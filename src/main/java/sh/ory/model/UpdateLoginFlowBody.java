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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import sh.ory.model.UpdateLoginFlowWithCodeMethod;
import sh.ory.model.UpdateLoginFlowWithIdentifierFirstMethod;
import sh.ory.model.UpdateLoginFlowWithLookupSecretMethod;
import sh.ory.model.UpdateLoginFlowWithOidcMethod;
import sh.ory.model.UpdateLoginFlowWithPasskeyMethod;
import sh.ory.model.UpdateLoginFlowWithPasswordMethod;
import sh.ory.model.UpdateLoginFlowWithTotpMethod;
import sh.ory.model.UpdateLoginFlowWithWebAuthnMethod;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import sh.ory.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-30T14:01:51.626964496Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UpdateLoginFlowBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateLoginFlowBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateLoginFlowBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateLoginFlowBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateLoginFlowWithPasswordMethod> adapterUpdateLoginFlowWithPasswordMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithPasswordMethod.class));
            final TypeAdapter<UpdateLoginFlowWithOidcMethod> adapterUpdateLoginFlowWithOidcMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithOidcMethod.class));
            final TypeAdapter<UpdateLoginFlowWithTotpMethod> adapterUpdateLoginFlowWithTotpMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithTotpMethod.class));
            final TypeAdapter<UpdateLoginFlowWithWebAuthnMethod> adapterUpdateLoginFlowWithWebAuthnMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithWebAuthnMethod.class));
            final TypeAdapter<UpdateLoginFlowWithLookupSecretMethod> adapterUpdateLoginFlowWithLookupSecretMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithLookupSecretMethod.class));
            final TypeAdapter<UpdateLoginFlowWithCodeMethod> adapterUpdateLoginFlowWithCodeMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithCodeMethod.class));
            final TypeAdapter<UpdateLoginFlowWithPasskeyMethod> adapterUpdateLoginFlowWithPasskeyMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithPasskeyMethod.class));
            final TypeAdapter<UpdateLoginFlowWithIdentifierFirstMethod> adapterUpdateLoginFlowWithIdentifierFirstMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithIdentifierFirstMethod.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateLoginFlowBody>() {
                @Override
                public void write(JsonWriter out, UpdateLoginFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateLoginFlowWithPasswordMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithPasswordMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithPasswordMethod.toJsonTree((UpdateLoginFlowWithPasswordMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateLoginFlowWithOidcMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithOidcMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithOidcMethod.toJsonTree((UpdateLoginFlowWithOidcMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateLoginFlowWithTotpMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithTotpMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithTotpMethod.toJsonTree((UpdateLoginFlowWithTotpMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateLoginFlowWithWebAuthnMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithWebAuthnMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithWebAuthnMethod.toJsonTree((UpdateLoginFlowWithWebAuthnMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateLoginFlowWithLookupSecretMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithLookupSecretMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithLookupSecretMethod.toJsonTree((UpdateLoginFlowWithLookupSecretMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateLoginFlowWithCodeMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithCodeMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithCodeMethod.toJsonTree((UpdateLoginFlowWithCodeMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateLoginFlowWithPasskeyMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithPasskeyMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithPasskeyMethod.toJsonTree((UpdateLoginFlowWithPasskeyMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateLoginFlowWithIdentifierFirstMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithIdentifierFirstMethod) {
                        JsonElement element = adapterUpdateLoginFlowWithIdentifierFirstMethod.toJsonTree((UpdateLoginFlowWithIdentifierFirstMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithIdentifierFirstMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasskeyMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod");
                }

                @Override
                public UpdateLoginFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    UpdateLoginFlowBody newUpdateLoginFlowBody = new UpdateLoginFlowBody();
                    if (jsonObject.get("method") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for UpdateLoginFlowBody as `method` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `method`
                        switch (jsonObject.get("method").getAsString()) {
                            case "code":
                                deserialized = adapterUpdateLoginFlowWithCodeMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "identifier_first":
                                deserialized = adapterUpdateLoginFlowWithIdentifierFirstMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "lookup_secret":
                                deserialized = adapterUpdateLoginFlowWithLookupSecretMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "oidc":
                                deserialized = adapterUpdateLoginFlowWithOidcMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "passkey":
                                deserialized = adapterUpdateLoginFlowWithPasskeyMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "password":
                                deserialized = adapterUpdateLoginFlowWithPasswordMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "totp":
                                deserialized = adapterUpdateLoginFlowWithTotpMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "webauthn":
                                deserialized = adapterUpdateLoginFlowWithWebAuthnMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithCodeMethod":
                                deserialized = adapterUpdateLoginFlowWithCodeMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithIdentifierFirstMethod":
                                deserialized = adapterUpdateLoginFlowWithIdentifierFirstMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithLookupSecretMethod":
                                deserialized = adapterUpdateLoginFlowWithLookupSecretMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithOidcMethod":
                                deserialized = adapterUpdateLoginFlowWithOidcMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithPasskeyMethod":
                                deserialized = adapterUpdateLoginFlowWithPasskeyMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithPasswordMethod":
                                deserialized = adapterUpdateLoginFlowWithPasswordMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithTotpMethod":
                                deserialized = adapterUpdateLoginFlowWithTotpMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            case "updateLoginFlowWithWebAuthnMethod":
                                deserialized = adapterUpdateLoginFlowWithWebAuthnMethod.fromJsonTree(jsonObject);
                                newUpdateLoginFlowBody.setActualInstance(deserialized);
                                return newUpdateLoginFlowBody;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for UpdateLoginFlowBody. Possible values: code identifier_first lookup_secret oidc passkey password totp webauthn updateLoginFlowWithCodeMethod updateLoginFlowWithIdentifierFirstMethod updateLoginFlowWithLookupSecretMethod updateLoginFlowWithOidcMethod updateLoginFlowWithPasskeyMethod updateLoginFlowWithPasswordMethod updateLoginFlowWithTotpMethod updateLoginFlowWithWebAuthnMethod", jsonObject.get("method").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpdateLoginFlowWithPasswordMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithPasswordMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithPasswordMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithPasswordMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithPasswordMethod'", e);
                    }
                    // deserialize UpdateLoginFlowWithOidcMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithOidcMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithOidcMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithOidcMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithOidcMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithOidcMethod'", e);
                    }
                    // deserialize UpdateLoginFlowWithTotpMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithTotpMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithTotpMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithTotpMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithTotpMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithTotpMethod'", e);
                    }
                    // deserialize UpdateLoginFlowWithWebAuthnMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithWebAuthnMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithWebAuthnMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithWebAuthnMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithWebAuthnMethod'", e);
                    }
                    // deserialize UpdateLoginFlowWithLookupSecretMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithLookupSecretMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithLookupSecretMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithLookupSecretMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithLookupSecretMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithLookupSecretMethod'", e);
                    }
                    // deserialize UpdateLoginFlowWithCodeMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithCodeMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithCodeMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithCodeMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithCodeMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithCodeMethod'", e);
                    }
                    // deserialize UpdateLoginFlowWithPasskeyMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithPasskeyMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithPasskeyMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithPasskeyMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithPasskeyMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithPasskeyMethod'", e);
                    }
                    // deserialize UpdateLoginFlowWithIdentifierFirstMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithIdentifierFirstMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateLoginFlowWithIdentifierFirstMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithIdentifierFirstMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithIdentifierFirstMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithIdentifierFirstMethod'", e);
                    }

                    if (match == 1) {
                        UpdateLoginFlowBody ret = new UpdateLoginFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateLoginFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateLoginFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateLoginFlowBody(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateLoginFlowWithPasswordMethod", UpdateLoginFlowWithPasswordMethod.class);
        schemas.put("UpdateLoginFlowWithOidcMethod", UpdateLoginFlowWithOidcMethod.class);
        schemas.put("UpdateLoginFlowWithTotpMethod", UpdateLoginFlowWithTotpMethod.class);
        schemas.put("UpdateLoginFlowWithWebAuthnMethod", UpdateLoginFlowWithWebAuthnMethod.class);
        schemas.put("UpdateLoginFlowWithLookupSecretMethod", UpdateLoginFlowWithLookupSecretMethod.class);
        schemas.put("UpdateLoginFlowWithCodeMethod", UpdateLoginFlowWithCodeMethod.class);
        schemas.put("UpdateLoginFlowWithPasskeyMethod", UpdateLoginFlowWithPasskeyMethod.class);
        schemas.put("UpdateLoginFlowWithIdentifierFirstMethod", UpdateLoginFlowWithIdentifierFirstMethod.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateLoginFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithIdentifierFirstMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasskeyMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpdateLoginFlowWithPasswordMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithOidcMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithTotpMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithWebAuthnMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithLookupSecretMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithCodeMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithPasskeyMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithIdentifierFirstMethod) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithIdentifierFirstMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasskeyMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithIdentifierFirstMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasskeyMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod
     *
     * @return The actual instance (UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithIdentifierFirstMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasskeyMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateLoginFlowWithPasswordMethod`. If the actual instance is not `UpdateLoginFlowWithPasswordMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithPasswordMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithPasswordMethod`
     */
    public UpdateLoginFlowWithPasswordMethod getUpdateLoginFlowWithPasswordMethod() throws ClassCastException {
        return (UpdateLoginFlowWithPasswordMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateLoginFlowWithOidcMethod`. If the actual instance is not `UpdateLoginFlowWithOidcMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithOidcMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithOidcMethod`
     */
    public UpdateLoginFlowWithOidcMethod getUpdateLoginFlowWithOidcMethod() throws ClassCastException {
        return (UpdateLoginFlowWithOidcMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateLoginFlowWithTotpMethod`. If the actual instance is not `UpdateLoginFlowWithTotpMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithTotpMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithTotpMethod`
     */
    public UpdateLoginFlowWithTotpMethod getUpdateLoginFlowWithTotpMethod() throws ClassCastException {
        return (UpdateLoginFlowWithTotpMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateLoginFlowWithWebAuthnMethod`. If the actual instance is not `UpdateLoginFlowWithWebAuthnMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithWebAuthnMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithWebAuthnMethod`
     */
    public UpdateLoginFlowWithWebAuthnMethod getUpdateLoginFlowWithWebAuthnMethod() throws ClassCastException {
        return (UpdateLoginFlowWithWebAuthnMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateLoginFlowWithLookupSecretMethod`. If the actual instance is not `UpdateLoginFlowWithLookupSecretMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithLookupSecretMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithLookupSecretMethod`
     */
    public UpdateLoginFlowWithLookupSecretMethod getUpdateLoginFlowWithLookupSecretMethod() throws ClassCastException {
        return (UpdateLoginFlowWithLookupSecretMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateLoginFlowWithCodeMethod`. If the actual instance is not `UpdateLoginFlowWithCodeMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithCodeMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithCodeMethod`
     */
    public UpdateLoginFlowWithCodeMethod getUpdateLoginFlowWithCodeMethod() throws ClassCastException {
        return (UpdateLoginFlowWithCodeMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateLoginFlowWithPasskeyMethod`. If the actual instance is not `UpdateLoginFlowWithPasskeyMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithPasskeyMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithPasskeyMethod`
     */
    public UpdateLoginFlowWithPasskeyMethod getUpdateLoginFlowWithPasskeyMethod() throws ClassCastException {
        return (UpdateLoginFlowWithPasskeyMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateLoginFlowWithIdentifierFirstMethod`. If the actual instance is not `UpdateLoginFlowWithIdentifierFirstMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateLoginFlowWithIdentifierFirstMethod`
     * @throws ClassCastException if the instance is not `UpdateLoginFlowWithIdentifierFirstMethod`
     */
    public UpdateLoginFlowWithIdentifierFirstMethod getUpdateLoginFlowWithIdentifierFirstMethod() throws ClassCastException {
        return (UpdateLoginFlowWithIdentifierFirstMethod)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateLoginFlowBody
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpdateLoginFlowWithPasswordMethod
        try {
            UpdateLoginFlowWithPasswordMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateLoginFlowWithOidcMethod
        try {
            UpdateLoginFlowWithOidcMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithOidcMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateLoginFlowWithTotpMethod
        try {
            UpdateLoginFlowWithTotpMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithTotpMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateLoginFlowWithWebAuthnMethod
        try {
            UpdateLoginFlowWithWebAuthnMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateLoginFlowWithLookupSecretMethod
        try {
            UpdateLoginFlowWithLookupSecretMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithLookupSecretMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateLoginFlowWithCodeMethod
        try {
            UpdateLoginFlowWithCodeMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithCodeMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateLoginFlowWithPasskeyMethod
        try {
            UpdateLoginFlowWithPasskeyMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithPasskeyMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateLoginFlowWithIdentifierFirstMethod
        try {
            UpdateLoginFlowWithIdentifierFirstMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithIdentifierFirstMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpdateLoginFlowBody with oneOf schemas: UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithIdentifierFirstMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasskeyMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of UpdateLoginFlowBody given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateLoginFlowBody
     * @throws IOException if the JSON string is invalid with respect to UpdateLoginFlowBody
     */
    public static UpdateLoginFlowBody fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateLoginFlowBody.class);
    }

    /**
     * Convert an instance of UpdateLoginFlowBody to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

