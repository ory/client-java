/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.19
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
 * Project invite quota
 */
@ApiModel(description = "Project invite quota")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T12:42:31.987086234Z[Etc/UTC]")
public class InviteQuota {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_REMAINING_SEATS = "remaining_seats";
  @SerializedName(SERIALIZED_NAME_REMAINING_SEATS)
  private Long remainingSeats;

  public static final String SERIALIZED_NAME_TOTAL_SEATS = "total_seats";
  @SerializedName(SERIALIZED_NAME_TOTAL_SEATS)
  private Long totalSeats;

  public InviteQuota() {
  }

  public InviteQuota projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public InviteQuota remainingSeats(Long remainingSeats) {
    
    this.remainingSeats = remainingSeats;
    return this;
  }

   /**
   * Get remainingSeats
   * @return remainingSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRemainingSeats() {
    return remainingSeats;
  }


  public void setRemainingSeats(Long remainingSeats) {
    this.remainingSeats = remainingSeats;
  }


  public InviteQuota totalSeats(Long totalSeats) {
    
    this.totalSeats = totalSeats;
    return this;
  }

   /**
   * Get totalSeats
   * @return totalSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalSeats() {
    return totalSeats;
  }


  public void setTotalSeats(Long totalSeats) {
    this.totalSeats = totalSeats;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteQuota inviteQuota = (InviteQuota) o;
    return Objects.equals(this.projectId, inviteQuota.projectId) &&
        Objects.equals(this.remainingSeats, inviteQuota.remainingSeats) &&
        Objects.equals(this.totalSeats, inviteQuota.totalSeats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, remainingSeats, totalSeats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteQuota {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    remainingSeats: ").append(toIndentedString(remainingSeats)).append("\n");
    sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
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
    openapiFields.add("project_id");
    openapiFields.add("remaining_seats");
    openapiFields.add("total_seats");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InviteQuota
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InviteQuota.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InviteQuota is not found in the empty JSON string", InviteQuota.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InviteQuota.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InviteQuota` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InviteQuota.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InviteQuota' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InviteQuota> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InviteQuota.class));

       return (TypeAdapter<T>) new TypeAdapter<InviteQuota>() {
           @Override
           public void write(JsonWriter out, InviteQuota value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InviteQuota read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InviteQuota given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InviteQuota
  * @throws IOException if the JSON string is invalid with respect to InviteQuota
  */
  public static InviteQuota fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InviteQuota.class);
  }

 /**
  * Convert an instance of InviteQuota to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

