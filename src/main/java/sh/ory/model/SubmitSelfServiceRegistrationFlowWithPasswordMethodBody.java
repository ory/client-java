/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.48
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * SubmitSelfServiceRegistrationFlowWithPasswordMethodBody is used to decode the registration form payload when using the password method.
 */
@ApiModel(description = "SubmitSelfServiceRegistrationFlowWithPasswordMethodBody is used to decode the registration form payload when using the password method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T13:47:36.645961205Z[Etc/UTC]")
public class SubmitSelfServiceRegistrationFlowWithPasswordMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public SubmitSelfServiceRegistrationFlowWithPasswordMethodBody() { 
  }

  public SubmitSelfServiceRegistrationFlowWithPasswordMethodBody csrfToken(String csrfToken) {
    
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


  public SubmitSelfServiceRegistrationFlowWithPasswordMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method to use  This field must be set to &#x60;password&#x60; when using the password method.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method to use  This field must be set to `password` when using the password method.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceRegistrationFlowWithPasswordMethodBody password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password to sign the user up with
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Password to sign the user up with")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SubmitSelfServiceRegistrationFlowWithPasswordMethodBody traits(Object traits) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceRegistrationFlowWithPasswordMethodBody submitSelfServiceRegistrationFlowWithPasswordMethodBody = (SubmitSelfServiceRegistrationFlowWithPasswordMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceRegistrationFlowWithPasswordMethodBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceRegistrationFlowWithPasswordMethodBody.method) &&
        Objects.equals(this.password, submitSelfServiceRegistrationFlowWithPasswordMethodBody.password) &&
        Objects.equals(this.traits, submitSelfServiceRegistrationFlowWithPasswordMethodBody.traits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, password, traits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceRegistrationFlowWithPasswordMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
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
    openapiFields.add("method");
    openapiFields.add("password");
    openapiFields.add("traits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("traits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitSelfServiceRegistrationFlowWithPasswordMethodBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubmitSelfServiceRegistrationFlowWithPasswordMethodBody.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitSelfServiceRegistrationFlowWithPasswordMethodBody is not found in the empty JSON string", SubmitSelfServiceRegistrationFlowWithPasswordMethodBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmitSelfServiceRegistrationFlowWithPasswordMethodBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitSelfServiceRegistrationFlowWithPasswordMethodBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitSelfServiceRegistrationFlowWithPasswordMethodBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitSelfServiceRegistrationFlowWithPasswordMethodBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitSelfServiceRegistrationFlowWithPasswordMethodBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitSelfServiceRegistrationFlowWithPasswordMethodBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceRegistrationFlowWithPasswordMethodBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitSelfServiceRegistrationFlowWithPasswordMethodBody>() {
           @Override
           public void write(JsonWriter out, SubmitSelfServiceRegistrationFlowWithPasswordMethodBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitSelfServiceRegistrationFlowWithPasswordMethodBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmitSelfServiceRegistrationFlowWithPasswordMethodBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitSelfServiceRegistrationFlowWithPasswordMethodBody
  * @throws IOException if the JSON string is invalid with respect to SubmitSelfServiceRegistrationFlowWithPasswordMethodBody
  */
  public static SubmitSelfServiceRegistrationFlowWithPasswordMethodBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitSelfServiceRegistrationFlowWithPasswordMethodBody.class);
  }

 /**
  * Convert an instance of SubmitSelfServiceRegistrationFlowWithPasswordMethodBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

