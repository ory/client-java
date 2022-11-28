/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0-alpha.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.ErrorOAuth2;
import sh.ory.model.GenericError;
import sh.ory.model.OAuth2Client;
import sh.ory.model.OidcConfiguration;
import sh.ory.model.OidcUserInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OidcApi
 */
@Disabled
public class OidcApiTest {

    private final OidcApi api = new OidcApi();

    /**
     * Register OAuth2 Client using OpenID Dynamic Client Registration
     *
     * This endpoint behaves like the administrative counterpart (&#x60;createOAuth2Client&#x60;) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  Please note that using this endpoint you are not able to choose the &#x60;client_secret&#x60; nor the &#x60;client_id&#x60; as those values will be server generated when specifying &#x60;token_endpoint_auth_method&#x60; as &#x60;client_secret_basic&#x60; or &#x60;client_secret_post&#x60;.  The &#x60;client_secret&#x60; will be returned in the response and you will not be able to retrieve it later on. Write the secret down and keep it somewhere safe.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOidcDynamicClientTest() throws ApiException {
        OAuth2Client oauth2Client = null;
        OAuth2Client response = api.createOidcDynamicClient(oauth2Client);
        // TODO: test validations
    }

    /**
     * Delete OAuth 2.0 Client using the OpenID Dynamic Client Registration Management Protocol
     *
     * This endpoint behaves like the administrative counterpart (&#x60;deleteOAuth2Client&#x60;) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol. This feature needs to be enabled in the configuration. This endpoint is disabled by default. It can be enabled by an administrator.  To use this endpoint, you will need to present the client&#39;s authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method &#x60;client_secret_post&#x60;, you need to present the client secret in the URL query. If it uses &#x60;client_secret_basic&#x60;, present the Client ID and the Client Secret in the Authorization header.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOidcDynamicClientTest() throws ApiException {
        String id = null;
        api.deleteOidcDynamicClient(id);
        // TODO: test validations
    }

    /**
     * OpenID Connect Discovery
     *
     * A mechanism for an OpenID Connect Relying Party to discover the End-User&#39;s OpenID Provider and obtain information needed to interact with it, including its OAuth 2.0 endpoint locations.  Popular libraries for OpenID Connect clients include oidc-client-js (JavaScript), go-oidc (Golang), and others. For a full list of clients go here: https://openid.net/developers/certified/
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void discoverOidcConfigurationTest() throws ApiException {
        OidcConfiguration response = api.discoverOidcConfiguration();
        // TODO: test validations
    }

    /**
     * Get OAuth2 Client using OpenID Dynamic Client Registration
     *
     * This endpoint behaves like the administrative counterpart (&#x60;getOAuth2Client&#x60;) but is capable of facing the public internet directly and can be used in self-service. It implements the OpenID Connect Dynamic Client Registration Protocol.  To use this endpoint, you will need to present the client&#39;s authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method &#x60;client_secret_post&#x60;, you need to present the client secret in the URL query. If it uses &#x60;client_secret_basic&#x60;, present the Client ID and the Client Secret in the Authorization header.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOidcDynamicClientTest() throws ApiException {
        String id = null;
        OAuth2Client response = api.getOidcDynamicClient(id);
        // TODO: test validations
    }

    /**
     * OpenID Connect Userinfo
     *
     * This endpoint returns the payload of the ID Token, including &#x60;session.id_token&#x60; values, of the provided OAuth 2.0 Access Token&#39;s consent request.  In the case of authentication error, a WWW-Authenticate header might be set in the response with more information about the error. See [the spec](https://datatracker.ietf.org/doc/html/rfc6750#section-3) for more details about header format.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOidcUserInfoTest() throws ApiException {
        OidcUserInfo response = api.getOidcUserInfo();
        // TODO: test validations
    }

    /**
     * OpenID Connect Front- and Back-channel Enabled Logout
     *
     * This endpoint initiates and completes user logout at the Ory OAuth2 &amp; OpenID provider and initiates OpenID Connect Front- / Back-channel logout:  https://openid.net/specs/openid-connect-frontchannel-1_0.html https://openid.net/specs/openid-connect-backchannel-1_0.html  Back-channel logout is performed asynchronously and does not affect logout flow.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeOidcSessionTest() throws ApiException {
        api.revokeOidcSession();
        // TODO: test validations
    }

    /**
     * Set OAuth2 Client using OpenID Dynamic Client Registration
     *
     * This endpoint behaves like the administrative counterpart (&#x60;setOAuth2Client&#x60;) but is capable of facing the public internet directly to be used by third parties. It implements the OpenID Connect Dynamic Client Registration Protocol.  This feature is disabled per default. It can be enabled by a system administrator.  If you pass &#x60;client_secret&#x60; the secret is used, otherwise the existing secret is used. If set, the secret is echoed in the response. It is not possible to retrieve it later on.  To use this endpoint, you will need to present the client&#39;s authentication credentials. If the OAuth2 Client uses the Token Endpoint Authentication Method &#x60;client_secret_post&#x60;, you need to present the client secret in the URL query. If it uses &#x60;client_secret_basic&#x60;, present the Client ID and the Client Secret in the Authorization header.  OAuth 2.0 clients are used to perform OAuth 2.0 and OpenID Connect flows. Usually, OAuth 2.0 clients are generated for applications which want to consume your OAuth 2.0 or OpenID Connect capabilities.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setOidcDynamicClientTest() throws ApiException {
        String id = null;
        OAuth2Client oauth2Client = null;
        OAuth2Client response = api.setOidcDynamicClient(id, oauth2Client);
        // TODO: test validations
    }

}
