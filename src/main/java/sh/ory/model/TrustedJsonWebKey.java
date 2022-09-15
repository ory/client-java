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
 * TrustedJsonWebKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T13:47:36.645961205Z[Etc/UTC]")
public class TrustedJsonWebKey {
  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_SET = "set";
  @SerializedName(SERIALIZED_NAME_SET)
  private String set;

  public TrustedJsonWebKey() { 
  }

  public TrustedJsonWebKey kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The \&quot;key_id\&quot; is key unique identifier (same as kid header in jws/jwt).
   * @return kid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "The \"key_id\" is key unique identifier (same as kid header in jws/jwt).")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public TrustedJsonWebKey set(String set) {
    
    this.set = set;
    return this;
  }

   /**
   * The \&quot;set\&quot; is basically a name for a group(set) of keys. Will be the same as \&quot;issuer\&quot; in grant.
   * @return set
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://jwt-idp.example.com", value = "The \"set\" is basically a name for a group(set) of keys. Will be the same as \"issuer\" in grant.")

  public String getSet() {
    return set;
  }


  public void setSet(String set) {
    this.set = set;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedJsonWebKey trustedJsonWebKey = (TrustedJsonWebKey) o;
    return Objects.equals(this.kid, trustedJsonWebKey.kid) &&
        Objects.equals(this.set, trustedJsonWebKey.set);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kid, set);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedJsonWebKey {\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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
    openapiFields.add("kid");
    openapiFields.add("set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrustedJsonWebKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrustedJsonWebKey.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrustedJsonWebKey is not found in the empty JSON string", TrustedJsonWebKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrustedJsonWebKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrustedJsonWebKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("kid") != null && !jsonObj.get("kid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kid").toString()));
      }
      if (jsonObj.get("set") != null && !jsonObj.get("set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("set").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustedJsonWebKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustedJsonWebKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustedJsonWebKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustedJsonWebKey.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustedJsonWebKey>() {
           @Override
           public void write(JsonWriter out, TrustedJsonWebKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrustedJsonWebKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrustedJsonWebKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrustedJsonWebKey
  * @throws IOException if the JSON string is invalid with respect to TrustedJsonWebKey
  */
  public static TrustedJsonWebKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustedJsonWebKey.class);
  }

 /**
  * Convert an instance of TrustedJsonWebKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

