/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.7
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
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.UiNodeAnchorAttributes;
import sh.ory.model.UiNodeImageAttributes;
import sh.ory.model.UiNodeInputAttributes;
import sh.ory.model.UiNodeScriptAttributes;
import sh.ory.model.UiNodeTextAttributes;
import sh.ory.model.UiText;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UiNodeAttributes
 */
public class UiNodeAttributesTest {
    private final UiNodeAttributes model = new UiNodeAttributes();

    /**
     * Model tests for UiNodeAttributes
     */
    @Test
    public void testUiNodeAttributes() {
        // TODO: test UiNodeAttributes
    }

    /**
     * Test the property 'autocomplete'
     */
    @Test
    public void autocompleteTest() {
        // TODO: test autocomplete
    }

    /**
     * Test the property 'disabled'
     */
    @Test
    public void disabledTest() {
        // TODO: test disabled
    }

    /**
     * Test the property 'label'
     */
    @Test
    public void labelTest() {
        // TODO: test label
    }

    /**
     * Test the property 'maxlength'
     */
    @Test
    public void maxlengthTest() {
        // TODO: test maxlength
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'nodeType'
     */
    @Test
    public void nodeTypeTest() {
        // TODO: test nodeType
    }

    /**
     * Test the property 'onclick'
     */
    @Test
    public void onclickTest() {
        // TODO: test onclick
    }

    /**
     * Test the property 'onclickTrigger'
     */
    @Test
    public void onclickTriggerTest() {
        // TODO: test onclickTrigger
    }

    /**
     * Test the property 'onload'
     */
    @Test
    public void onloadTest() {
        // TODO: test onload
    }

    /**
     * Test the property 'onloadTrigger'
     */
    @Test
    public void onloadTriggerTest() {
        // TODO: test onloadTrigger
    }

    /**
     * Test the property 'pattern'
     */
    @Test
    public void patternTest() {
        // TODO: test pattern
    }

    /**
     * Test the property 'required'
     */
    @Test
    public void requiredTest() {
        // TODO: test required
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'value'
     */
    @Test
    public void valueTest() {
        // TODO: test value
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'text'
     */
    @Test
    public void textTest() {
        // TODO: test text
    }

    /**
     * Test the property 'height'
     */
    @Test
    public void heightTest() {
        // TODO: test height
    }

    /**
     * Test the property 'src'
     */
    @Test
    public void srcTest() {
        // TODO: test src
    }

    /**
     * Test the property 'width'
     */
    @Test
    public void widthTest() {
        // TODO: test width
    }

    /**
     * Test the property 'href'
     */
    @Test
    public void hrefTest() {
        // TODO: test href
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'async'
     */
    @Test
    public void asyncTest() {
        // TODO: test async
    }

    /**
     * Test the property 'crossorigin'
     */
    @Test
    public void crossoriginTest() {
        // TODO: test crossorigin
    }

    /**
     * Test the property 'integrity'
     */
    @Test
    public void integrityTest() {
        // TODO: test integrity
    }

    /**
     * Test the property 'nonce'
     */
    @Test
    public void nonceTest() {
        // TODO: test nonce
    }

    /**
     * Test the property 'referrerpolicy'
     */
    @Test
    public void referrerpolicyTest() {
        // TODO: test referrerpolicy
    }

}
