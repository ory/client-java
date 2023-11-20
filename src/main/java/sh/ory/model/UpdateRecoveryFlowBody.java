/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.4.2
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
import sh.ory.model.UpdateRecoveryFlowWithCodeMethod;
import sh.ory.model.UpdateRecoveryFlowWithLinkMethod;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:49:18.367639389Z[Etc/UTC]")
public class UpdateRecoveryFlowBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateRecoveryFlowBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateRecoveryFlowBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateRecoveryFlowBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateRecoveryFlowWithCodeMethod> adapterUpdateRecoveryFlowWithCodeMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRecoveryFlowWithCodeMethod.class));
            final TypeAdapter<UpdateRecoveryFlowWithLinkMethod> adapterUpdateRecoveryFlowWithLinkMethod = gson.getDelegateAdapter(this, TypeToken.get(UpdateRecoveryFlowWithLinkMethod.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateRecoveryFlowBody>() {
                @Override
                public void write(JsonWriter out, UpdateRecoveryFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateRecoveryFlowWithCodeMethod`
                    if (value.getActualInstance() instanceof UpdateRecoveryFlowWithCodeMethod) {
                        JsonObject obj = adapterUpdateRecoveryFlowWithCodeMethod.toJsonTree((UpdateRecoveryFlowWithCodeMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UpdateRecoveryFlowWithLinkMethod`
                    if (value.getActualInstance() instanceof UpdateRecoveryFlowWithLinkMethod) {
                        JsonObject obj = adapterUpdateRecoveryFlowWithLinkMethod.toJsonTree((UpdateRecoveryFlowWithLinkMethod)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod");
                }

                @Override
                public UpdateRecoveryFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpdateRecoveryFlowWithCodeMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRecoveryFlowWithCodeMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateRecoveryFlowWithCodeMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRecoveryFlowWithCodeMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRecoveryFlowWithCodeMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRecoveryFlowWithCodeMethod'", e);
                    }

                    // deserialize UpdateRecoveryFlowWithLinkMethod
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpdateRecoveryFlowWithLinkMethod.validateJsonObject(jsonObject);
                        actualAdapter = adapterUpdateRecoveryFlowWithLinkMethod;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpdateRecoveryFlowWithLinkMethod'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpdateRecoveryFlowWithLinkMethod failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpdateRecoveryFlowWithLinkMethod'", e);
                    }

                    if (match == 1) {
                        UpdateRecoveryFlowBody ret = new UpdateRecoveryFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateRecoveryFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UpdateRecoveryFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateRecoveryFlowBody(UpdateRecoveryFlowWithCodeMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateRecoveryFlowBody(UpdateRecoveryFlowWithLinkMethod o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateRecoveryFlowWithCodeMethod", new GenericType<UpdateRecoveryFlowWithCodeMethod>() {
        });
        schemas.put("UpdateRecoveryFlowWithLinkMethod", new GenericType<UpdateRecoveryFlowWithLinkMethod>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UpdateRecoveryFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpdateRecoveryFlowWithCodeMethod) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UpdateRecoveryFlowWithLinkMethod) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod
     *
     * @return The actual instance (UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateRecoveryFlowWithCodeMethod`. If the actual instance is not `UpdateRecoveryFlowWithCodeMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRecoveryFlowWithCodeMethod`
     * @throws ClassCastException if the instance is not `UpdateRecoveryFlowWithCodeMethod`
     */
    public UpdateRecoveryFlowWithCodeMethod getUpdateRecoveryFlowWithCodeMethod() throws ClassCastException {
        return (UpdateRecoveryFlowWithCodeMethod)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateRecoveryFlowWithLinkMethod`. If the actual instance is not `UpdateRecoveryFlowWithLinkMethod`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateRecoveryFlowWithLinkMethod`
     * @throws ClassCastException if the instance is not `UpdateRecoveryFlowWithLinkMethod`
     */
    public UpdateRecoveryFlowWithLinkMethod getUpdateRecoveryFlowWithLinkMethod() throws ClassCastException {
        return (UpdateRecoveryFlowWithLinkMethod)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateRecoveryFlowBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with UpdateRecoveryFlowWithCodeMethod
    try {
      UpdateRecoveryFlowWithCodeMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateRecoveryFlowWithCodeMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UpdateRecoveryFlowWithLinkMethod
    try {
      UpdateRecoveryFlowWithLinkMethod.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UpdateRecoveryFlowWithLinkMethod failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UpdateRecoveryFlowBody with oneOf schemas: UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UpdateRecoveryFlowBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateRecoveryFlowBody
  * @throws IOException if the JSON string is invalid with respect to UpdateRecoveryFlowBody
  */
  public static UpdateRecoveryFlowBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateRecoveryFlowBody.class);
  }

 /**
  * Convert an instance of UpdateRecoveryFlowBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

