/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.api;
<<<<<<< bead95f1e51ee883082063d73f52a8e98122833a:integration-tests/src/main/java/org/wso2/carbon/apimgt/rest/integration/tests/publisher/api/DocumentCollectionApi.java
=======

import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiCallback;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiClient;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiResponse;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.Configuration;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.Pair;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ProgressRequestBody;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ProgressResponseBody;
>>>>>>> after java unit testing:integration-tests/src/main/java/org/wso2/carbon/apimgt/rest/integration/tests/publisher/api/DocumentCollectionApi.java

import com.google.gson.reflect.TypeToken;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiCallback;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiClient;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.Configuration;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.Pair;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiResponse;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ProgressResponseBody;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ProgressRequestBody;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.DocumentList;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.Document;

import java.io.IOException;
<<<<<<< bead95f1e51ee883082063d73f52a8e98122833a:integration-tests/src/main/java/org/wso2/carbon/apimgt/rest/integration/tests/publisher/api/DocumentCollectionApi.java
=======


import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.Document;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.DocumentList;

>>>>>>> after java unit testing:integration-tests/src/main/java/org/wso2/carbon/apimgt/rest/integration/tests/publisher/api/DocumentCollectionApi.java
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentCollectionApi {
    private ApiClient apiClient;

    public DocumentCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apisApiIdDocumentsGet
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdDocumentsGetCall(String apiId, Integer limit, Integer offset, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apis/{apiId}/documents"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdDocumentsGetValidateBeforeCall(String apiId, Integer limit, Integer offset, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdDocumentsGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = apisApiIdDocumentsGetCall(apiId, limit, offset, ifNoneMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of documents of an API
     * This operation can be used to retrieve a list of documents belonging to an API by providing the id of the API. 
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return DocumentList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentList apisApiIdDocumentsGet(String apiId, Integer limit, Integer offset, String ifNoneMatch) throws ApiException {
        ApiResponse<DocumentList> resp = apisApiIdDocumentsGetWithHttpInfo(apiId, limit, offset, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get a list of documents of an API
     * This operation can be used to retrieve a list of documents belonging to an API by providing the id of the API. 
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ApiResponse&lt;DocumentList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentList> apisApiIdDocumentsGetWithHttpInfo(String apiId, Integer limit, Integer offset, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdDocumentsGetValidateBeforeCall(apiId, limit, offset, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<DocumentList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of documents of an API (asynchronously)
     * This operation can be used to retrieve a list of documents belonging to an API by providing the id of the API. 
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdDocumentsGetAsync(String apiId, Integer limit, Integer offset, String ifNoneMatch, final ApiCallback<DocumentList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdDocumentsGetValidateBeforeCall(apiId, limit, offset, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apisApiIdDocumentsPost
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param body Document object that needs to be added  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdDocumentsPostCall(String apiId, Document body, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/apis/{apiId}/documents"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));
        if (ifUnmodifiedSince != null)
        localVarHeaderParams.put("If-Unmodified-Since", apiClient.parameterToString(ifUnmodifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdDocumentsPostValidateBeforeCall(String apiId, Document body, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdDocumentsPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apisApiIdDocumentsPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = apisApiIdDocumentsPostCall(apiId, body, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a new document to an API
     * This operation can be used to add a new documentation to an API. This operation only adds the metadata of a document. To add the actual content we need to use **Upload the content of an API document ** API once we obtain a document Id by this operation. 
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param body Document object that needs to be added  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Document apisApiIdDocumentsPost(String apiId, Document body, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        ApiResponse<Document> resp = apisApiIdDocumentsPostWithHttpInfo(apiId, body, ifMatch, ifUnmodifiedSince);
        return resp.getData();
    }

    /**
     * Add a new document to an API
     * This operation can be used to add a new documentation to an API. This operation only adds the metadata of a document. To add the actual content we need to use **Upload the content of an API document ** API once we obtain a document Id by this operation. 
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param body Document object that needs to be added  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Document> apisApiIdDocumentsPostWithHttpInfo(String apiId, Document body, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdDocumentsPostValidateBeforeCall(apiId, body, ifMatch, ifUnmodifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a new document to an API (asynchronously)
     * This operation can be used to add a new documentation to an API. This operation only adds the metadata of a document. To add the actual content we need to use **Upload the content of an API document ** API once we obtain a document Id by this operation. 
     * @param apiId **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param body Document object that needs to be added  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdDocumentsPostAsync(String apiId, Document body, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Document> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdDocumentsPostValidateBeforeCall(apiId, body, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
