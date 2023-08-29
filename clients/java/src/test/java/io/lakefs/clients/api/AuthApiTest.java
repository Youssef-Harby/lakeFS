/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api;

import io.lakefs.clients.api.ApiException;
import io.lakefs.clients.api.model.ACL;
import io.lakefs.clients.api.model.AuthenticationToken;
import io.lakefs.clients.api.model.Credentials;
import io.lakefs.clients.api.model.CredentialsList;
import io.lakefs.clients.api.model.CredentialsWithSecret;
import io.lakefs.clients.api.model.CurrentUser;
import io.lakefs.clients.api.model.Error;
import io.lakefs.clients.api.model.ErrorNoACL;
import io.lakefs.clients.api.model.Group;
import io.lakefs.clients.api.model.GroupCreation;
import io.lakefs.clients.api.model.GroupList;
import io.lakefs.clients.api.model.LoginInformation;
import io.lakefs.clients.api.model.Policy;
import io.lakefs.clients.api.model.PolicyList;
import io.lakefs.clients.api.model.User;
import io.lakefs.clients.api.model.UserCreation;
import io.lakefs.clients.api.model.UserList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthApi
 */
@Ignore
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    
    /**
     * add group membership
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGroupMembershipTest() throws ApiException {
        String groupId = null;
        String userId = null;
                api.addGroupMembership(groupId, userId);
        // TODO: test validations
    }
    
    /**
     * attach policy to group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachPolicyToGroupTest() throws ApiException {
        String groupId = null;
        String policyId = null;
                api.attachPolicyToGroup(groupId, policyId);
        // TODO: test validations
    }
    
    /**
     * attach policy to user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachPolicyToUserTest() throws ApiException {
        String userId = null;
        String policyId = null;
                api.attachPolicyToUser(userId, policyId);
        // TODO: test validations
    }
    
    /**
     * create credentials
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCredentialsTest() throws ApiException {
        String userId = null;
                CredentialsWithSecret response = api.createCredentials(userId);
        // TODO: test validations
    }
    
    /**
     * create group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        GroupCreation groupCreation = null;
                Group response = api.createGroup(groupCreation);
        // TODO: test validations
    }
    
    /**
     * create policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPolicyTest() throws ApiException {
        Policy policy = null;
                Policy response = api.createPolicy(policy);
        // TODO: test validations
    }
    
    /**
     * create user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserCreation userCreation = null;
                User response = api.createUser(userCreation);
        // TODO: test validations
    }
    
    /**
     * delete credentials
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCredentialsTest() throws ApiException {
        String userId = null;
        String accessKeyId = null;
                api.deleteCredentials(userId, accessKeyId);
        // TODO: test validations
    }
    
    /**
     * delete group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupTest() throws ApiException {
        String groupId = null;
                api.deleteGroup(groupId);
        // TODO: test validations
    }
    
    /**
     * delete group membership
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupMembershipTest() throws ApiException {
        String groupId = null;
        String userId = null;
                api.deleteGroupMembership(groupId, userId);
        // TODO: test validations
    }
    
    /**
     * delete policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePolicyTest() throws ApiException {
        String policyId = null;
                api.deletePolicy(policyId);
        // TODO: test validations
    }
    
    /**
     * delete user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userId = null;
                api.deleteUser(userId);
        // TODO: test validations
    }
    
    /**
     * detach policy from group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachPolicyFromGroupTest() throws ApiException {
        String groupId = null;
        String policyId = null;
                api.detachPolicyFromGroup(groupId, policyId);
        // TODO: test validations
    }
    
    /**
     * detach policy from user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachPolicyFromUserTest() throws ApiException {
        String userId = null;
        String policyId = null;
                api.detachPolicyFromUser(userId, policyId);
        // TODO: test validations
    }
    

    
    /**
     * get credentials
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCredentialsTest() throws ApiException {
        String userId = null;
        String accessKeyId = null;
                Credentials response = api.getCredentials(userId, accessKeyId);
        // TODO: test validations
    }
    
    /**
     * get current user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
                CurrentUser response = api.getCurrentUser();
        // TODO: test validations
    }
    
    /**
     * get group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        String groupId = null;
                Group response = api.getGroup(groupId);
        // TODO: test validations
    }
    
    /**
     * get ACL of group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupACLTest() throws ApiException {
        String groupId = null;
                ACL response = api.getGroupACL(groupId);
        // TODO: test validations
    }
    
    /**
     * get policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPolicyTest() throws ApiException {
        String policyId = null;
                Policy response = api.getPolicy(policyId);
        // TODO: test validations
    }
    
    /**
     * get user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String userId = null;
                User response = api.getUser(userId);
        // TODO: test validations
    }
    
    /**
     * list group members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupMembersTest() throws ApiException {
        String groupId = null;
        String prefix = null;
        String after = null;
        Integer amount = null;
                UserList response = api.listGroupMembers(groupId, prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * list group policies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupPoliciesTest() throws ApiException {
        String groupId = null;
        String prefix = null;
        String after = null;
        Integer amount = null;
                PolicyList response = api.listGroupPolicies(groupId, prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * list groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupsTest() throws ApiException {
        String prefix = null;
        String after = null;
        Integer amount = null;
                GroupList response = api.listGroups(prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * list policies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPoliciesTest() throws ApiException {
        String prefix = null;
        String after = null;
        Integer amount = null;
                PolicyList response = api.listPolicies(prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * list user credentials
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserCredentialsTest() throws ApiException {
        String userId = null;
        String prefix = null;
        String after = null;
        Integer amount = null;
                CredentialsList response = api.listUserCredentials(userId, prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * list user groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserGroupsTest() throws ApiException {
        String userId = null;
        String prefix = null;
        String after = null;
        Integer amount = null;
                GroupList response = api.listUserGroups(userId, prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * list user policies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserPoliciesTest() throws ApiException {
        String userId = null;
        String prefix = null;
        String after = null;
        Integer amount = null;
        Boolean effective = null;
                PolicyList response = api.listUserPolicies(userId, prefix, after, amount, effective);
        // TODO: test validations
    }
    
    /**
     * list users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsersTest() throws ApiException {
        String prefix = null;
        String after = null;
        Integer amount = null;
                UserList response = api.listUsers(prefix, after, amount);
        // TODO: test validations
    }
    
    /**
     * perform a login
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        LoginInformation loginInformation = null;
                AuthenticationToken response = api.login(loginInformation);
        // TODO: test validations
    }
    
    /**
     * set ACL of group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setGroupACLTest() throws ApiException {
        String groupId = null;
        ACL ACL = null;
                api.setGroupACL(groupId, ACL);
        // TODO: test validations
    }

    /**
     * update policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePolicyTest() throws ApiException {
        String policyId = null;
        Policy policy = null;
                Policy response = api.updatePolicy(policyId, policy);
        // TODO: test validations
    }
    
}
