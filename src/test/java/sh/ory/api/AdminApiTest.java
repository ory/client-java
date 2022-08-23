/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.14
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.GenericError;
import sh.ory.model.OAuth2Client;
import sh.ory.model.UpdateOAuth2ClientLifespans;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Ignore
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    
    /**
     * 
     *
     * UpdateLifespans an existing OAuth 2.0 client&#39;s token lifespan configuration. This client configuration takes precedence over the instance-wide token lifespan configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOAuth2ClientLifespansTest() throws ApiException {
        String id = null;
        UpdateOAuth2ClientLifespans updateOAuth2ClientLifespans = null;
                OAuth2Client response = api.updateOAuth2ClientLifespans(id, updateOAuth2ClientLifespans);
        // TODO: test validations
    }
    
}
