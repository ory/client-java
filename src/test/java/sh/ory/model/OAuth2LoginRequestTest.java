/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.20.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sh.ory.model.OAuth2Client;
import sh.ory.model.OAuth2ConsentRequestOpenIDConnectContext;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for OAuth2LoginRequest
 */
public class OAuth2LoginRequestTest {
    private final OAuth2LoginRequest model = new OAuth2LoginRequest();

    /**
     * Model tests for OAuth2LoginRequest
     */
    @Test
    public void testOAuth2LoginRequest() {
        // TODO: test OAuth2LoginRequest
    }

    /**
     * Test the property 'challenge'
     */
    @Test
    public void challengeTest() {
        // TODO: test challenge
    }

    /**
     * Test the property 'client'
     */
    @Test
    public void clientTest() {
        // TODO: test client
    }

    /**
     * Test the property 'oidcContext'
     */
    @Test
    public void oidcContextTest() {
        // TODO: test oidcContext
    }

    /**
     * Test the property 'requestUrl'
     */
    @Test
    public void requestUrlTest() {
        // TODO: test requestUrl
    }

    /**
     * Test the property 'requestedAccessTokenAudience'
     */
    @Test
    public void requestedAccessTokenAudienceTest() {
        // TODO: test requestedAccessTokenAudience
    }

    /**
     * Test the property 'requestedScope'
     */
    @Test
    public void requestedScopeTest() {
        // TODO: test requestedScope
    }

    /**
     * Test the property 'sessionId'
     */
    @Test
    public void sessionIdTest() {
        // TODO: test sessionId
    }

    /**
     * Test the property 'skip'
     */
    @Test
    public void skipTest() {
        // TODO: test skip
    }

    /**
     * Test the property 'subject'
     */
    @Test
    public void subjectTest() {
        // TODO: test subject
    }

}
