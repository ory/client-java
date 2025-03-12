/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.18.4
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.CreateWorkspaceApiKeyBody;
import sh.ory.model.CreateWorkspaceBody;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.ListWorkspaceProjects;
import sh.ory.model.ListWorkspaces;
import sh.ory.model.UpdateWorkspaceBody;
import sh.ory.model.Workspace;
import sh.ory.model.WorkspaceApiKey;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkspaceApi
 */
@Disabled
public class WorkspaceApiTest {

    private final WorkspaceApi api = new WorkspaceApi();

    /**
     * Create a new workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWorkspaceTest() throws ApiException {
        CreateWorkspaceBody createWorkspaceBody = null;
        Workspace response = api.createWorkspace(createWorkspaceBody);
        // TODO: test validations
    }

    /**
     * Create workspace API key
     *
     * Create an API key for a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWorkspaceApiKeyTest() throws ApiException {
        String workspace = null;
        CreateWorkspaceApiKeyBody createWorkspaceApiKeyBody = null;
        WorkspaceApiKey response = api.createWorkspaceApiKey(workspace, createWorkspaceApiKeyBody);
        // TODO: test validations
    }

    /**
     * Delete workspace API key
     *
     * Deletes an API key and immediately removes it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWorkspaceApiKeyTest() throws ApiException {
        String workspace = null;
        String tokenId = null;
        api.deleteWorkspaceApiKey(workspace, tokenId);
        // TODO: test validations
    }

    /**
     * Get a workspace
     *
     * Any workspace member can access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkspaceTest() throws ApiException {
        String workspace = null;
        Workspace response = api.getWorkspace(workspace);
        // TODO: test validations
    }

    /**
     * List a workspace&#39;s API keys
     *
     * A list of all the workspace&#39;s API keys.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWorkspaceApiKeysTest() throws ApiException {
        String workspace = null;
        List<WorkspaceApiKey> response = api.listWorkspaceApiKeys(workspace);
        // TODO: test validations
    }

    /**
     * List all projects of a workspace
     *
     * Any workspace member can access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWorkspaceProjectsTest() throws ApiException {
        String workspace = null;
        ListWorkspaceProjects response = api.listWorkspaceProjects(workspace);
        // TODO: test validations
    }

    /**
     * List workspaces the user is a member of
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWorkspacesTest() throws ApiException {
        Long pageSize = null;
        String pageToken = null;
        ListWorkspaces response = api.listWorkspaces(pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Update an workspace
     *
     * Workspace members with the role &#x60;OWNER&#x60; can access this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWorkspaceTest() throws ApiException {
        String workspace = null;
        UpdateWorkspaceBody updateWorkspaceBody = null;
        Workspace response = api.updateWorkspace(workspace, updateWorkspaceBody);
        // TODO: test validations
    }

}
