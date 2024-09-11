/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.15.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sh.ory.JSON;

/**
 * MemberInvite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-11T14:16:56.042339805Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class MemberInvite {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INVITEE_EMAIL = "invitee_email";
  @SerializedName(SERIALIZED_NAME_INVITEE_EMAIL)
  private String inviteeEmail;

  public static final String SERIALIZED_NAME_INVITEE_ID = "invitee_id";
  @SerializedName(SERIALIZED_NAME_INVITEE_ID)
  private String inviteeId;

  public static final String SERIALIZED_NAME_OWNER_EMAIL = "owner_email";
  @SerializedName(SERIALIZED_NAME_OWNER_EMAIL)
  private String ownerEmail;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  /**
   * The invite&#39;s status Keeps track of the invites status such as pending, accepted, declined, expired pending PENDING accepted ACCEPTED declined DECLINED expired EXPIRED cancelled CANCELLED removed REMOVED
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    ACCEPTED("accepted"),
    
    DECLINED("declined"),
    
    EXPIRED("expired"),
    
    CANCELLED("cancelled"),
    
    REMOVED("removed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspace_id";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public MemberInvite() {
  }

  public MemberInvite(
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
  }

  /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * The invite&#39;s ID.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public MemberInvite inviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
    return this;
  }

  /**
   * The invitee&#39;s email
   * @return inviteeEmail
   */
  @javax.annotation.Nonnull
  public String getInviteeEmail() {
    return inviteeEmail;
  }

  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }


  public MemberInvite inviteeId(String inviteeId) {
    this.inviteeId = inviteeId;
    return this;
  }

  /**
   * Get inviteeId
   * @return inviteeId
   */
  @javax.annotation.Nullable
  public String getInviteeId() {
    return inviteeId;
  }

  public void setInviteeId(String inviteeId) {
    this.inviteeId = inviteeId;
  }


  public MemberInvite ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * The invite owner&#39;s email Usually the project&#39;s owner email
   * @return ownerEmail
   */
  @javax.annotation.Nonnull
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }


  public MemberInvite ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The invite owner&#39;s ID Usually the project&#39;s owner
   * @return ownerId
   */
  @javax.annotation.Nonnull
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public MemberInvite projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public MemberInvite role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public MemberInvite status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The invite&#39;s status Keeps track of the invites status such as pending, accepted, declined, expired pending PENDING accepted ACCEPTED declined DECLINED expired EXPIRED cancelled CANCELLED removed REMOVED
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }



  public MemberInvite workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * Get workspaceId
   * @return workspaceId
   */
  @javax.annotation.Nullable
  public String getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
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
   * @return the MemberInvite instance itself
   */
  public MemberInvite putAdditionalProperty(String key, Object value) {
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
    MemberInvite memberInvite = (MemberInvite) o;
    return Objects.equals(this.createdAt, memberInvite.createdAt) &&
        Objects.equals(this.id, memberInvite.id) &&
        Objects.equals(this.inviteeEmail, memberInvite.inviteeEmail) &&
        Objects.equals(this.inviteeId, memberInvite.inviteeId) &&
        Objects.equals(this.ownerEmail, memberInvite.ownerEmail) &&
        Objects.equals(this.ownerId, memberInvite.ownerId) &&
        Objects.equals(this.projectId, memberInvite.projectId) &&
        Objects.equals(this.role, memberInvite.role) &&
        Objects.equals(this.status, memberInvite.status) &&
        Objects.equals(this.updatedAt, memberInvite.updatedAt) &&
        Objects.equals(this.workspaceId, memberInvite.workspaceId)&&
        Objects.equals(this.additionalProperties, memberInvite.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, inviteeEmail, inviteeId, ownerEmail, ownerId, projectId, role, status, updatedAt, workspaceId, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberInvite {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteeEmail: ").append(toIndentedString(inviteeEmail)).append("\n");
    sb.append("    inviteeId: ").append(toIndentedString(inviteeId)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
    openapiFields.add("invitee_email");
    openapiFields.add("invitee_id");
    openapiFields.add("owner_email");
    openapiFields.add("owner_id");
    openapiFields.add("project_id");
    openapiFields.add("role");
    openapiFields.add("status");
    openapiFields.add("updated_at");
    openapiFields.add("workspace_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("invitee_email");
    openapiRequiredFields.add("owner_email");
    openapiRequiredFields.add("owner_id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MemberInvite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MemberInvite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MemberInvite is not found in the empty JSON string", MemberInvite.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MemberInvite.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("invitee_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitee_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitee_email").toString()));
      }
      if ((jsonObj.get("invitee_id") != null && !jsonObj.get("invitee_id").isJsonNull()) && !jsonObj.get("invitee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invitee_id").toString()));
      }
      if (!jsonObj.get("owner_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_email").toString()));
      }
      if (!jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("workspace_id") != null && !jsonObj.get("workspace_id").isJsonNull()) && !jsonObj.get("workspace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MemberInvite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MemberInvite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MemberInvite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MemberInvite.class));

       return (TypeAdapter<T>) new TypeAdapter<MemberInvite>() {
           @Override
           public void write(JsonWriter out, MemberInvite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MemberInvite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MemberInvite instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of MemberInvite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MemberInvite
   * @throws IOException if the JSON string is invalid with respect to MemberInvite
   */
  public static MemberInvite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MemberInvite.class);
  }

  /**
   * Convert an instance of MemberInvite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

