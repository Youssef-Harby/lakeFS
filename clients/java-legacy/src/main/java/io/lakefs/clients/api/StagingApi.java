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

import io.lakefs.clients.api.ApiCallback;
import io.lakefs.clients.api.ApiClient;
import io.lakefs.clients.api.ApiException;
import io.lakefs.clients.api.ApiResponse;
import io.lakefs.clients.api.Configuration;
import io.lakefs.clients.api.Pair;
import io.lakefs.clients.api.ProgressRequestBody;
import io.lakefs.clients.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.lakefs.clients.api.model.Error;
import io.lakefs.clients.api.model.ObjectStats;
import io.lakefs.clients.api.model.StagingLocation;
import io.lakefs.clients.api.model.StagingMetadata;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StagingApi {
    private ApiClient localVarApiClient;

    public StagingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StagingApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPhysicalAddress
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param presign  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> physical address for staging area </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPhysicalAddressCall(String repository, String branch, String path, Boolean presign, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/{branch}/staging/backing"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()))
            .replaceAll("\\{" + "branch" + "\\}", localVarApiClient.escapeString(branch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (path != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("path", path));
        }

        if (presign != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("presign", presign));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "cookie_auth", "jwt_token", "oidc_auth", "saml_auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPhysicalAddressValidateBeforeCall(String repository, String branch, String path, Boolean presign, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling getPhysicalAddress(Async)");
        }
        
        // verify the required parameter 'branch' is set
        if (branch == null) {
            throw new ApiException("Missing the required parameter 'branch' when calling getPhysicalAddress(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getPhysicalAddress(Async)");
        }
        

        okhttp3.Call localVarCall = getPhysicalAddressCall(repository, branch, path, presign, _callback);
        return localVarCall;

    }

    /**
     * generate an address to which the client can upload an object
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param presign  (optional)
     * @return StagingLocation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> physical address for staging area </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public StagingLocation getPhysicalAddress(String repository, String branch, String path, Boolean presign) throws ApiException {
        ApiResponse<StagingLocation> localVarResp = getPhysicalAddressWithHttpInfo(repository, branch, path, presign);
        return localVarResp.getData();
    }

    /**
     * generate an address to which the client can upload an object
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param presign  (optional)
     * @return ApiResponse&lt;StagingLocation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> physical address for staging area </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StagingLocation> getPhysicalAddressWithHttpInfo(String repository, String branch, String path, Boolean presign) throws ApiException {
        okhttp3.Call localVarCall = getPhysicalAddressValidateBeforeCall(repository, branch, path, presign, null);
        Type localVarReturnType = new TypeToken<StagingLocation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * generate an address to which the client can upload an object (asynchronously)
     * 
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param presign  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> physical address for staging area </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPhysicalAddressAsync(String repository, String branch, String path, Boolean presign, final ApiCallback<StagingLocation> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPhysicalAddressValidateBeforeCall(repository, branch, path, presign, _callback);
        Type localVarReturnType = new TypeToken<StagingLocation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for linkPhysicalAddress
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param stagingMetadata  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> object metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> conflict with a commit, try here </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call linkPhysicalAddressCall(String repository, String branch, String path, StagingMetadata stagingMetadata, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = stagingMetadata;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/branches/{branch}/staging/backing"
            .replaceAll("\\{" + "repository" + "\\}", localVarApiClient.escapeString(repository.toString()))
            .replaceAll("\\{" + "branch" + "\\}", localVarApiClient.escapeString(branch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (path != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("path", path));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basic_auth", "cookie_auth", "jwt_token", "oidc_auth", "saml_auth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call linkPhysicalAddressValidateBeforeCall(String repository, String branch, String path, StagingMetadata stagingMetadata, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling linkPhysicalAddress(Async)");
        }
        
        // verify the required parameter 'branch' is set
        if (branch == null) {
            throw new ApiException("Missing the required parameter 'branch' when calling linkPhysicalAddress(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException("Missing the required parameter 'path' when calling linkPhysicalAddress(Async)");
        }
        
        // verify the required parameter 'stagingMetadata' is set
        if (stagingMetadata == null) {
            throw new ApiException("Missing the required parameter 'stagingMetadata' when calling linkPhysicalAddress(Async)");
        }
        

        okhttp3.Call localVarCall = linkPhysicalAddressCall(repository, branch, path, stagingMetadata, _callback);
        return localVarCall;

    }

    /**
     * associate staging on this physical address with a path
     * Link the physical address with the path in lakeFS, creating an uncommitted change. The given address can be one generated by getPhysicalAddress, or an address outside the repository&#39;s storage namespace. 
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param stagingMetadata  (required)
     * @return ObjectStats
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> object metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> conflict with a commit, try here </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ObjectStats linkPhysicalAddress(String repository, String branch, String path, StagingMetadata stagingMetadata) throws ApiException {
        ApiResponse<ObjectStats> localVarResp = linkPhysicalAddressWithHttpInfo(repository, branch, path, stagingMetadata);
        return localVarResp.getData();
    }

    /**
     * associate staging on this physical address with a path
     * Link the physical address with the path in lakeFS, creating an uncommitted change. The given address can be one generated by getPhysicalAddress, or an address outside the repository&#39;s storage namespace. 
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param stagingMetadata  (required)
     * @return ApiResponse&lt;ObjectStats&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> object metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> conflict with a commit, try here </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ObjectStats> linkPhysicalAddressWithHttpInfo(String repository, String branch, String path, StagingMetadata stagingMetadata) throws ApiException {
        okhttp3.Call localVarCall = linkPhysicalAddressValidateBeforeCall(repository, branch, path, stagingMetadata, null);
        Type localVarReturnType = new TypeToken<ObjectStats>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * associate staging on this physical address with a path (asynchronously)
     * Link the physical address with the path in lakeFS, creating an uncommitted change. The given address can be one generated by getPhysicalAddress, or an address outside the repository&#39;s storage namespace. 
     * @param repository  (required)
     * @param branch  (required)
     * @param path relative to the branch (required)
     * @param stagingMetadata  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> object metadata </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> conflict with a commit, try here </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call linkPhysicalAddressAsync(String repository, String branch, String path, StagingMetadata stagingMetadata, final ApiCallback<ObjectStats> _callback) throws ApiException {

        okhttp3.Call localVarCall = linkPhysicalAddressValidateBeforeCall(repository, branch, path, stagingMetadata, _callback);
        Type localVarReturnType = new TypeToken<ObjectStats>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
