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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.ProjectInvite;

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
 * Response to the create project invite request
 */
@ApiModel(description = "Response to the create project invite request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T13:18:59.927245844Z[Etc/UTC]")
public class CreateProjectInvitesResponse {
  public static final String SERIALIZED_NAME_ALL_INVITES = "all_invites";
  @SerializedName(SERIALIZED_NAME_ALL_INVITES)
  private List<ProjectInvite> allInvites = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_INVITES = "created_invites";
  @SerializedName(SERIALIZED_NAME_CREATED_INVITES)
  private List<ProjectInvite> createdInvites = new ArrayList<>();

  public CreateProjectInvitesResponse() {
  }

  public CreateProjectInvitesResponse allInvites(List<ProjectInvite> allInvites) {
    
    this.allInvites = allInvites;
    return this;
  }

  public CreateProjectInvitesResponse addAllInvitesItem(ProjectInvite allInvitesItem) {
    this.allInvites.add(allInvitesItem);
    return this;
  }

   /**
   * Get allInvites
   * @return allInvites
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ProjectInvite> getAllInvites() {
    return allInvites;
  }


  public void setAllInvites(List<ProjectInvite> allInvites) {
    this.allInvites = allInvites;
  }


  public CreateProjectInvitesResponse createdInvites(List<ProjectInvite> createdInvites) {
    
    this.createdInvites = createdInvites;
    return this;
  }

  public CreateProjectInvitesResponse addCreatedInvitesItem(ProjectInvite createdInvitesItem) {
    this.createdInvites.add(createdInvitesItem);
    return this;
  }

   /**
   * Get createdInvites
   * @return createdInvites
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ProjectInvite> getCreatedInvites() {
    return createdInvites;
  }


  public void setCreatedInvites(List<ProjectInvite> createdInvites) {
    this.createdInvites = createdInvites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectInvitesResponse createProjectInvitesResponse = (CreateProjectInvitesResponse) o;
    return Objects.equals(this.allInvites, createProjectInvitesResponse.allInvites) &&
        Objects.equals(this.createdInvites, createProjectInvitesResponse.createdInvites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allInvites, createdInvites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectInvitesResponse {\n");
    sb.append("    allInvites: ").append(toIndentedString(allInvites)).append("\n");
    sb.append("    createdInvites: ").append(toIndentedString(createdInvites)).append("\n");
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
    openapiFields.add("all_invites");
    openapiFields.add("created_invites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("all_invites");
    openapiRequiredFields.add("created_invites");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateProjectInvitesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateProjectInvitesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProjectInvitesResponse is not found in the empty JSON string", CreateProjectInvitesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateProjectInvitesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProjectInvitesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateProjectInvitesResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("all_invites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `all_invites` to be an array in the JSON string but got `%s`", jsonObj.get("all_invites").toString()));
      }

      JsonArray jsonArrayallInvites = jsonObj.getAsJsonArray("all_invites");
      // validate the required field `all_invites` (array)
      for (int i = 0; i < jsonArrayallInvites.size(); i++) {
        ProjectInvite.validateJsonObject(jsonArrayallInvites.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("created_invites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_invites` to be an array in the JSON string but got `%s`", jsonObj.get("created_invites").toString()));
      }

      JsonArray jsonArraycreatedInvites = jsonObj.getAsJsonArray("created_invites");
      // validate the required field `created_invites` (array)
      for (int i = 0; i < jsonArraycreatedInvites.size(); i++) {
        ProjectInvite.validateJsonObject(jsonArraycreatedInvites.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProjectInvitesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProjectInvitesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProjectInvitesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProjectInvitesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProjectInvitesResponse>() {
           @Override
           public void write(JsonWriter out, CreateProjectInvitesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProjectInvitesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateProjectInvitesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateProjectInvitesResponse
  * @throws IOException if the JSON string is invalid with respect to CreateProjectInvitesResponse
  */
  public static CreateProjectInvitesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProjectInvitesResponse.class);
  }

 /**
  * Convert an instance of CreateProjectInvitesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

