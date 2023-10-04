"""
    lakeFS API

    lakeFS HTTP API  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: services@treeverse.io
    Generated by: https://openapi-generator.tech
"""


import unittest

import lakefs_client
from lakefs_client.api.refs_api import RefsApi  # noqa: E501


class TestRefsApi(unittest.TestCase):
    """RefsApi unit test stubs"""

    def setUp(self):
        self.api = RefsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_diff_refs(self):
        """Test case for diff_refs

        diff references  # noqa: E501
        """
        pass

    def test_dump_refs_status(self):
        """Test case for dump_refs_status

        Dump repository refs (tags, commits, branches) to object store  # noqa: E501
        """
        pass

    def test_dump_refs_submit(self):
        """Test case for dump_refs_submit

        Dump repository refs (tags, commits, branches) to object store  # noqa: E501
        """
        pass

    def test_find_merge_base(self):
        """Test case for find_merge_base

        find the merge base for 2 references  # noqa: E501
        """
        pass

    def test_log_commits(self):
        """Test case for log_commits

        get commit log from ref. If both objects and prefixes are empty, return all commits.  # noqa: E501
        """
        pass

    def test_merge_into_branch(self):
        """Test case for merge_into_branch

        merge references  # noqa: E501
        """
        pass

    def test_restore_refs_status(self):
        """Test case for restore_refs_status

        Restore repository refs (tags, commits, branches) from object store  # noqa: E501
        """
        pass

    def test_restore_refs_submit(self):
        """Test case for restore_refs_submit

        Restore repository refs (tags, commits, branches) from object store  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
