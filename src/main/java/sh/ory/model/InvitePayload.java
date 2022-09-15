/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.47
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
 * InvitePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T10:52:22.064462360Z[Etc/UTC]")
public class InvitePayload {
  public static final String SERIALIZED_NAME_INVITEE_EMAIL = "invitee_email";
  @SerializedName(SERIALIZED_NAME_INVITEE_EMAIL)
  private String inviteeEmail;

  public InvitePayload() { 
  }

  public InvitePayload inviteeEmail(String inviteeEmail) {
    
    this.inviteeEmail = inviteeEmail;
    return this;
  }

   /**
   * Get inviteeEmail
   * @return inviteeEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInviteeEmail() {
    return inviteeEmail;
  }


  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitePayload invitePayload = (InvitePayload) o;
    return Objects.equals(this.inviteeEmail, invitePayload.inviteeEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteeEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitePayload {\n");
    sb.append("    inviteeEmail: ").append(toIndentedString(inviteeEmail)).append("\n");
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
    openapiFields.add("invitee_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvitePayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvitePayload.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvitePayload is not found in the empty JSON string", InvitePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvitePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvitePayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("invitee_email") != null && !jsonObj.get("invitee_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitee_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitee_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvitePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvitePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvitePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvitePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<InvitePayload>() {
           @Override
           public void write(JsonWriter out, InvitePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvitePayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvitePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvitePayload
  * @throws IOException if the JSON string is invalid with respect to InvitePayload
  */
  public static InvitePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvitePayload.class);
  }

 /**
  * Convert an instance of InvitePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

