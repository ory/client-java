/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.26
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
 * Update Login Flow with Password Method
 */
@ApiModel(description = "Update Login Flow with Password Method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-05T06:48:46.434133512Z[Etc/UTC]")
public class UpdateLoginFlowWithPasswordMethod {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PASSWORD_IDENTIFIER = "password_identifier";
  @SerializedName(SERIALIZED_NAME_PASSWORD_IDENTIFIER)
  private String passwordIdentifier;

  public UpdateLoginFlowWithPasswordMethod() {
  }

  public UpdateLoginFlowWithPasswordMethod csrfToken(String csrfToken) {
    
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


  public UpdateLoginFlowWithPasswordMethod identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Identifier is the email or username of the user trying to log in.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier is the email or username of the user trying to log in.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public UpdateLoginFlowWithPasswordMethod method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method should be set to \&quot;password\&quot; when logging in using the identifier and password strategy.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method should be set to \"password\" when logging in using the identifier and password strategy.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public UpdateLoginFlowWithPasswordMethod password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The user&#39;s password.
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The user's password.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateLoginFlowWithPasswordMethod passwordIdentifier(String passwordIdentifier) {
    
    this.passwordIdentifier = passwordIdentifier;
    return this;
  }

   /**
   * Identifier is the email or username of the user trying to log in. This field is deprecated!
   * @return passwordIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier is the email or username of the user trying to log in. This field is deprecated!")

  public String getPasswordIdentifier() {
    return passwordIdentifier;
  }


  public void setPasswordIdentifier(String passwordIdentifier) {
    this.passwordIdentifier = passwordIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLoginFlowWithPasswordMethod updateLoginFlowWithPasswordMethod = (UpdateLoginFlowWithPasswordMethod) o;
    return Objects.equals(this.csrfToken, updateLoginFlowWithPasswordMethod.csrfToken) &&
        Objects.equals(this.identifier, updateLoginFlowWithPasswordMethod.identifier) &&
        Objects.equals(this.method, updateLoginFlowWithPasswordMethod.method) &&
        Objects.equals(this.password, updateLoginFlowWithPasswordMethod.password) &&
        Objects.equals(this.passwordIdentifier, updateLoginFlowWithPasswordMethod.passwordIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, identifier, method, password, passwordIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLoginFlowWithPasswordMethod {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordIdentifier: ").append(toIndentedString(passwordIdentifier)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("method");
    openapiFields.add("password");
    openapiFields.add("password_identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("password");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateLoginFlowWithPasswordMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateLoginFlowWithPasswordMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLoginFlowWithPasswordMethod is not found in the empty JSON string", UpdateLoginFlowWithPasswordMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateLoginFlowWithPasswordMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateLoginFlowWithPasswordMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateLoginFlowWithPasswordMethod.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonNull()) && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (!jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("password_identifier") != null && !jsonObj.get("password_identifier").isJsonNull()) && !jsonObj.get("password_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password_identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLoginFlowWithPasswordMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLoginFlowWithPasswordMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLoginFlowWithPasswordMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithPasswordMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLoginFlowWithPasswordMethod>() {
           @Override
           public void write(JsonWriter out, UpdateLoginFlowWithPasswordMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLoginFlowWithPasswordMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateLoginFlowWithPasswordMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateLoginFlowWithPasswordMethod
  * @throws IOException if the JSON string is invalid with respect to UpdateLoginFlowWithPasswordMethod
  */
  public static UpdateLoginFlowWithPasswordMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLoginFlowWithPasswordMethod.class);
  }

 /**
  * Convert an instance of UpdateLoginFlowWithPasswordMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

