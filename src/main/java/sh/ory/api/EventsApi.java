/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.2
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiCallback;
import sh.ory.ApiClient;
import sh.ory.ApiException;
import sh.ory.ApiResponse;
import sh.ory.Configuration;
import sh.ory.Pair;
import sh.ory.ProgressRequestBody;
import sh.ory.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sh.ory.model.CreateEventStreamBody;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.EventStream;
import sh.ory.model.ListEventStreams;
import sh.ory.model.SetEventStreamBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createEventStream
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param createEventStreamBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEventStreamCall(String projectId, CreateEventStreamBody createEventStreamBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.console.ory.sh" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createEventStreamBody;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/eventstreams"
            .replace("{" + "project_id" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oryWorkspaceApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createEventStreamValidateBeforeCall(String projectId, CreateEventStreamBody createEventStreamBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling createEventStream(Async)");
        }

        // verify the required parameter 'createEventStreamBody' is set
        if (createEventStreamBody == null) {
            throw new ApiException("Missing the required parameter 'createEventStreamBody' when calling createEventStream(Async)");
        }

        return createEventStreamCall(projectId, createEventStreamBody, _callback);

    }

    /**
     * Create an event stream for your project.
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param createEventStreamBody  (required)
     * @return EventStream
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public EventStream createEventStream(String projectId, CreateEventStreamBody createEventStreamBody) throws ApiException {
        ApiResponse<EventStream> localVarResp = createEventStreamWithHttpInfo(projectId, createEventStreamBody);
        return localVarResp.getData();
    }

    /**
     * Create an event stream for your project.
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param createEventStreamBody  (required)
     * @return ApiResponse&lt;EventStream&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EventStream> createEventStreamWithHttpInfo(String projectId, CreateEventStreamBody createEventStreamBody) throws ApiException {
        okhttp3.Call localVarCall = createEventStreamValidateBeforeCall(projectId, createEventStreamBody, null);
        Type localVarReturnType = new TypeToken<EventStream>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create an event stream for your project. (asynchronously)
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param createEventStreamBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createEventStreamAsync(String projectId, CreateEventStreamBody createEventStreamBody, final ApiCallback<EventStream> _callback) throws ApiException {

        okhttp3.Call localVarCall = createEventStreamValidateBeforeCall(projectId, createEventStreamBody, _callback);
        Type localVarReturnType = new TypeToken<EventStream>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteEventStream
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The ID of the event stream to be deleted, as returned when created. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteEventStreamCall(String projectId, String eventStreamId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.console.ory.sh" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/eventstreams/{event_stream_id}"
            .replace("{" + "project_id" + "}", localVarApiClient.escapeString(projectId.toString()))
            .replace("{" + "event_stream_id" + "}", localVarApiClient.escapeString(eventStreamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oryWorkspaceApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteEventStreamValidateBeforeCall(String projectId, String eventStreamId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling deleteEventStream(Async)");
        }

        // verify the required parameter 'eventStreamId' is set
        if (eventStreamId == null) {
            throw new ApiException("Missing the required parameter 'eventStreamId' when calling deleteEventStream(Async)");
        }

        return deleteEventStreamCall(projectId, eventStreamId, _callback);

    }

    /**
     * Remove an event stream from a project
     * Remove an event stream from a project.
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The ID of the event stream to be deleted, as returned when created. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public void deleteEventStream(String projectId, String eventStreamId) throws ApiException {
        deleteEventStreamWithHttpInfo(projectId, eventStreamId);
    }

    /**
     * Remove an event stream from a project
     * Remove an event stream from a project.
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The ID of the event stream to be deleted, as returned when created. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteEventStreamWithHttpInfo(String projectId, String eventStreamId) throws ApiException {
        okhttp3.Call localVarCall = deleteEventStreamValidateBeforeCall(projectId, eventStreamId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove an event stream from a project (asynchronously)
     * Remove an event stream from a project.
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The ID of the event stream to be deleted, as returned when created. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty responses are sent when, for example, resources are deleted. The HTTP status code for empty responses is typically 201. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteEventStreamAsync(String projectId, String eventStreamId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteEventStreamValidateBeforeCall(projectId, eventStreamId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for listEventStreams
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> listEventStreams </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listEventStreamsCall(String projectId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.console.ory.sh" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/eventstreams"
            .replace("{" + "project_id" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oryWorkspaceApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listEventStreamsValidateBeforeCall(String projectId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling listEventStreams(Async)");
        }

        return listEventStreamsCall(projectId, _callback);

    }

    /**
     * List all event streams for the project. This endpoint is not paginated.
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @return ListEventStreams
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> listEventStreams </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public ListEventStreams listEventStreams(String projectId) throws ApiException {
        ApiResponse<ListEventStreams> localVarResp = listEventStreamsWithHttpInfo(projectId);
        return localVarResp.getData();
    }

    /**
     * List all event streams for the project. This endpoint is not paginated.
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @return ApiResponse&lt;ListEventStreams&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> listEventStreams </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListEventStreams> listEventStreamsWithHttpInfo(String projectId) throws ApiException {
        okhttp3.Call localVarCall = listEventStreamsValidateBeforeCall(projectId, null);
        Type localVarReturnType = new TypeToken<ListEventStreams>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all event streams for the project. This endpoint is not paginated. (asynchronously)
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> listEventStreams </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listEventStreamsAsync(String projectId, final ApiCallback<ListEventStreams> _callback) throws ApiException {

        okhttp3.Call localVarCall = listEventStreamsValidateBeforeCall(projectId, _callback);
        Type localVarReturnType = new TypeToken<ListEventStreams>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setEventStream
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The event stream&#39;s ID. (required)
     * @param setEventStreamBody  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setEventStreamCall(String projectId, String eventStreamId, SetEventStreamBody setEventStreamBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://api.console.ory.sh" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = setEventStreamBody;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/eventstreams/{event_stream_id}"
            .replace("{" + "project_id" + "}", localVarApiClient.escapeString(projectId.toString()))
            .replace("{" + "event_stream_id" + "}", localVarApiClient.escapeString(eventStreamId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oryWorkspaceApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setEventStreamValidateBeforeCall(String projectId, String eventStreamId, SetEventStreamBody setEventStreamBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling setEventStream(Async)");
        }

        // verify the required parameter 'eventStreamId' is set
        if (eventStreamId == null) {
            throw new ApiException("Missing the required parameter 'eventStreamId' when calling setEventStream(Async)");
        }

        return setEventStreamCall(projectId, eventStreamId, setEventStreamBody, _callback);

    }

    /**
     * Update an event stream for a project.
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The event stream&#39;s ID. (required)
     * @param setEventStreamBody  (optional)
     * @return EventStream
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public EventStream setEventStream(String projectId, String eventStreamId, SetEventStreamBody setEventStreamBody) throws ApiException {
        ApiResponse<EventStream> localVarResp = setEventStreamWithHttpInfo(projectId, eventStreamId, setEventStreamBody);
        return localVarResp.getData();
    }

    /**
     * Update an event stream for a project.
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The event stream&#39;s ID. (required)
     * @param setEventStreamBody  (optional)
     * @return ApiResponse&lt;EventStream&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EventStream> setEventStreamWithHttpInfo(String projectId, String eventStreamId, SetEventStreamBody setEventStreamBody) throws ApiException {
        okhttp3.Call localVarCall = setEventStreamValidateBeforeCall(projectId, eventStreamId, setEventStreamBody, null);
        Type localVarReturnType = new TypeToken<EventStream>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update an event stream for a project. (asynchronously)
     * 
     * @param projectId Project ID  The project&#39;s ID. (required)
     * @param eventStreamId Event Stream ID  The event stream&#39;s ID. (required)
     * @param setEventStreamBody  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> eventStream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> errorGeneric </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorGeneric </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setEventStreamAsync(String projectId, String eventStreamId, SetEventStreamBody setEventStreamBody, final ApiCallback<EventStream> _callback) throws ApiException {

        okhttp3.Call localVarCall = setEventStreamValidateBeforeCall(projectId, eventStreamId, setEventStreamBody, _callback);
        Type localVarReturnType = new TypeToken<EventStream>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
