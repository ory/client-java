/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.20.7
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.CreateJsonWebKeySet;
import sh.ory.model.ErrorOAuth2;
import sh.ory.model.JsonWebKey;
import sh.ory.model.JsonWebKeySet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JwkApi
 */
@Disabled
public class JwkApiTest {

    private final JwkApi api = new JwkApi();

    /**
     * Create JSON Web Key
     *
     * This endpoint is capable of generating JSON Web Key Sets for you. There a different strategies available, such as symmetric cryptographic keys (HS256, HS512) and asymetric cryptographic keys (RS256, ECDSA). If the specified JSON Web Key Set does not exist, it will be created.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createJsonWebKeySetTest() throws ApiException {
        String set = null;
        CreateJsonWebKeySet createJsonWebKeySet = null;
        JsonWebKeySet response = api.createJsonWebKeySet(set, createJsonWebKeySet);
        // TODO: test validations
    }

    /**
     * Delete JSON Web Key
     *
     * Use this endpoint to delete a single JSON Web Key.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteJsonWebKeyTest() throws ApiException {
        String set = null;
        String kid = null;
        api.deleteJsonWebKey(set, kid);
        // TODO: test validations
    }

    /**
     * Delete JSON Web Key Set
     *
     * Use this endpoint to delete a complete JSON Web Key Set and all the keys in that set.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteJsonWebKeySetTest() throws ApiException {
        String set = null;
        api.deleteJsonWebKeySet(set);
        // TODO: test validations
    }

    /**
     * Get JSON Web Key
     *
     * This endpoint returns a singular JSON Web Key contained in a set. It is identified by the set and the specific key ID (kid).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJsonWebKeyTest() throws ApiException {
        String set = null;
        String kid = null;
        JsonWebKeySet response = api.getJsonWebKey(set, kid);
        // TODO: test validations
    }

    /**
     * Retrieve a JSON Web Key Set
     *
     * This endpoint can be used to retrieve JWK Sets stored in ORY Hydra.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJsonWebKeySetTest() throws ApiException {
        String set = null;
        JsonWebKeySet response = api.getJsonWebKeySet(set);
        // TODO: test validations
    }

    /**
     * Set JSON Web Key
     *
     * Use this method if you do not want to let Hydra generate the JWKs for you, but instead save your own.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setJsonWebKeyTest() throws ApiException {
        String set = null;
        String kid = null;
        JsonWebKey jsonWebKey = null;
        JsonWebKey response = api.setJsonWebKey(set, kid, jsonWebKey);
        // TODO: test validations
    }

    /**
     * Update a JSON Web Key Set
     *
     * Use this method if you do not want to let Hydra generate the JWKs for you, but instead save your own.  A JSON Web Key (JWK) is a JavaScript Object Notation (JSON) data structure that represents a cryptographic key. A JWK Set is a JSON data structure that represents a set of JWKs. A JSON Web Key is identified by its set and key id. ORY Hydra uses this functionality to store cryptographic keys used for TLS and JSON Web Tokens (such as OpenID Connect ID tokens), and allows storing user-defined keys as well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setJsonWebKeySetTest() throws ApiException {
        String set = null;
        JsonWebKeySet jsonWebKeySet = null;
        JsonWebKeySet response = api.setJsonWebKeySet(set, jsonWebKeySet);
        // TODO: test validations
    }

}
