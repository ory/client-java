/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.19.0
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
import sh.ory.model.UpdateRegistrationFlowWithCodeMethod;
import sh.ory.model.UpdateRegistrationFlowWithOidcMethod;
import sh.ory.model.UpdateRegistrationFlowWithPasskeyMethod;
import sh.ory.model.UpdateRegistrationFlowWithPasswordMethod;
import sh.ory.model.UpdateRegistrationFlowWithProfileMethod;
import sh.ory.model.UpdateRegistrationFlowWithSamlMethod;
import sh.ory.model.UpdateRegistrationFlowWithWebAuthnMethod;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T11:29:18.613405246Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UpdateRegistrationFlowBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateRegistrationFlowBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateRegistrationFlowBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateRegistrationFlowBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateRegistrationFlowWithPasswordMethod> adapterUpdateRegistrationFlowWithPasswordMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithPasswordMethod.class));
            final TypeAdapter<UpdateRegistrationFlowWithOidcMethod> adapterUpdateRegistrationFlowWithOidcMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithOidcMethod.class));
            final TypeAdapter<UpdateRegistrationFlowWithSamlMethod> adapterUpdateRegistrationFlowWithSamlMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithSamlMethod.class));
            final TypeAdapter<UpdateRegistrationFlowWithWebAuthnMethod> adapterUpdateRegistrationFlowWithWebAuthnMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithWebAuthnMethod.class));
            final TypeAdapter<UpdateRegistrationFlowWithCodeMethod> adapterUpdateRegistrationFlowWithCodeMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithCodeMethod.class));
            final TypeAdapter<UpdateRegistrationFlowWithPasskeyMethod> adapterUpdateRegistrationFlowWithPasskeyMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithPasskeyMethod.class));
            final TypeAdapter<UpdateRegistrationFlowWithProfileMethod> adapterUpdateRegistrationFlowWithProfileMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithProfileMethod.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateRegistrationFlowBody>() {
                @Override
                public void write(JsonWriter out, UpdateRegistrationFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateRegistrationFlowWithPasswordMethod`
                    if (value.getActualInstance() instanceof UpdateRegistrationFlowWithPasswordMethod) {
                        JsonElement element = adapterUpdateRegistrationFlowWithPasswordMethod.toJsonTree((UpdateRegistrationFlowWithPasswordMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateRegistrationFlowWithOidcMethod`
                    if (value.getActualInstance() instanceof UpdateRegistrationFlowWithOidcMethod) {
                        JsonElement element = adapterUpdateRegistrationFlowWithOidcMethod.toJsonTree((UpdateRegistrationFlowWithOidcMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateRegistrationFlowWithSamlMethod`
                    if (value.getActualInstance() instanceof UpdateRegistrationFlowWithSamlMethod) {
                        JsonElement element = adapterUpdateRegistrationFlowWithSamlMethod.toJsonTree((UpdateRegistrationFlowWithSamlMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateRegistrationFlowWithWebAuthnMethod`
                    if (value.getActualInstance() instanceof UpdateRegistrationFlowWithWebAuthnMethod) {
                        JsonElement element = adapterUpdateRegistrationFlowWithWebAuthnMethod.toJsonTree((UpdateRegistrationFlowWithWebAuthnMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateRegistrationFlowWithCodeMethod`
                    if (value.getActualInstance() instanceof UpdateRegistrationFlowWithCodeMethod) {
                        JsonElement element = adapterUpdateRegistrationFlowWithCodeMethod.toJsonTree((UpdateRegistrationFlowWithCodeMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateRegistrationFlowWithPasskeyMethod`
                    if (value.getActualInstance() instanceof UpdateRegistrationFlowWithPasskeyMethod) {
                        JsonElement element = adapterUpdateRegistrationFlowWithPasskeyMethod.toJsonTree((UpdateRegistrationFlowWithPasskeyMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateRegistrationFlowWithProfileMethod`
                    if (value.getActualInstance() instanceof UpdateRegistrationFlowWithProfileMethod) {
                        JsonElement element = adapterUpdateRegistrationFlowWithProfileMethod.toJsonTree((UpdateRegistrationFlowWithProfileMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpdateRegistrationFlowWithCodeMethod, UpdateRegistrationFlowWithOidcMethod, UpdateRegistrationFlowWithPasskeyMethod, UpdateRegistrationFlowWithPasswordMethod, UpdateRegistrationFlowWithProfileMethod, UpdateRegistrationFlowWithSamlMethod, UpdateRegistrationFlowWithWebAuthnMethod");
                }

                @Override
                public UpdateRegistrationFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    UpdateRegistrationFlowBody newUpdateRegistrationFlowBody = new UpdateRegistrationFlowBody();
                    if (jsonObject.get("method") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for UpdateRegistrationFlowBody as `method` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `method`
                        switch (jsonObject.get("method").getAsString()) {
                            case "code":
                                deserialized = adapterUpdateRegistrationFlowWithCodeMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "oidc":
                                deserialized = adapterUpdateRegistrationFlowWithOidcMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "passkey":
                                deserialized = adapterUpdateRegistrationFlowWithPasskeyMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "password":
                                deserialized = adapterUpdateRegistrationFlowWithPasswordMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "profile":
                                deserialized = adapterUpdateRegistrationFlowWithProfileMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "saml":
                                deserialized = adapterUpdateRegistrationFlowWithSamlMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "webauthn":
                                deserialized = adapterUpdateRegistrationFlowWithWebAuthnMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "updateRegistrationFlowWithCodeMethod":
                                deserialized = adapterUpdateRegistrationFlowWithCodeMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "updateRegistrationFlowWithOidcMethod":
                                deserialized = adapterUpdateRegistrationFlowWithOidcMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "updateRegistrationFlowWithPasskeyMethod":
                                deserialized = adapterUpdateRegistrationFlowWithPasskeyMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "updateRegistrationFlowWithPasswordMethod":
                                deserialized = adapterUpdateRegistrationFlowWithPasswordMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "updateRegistrationFlowWithProfileMethod":
                                deserialized = adapterUpdateRegistrationFlowWithProfileMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "updateRegistrationFlowWithSamlMethod":
                                deserialized = adapterUpdateRegistrationFlowWithSamlMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            case "updateRegistrationFlowWithWebAuthnMethod":
                                deserialized = adapterUpdateRegistrationFlowWithWebAuthnMethod.fromJsonTree(jsonObject);
                                newUpdateRegistrationFlowBody.setActualInstance(deserialized);
                                return newUpdateRegistrationFlowBody;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for UpdateRegistrationFlowBody. Possible values: code oidc passkey password profile saml webauthn updateRegistrationFlowWithCodeMethod updateRegistrationFlowWithOidcMethod updateRegistrationFlowWithPasskeyMethod updateRegistrationFlowWithPasswordMethod updateRegistrationFlowWithProfileMethod updateRegistrationFlowWithSamlMethod updateRegistrationFlowWithWebAuthnMethod", jsonObject.get("method").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpdateRegistrationFlowWithPasswordMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRegistrationFlowWithPasswordMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateRegistrationFlowWithPasswordMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRegistrationFlowWithPasswordMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRegistrationFlowWithPasswordMethod'", e);
                    }
                    // deserialize UpdateRegistrationFlowWithOidcMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRegistrationFlowWithOidcMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateRegistrationFlowWithOidcMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRegistrationFlowWithOidcMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithOidcMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRegistrationFlowWithOidcMethod'", e);
                    }
                    // deserialize UpdateRegistrationFlowWithSamlMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRegistrationFlowWithSamlMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateRegistrationFlowWithSamlMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRegistrationFlowWithSamlMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithSamlMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRegistrationFlowWithSamlMethod'", e);
                    }
                    // deserialize UpdateRegistrationFlowWithWebAuthnMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRegistrationFlowWithWebAuthnMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateRegistrationFlowWithWebAuthnMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRegistrationFlowWithWebAuthnMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRegistrationFlowWithWebAuthnMethod'", e);
                    }
                    // deserialize UpdateRegistrationFlowWithCodeMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRegistrationFlowWithCodeMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateRegistrationFlowWithCodeMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRegistrationFlowWithCodeMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithCodeMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRegistrationFlowWithCodeMethod'", e);
                    }
                    // deserialize UpdateRegistrationFlowWithPasskeyMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRegistrationFlowWithPasskeyMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateRegistrationFlowWithPasskeyMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRegistrationFlowWithPasskeyMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithPasskeyMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRegistrationFlowWithPasskeyMethod'", e);
                    }
                    // deserialize UpdateRegistrationFlowWithProfileMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRegistrationFlowWithProfileMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateRegistrationFlowWithProfileMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRegistrationFlowWithProfileMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithProfileMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRegistrationFlowWithProfileMethod'", e);
                    }

                    if (match == 1) {
                        UpdateRegistrationFlowBody ret = new UpdateRegistrationFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateRegistrationFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateRegistrationFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateRegistrationFlowBody(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateRegistrationFlowWithPasswordMethod", UpdateRegistrationFlowWithPasswordMethod.class);
        schemas.put("UpdateRegistrationFlowWithOidcMethod", UpdateRegistrationFlowWithOidcMethod.class);
        schemas.put("UpdateRegistrationFlowWithSamlMethod", UpdateRegistrationFlowWithSamlMethod.class);
        schemas.put("UpdateRegistrationFlowWithWebAuthnMethod", UpdateRegistrationFlowWithWebAuthnMethod.class);
        schemas.put("UpdateRegistrationFlowWithCodeMethod", UpdateRegistrationFlowWithCodeMethod.class);
        schemas.put("UpdateRegistrationFlowWithPasskeyMethod", UpdateRegistrationFlowWithPasskeyMethod.class);
        schemas.put("UpdateRegistrationFlowWithProfileMethod", UpdateRegistrationFlowWithProfileMethod.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateRegistrationFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateRegistrationFlowWithCodeMethod, UpdateRegistrationFlowWithOidcMethod, UpdateRegistrationFlowWithPasskeyMethod, UpdateRegistrationFlowWithPasswordMethod, UpdateRegistrationFlowWithProfileMethod, UpdateRegistrationFlowWithSamlMethod, UpdateRegistrationFlowWithWebAuthnMethod
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpdateRegistrationFlowWithPasswordMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateRegistrationFlowWithOidcMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateRegistrationFlowWithSamlMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateRegistrationFlowWithWebAuthnMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateRegistrationFlowWithCodeMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateRegistrationFlowWithPasskeyMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateRegistrationFlowWithProfileMethod) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateRegistrationFlowWithCodeMethod, UpdateRegistrationFlowWithOidcMethod, UpdateRegistrationFlowWithPasskeyMethod, UpdateRegistrationFlowWithPasswordMethod, UpdateRegistrationFlowWithProfileMethod, UpdateRegistrationFlowWithSamlMethod, UpdateRegistrationFlowWithWebAuthnMethod");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateRegistrationFlowWithCodeMethod, UpdateRegistrationFlowWithOidcMethod, UpdateRegistrationFlowWithPasskeyMethod, UpdateRegistrationFlowWithPasswordMethod, UpdateRegistrationFlowWithProfileMethod, UpdateRegistrationFlowWithSamlMethod, UpdateRegistrationFlowWithWebAuthnMethod
     *
     * @return The actual instance (UpdateRegistrationFlowWithCodeMethod, UpdateRegistrationFlowWithOidcMethod, UpdateRegistrationFlowWithPasskeyMethod, UpdateRegistrationFlowWithPasswordMethod, UpdateRegistrationFlowWithProfileMethod, UpdateRegistrationFlowWithSamlMethod, UpdateRegistrationFlowWithWebAuthnMethod)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateRegistrationFlowWithPasswordMethod`. If the actual instance is not `UpdateRegistrationFlowWithPasswordMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRegistrationFlowWithPasswordMethod`
     * @throws ClassCastException if the instance is not `UpdateRegistrationFlowWithPasswordMethod`
     */
    public UpdateRegistrationFlowWithPasswordMethod getUpdateRegistrationFlowWithPasswordMethod() throws ClassCastException {
        return (UpdateRegistrationFlowWithPasswordMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateRegistrationFlowWithOidcMethod`. If the actual instance is not `UpdateRegistrationFlowWithOidcMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRegistrationFlowWithOidcMethod`
     * @throws ClassCastException if the instance is not `UpdateRegistrationFlowWithOidcMethod`
     */
    public UpdateRegistrationFlowWithOidcMethod getUpdateRegistrationFlowWithOidcMethod() throws ClassCastException {
        return (UpdateRegistrationFlowWithOidcMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateRegistrationFlowWithSamlMethod`. If the actual instance is not `UpdateRegistrationFlowWithSamlMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRegistrationFlowWithSamlMethod`
     * @throws ClassCastException if the instance is not `UpdateRegistrationFlowWithSamlMethod`
     */
    public UpdateRegistrationFlowWithSamlMethod getUpdateRegistrationFlowWithSamlMethod() throws ClassCastException {
        return (UpdateRegistrationFlowWithSamlMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateRegistrationFlowWithWebAuthnMethod`. If the actual instance is not `UpdateRegistrationFlowWithWebAuthnMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRegistrationFlowWithWebAuthnMethod`
     * @throws ClassCastException if the instance is not `UpdateRegistrationFlowWithWebAuthnMethod`
     */
    public UpdateRegistrationFlowWithWebAuthnMethod getUpdateRegistrationFlowWithWebAuthnMethod() throws ClassCastException {
        return (UpdateRegistrationFlowWithWebAuthnMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateRegistrationFlowWithCodeMethod`. If the actual instance is not `UpdateRegistrationFlowWithCodeMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRegistrationFlowWithCodeMethod`
     * @throws ClassCastException if the instance is not `UpdateRegistrationFlowWithCodeMethod`
     */
    public UpdateRegistrationFlowWithCodeMethod getUpdateRegistrationFlowWithCodeMethod() throws ClassCastException {
        return (UpdateRegistrationFlowWithCodeMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateRegistrationFlowWithPasskeyMethod`. If the actual instance is not `UpdateRegistrationFlowWithPasskeyMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRegistrationFlowWithPasskeyMethod`
     * @throws ClassCastException if the instance is not `UpdateRegistrationFlowWithPasskeyMethod`
     */
    public UpdateRegistrationFlowWithPasskeyMethod getUpdateRegistrationFlowWithPasskeyMethod() throws ClassCastException {
        return (UpdateRegistrationFlowWithPasskeyMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateRegistrationFlowWithProfileMethod`. If the actual instance is not `UpdateRegistrationFlowWithProfileMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRegistrationFlowWithProfileMethod`
     * @throws ClassCastException if the instance is not `UpdateRegistrationFlowWithProfileMethod`
     */
    public UpdateRegistrationFlowWithProfileMethod getUpdateRegistrationFlowWithProfileMethod() throws ClassCastException {
        return (UpdateRegistrationFlowWithProfileMethod)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateRegistrationFlowBody
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpdateRegistrationFlowWithPasswordMethod
        try {
            UpdateRegistrationFlowWithPasswordMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateRegistrationFlowWithOidcMethod
        try {
            UpdateRegistrationFlowWithOidcMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithOidcMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateRegistrationFlowWithSamlMethod
        try {
            UpdateRegistrationFlowWithSamlMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithSamlMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateRegistrationFlowWithWebAuthnMethod
        try {
            UpdateRegistrationFlowWithWebAuthnMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateRegistrationFlowWithCodeMethod
        try {
            UpdateRegistrationFlowWithCodeMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithCodeMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateRegistrationFlowWithPasskeyMethod
        try {
            UpdateRegistrationFlowWithPasskeyMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithPasskeyMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateRegistrationFlowWithProfileMethod
        try {
            UpdateRegistrationFlowWithProfileMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateRegistrationFlowWithProfileMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpdateRegistrationFlowBody with oneOf schemas: UpdateRegistrationFlowWithCodeMethod, UpdateRegistrationFlowWithOidcMethod, UpdateRegistrationFlowWithPasskeyMethod, UpdateRegistrationFlowWithPasswordMethod, UpdateRegistrationFlowWithProfileMethod, UpdateRegistrationFlowWithSamlMethod, UpdateRegistrationFlowWithWebAuthnMethod. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of UpdateRegistrationFlowBody given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateRegistrationFlowBody
     * @throws IOException if the JSON string is invalid with respect to UpdateRegistrationFlowBody
     */
    public static UpdateRegistrationFlowBody fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateRegistrationFlowBody.class);
    }

    /**
     * Convert an instance of UpdateRegistrationFlowBody to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

