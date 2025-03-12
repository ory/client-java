/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.18.5
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
import sh.ory.model.ContinueWithRecoveryUi;
import sh.ory.model.ContinueWithRecoveryUiFlow;
import sh.ory.model.ContinueWithRedirectBrowserTo;
import sh.ory.model.ContinueWithSetOrySessionToken;
import sh.ory.model.ContinueWithSettingsUi;
import sh.ory.model.ContinueWithVerificationUi;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-12T15:15:47.989518636Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ContinueWith extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContinueWith.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContinueWith.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContinueWith' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContinueWithVerificationUi> adapterContinueWithVerificationUi = gson.getDelegateAdapter(this, TypeToken.get(ContinueWithVerificationUi.class));
            final TypeAdapter<ContinueWithSetOrySessionToken> adapterContinueWithSetOrySessionToken = gson.getDelegateAdapter(this, TypeToken.get(ContinueWithSetOrySessionToken.class));
            final TypeAdapter<ContinueWithSettingsUi> adapterContinueWithSettingsUi = gson.getDelegateAdapter(this, TypeToken.get(ContinueWithSettingsUi.class));
            final TypeAdapter<ContinueWithRecoveryUi> adapterContinueWithRecoveryUi = gson.getDelegateAdapter(this, TypeToken.get(ContinueWithRecoveryUi.class));
            final TypeAdapter<ContinueWithRedirectBrowserTo> adapterContinueWithRedirectBrowserTo = gson.getDelegateAdapter(this, TypeToken.get(ContinueWithRedirectBrowserTo.class));

            return (TypeAdapter<T>) new TypeAdapter<ContinueWith>() {
                @Override
                public void write(JsonWriter out, ContinueWith value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ContinueWithVerificationUi`
                    if (value.getActualInstance() instanceof ContinueWithVerificationUi) {
                        JsonElement element = adapterContinueWithVerificationUi.toJsonTree((ContinueWithVerificationUi)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContinueWithSetOrySessionToken`
                    if (value.getActualInstance() instanceof ContinueWithSetOrySessionToken) {
                        JsonElement element = adapterContinueWithSetOrySessionToken.toJsonTree((ContinueWithSetOrySessionToken)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContinueWithSettingsUi`
                    if (value.getActualInstance() instanceof ContinueWithSettingsUi) {
                        JsonElement element = adapterContinueWithSettingsUi.toJsonTree((ContinueWithSettingsUi)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContinueWithRecoveryUi`
                    if (value.getActualInstance() instanceof ContinueWithRecoveryUi) {
                        JsonElement element = adapterContinueWithRecoveryUi.toJsonTree((ContinueWithRecoveryUi)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContinueWithRedirectBrowserTo`
                    if (value.getActualInstance() instanceof ContinueWithRedirectBrowserTo) {
                        JsonElement element = adapterContinueWithRedirectBrowserTo.toJsonTree((ContinueWithRedirectBrowserTo)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContinueWithRecoveryUi, ContinueWithRedirectBrowserTo, ContinueWithSetOrySessionToken, ContinueWithSettingsUi, ContinueWithVerificationUi");
                }

                @Override
                public ContinueWith read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    ContinueWith newContinueWith = new ContinueWith();
                    if (jsonObject.get("action") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for ContinueWith as `action` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `action`
                        switch (jsonObject.get("action").getAsString()) {
                            case "redirect_browser_to":
                                deserialized = adapterContinueWithRedirectBrowserTo.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "set_ory_session_token":
                                deserialized = adapterContinueWithSetOrySessionToken.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "show_recovery_ui":
                                deserialized = adapterContinueWithRecoveryUi.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "show_settings_ui":
                                deserialized = adapterContinueWithSettingsUi.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "show_verification_ui":
                                deserialized = adapterContinueWithVerificationUi.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "continueWithRecoveryUi":
                                deserialized = adapterContinueWithRecoveryUi.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "continueWithRedirectBrowserTo":
                                deserialized = adapterContinueWithRedirectBrowserTo.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "continueWithSetOrySessionToken":
                                deserialized = adapterContinueWithSetOrySessionToken.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "continueWithSettingsUi":
                                deserialized = adapterContinueWithSettingsUi.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            case "continueWithVerificationUi":
                                deserialized = adapterContinueWithVerificationUi.fromJsonTree(jsonObject);
                                newContinueWith.setActualInstance(deserialized);
                                return newContinueWith;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for ContinueWith. Possible values: redirect_browser_to set_ory_session_token show_recovery_ui show_settings_ui show_verification_ui continueWithRecoveryUi continueWithRedirectBrowserTo continueWithSetOrySessionToken continueWithSettingsUi continueWithVerificationUi", jsonObject.get("action").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ContinueWithVerificationUi
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContinueWithVerificationUi.validateJsonElement(jsonElement);
                        actualAdapter = adapterContinueWithVerificationUi;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContinueWithVerificationUi'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContinueWithVerificationUi failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContinueWithVerificationUi'", e);
                    }
                    // deserialize ContinueWithSetOrySessionToken
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContinueWithSetOrySessionToken.validateJsonElement(jsonElement);
                        actualAdapter = adapterContinueWithSetOrySessionToken;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContinueWithSetOrySessionToken'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContinueWithSetOrySessionToken failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContinueWithSetOrySessionToken'", e);
                    }
                    // deserialize ContinueWithSettingsUi
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContinueWithSettingsUi.validateJsonElement(jsonElement);
                        actualAdapter = adapterContinueWithSettingsUi;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContinueWithSettingsUi'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContinueWithSettingsUi failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContinueWithSettingsUi'", e);
                    }
                    // deserialize ContinueWithRecoveryUi
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContinueWithRecoveryUi.validateJsonElement(jsonElement);
                        actualAdapter = adapterContinueWithRecoveryUi;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContinueWithRecoveryUi'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContinueWithRecoveryUi failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContinueWithRecoveryUi'", e);
                    }
                    // deserialize ContinueWithRedirectBrowserTo
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContinueWithRedirectBrowserTo.validateJsonElement(jsonElement);
                        actualAdapter = adapterContinueWithRedirectBrowserTo;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContinueWithRedirectBrowserTo'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContinueWithRedirectBrowserTo failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContinueWithRedirectBrowserTo'", e);
                    }

                    if (match == 1) {
                        ContinueWith ret = new ContinueWith();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContinueWith: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ContinueWith() {
        super("oneOf", Boolean.FALSE);
    }

    public ContinueWith(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ContinueWithVerificationUi", ContinueWithVerificationUi.class);
        schemas.put("ContinueWithSetOrySessionToken", ContinueWithSetOrySessionToken.class);
        schemas.put("ContinueWithSettingsUi", ContinueWithSettingsUi.class);
        schemas.put("ContinueWithRecoveryUi", ContinueWithRecoveryUi.class);
        schemas.put("ContinueWithRedirectBrowserTo", ContinueWithRedirectBrowserTo.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ContinueWith.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContinueWithRecoveryUi, ContinueWithRedirectBrowserTo, ContinueWithSetOrySessionToken, ContinueWithSettingsUi, ContinueWithVerificationUi
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ContinueWithVerificationUi) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContinueWithSetOrySessionToken) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContinueWithSettingsUi) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContinueWithRecoveryUi) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContinueWithRedirectBrowserTo) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ContinueWithRecoveryUi, ContinueWithRedirectBrowserTo, ContinueWithSetOrySessionToken, ContinueWithSettingsUi, ContinueWithVerificationUi");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContinueWithRecoveryUi, ContinueWithRedirectBrowserTo, ContinueWithSetOrySessionToken, ContinueWithSettingsUi, ContinueWithVerificationUi
     *
     * @return The actual instance (ContinueWithRecoveryUi, ContinueWithRedirectBrowserTo, ContinueWithSetOrySessionToken, ContinueWithSettingsUi, ContinueWithVerificationUi)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContinueWithVerificationUi`. If the actual instance is not `ContinueWithVerificationUi`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContinueWithVerificationUi`
     * @throws ClassCastException if the instance is not `ContinueWithVerificationUi`
     */
    public ContinueWithVerificationUi getContinueWithVerificationUi() throws ClassCastException {
        return (ContinueWithVerificationUi)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ContinueWithSetOrySessionToken`. If the actual instance is not `ContinueWithSetOrySessionToken`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContinueWithSetOrySessionToken`
     * @throws ClassCastException if the instance is not `ContinueWithSetOrySessionToken`
     */
    public ContinueWithSetOrySessionToken getContinueWithSetOrySessionToken() throws ClassCastException {
        return (ContinueWithSetOrySessionToken)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ContinueWithSettingsUi`. If the actual instance is not `ContinueWithSettingsUi`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContinueWithSettingsUi`
     * @throws ClassCastException if the instance is not `ContinueWithSettingsUi`
     */
    public ContinueWithSettingsUi getContinueWithSettingsUi() throws ClassCastException {
        return (ContinueWithSettingsUi)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ContinueWithRecoveryUi`. If the actual instance is not `ContinueWithRecoveryUi`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContinueWithRecoveryUi`
     * @throws ClassCastException if the instance is not `ContinueWithRecoveryUi`
     */
    public ContinueWithRecoveryUi getContinueWithRecoveryUi() throws ClassCastException {
        return (ContinueWithRecoveryUi)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ContinueWithRedirectBrowserTo`. If the actual instance is not `ContinueWithRedirectBrowserTo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContinueWithRedirectBrowserTo`
     * @throws ClassCastException if the instance is not `ContinueWithRedirectBrowserTo`
     */
    public ContinueWithRedirectBrowserTo getContinueWithRedirectBrowserTo() throws ClassCastException {
        return (ContinueWithRedirectBrowserTo)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ContinueWith
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ContinueWithVerificationUi
        try {
            ContinueWithVerificationUi.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContinueWithVerificationUi failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContinueWithSetOrySessionToken
        try {
            ContinueWithSetOrySessionToken.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContinueWithSetOrySessionToken failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContinueWithSettingsUi
        try {
            ContinueWithSettingsUi.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContinueWithSettingsUi failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContinueWithRecoveryUi
        try {
            ContinueWithRecoveryUi.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContinueWithRecoveryUi failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContinueWithRedirectBrowserTo
        try {
            ContinueWithRedirectBrowserTo.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContinueWithRedirectBrowserTo failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ContinueWith with oneOf schemas: ContinueWithRecoveryUi, ContinueWithRedirectBrowserTo, ContinueWithSetOrySessionToken, ContinueWithSettingsUi, ContinueWithVerificationUi. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ContinueWith given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContinueWith
     * @throws IOException if the JSON string is invalid with respect to ContinueWith
     */
    public static ContinueWith fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ContinueWith.class);
    }

    /**
     * Convert an instance of ContinueWith to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

