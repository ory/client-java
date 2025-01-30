/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.4
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
import sh.ory.model.UpdateSettingsFlowWithLookupMethod;
import sh.ory.model.UpdateSettingsFlowWithOidcMethod;
import sh.ory.model.UpdateSettingsFlowWithPasskeyMethod;
import sh.ory.model.UpdateSettingsFlowWithPasswordMethod;
import sh.ory.model.UpdateSettingsFlowWithProfileMethod;
import sh.ory.model.UpdateSettingsFlowWithTotpMethod;
import sh.ory.model.UpdateSettingsFlowWithWebAuthnMethod;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UpdateSettingsFlowBody
 */
public class UpdateSettingsFlowBodyTest {
    private final UpdateSettingsFlowBody model = new UpdateSettingsFlowBody();

    /**
     * Model tests for UpdateSettingsFlowBody
     */
    @Test
    public void testUpdateSettingsFlowBody() {
        // TODO: test UpdateSettingsFlowBody
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
     * Test the property 'transientPayload'
     */
    @Test
    public void transientPayloadTest() {
        // TODO: test transientPayload
    }

    /**
     * Test the property 'traits'
     */
    @Test
    public void traitsTest() {
        // TODO: test traits
    }

    /**
     * Test the property 'flow'
     */
    @Test
    public void flowTest() {
        // TODO: test flow
    }

    /**
     * Test the property 'link'
     */
    @Test
    public void linkTest() {
        // TODO: test link
    }

    /**
     * Test the property 'unlink'
     */
    @Test
    public void unlinkTest() {
        // TODO: test unlink
    }

    /**
     * Test the property 'upstreamParameters'
     */
    @Test
    public void upstreamParametersTest() {
        // TODO: test upstreamParameters
    }

    /**
     * Test the property 'totpCode'
     */
    @Test
    public void totpCodeTest() {
        // TODO: test totpCode
    }

    /**
     * Test the property 'totpUnlink'
     */
    @Test
    public void totpUnlinkTest() {
        // TODO: test totpUnlink
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
     * Test the property 'webauthnRemove'
     */
    @Test
    public void webauthnRemoveTest() {
        // TODO: test webauthnRemove
    }

    /**
     * Test the property 'lookupSecretConfirm'
     */
    @Test
    public void lookupSecretConfirmTest() {
        // TODO: test lookupSecretConfirm
    }

    /**
     * Test the property 'lookupSecretDisable'
     */
    @Test
    public void lookupSecretDisableTest() {
        // TODO: test lookupSecretDisable
    }

    /**
     * Test the property 'lookupSecretRegenerate'
     */
    @Test
    public void lookupSecretRegenerateTest() {
        // TODO: test lookupSecretRegenerate
    }

    /**
     * Test the property 'lookupSecretReveal'
     */
    @Test
    public void lookupSecretRevealTest() {
        // TODO: test lookupSecretReveal
    }

    /**
     * Test the property 'passkeyRemove'
     */
    @Test
    public void passkeyRemoveTest() {
        // TODO: test passkeyRemove
    }

    /**
     * Test the property 'passkeySettingsRegister'
     */
    @Test
    public void passkeySettingsRegisterTest() {
        // TODO: test passkeySettingsRegister
    }

}
