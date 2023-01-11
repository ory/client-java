/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.5
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
import sh.ory.model.IdentityWithCredentialsOidc;
import sh.ory.model.IdentityWithCredentialsPassword;

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
 * Create Identity and Import Credentials
 */
@ApiModel(description = "Create Identity and Import Credentials")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:29:42.038062650Z[Etc/UTC]")
public class IdentityWithCredentials {
  public static final String SERIALIZED_NAME_OIDC = "oidc";
  @SerializedName(SERIALIZED_NAME_OIDC)
  private IdentityWithCredentialsOidc oidc;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private IdentityWithCredentialsPassword password;

  public IdentityWithCredentials() {
  }

  public IdentityWithCredentials oidc(IdentityWithCredentialsOidc oidc) {
    
    this.oidc = oidc;
    return this;
  }

   /**
   * Get oidc
   * @return oidc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityWithCredentialsOidc getOidc() {
    return oidc;
  }


  public void setOidc(IdentityWithCredentialsOidc oidc) {
    this.oidc = oidc;
  }


  public IdentityWithCredentials password(IdentityWithCredentialsPassword password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityWithCredentialsPassword getPassword() {
    return password;
  }


  public void setPassword(IdentityWithCredentialsPassword password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityWithCredentials identityWithCredentials = (IdentityWithCredentials) o;
    return Objects.equals(this.oidc, identityWithCredentials.oidc) &&
        Objects.equals(this.password, identityWithCredentials.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oidc, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityWithCredentials {\n");
    sb.append("    oidc: ").append(toIndentedString(oidc)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("oidc");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityWithCredentials
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IdentityWithCredentials.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityWithCredentials is not found in the empty JSON string", IdentityWithCredentials.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityWithCredentials.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityWithCredentials` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `oidc`
      if (jsonObj.get("oidc") != null && !jsonObj.get("oidc").isJsonNull()) {
        IdentityWithCredentialsOidc.validateJsonObject(jsonObj.getAsJsonObject("oidc"));
      }
      // validate the optional field `password`
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) {
        IdentityWithCredentialsPassword.validateJsonObject(jsonObj.getAsJsonObject("password"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityWithCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityWithCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityWithCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityWithCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityWithCredentials>() {
           @Override
           public void write(JsonWriter out, IdentityWithCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityWithCredentials read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityWithCredentials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityWithCredentials
  * @throws IOException if the JSON string is invalid with respect to IdentityWithCredentials
  */
  public static IdentityWithCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityWithCredentials.class);
  }

 /**
  * Convert an instance of IdentityWithCredentials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

