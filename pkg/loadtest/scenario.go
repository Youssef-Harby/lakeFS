package loadtest

import (
	"fmt"

	vegeta "github.com/tsenart/vegeta/v12/lib"
)

const FileCountInCommit = 20

type Scenario interface {
	Play(loader Loader, stopCh chan struct{}) <-chan vegeta.Target
}

type SimpleScenario struct {
	FileCountInCommit int
}

func (s *SimpleScenario) Play(serverAddress string, repoName string, stopCh chan struct{}) <-chan vegeta.Target {
	targetGenerator := TargetGenerator{ServerAddress: serverAddress}
	out := make(chan vegeta.Target)
	go func() {
		defer close(out)
		for i := 0; true; i++ {
			for _, tgt := range targetGenerator.GenerateCreateFileTargets(repoName, "main", FileCountInCommit) {
				out <- tgt
			}
			commitMsg := fmt.Sprintf("commit%d", i)
			out <- targetGenerator.GenerateCommitTarget(repoName, "main", commitMsg)
			branchName := fmt.Sprintf("branch%d", i)
			out <- targetGenerator.GenerateBranchTarget(repoName, branchName)

			for _, tgt := range targetGenerator.GenerateCreateFileTargets(repoName, branchName, FileCountInCommit) {
				out <- tgt
			}
			out <- targetGenerator.GenerateCommitTarget(repoName, branchName, commitMsg)
			out <- targetGenerator.GenerateMergeToMasterTarget(repoName, branchName)
			out <- targetGenerator.GenerateListTarget(repoName, "main", 100)  //nolint: mnd
			out <- targetGenerator.GenerateListTarget(repoName, "main", 1000) //nolint: mnd
			out <- targetGenerator.GenerateDiffTarget(repoName, "main")

			select {
			case <-stopCh:
				return
			default:
			}
		}
	}()
	return out
}
