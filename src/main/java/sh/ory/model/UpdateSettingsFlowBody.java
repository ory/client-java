/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.18.4
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
import sh.ory.model.UpdateSettingsFlowWithLookupMethod;
import sh.ory.model.UpdateSettingsFlowWithOidcMethod;
import sh.ory.model.UpdateSettingsFlowWithPasskeyMethod;
import sh.ory.model.UpdateSettingsFlowWithPasswordMethod;
import sh.ory.model.UpdateSettingsFlowWithProfileMethod;
import sh.ory.model.UpdateSettingsFlowWithTotpMethod;
import sh.ory.model.UpdateSettingsFlowWithWebAuthnMethod;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-12T13:16:57.922851411Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UpdateSettingsFlowBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateSettingsFlowBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateSettingsFlowBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateSettingsFlowBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateSettingsFlowWithPasswordMethod> adapterUpdateSettingsFlowWithPasswordMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithPasswordMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithProfileMethod> adapterUpdateSettingsFlowWithProfileMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithProfileMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithOidcMethod> adapterUpdateSettingsFlowWithOidcMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithOidcMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithTotpMethod> adapterUpdateSettingsFlowWithTotpMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithTotpMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithWebAuthnMethod> adapterUpdateSettingsFlowWithWebAuthnMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithWebAuthnMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithLookupMethod> adapterUpdateSettingsFlowWithLookupMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithLookupMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithPasskeyMethod> adapterUpdateSettingsFlowWithPasskeyMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithPasskeyMethod.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateSettingsFlowBody>() {
                @Override
                public void write(JsonWriter out, UpdateSettingsFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateSettingsFlowWithPasswordMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithPasswordMethod) {
                        JsonElement element = adapterUpdateSettingsFlowWithPasswordMethod.toJsonTree((UpdateSettingsFlowWithPasswordMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateSettingsFlowWithProfileMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithProfileMethod) {
                        JsonElement element = adapterUpdateSettingsFlowWithProfileMethod.toJsonTree((UpdateSettingsFlowWithProfileMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateSettingsFlowWithOidcMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithOidcMethod) {
                        JsonElement element = adapterUpdateSettingsFlowWithOidcMethod.toJsonTree((UpdateSettingsFlowWithOidcMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateSettingsFlowWithTotpMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithTotpMethod) {
                        JsonElement element = adapterUpdateSettingsFlowWithTotpMethod.toJsonTree((UpdateSettingsFlowWithTotpMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateSettingsFlowWithWebAuthnMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithWebAuthnMethod) {
                        JsonElement element = adapterUpdateSettingsFlowWithWebAuthnMethod.toJsonTree((UpdateSettingsFlowWithWebAuthnMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateSettingsFlowWithLookupMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithLookupMethod) {
                        JsonElement element = adapterUpdateSettingsFlowWithLookupMethod.toJsonTree((UpdateSettingsFlowWithLookupMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UpdateSettingsFlowWithPasskeyMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithPasskeyMethod) {
                        JsonElement element = adapterUpdateSettingsFlowWithPasskeyMethod.toJsonTree((UpdateSettingsFlowWithPasskeyMethod)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasskeyMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod");
                }

                @Override
                public UpdateSettingsFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    UpdateSettingsFlowBody newUpdateSettingsFlowBody = new UpdateSettingsFlowBody();
                    if (jsonObject.get("method") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for UpdateSettingsFlowBody as `method` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `method`
                        switch (jsonObject.get("method").getAsString()) {
                            case "lookup_secret":
                                deserialized = adapterUpdateSettingsFlowWithLookupMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "oidc":
                                deserialized = adapterUpdateSettingsFlowWithOidcMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "passkey":
                                deserialized = adapterUpdateSettingsFlowWithPasskeyMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "password":
                                deserialized = adapterUpdateSettingsFlowWithPasswordMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "profile":
                                deserialized = adapterUpdateSettingsFlowWithProfileMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "totp":
                                deserialized = adapterUpdateSettingsFlowWithTotpMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "webauthn":
                                deserialized = adapterUpdateSettingsFlowWithWebAuthnMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "updateSettingsFlowWithLookupMethod":
                                deserialized = adapterUpdateSettingsFlowWithLookupMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "updateSettingsFlowWithOidcMethod":
                                deserialized = adapterUpdateSettingsFlowWithOidcMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "updateSettingsFlowWithPasskeyMethod":
                                deserialized = adapterUpdateSettingsFlowWithPasskeyMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "updateSettingsFlowWithPasswordMethod":
                                deserialized = adapterUpdateSettingsFlowWithPasswordMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "updateSettingsFlowWithProfileMethod":
                                deserialized = adapterUpdateSettingsFlowWithProfileMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "updateSettingsFlowWithTotpMethod":
                                deserialized = adapterUpdateSettingsFlowWithTotpMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            case "updateSettingsFlowWithWebAuthnMethod":
                                deserialized = adapterUpdateSettingsFlowWithWebAuthnMethod.fromJsonTree(jsonObject);
                                newUpdateSettingsFlowBody.setActualInstance(deserialized);
                                return newUpdateSettingsFlowBody;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for UpdateSettingsFlowBody. Possible values: lookup_secret oidc passkey password profile totp webauthn updateSettingsFlowWithLookupMethod updateSettingsFlowWithOidcMethod updateSettingsFlowWithPasskeyMethod updateSettingsFlowWithPasswordMethod updateSettingsFlowWithProfileMethod updateSettingsFlowWithTotpMethod updateSettingsFlowWithWebAuthnMethod", jsonObject.get("method").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpdateSettingsFlowWithPasswordMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithPasswordMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateSettingsFlowWithPasswordMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithPasswordMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithPasswordMethod'", e);
                    }
                    // deserialize UpdateSettingsFlowWithProfileMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithProfileMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateSettingsFlowWithProfileMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithProfileMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithProfileMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithProfileMethod'", e);
                    }
                    // deserialize UpdateSettingsFlowWithOidcMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithOidcMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateSettingsFlowWithOidcMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithOidcMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithOidcMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithOidcMethod'", e);
                    }
                    // deserialize UpdateSettingsFlowWithTotpMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithTotpMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateSettingsFlowWithTotpMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithTotpMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithTotpMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithTotpMethod'", e);
                    }
                    // deserialize UpdateSettingsFlowWithWebAuthnMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithWebAuthnMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateSettingsFlowWithWebAuthnMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithWebAuthnMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithWebAuthnMethod'", e);
                    }
                    // deserialize UpdateSettingsFlowWithLookupMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithLookupMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateSettingsFlowWithLookupMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithLookupMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithLookupMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithLookupMethod'", e);
                    }
                    // deserialize UpdateSettingsFlowWithPasskeyMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithPasskeyMethod.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpdateSettingsFlowWithPasskeyMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithPasskeyMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithPasskeyMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithPasskeyMethod'", e);
                    }

                    if (match == 1) {
                        UpdateSettingsFlowBody ret = new UpdateSettingsFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateSettingsFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateSettingsFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateSettingsFlowBody(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateSettingsFlowWithPasswordMethod", UpdateSettingsFlowWithPasswordMethod.class);
        schemas.put("UpdateSettingsFlowWithProfileMethod", UpdateSettingsFlowWithProfileMethod.class);
        schemas.put("UpdateSettingsFlowWithOidcMethod", UpdateSettingsFlowWithOidcMethod.class);
        schemas.put("UpdateSettingsFlowWithTotpMethod", UpdateSettingsFlowWithTotpMethod.class);
        schemas.put("UpdateSettingsFlowWithWebAuthnMethod", UpdateSettingsFlowWithWebAuthnMethod.class);
        schemas.put("UpdateSettingsFlowWithLookupMethod", UpdateSettingsFlowWithLookupMethod.class);
        schemas.put("UpdateSettingsFlowWithPasskeyMethod", UpdateSettingsFlowWithPasskeyMethod.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateSettingsFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasskeyMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpdateSettingsFlowWithPasswordMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithProfileMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithOidcMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithTotpMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithWebAuthnMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithLookupMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithPasskeyMethod) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasskeyMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasskeyMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod
     *
     * @return The actual instance (UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasskeyMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateSettingsFlowWithPasswordMethod`. If the actual instance is not `UpdateSettingsFlowWithPasswordMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateSettingsFlowWithPasswordMethod`
     * @throws ClassCastException if the instance is not `UpdateSettingsFlowWithPasswordMethod`
     */
    public UpdateSettingsFlowWithPasswordMethod getUpdateSettingsFlowWithPasswordMethod() throws ClassCastException {
        return (UpdateSettingsFlowWithPasswordMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateSettingsFlowWithProfileMethod`. If the actual instance is not `UpdateSettingsFlowWithProfileMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateSettingsFlowWithProfileMethod`
     * @throws ClassCastException if the instance is not `UpdateSettingsFlowWithProfileMethod`
     */
    public UpdateSettingsFlowWithProfileMethod getUpdateSettingsFlowWithProfileMethod() throws ClassCastException {
        return (UpdateSettingsFlowWithProfileMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateSettingsFlowWithOidcMethod`. If the actual instance is not `UpdateSettingsFlowWithOidcMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateSettingsFlowWithOidcMethod`
     * @throws ClassCastException if the instance is not `UpdateSettingsFlowWithOidcMethod`
     */
    public UpdateSettingsFlowWithOidcMethod getUpdateSettingsFlowWithOidcMethod() throws ClassCastException {
        return (UpdateSettingsFlowWithOidcMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateSettingsFlowWithTotpMethod`. If the actual instance is not `UpdateSettingsFlowWithTotpMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateSettingsFlowWithTotpMethod`
     * @throws ClassCastException if the instance is not `UpdateSettingsFlowWithTotpMethod`
     */
    public UpdateSettingsFlowWithTotpMethod getUpdateSettingsFlowWithTotpMethod() throws ClassCastException {
        return (UpdateSettingsFlowWithTotpMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateSettingsFlowWithWebAuthnMethod`. If the actual instance is not `UpdateSettingsFlowWithWebAuthnMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateSettingsFlowWithWebAuthnMethod`
     * @throws ClassCastException if the instance is not `UpdateSettingsFlowWithWebAuthnMethod`
     */
    public UpdateSettingsFlowWithWebAuthnMethod getUpdateSettingsFlowWithWebAuthnMethod() throws ClassCastException {
        return (UpdateSettingsFlowWithWebAuthnMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateSettingsFlowWithLookupMethod`. If the actual instance is not `UpdateSettingsFlowWithLookupMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateSettingsFlowWithLookupMethod`
     * @throws ClassCastException if the instance is not `UpdateSettingsFlowWithLookupMethod`
     */
    public UpdateSettingsFlowWithLookupMethod getUpdateSettingsFlowWithLookupMethod() throws ClassCastException {
        return (UpdateSettingsFlowWithLookupMethod)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UpdateSettingsFlowWithPasskeyMethod`. If the actual instance is not `UpdateSettingsFlowWithPasskeyMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateSettingsFlowWithPasskeyMethod`
     * @throws ClassCastException if the instance is not `UpdateSettingsFlowWithPasskeyMethod`
     */
    public UpdateSettingsFlowWithPasskeyMethod getUpdateSettingsFlowWithPasskeyMethod() throws ClassCastException {
        return (UpdateSettingsFlowWithPasskeyMethod)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateSettingsFlowBody
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpdateSettingsFlowWithPasswordMethod
        try {
            UpdateSettingsFlowWithPasswordMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateSettingsFlowWithProfileMethod
        try {
            UpdateSettingsFlowWithProfileMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithProfileMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateSettingsFlowWithOidcMethod
        try {
            UpdateSettingsFlowWithOidcMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithOidcMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateSettingsFlowWithTotpMethod
        try {
            UpdateSettingsFlowWithTotpMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithTotpMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateSettingsFlowWithWebAuthnMethod
        try {
            UpdateSettingsFlowWithWebAuthnMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateSettingsFlowWithLookupMethod
        try {
            UpdateSettingsFlowWithLookupMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithLookupMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UpdateSettingsFlowWithPasskeyMethod
        try {
            UpdateSettingsFlowWithPasskeyMethod.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithPasskeyMethod failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpdateSettingsFlowBody with oneOf schemas: UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasskeyMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of UpdateSettingsFlowBody given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateSettingsFlowBody
     * @throws IOException if the JSON string is invalid with respect to UpdateSettingsFlowBody
     */
    public static UpdateSettingsFlowBody fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateSettingsFlowBody.class);
    }

    /**
     * Convert an instance of UpdateSettingsFlowBody to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

