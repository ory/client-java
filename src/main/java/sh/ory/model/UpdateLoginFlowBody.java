/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.4
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.ory.model.UpdateLoginFlowWithCodeMethod;
import sh.ory.model.UpdateLoginFlowWithLookupSecretMethod;
import sh.ory.model.UpdateLoginFlowWithOidcMethod;
import sh.ory.model.UpdateLoginFlowWithPasswordMethod;
import sh.ory.model.UpdateLoginFlowWithTotpMethod;
import sh.ory.model.UpdateLoginFlowWithWebAuthnMethod;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
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
import com.google.gson.JsonParseException;

import sh.ory.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-08T11:57:14.101188840Z[Etc/UTC]")
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
            final TypeAdapter<UpdateLoginFlowWithCodeMethod> adapterUpdateLoginFlowWithCodeMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithCodeMethod.class));
            final TypeAdapter<UpdateLoginFlowWithLookupSecretMethod> adapterUpdateLoginFlowWithLookupSecretMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithLookupSecretMethod.class));
            final TypeAdapter<UpdateLoginFlowWithOidcMethod> adapterUpdateLoginFlowWithOidcMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithOidcMethod.class));
            final TypeAdapter<UpdateLoginFlowWithPasswordMethod> adapterUpdateLoginFlowWithPasswordMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithPasswordMethod.class));
            final TypeAdapter<UpdateLoginFlowWithTotpMethod> adapterUpdateLoginFlowWithTotpMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithTotpMethod.class));
            final TypeAdapter<UpdateLoginFlowWithWebAuthnMethod> adapterUpdateLoginFlowWithWebAuthnMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithWebAuthnMethod.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateLoginFlowBody>() {
                @Override
                public void write(JsonWriter out, UpdateLoginFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateLoginFlowWithCodeMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithCodeMethod) {
                        JsonObject obj = adapterUpdateLoginFlowWithCodeMethod.toJsonTree((UpdateLoginFlowWithCodeMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateLoginFlowWithLookupSecretMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithLookupSecretMethod) {
                        JsonObject obj = adapterUpdateLoginFlowWithLookupSecretMethod.toJsonTree((UpdateLoginFlowWithLookupSecretMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateLoginFlowWithOidcMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithOidcMethod) {
                        JsonObject obj = adapterUpdateLoginFlowWithOidcMethod.toJsonTree((UpdateLoginFlowWithOidcMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateLoginFlowWithPasswordMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithPasswordMethod) {
                        JsonObject obj = adapterUpdateLoginFlowWithPasswordMethod.toJsonTree((UpdateLoginFlowWithPasswordMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateLoginFlowWithTotpMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithTotpMethod) {
                        JsonObject obj = adapterUpdateLoginFlowWithTotpMethod.toJsonTree((UpdateLoginFlowWithTotpMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateLoginFlowWithWebAuthnMethod`
                    if (value.getActualInstance() instanceof UpdateLoginFlowWithWebAuthnMethod) {
                        JsonObject obj = adapterUpdateLoginFlowWithWebAuthnMethod.toJsonTree((UpdateLoginFlowWithWebAuthnMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod");
                }

                @Override
                public UpdateLoginFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpdateLoginFlowWithCodeMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithCodeMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateLoginFlowWithCodeMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithCodeMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithCodeMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithCodeMethod'", e);
                    }

                    // deserialize UpdateLoginFlowWithLookupSecretMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithLookupSecretMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateLoginFlowWithLookupSecretMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithLookupSecretMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithLookupSecretMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithLookupSecretMethod'", e);
                    }

                    // deserialize UpdateLoginFlowWithOidcMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithOidcMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateLoginFlowWithOidcMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithOidcMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithOidcMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithOidcMethod'", e);
                    }

                    // deserialize UpdateLoginFlowWithPasswordMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithPasswordMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateLoginFlowWithPasswordMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithPasswordMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithPasswordMethod'", e);
                    }

                    // deserialize UpdateLoginFlowWithTotpMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateLoginFlowWithTotpMethod.validateJsonObject(jsonObject);
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
                        UpdateLoginFlowWithWebAuthnMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateLoginFlowWithWebAuthnMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateLoginFlowWithWebAuthnMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateLoginFlowWithWebAuthnMethod'", e);
                    }

                    if (match == 1) {
                        UpdateLoginFlowBody ret = new UpdateLoginFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateLoginFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UpdateLoginFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateLoginFlowBody(UpdateLoginFlowWithCodeMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateLoginFlowBody(UpdateLoginFlowWithLookupSecretMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateLoginFlowBody(UpdateLoginFlowWithOidcMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateLoginFlowBody(UpdateLoginFlowWithPasswordMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateLoginFlowBody(UpdateLoginFlowWithTotpMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateLoginFlowBody(UpdateLoginFlowWithWebAuthnMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateLoginFlowWithCodeMethod", new GenericType<UpdateLoginFlowWithCodeMethod>() {
        });
        schemas.put("UpdateLoginFlowWithLookupSecretMethod", new GenericType<UpdateLoginFlowWithLookupSecretMethod>() {
        });
        schemas.put("UpdateLoginFlowWithOidcMethod", new GenericType<UpdateLoginFlowWithOidcMethod>() {
        });
        schemas.put("UpdateLoginFlowWithPasswordMethod", new GenericType<UpdateLoginFlowWithPasswordMethod>() {
        });
        schemas.put("UpdateLoginFlowWithTotpMethod", new GenericType<UpdateLoginFlowWithTotpMethod>() {
        });
        schemas.put("UpdateLoginFlowWithWebAuthnMethod", new GenericType<UpdateLoginFlowWithWebAuthnMethod>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UpdateLoginFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpdateLoginFlowWithCodeMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithLookupSecretMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithOidcMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateLoginFlowWithPasswordMethod) {
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

        throw new RuntimeException("Invalid instance type. Must be UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod
     *
     * @return The actual instance (UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateLoginFlowBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with UpdateLoginFlowWithCodeMethod
    try {
      UpdateLoginFlowWithCodeMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithCodeMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateLoginFlowWithLookupSecretMethod
    try {
      UpdateLoginFlowWithLookupSecretMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithLookupSecretMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateLoginFlowWithOidcMethod
    try {
      UpdateLoginFlowWithOidcMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithOidcMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateLoginFlowWithPasswordMethod
    try {
      UpdateLoginFlowWithPasswordMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateLoginFlowWithTotpMethod
    try {
      UpdateLoginFlowWithTotpMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithTotpMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateLoginFlowWithWebAuthnMethod
    try {
      UpdateLoginFlowWithWebAuthnMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateLoginFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UpdateLoginFlowBody with oneOf schemas: UpdateLoginFlowWithCodeMethod, UpdateLoginFlowWithLookupSecretMethod, UpdateLoginFlowWithOidcMethod, UpdateLoginFlowWithPasswordMethod, UpdateLoginFlowWithTotpMethod, UpdateLoginFlowWithWebAuthnMethod. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
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

