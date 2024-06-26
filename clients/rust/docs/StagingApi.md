# \StagingApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_physical_address**](StagingApi.md#get_physical_address) | **GET** /repositories/{repository}/branches/{branch}/staging/backing | generate an address to which the client can upload an object
[**link_physical_address**](StagingApi.md#link_physical_address) | **PUT** /repositories/{repository}/branches/{branch}/staging/backing | associate staging on this physical address with a path



## get_physical_address

> models::StagingLocation get_physical_address(repository, branch, path, presign)
generate an address to which the client can upload an object

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**repository** | **String** |  | [required] |
**branch** | **String** |  | [required] |
**path** | **String** | relative to the branch | [required] |
**presign** | Option<**bool**> |  |  |

### Return type

[**models::StagingLocation**](StagingLocation.md)

### Authorization

[basic_auth](../README.md#basic_auth), [cookie_auth](../README.md#cookie_auth), [oidc_auth](../README.md#oidc_auth), [saml_auth](../README.md#saml_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## link_physical_address

> models::ObjectStats link_physical_address(repository, branch, path, staging_metadata, if_none_match)
associate staging on this physical address with a path

Link the physical address with the path in lakeFS, creating an uncommitted change. The given address can be one generated by getPhysicalAddress, or an address outside the repository's storage namespace. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**repository** | **String** |  | [required] |
**branch** | **String** |  | [required] |
**path** | **String** | relative to the branch | [required] |
**staging_metadata** | [**StagingMetadata**](StagingMetadata.md) |  | [required] |
**if_none_match** | Option<**String**> | Set to \"*\" to atomically allow the upload only if the key has no object yet. Other values are not supported. |  |

### Return type

[**models::ObjectStats**](ObjectStats.md)

### Authorization

[basic_auth](../README.md#basic_auth), [cookie_auth](../README.md#cookie_auth), [oidc_auth](../README.md#oidc_auth), [saml_auth](../README.md#saml_auth), [jwt_token](../README.md#jwt_token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

