/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.33
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
 * Update Verification Flow with Link Method
 */
@ApiModel(description = "Update Verification Flow with Link Method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T13:18:59.927245844Z[Etc/UTC]")
public class UpdateVerificationFlowWithLinkMethod {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public UpdateVerificationFlowWithLinkMethod() {
  }

  public UpdateVerificationFlowWithLinkMethod csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * Sending the anti-csrf token is only required for browser login flows.
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sending the anti-csrf token is only required for browser login flows.")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public UpdateVerificationFlowWithLinkMethod email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateVerificationFlowWithLinkMethod method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the method that should be used for this verification flow  Allowed values are &#x60;link&#x60; and &#x60;code&#x60;
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method is the method that should be used for this verification flow  Allowed values are `link` and `code`")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerificationFlowWithLinkMethod updateVerificationFlowWithLinkMethod = (UpdateVerificationFlowWithLinkMethod) o;
    return Objects.equals(this.csrfToken, updateVerificationFlowWithLinkMethod.csrfToken) &&
        Objects.equals(this.email, updateVerificationFlowWithLinkMethod.email) &&
        Objects.equals(this.method, updateVerificationFlowWithLinkMethod.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, email, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerificationFlowWithLinkMethod {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
    openapiFields.add("csrf_token");
    openapiFields.add("email");
    openapiFields.add("method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateVerificationFlowWithLinkMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateVerificationFlowWithLinkMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVerificationFlowWithLinkMethod is not found in the empty JSON string", UpdateVerificationFlowWithLinkMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateVerificationFlowWithLinkMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVerificationFlowWithLinkMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateVerificationFlowWithLinkMethod.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonNull()) && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVerificationFlowWithLinkMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVerificationFlowWithLinkMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVerificationFlowWithLinkMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVerificationFlowWithLinkMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVerificationFlowWithLinkMethod>() {
           @Override
           public void write(JsonWriter out, UpdateVerificationFlowWithLinkMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVerificationFlowWithLinkMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateVerificationFlowWithLinkMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVerificationFlowWithLinkMethod
  * @throws IOException if the JSON string is invalid with respect to UpdateVerificationFlowWithLinkMethod
  */
  public static UpdateVerificationFlowWithLinkMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVerificationFlowWithLinkMethod.class);
  }

 /**
  * Convert an instance of UpdateVerificationFlowWithLinkMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

