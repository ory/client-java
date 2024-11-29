/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.13
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
import java.util.Arrays;
import sh.ory.model.UpdateRegistrationFlowWithCodeMethod;
import sh.ory.model.UpdateRegistrationFlowWithOidcMethod;
import sh.ory.model.UpdateRegistrationFlowWithPasskeyMethod;
import sh.ory.model.UpdateRegistrationFlowWithPasswordMethod;
import sh.ory.model.UpdateRegistrationFlowWithProfileMethod;
import sh.ory.model.UpdateRegistrationFlowWithWebAuthnMethod;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UpdateRegistrationFlowBody
 */
public class UpdateRegistrationFlowBodyTest {
    private final UpdateRegistrationFlowBody model = new UpdateRegistrationFlowBody();

    /**
     * Model tests for UpdateRegistrationFlowBody
     */
    @Test
    public void testUpdateRegistrationFlowBody() {
        // TODO: test UpdateRegistrationFlowBody
    }

    /**
     * Test the property 'csrfToken'
     */
    @Test
    public void csrfTokenTest() {
        // TODO: test csrfToken
    }

    /**
     * Test the property 'method'
     */
    @Test
    public void methodTest() {
        // TODO: test method
    }

    /**
     * Test the property 'password'
     */
    @Test
    public void passwordTest() {
        // TODO: test password
    }

    /**
     * Test the property 'traits'
     */
    @Test
    public void traitsTest() {
        // TODO: test traits
    }

    /**
     * Test the property 'transientPayload'
     */
    @Test
    public void transientPayloadTest() {
        // TODO: test transientPayload
    }

    /**
     * Test the property 'idToken'
     */
    @Test
    public void idTokenTest() {
        // TODO: test idToken
    }

    /**
     * Test the property 'idTokenNonce'
     */
    @Test
    public void idTokenNonceTest() {
        // TODO: test idTokenNonce
    }

    /**
     * Test the property 'provider'
     */
    @Test
    public void providerTest() {
        // TODO: test provider
    }

    /**
     * Test the property 'upstreamParameters'
     */
    @Test
    public void upstreamParametersTest() {
        // TODO: test upstreamParameters
    }

    /**
     * Test the property 'webauthnRegister'
     */
    @Test
    public void webauthnRegisterTest() {
        // TODO: test webauthnRegister
    }

    /**
     * Test the property 'webauthnRegisterDisplayname'
     */
    @Test
    public void webauthnRegisterDisplaynameTest() {
        // TODO: test webauthnRegisterDisplayname
    }

    /**
     * Test the property 'code'
     */
    @Test
    public void codeTest() {
        // TODO: test code
    }

    /**
     * Test the property 'resend'
     */
    @Test
    public void resendTest() {
        // TODO: test resend
    }

    /**
     * Test the property 'passkeyRegister'
     */
    @Test
    public void passkeyRegisterTest() {
        // TODO: test passkeyRegister
    }

    /**
     * Test the property 'screen'
     */
    @Test
    public void screenTest() {
        // TODO: test screen
    }

}
