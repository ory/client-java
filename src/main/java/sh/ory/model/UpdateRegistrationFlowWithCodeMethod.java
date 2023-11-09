/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.17
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * Update Registration Flow with Code Method
 */
@ApiModel(description = "Update Registration Flow with Code Method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T08:22:45.524673580Z[Etc/UTC]")
public class UpdateRegistrationFlowWithCodeMethod {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_RESEND = "resend";
  @SerializedName(SERIALIZED_NAME_RESEND)
  private String resend;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_TRANSIENT_PAYLOAD = "transient_payload";
  @SerializedName(SERIALIZED_NAME_TRANSIENT_PAYLOAD)
  private Object transientPayload;

  public UpdateRegistrationFlowWithCodeMethod() {
  }

  public UpdateRegistrationFlowWithCodeMethod code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The OTP Code sent to the user
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The OTP Code sent to the user")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public UpdateRegistrationFlowWithCodeMethod csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * The CSRF Token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CSRF Token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public UpdateRegistrationFlowWithCodeMethod method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method to use  This field must be set to &#x60;code&#x60; when using the code method.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method to use  This field must be set to `code` when using the code method.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public UpdateRegistrationFlowWithCodeMethod resend(String resend) {
    
    this.resend = resend;
    return this;
  }

   /**
   * Resend restarts the flow with a new code
   * @return resend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resend restarts the flow with a new code")

  public String getResend() {
    return resend;
  }


  public void setResend(String resend) {
    this.resend = resend;
  }


  public UpdateRegistrationFlowWithCodeMethod traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * The identity&#39;s traits
   * @return traits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identity's traits")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public UpdateRegistrationFlowWithCodeMethod transientPayload(Object transientPayload) {
    
    this.transientPayload = transientPayload;
    return this;
  }

   /**
   * Transient data to pass along to any webhooks
   * @return transientPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transient data to pass along to any webhooks")

  public Object getTransientPayload() {
    return transientPayload;
  }


  public void setTransientPayload(Object transientPayload) {
    this.transientPayload = transientPayload;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UpdateRegistrationFlowWithCodeMethod instance itself
   */
  public UpdateRegistrationFlowWithCodeMethod putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRegistrationFlowWithCodeMethod updateRegistrationFlowWithCodeMethod = (UpdateRegistrationFlowWithCodeMethod) o;
    return Objects.equals(this.code, updateRegistrationFlowWithCodeMethod.code) &&
        Objects.equals(this.csrfToken, updateRegistrationFlowWithCodeMethod.csrfToken) &&
        Objects.equals(this.method, updateRegistrationFlowWithCodeMethod.method) &&
        Objects.equals(this.resend, updateRegistrationFlowWithCodeMethod.resend) &&
        Objects.equals(this.traits, updateRegistrationFlowWithCodeMethod.traits) &&
        Objects.equals(this.transientPayload, updateRegistrationFlowWithCodeMethod.transientPayload)&&
        Objects.equals(this.additionalProperties, updateRegistrationFlowWithCodeMethod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, csrfToken, method, resend, traits, transientPayload, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRegistrationFlowWithCodeMethod {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    resend: ").append(toIndentedString(resend)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    transientPayload: ").append(toIndentedString(transientPayload)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("csrf_token");
    openapiFields.add("method");
    openapiFields.add("resend");
    openapiFields.add("traits");
    openapiFields.add("transient_payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("traits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateRegistrationFlowWithCodeMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateRegistrationFlowWithCodeMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateRegistrationFlowWithCodeMethod is not found in the empty JSON string", UpdateRegistrationFlowWithCodeMethod.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateRegistrationFlowWithCodeMethod.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonNull()) && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("resend") != null && !jsonObj.get("resend").isJsonNull()) && !jsonObj.get("resend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resend").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateRegistrationFlowWithCodeMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateRegistrationFlowWithCodeMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateRegistrationFlowWithCodeMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateRegistrationFlowWithCodeMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateRegistrationFlowWithCodeMethod>() {
           @Override
           public void write(JsonWriter out, UpdateRegistrationFlowWithCodeMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateRegistrationFlowWithCodeMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateRegistrationFlowWithCodeMethod instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateRegistrationFlowWithCodeMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateRegistrationFlowWithCodeMethod
  * @throws IOException if the JSON string is invalid with respect to UpdateRegistrationFlowWithCodeMethod
  */
  public static UpdateRegistrationFlowWithCodeMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateRegistrationFlowWithCodeMethod.class);
  }

 /**
  * Convert an instance of UpdateRegistrationFlowWithCodeMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

