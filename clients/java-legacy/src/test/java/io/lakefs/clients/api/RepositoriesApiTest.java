/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api;

import io.lakefs.clients.api.ApiException;
import io.lakefs.clients.api.model.BranchProtectionRule;
import io.lakefs.clients.api.model.Error;
import io.lakefs.clients.api.model.GarbageCollectionRules;
import io.lakefs.clients.api.model.RefsRestore;
import io.lakefs.clients.api.model.Repository;
import io.lakefs.clients.api.model.RepositoryCreation;
import io.lakefs.clients.api.model.RepositoryDumpStatus;
import io.lakefs.clients.api.model.RepositoryList;
import io.lakefs.clients.api.model.RepositoryRestoreStatus;
import io.lakefs.clients.api.model.TaskInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RepositoriesApi
 */
@Ignore
public class RepositoriesApiTest {

    private final RepositoriesApi api = new RepositoriesApi();

    
    /**
     * create repository
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRepositoryTest() throws ApiException {
        RepositoryCreation repositoryCreation = null;
        Boolean bare = null;
                Repository response = api.createRepository(repositoryCreation, bare);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGCRulesTest() throws ApiException {
        String repository = null;
                api.deleteGCRules(repository);
        // TODO: test validations
    }
    
    /**
     * delete repository
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRepositoryTest() throws ApiException {
        String repository = null;
        Boolean force = null;
                api.deleteRepository(repository, force);
        // TODO: test validations
    }
    
    /**
     * Status of a repository dump task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dumpStatusTest() throws ApiException {
        String repository = null;
        String taskId = null;
                RepositoryDumpStatus response = api.dumpStatus(repository, taskId);
        // TODO: test validations
    }
    
    /**
     * Backup the repository metadata (tags, commits, branches) and save the backup to the object store.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dumpSubmitTest() throws ApiException {
        String repository = null;
                TaskInfo response = api.dumpSubmit(repository);
        // TODO: test validations
    }
    
    /**
     * get branch protection rules
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBranchProtectionRulesTest() throws ApiException {
        String repository = null;
                List<BranchProtectionRule> response = api.getBranchProtectionRules(repository);
        // TODO: test validations
    }
    
    /**
     * get repository GC rules
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGCRulesTest() throws ApiException {
        String repository = null;
                GarbageCollectionRules response = api.getGCRules(repository);
        // TODO: test validations
    }
    
    /**
     * get repository
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRepositoryTest() throws ApiException {
        String repository = null;
                Repository response = api.getRepository(repository);
        // TODO: test validations
    }
    
    /**
     * get repository metadata
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRepositoryMetadataTest() throws ApiException {
        String repository = null;
                Map<String, String> response = api.getRepositoryMetadata(repository);
        // TODO: test validations
    }
    
    /**
     * list repositories
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRepositoriesTest() throws ApiException {
        String prefix = null;
        String after = null;
        Integer amount = null;
                RepositoryList response = api.listRepositories(prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * Status of a restore request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreStatusTest() throws ApiException {
        String repository = null;
        String taskId = null;
                RepositoryRestoreStatus response = api.restoreStatus(repository, taskId);
        // TODO: test validations
    }
    
    /**
     * Restore repository from a dump in the object store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreSubmitTest() throws ApiException {
        String repository = null;
        RefsRestore refsRestore = null;
                TaskInfo response = api.restoreSubmit(repository, refsRestore);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setBranchProtectionRulesTest() throws ApiException {
        String repository = null;
        List<BranchProtectionRule> branchProtectionRule = null;
        String ifMatch = null;
                api.setBranchProtectionRules(repository, branchProtectionRule, ifMatch);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setGCRulesTest() throws ApiException {
        String repository = null;
        GarbageCollectionRules garbageCollectionRules = null;
                api.setGCRules(repository, garbageCollectionRules);
        // TODO: test validations
    }
    
}
