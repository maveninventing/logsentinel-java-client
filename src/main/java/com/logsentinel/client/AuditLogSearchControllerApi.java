/*
 * LogSentinel RESTful API
 * Read more at http://localhost:8080/docs
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.client;

import com.logsentinel.ApiCallback;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiException;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;
import com.logsentinel.ProgressRequestBody;
import com.logsentinel.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.logsentinel.client.model.AuditLogEntry;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditLogSearchControllerApi {
    private ApiClient apiClient;

    public AuditLogSearchControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuditLogSearchControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBatchUsingGET
     * @param values Values that match the specified field (required)
     * @param field Field to search in for the supplied values (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBatchUsingGETCall(List<String> values, String field, String applicationId, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/search/batch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (values != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "values", values));
        if (field != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("field", field));
        if (entityType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entityType", entityType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (applicationId != null)
        localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "*/*"
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCallNew(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBatchUsingGETValidateBeforeCall(List<String> values, String field, String applicationId, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'values' is set
        if (values == null) {
            throw new ApiException("Missing the required parameter 'values' when calling getBatchUsingGET(Async)");
        }
        
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException("Missing the required parameter 'field' when calling getBatchUsingGET(Async)");
        }
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling getBatchUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getBatchUsingGETCall(values, field, applicationId, entityType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get entries in batches by field
     * 
     * @param values Values that match the specified field (required)
     * @param field Field to search in for the supplied values (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (optional)
     * @return List&lt;AuditLogEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuditLogEntry> getBatchUsingGET(List<String> values, String field, String applicationId, String entityType) throws ApiException {
        ApiResponse<List<AuditLogEntry>> resp = getBatchUsingGETWithHttpInfo(values, field, applicationId, entityType);
        return resp.getData();
    }

    /**
     * Get entries in batches by field
     * 
     * @param values Values that match the specified field (required)
     * @param field Field to search in for the supplied values (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (optional)
     * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuditLogEntry>> getBatchUsingGETWithHttpInfo(List<String> values, String field, String applicationId, String entityType) throws ApiException {
        com.squareup.okhttp.Call call = getBatchUsingGETValidateBeforeCall(values, field, applicationId, entityType, null, null);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entries in batches by field (asynchronously)
     * 
     * @param values Values that match the specified field (required)
     * @param field Field to search in for the supplied values (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBatchUsingGETAsync(List<String> values, String field, String applicationId, String entityType, final ApiCallback<List<AuditLogEntry>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getBatchUsingGETValidateBeforeCall(values, field, applicationId, entityType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEntityHistoryUsingGET
     * @param entityId When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEntityHistoryUsingGETCall(String entityId, String entityType, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/search/entityHistory";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (entityId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
        if (entityType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("entityType", entityType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (applicationId != null)
        localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "*/*"
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCallNew(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEntityHistoryUsingGETValidateBeforeCall(String entityId, String entityType, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new ApiException("Missing the required parameter 'entityId' when calling getEntityHistoryUsingGET(Async)");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling getEntityHistoryUsingGET(Async)");
        }
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling getEntityHistoryUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getEntityHistoryUsingGETCall(entityId, entityType, applicationId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get entity history
     * 
     * @param entityId When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @return List&lt;AuditLogEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuditLogEntry> getEntityHistoryUsingGET(String entityId, String entityType, String applicationId) throws ApiException {
        ApiResponse<List<AuditLogEntry>> resp = getEntityHistoryUsingGETWithHttpInfo(entityId, entityType, applicationId);
        return resp.getData();
    }

    /**
     * Get entity history
     * 
     * @param entityId When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuditLogEntry>> getEntityHistoryUsingGETWithHttpInfo(String entityId, String entityType, String applicationId) throws ApiException {
        com.squareup.okhttp.Call call = getEntityHistoryUsingGETValidateBeforeCall(entityId, entityType, applicationId, null, null);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entity history (asynchronously)
     * 
     * @param entityId When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType When the event is about a particular model entity, you can set its type here (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEntityHistoryUsingGETAsync(String entityId, String entityType, String applicationId, final ApiCallback<List<AuditLogEntry>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEntityHistoryUsingGETValidateBeforeCall(entityId, entityType, applicationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchUsingGET
     * @param query query (required)
     * @param startTime startTime (required)
     * @param endTime endTime (required)
     * @param page page (required)
     * @param pageSize pageSize (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchUsingGETCall(String query, Long startTime, Long endTime, Integer page, Integer pageSize, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startTime", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endTime", endTime));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (applicationId != null)
        localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "*/*"
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCallNew(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchUsingGETValidateBeforeCall(String query, Long startTime, Long endTime, Integer page, Integer pageSize, String applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchUsingGET(Async)");
        }
        
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling searchUsingGET(Async)");
        }
        
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling searchUsingGET(Async)");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling searchUsingGET(Async)");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling searchUsingGET(Async)");
        }
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling searchUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = searchUsingGETCall(query, startTime, endTime, page, pageSize, applicationId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search logged entries
     * 
     * @param query query (required)
     * @param startTime startTime (required)
     * @param endTime endTime (required)
     * @param page page (required)
     * @param pageSize pageSize (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @return List&lt;AuditLogEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuditLogEntry> searchUsingGET(String query, Long startTime, Long endTime, Integer page, Integer pageSize, String applicationId) throws ApiException {
        ApiResponse<List<AuditLogEntry>> resp = searchUsingGETWithHttpInfo(query, startTime, endTime, page, pageSize, applicationId);
        return resp.getData();
    }

    /**
     * Search logged entries
     * 
     * @param query query (required)
     * @param startTime startTime (required)
     * @param endTime endTime (required)
     * @param page page (required)
     * @param pageSize pageSize (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuditLogEntry>> searchUsingGETWithHttpInfo(String query, Long startTime, Long endTime, Integer page, Integer pageSize, String applicationId) throws ApiException {
        com.squareup.okhttp.Call call = searchUsingGETValidateBeforeCall(query, startTime, endTime, page, pageSize, applicationId, null, null);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search logged entries (asynchronously)
     * 
     * @param query query (required)
     * @param startTime startTime (required)
     * @param endTime endTime (required)
     * @param page page (required)
     * @param pageSize pageSize (required)
     * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchUsingGETAsync(String query, Long startTime, Long endTime, Integer page, Integer pageSize, String applicationId, final ApiCallback<List<AuditLogEntry>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchUsingGETValidateBeforeCall(query, startTime, endTime, page, pageSize, applicationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
