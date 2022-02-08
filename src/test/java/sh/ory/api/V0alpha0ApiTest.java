/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.77
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.ActiveProject;
import sh.ory.model.CloudAccount;
import sh.ory.model.GenericError;
import sh.ory.model.InlineObject;
import sh.ory.model.Project;
import sh.ory.model.ProjectRevision;
import sh.ory.model.SuccessfulProjectConfigUpdate;
import sh.ory.model.UpdateProjectConfigConfig;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for V0alpha0Api
 */
@Ignore
public class V0alpha0ApiTest {

    private final V0alpha0Api api = new V0alpha0Api();

    
    /**
     * Create a Project
     *
     * Creates a new project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        ProjectRevision projectRevision = null;
                Project response = api.createProject(projectRevision);
        // TODO: test validations
    }
    
    /**
     * Returns Your Active Ory Cloud Project
     *
     * Use this API to get your active project in the Ory Cloud Console UI.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveProjectTest() throws ApiException {
                ActiveProject response = api.getActiveProject();
        // TODO: test validations
    }
    
    /**
     * Get a Project
     *
     * Get a projects you have access to by its ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String projectId = null;
                Project response = api.getProject(projectId);
        // TODO: test validations
    }
    
    /**
     * Get all members associated with this project.
     *
     * This endpoint requires the user to be a member of the project with the role &#x60;OWNER&#x60; or &#x60;DEVELOPER&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectMembersTest() throws ApiException {
        String projectId = null;
                List<CloudAccount> response = api.getProjectMembers(projectId);
        // TODO: test validations
    }
    
    /**
     * List All Projects
     *
     * Lists all projects you have access to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProjectsTest() throws ApiException {
                List<Project> response = api.listProjects();
        // TODO: test validations
    }
    
    /**
     * Irrecoverably Purge a Project
     *
     * !! Use with extreme caution !!  Using this API endpoint you can purge (completely delete) a project and its data. This action can not be undone and will delete ALL your data.  !! Use with extreme caution !!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purgeProjectTest() throws ApiException {
        String projectId = null;
                api.purgeProject(projectId);
        // TODO: test validations
    }
    
    /**
     * Remove a member associated with this project. This also sets their invite status to &#x60;REMOVED&#x60;.
     *
     * This endpoint requires the user to be a member of the project with the role &#x60;OWNER&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeProjectMemberTest() throws ApiException {
        String projectId = null;
        String memberId = null;
                api.removeProjectMember(projectId, memberId);
        // TODO: test validations
    }
    
    /**
     * Sets Your Active Project
     *
     * Use this API to set your active project in the Ory Cloud Console UI.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setActiveProjectTest() throws ApiException {
        InlineObject inlineObject = null;
                api.setActiveProject(inlineObject);
        // TODO: test validations
    }
    
    /**
     * Update a Project
     *
     * Creates a new configuration revision for a project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        String projectId = null;
        ProjectRevision projectRevision = null;
                Project response = api.updateProject(projectId, projectRevision);
        // TODO: test validations
    }
    
    /**
     * Update an Ory Cloud Project Configuration
     *
     * This endpoints allows you to update the Ory Cloud Project configuration for individual services (identity, permission, ...). The configuration is fully compatible with the open source projects for the respective services (e.g. Ory Kratos for Identity, Ory Keto for Permissions).  This endpoint expects the &#x60;version&#x60; key to be set in the payload. If it is unset, it will try to import the config as if it is from the most recent version.  If you have an older version of a configuration, you should set the version key in the payload!  While this endpoint is able to process all configuration items related to features (e.g. password reset), it does not support operational configuration items (e.g. port, tracing, logging) otherwise available in the open source.  For configuration items that can not be translated to Ory Cloud, this endpoint will return a list of warnings to help you understand which parts of your config could not be processed.  Be aware that updating any service&#39;s configuration will completely override your current configuration for that service!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectConfigTest() throws ApiException {
        String projectId = null;
        UpdateProjectConfigConfig updateProjectConfigConfig = null;
                SuccessfulProjectConfigUpdate response = api.updateProjectConfig(projectId, updateProjectConfigConfig);
        // TODO: test validations
    }
    
}
