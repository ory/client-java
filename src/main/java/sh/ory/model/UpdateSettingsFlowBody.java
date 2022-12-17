/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.1
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
import sh.ory.model.UpdateSettingsFlowWithLookupMethod;
import sh.ory.model.UpdateSettingsFlowWithOidcMethod;
import sh.ory.model.UpdateSettingsFlowWithPasswordMethod;
import sh.ory.model.UpdateSettingsFlowWithProfileMethod;
import sh.ory.model.UpdateSettingsFlowWithTotpMethod;
import sh.ory.model.UpdateSettingsFlowWithWebAuthnMethod;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-17T12:47:15.295740778Z[Etc/UTC]")
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
            final TypeAdapter<UpdateSettingsFlowWithLookupMethod> adapterUpdateSettingsFlowWithLookupMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithLookupMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithOidcMethod> adapterUpdateSettingsFlowWithOidcMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithOidcMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithPasswordMethod> adapterUpdateSettingsFlowWithPasswordMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithPasswordMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithProfileMethod> adapterUpdateSettingsFlowWithProfileMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithProfileMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithTotpMethod> adapterUpdateSettingsFlowWithTotpMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithTotpMethod.class));
            final TypeAdapter<UpdateSettingsFlowWithWebAuthnMethod> adapterUpdateSettingsFlowWithWebAuthnMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithWebAuthnMethod.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateSettingsFlowBody>() {
                @Override
                public void write(JsonWriter out, UpdateSettingsFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateSettingsFlowWithLookupMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithLookupMethod) {
                        JsonObject obj = adapterUpdateSettingsFlowWithLookupMethod.toJsonTree((UpdateSettingsFlowWithLookupMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateSettingsFlowWithOidcMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithOidcMethod) {
                        JsonObject obj = adapterUpdateSettingsFlowWithOidcMethod.toJsonTree((UpdateSettingsFlowWithOidcMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateSettingsFlowWithPasswordMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithPasswordMethod) {
                        JsonObject obj = adapterUpdateSettingsFlowWithPasswordMethod.toJsonTree((UpdateSettingsFlowWithPasswordMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateSettingsFlowWithProfileMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithProfileMethod) {
                        JsonObject obj = adapterUpdateSettingsFlowWithProfileMethod.toJsonTree((UpdateSettingsFlowWithProfileMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateSettingsFlowWithTotpMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithTotpMethod) {
                        JsonObject obj = adapterUpdateSettingsFlowWithTotpMethod.toJsonTree((UpdateSettingsFlowWithTotpMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateSettingsFlowWithWebAuthnMethod`
                    if (value.getActualInstance() instanceof UpdateSettingsFlowWithWebAuthnMethod) {
                        JsonObject obj = adapterUpdateSettingsFlowWithWebAuthnMethod.toJsonTree((UpdateSettingsFlowWithWebAuthnMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod");
                }

                @Override
                public UpdateSettingsFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpdateSettingsFlowWithLookupMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithLookupMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateSettingsFlowWithLookupMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithLookupMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithLookupMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithLookupMethod'", e);
                    }

                    // deserialize UpdateSettingsFlowWithOidcMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithOidcMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateSettingsFlowWithOidcMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithOidcMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithOidcMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithOidcMethod'", e);
                    }

                    // deserialize UpdateSettingsFlowWithPasswordMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithPasswordMethod.validateJsonObject(jsonObject);
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
                        UpdateSettingsFlowWithProfileMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateSettingsFlowWithProfileMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithProfileMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithProfileMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithProfileMethod'", e);
                    }

                    // deserialize UpdateSettingsFlowWithTotpMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateSettingsFlowWithTotpMethod.validateJsonObject(jsonObject);
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
                        UpdateSettingsFlowWithWebAuthnMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateSettingsFlowWithWebAuthnMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateSettingsFlowWithWebAuthnMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateSettingsFlowWithWebAuthnMethod'", e);
                    }

                    if (match == 1) {
                        UpdateSettingsFlowBody ret = new UpdateSettingsFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateSettingsFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UpdateSettingsFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateSettingsFlowBody(UpdateSettingsFlowWithLookupMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateSettingsFlowBody(UpdateSettingsFlowWithOidcMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateSettingsFlowBody(UpdateSettingsFlowWithPasswordMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateSettingsFlowBody(UpdateSettingsFlowWithProfileMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateSettingsFlowBody(UpdateSettingsFlowWithTotpMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateSettingsFlowBody(UpdateSettingsFlowWithWebAuthnMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateSettingsFlowWithLookupMethod", new GenericType<UpdateSettingsFlowWithLookupMethod>() {
        });
        schemas.put("UpdateSettingsFlowWithOidcMethod", new GenericType<UpdateSettingsFlowWithOidcMethod>() {
        });
        schemas.put("UpdateSettingsFlowWithPasswordMethod", new GenericType<UpdateSettingsFlowWithPasswordMethod>() {
        });
        schemas.put("UpdateSettingsFlowWithProfileMethod", new GenericType<UpdateSettingsFlowWithProfileMethod>() {
        });
        schemas.put("UpdateSettingsFlowWithTotpMethod", new GenericType<UpdateSettingsFlowWithTotpMethod>() {
        });
        schemas.put("UpdateSettingsFlowWithWebAuthnMethod", new GenericType<UpdateSettingsFlowWithWebAuthnMethod>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UpdateSettingsFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpdateSettingsFlowWithLookupMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithOidcMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithPasswordMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateSettingsFlowWithProfileMethod) {
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

        throw new RuntimeException("Invalid instance type. Must be UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod
     *
     * @return The actual instance (UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSettingsFlowBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with UpdateSettingsFlowWithLookupMethod
    try {
      UpdateSettingsFlowWithLookupMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithLookupMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateSettingsFlowWithOidcMethod
    try {
      UpdateSettingsFlowWithOidcMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithOidcMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateSettingsFlowWithPasswordMethod
    try {
      UpdateSettingsFlowWithPasswordMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithPasswordMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateSettingsFlowWithProfileMethod
    try {
      UpdateSettingsFlowWithProfileMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithProfileMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateSettingsFlowWithTotpMethod
    try {
      UpdateSettingsFlowWithTotpMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithTotpMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateSettingsFlowWithWebAuthnMethod
    try {
      UpdateSettingsFlowWithWebAuthnMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateSettingsFlowWithWebAuthnMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UpdateSettingsFlowBody with oneOf schemas: UpdateSettingsFlowWithLookupMethod, UpdateSettingsFlowWithOidcMethod, UpdateSettingsFlowWithPasswordMethod, UpdateSettingsFlowWithProfileMethod, UpdateSettingsFlowWithTotpMethod, UpdateSettingsFlowWithWebAuthnMethod. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
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

