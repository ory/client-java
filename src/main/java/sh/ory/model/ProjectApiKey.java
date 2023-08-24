/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.50
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
import java.time.OffsetDateTime;

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
 * ProjectApiKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T06:58:29.699046059Z[Etc/UTC]")
public class ProjectApiKey {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ProjectApiKey() {
  }

  
  public ProjectApiKey(
     OffsetDateTime createdAt, 
     String id, 
     String ownerId, 
     String projectId, 
     OffsetDateTime updatedAt, 
     String value
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.ownerId = ownerId;
    this.projectId = projectId;
    this.updatedAt = updatedAt;
    this.value = value;
  }

   /**
   * The token&#39;s creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token's creation date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The token&#39;s ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The token's ID.")

  public String getId() {
    return id;
  }




  public ProjectApiKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The Token&#39;s Name  Set this to help you remember, for example, where you use the token.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Token's Name  Set this to help you remember, for example, where you use the token.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The token&#39;s owner
   * @return ownerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The token's owner")

  public String getOwnerId() {
    return ownerId;
  }




   /**
   * The Token&#39;s Project ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Token's Project ID")

  public String getProjectId() {
    return projectId;
  }




   /**
   * The token&#39;s last update date
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token's last update date")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * The token&#39;s value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token's value")

  public String getValue() {
    return value;
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
   * @return the ProjectApiKey instance itself
   */
  public ProjectApiKey putAdditionalProperty(String key, Object value) {
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
    ProjectApiKey projectApiKey = (ProjectApiKey) o;
    return Objects.equals(this.createdAt, projectApiKey.createdAt) &&
        Objects.equals(this.id, projectApiKey.id) &&
        Objects.equals(this.name, projectApiKey.name) &&
        Objects.equals(this.ownerId, projectApiKey.ownerId) &&
        Objects.equals(this.projectId, projectApiKey.projectId) &&
        Objects.equals(this.updatedAt, projectApiKey.updatedAt) &&
        Objects.equals(this.value, projectApiKey.value)&&
        Objects.equals(this.additionalProperties, projectApiKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, name, ownerId, projectId, updatedAt, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKey {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("owner_id");
    openapiFields.add("project_id");
    openapiFields.add("updated_at");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("owner_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectApiKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectApiKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectApiKey is not found in the empty JSON string", ProjectApiKey.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectApiKey.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectApiKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectApiKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectApiKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectApiKey.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectApiKey>() {
           @Override
           public void write(JsonWriter out, ProjectApiKey value) throws IOException {
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
           public ProjectApiKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectApiKey instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectApiKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectApiKey
  * @throws IOException if the JSON string is invalid with respect to ProjectApiKey
  */
  public static ProjectApiKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectApiKey.class);
  }

 /**
  * Convert an instance of ProjectApiKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

