/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.16
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
import sh.ory.model.ManagedIdentitySchema;

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
 * NormalizedProjectRevisionIdentitySchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T11:51:29.942568361Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class NormalizedProjectRevisionIdentitySchema {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTITY_SCHEMA = "identity_schema";
  @SerializedName(SERIALIZED_NAME_IDENTITY_SCHEMA)
  private ManagedIdentitySchema identitySchema;

  public static final String SERIALIZED_NAME_IDENTITY_SCHEMA_ID = "identity_schema_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_SCHEMA_ID)
  private String identitySchemaId;

  public static final String SERIALIZED_NAME_IMPORT_ID = "import_id";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private String importId;

  public static final String SERIALIZED_NAME_IMPORT_URL = "import_url";
  @SerializedName(SERIALIZED_NAME_IMPORT_URL)
  private String importUrl;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_PRESET = "preset";
  @SerializedName(SERIALIZED_NAME_PRESET)
  private String preset;

  public static final String SERIALIZED_NAME_PROJECT_REVISION_ID = "project_revision_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_REVISION_ID)
  private String projectRevisionId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public NormalizedProjectRevisionIdentitySchema() {
  }

  public NormalizedProjectRevisionIdentitySchema(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public NormalizedProjectRevisionIdentitySchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of this entry.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public NormalizedProjectRevisionIdentitySchema identitySchema(ManagedIdentitySchema identitySchema) {
    this.identitySchema = identitySchema;
    return this;
  }

  /**
   * Get identitySchema
   * @return identitySchema
   */
  @javax.annotation.Nullable
  public ManagedIdentitySchema getIdentitySchema() {
    return identitySchema;
  }

  public void setIdentitySchema(ManagedIdentitySchema identitySchema) {
    this.identitySchema = identitySchema;
  }


  public NormalizedProjectRevisionIdentitySchema identitySchemaId(String identitySchemaId) {
    this.identitySchemaId = identitySchemaId;
    return this;
  }

  /**
   * Get identitySchemaId
   * @return identitySchemaId
   */
  @javax.annotation.Nullable
  public String getIdentitySchemaId() {
    return identitySchemaId;
  }

  public void setIdentitySchemaId(String identitySchemaId) {
    this.identitySchemaId = identitySchemaId;
  }


  public NormalizedProjectRevisionIdentitySchema importId(String importId) {
    this.importId = importId;
    return this;
  }

  /**
   * The imported (named) ID of the Identity Schema referenced in the Ory Kratos config.
   * @return importId
   */
  @javax.annotation.Nullable
  public String getImportId() {
    return importId;
  }

  public void setImportId(String importId) {
    this.importId = importId;
  }


  public NormalizedProjectRevisionIdentitySchema importUrl(String importUrl) {
    this.importUrl = importUrl;
    return this;
  }

  /**
   * The ImportURL can be used to import an Identity Schema from a bse64 encoded string. In the future, this key also support HTTPS and other sources!  If you import an Ory Kratos configuration, this would be akin to the &#x60;identity.schemas.#.url&#x60; key.  The configuration will always return the import URL when you fetch it from the API.
   * @return importUrl
   */
  @javax.annotation.Nullable
  public String getImportUrl() {
    return importUrl;
  }

  public void setImportUrl(String importUrl) {
    this.importUrl = importUrl;
  }


  public NormalizedProjectRevisionIdentitySchema isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * If true sets the default schema for identities  Only one schema can ever be the default schema. If you try to add two schemas with default to true, the request will fail.
   * @return isDefault
   */
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public NormalizedProjectRevisionIdentitySchema preset(String preset) {
    this.preset = preset;
    return this;
  }

  /**
   * Use a preset instead of a custom identity schema.
   * @return preset
   */
  @javax.annotation.Nullable
  public String getPreset() {
    return preset;
  }

  public void setPreset(String preset) {
    this.preset = preset;
  }


  public NormalizedProjectRevisionIdentitySchema projectRevisionId(String projectRevisionId) {
    this.projectRevisionId = projectRevisionId;
    return this;
  }

  /**
   * The Revision&#39;s ID this schema belongs to
   * @return projectRevisionId
   */
  @javax.annotation.Nullable
  public String getProjectRevisionId() {
    return projectRevisionId;
  }

  public void setProjectRevisionId(String projectRevisionId) {
    this.projectRevisionId = projectRevisionId;
  }


  /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
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
   * @return the NormalizedProjectRevisionIdentitySchema instance itself
   */
  public NormalizedProjectRevisionIdentitySchema putAdditionalProperty(String key, Object value) {
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
    NormalizedProjectRevisionIdentitySchema normalizedProjectRevisionIdentitySchema = (NormalizedProjectRevisionIdentitySchema) o;
    return Objects.equals(this.createdAt, normalizedProjectRevisionIdentitySchema.createdAt) &&
        Objects.equals(this.id, normalizedProjectRevisionIdentitySchema.id) &&
        Objects.equals(this.identitySchema, normalizedProjectRevisionIdentitySchema.identitySchema) &&
        Objects.equals(this.identitySchemaId, normalizedProjectRevisionIdentitySchema.identitySchemaId) &&
        Objects.equals(this.importId, normalizedProjectRevisionIdentitySchema.importId) &&
        Objects.equals(this.importUrl, normalizedProjectRevisionIdentitySchema.importUrl) &&
        Objects.equals(this.isDefault, normalizedProjectRevisionIdentitySchema.isDefault) &&
        Objects.equals(this.preset, normalizedProjectRevisionIdentitySchema.preset) &&
        Objects.equals(this.projectRevisionId, normalizedProjectRevisionIdentitySchema.projectRevisionId) &&
        Objects.equals(this.updatedAt, normalizedProjectRevisionIdentitySchema.updatedAt)&&
        Objects.equals(this.additionalProperties, normalizedProjectRevisionIdentitySchema.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, identitySchema, identitySchemaId, importId, importUrl, isDefault, preset, projectRevisionId, updatedAt, additionalProperties);
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
    sb.append("class NormalizedProjectRevisionIdentitySchema {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identitySchema: ").append(toIndentedString(identitySchema)).append("\n");
    sb.append("    identitySchemaId: ").append(toIndentedString(identitySchemaId)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    importUrl: ").append(toIndentedString(importUrl)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    projectRevisionId: ").append(toIndentedString(projectRevisionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("identity_schema");
    openapiFields.add("identity_schema_id");
    openapiFields.add("import_id");
    openapiFields.add("import_url");
    openapiFields.add("is_default");
    openapiFields.add("preset");
    openapiFields.add("project_revision_id");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NormalizedProjectRevisionIdentitySchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NormalizedProjectRevisionIdentitySchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormalizedProjectRevisionIdentitySchema is not found in the empty JSON string", NormalizedProjectRevisionIdentitySchema.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `identity_schema`
      if (jsonObj.get("identity_schema") != null && !jsonObj.get("identity_schema").isJsonNull()) {
        ManagedIdentitySchema.validateJsonElement(jsonObj.get("identity_schema"));
      }
      if ((jsonObj.get("identity_schema_id") != null && !jsonObj.get("identity_schema_id").isJsonNull()) && !jsonObj.get("identity_schema_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_schema_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_schema_id").toString()));
      }
      if ((jsonObj.get("import_id") != null && !jsonObj.get("import_id").isJsonNull()) && !jsonObj.get("import_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_id").toString()));
      }
      if ((jsonObj.get("import_url") != null && !jsonObj.get("import_url").isJsonNull()) && !jsonObj.get("import_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_url").toString()));
      }
      if ((jsonObj.get("preset") != null && !jsonObj.get("preset").isJsonNull()) && !jsonObj.get("preset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preset").toString()));
      }
      if ((jsonObj.get("project_revision_id") != null && !jsonObj.get("project_revision_id").isJsonNull()) && !jsonObj.get("project_revision_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_revision_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_revision_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormalizedProjectRevisionIdentitySchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormalizedProjectRevisionIdentitySchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormalizedProjectRevisionIdentitySchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormalizedProjectRevisionIdentitySchema.class));

       return (TypeAdapter<T>) new TypeAdapter<NormalizedProjectRevisionIdentitySchema>() {
           @Override
           public void write(JsonWriter out, NormalizedProjectRevisionIdentitySchema value) throws IOException {
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
           public NormalizedProjectRevisionIdentitySchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             NormalizedProjectRevisionIdentitySchema instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of NormalizedProjectRevisionIdentitySchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NormalizedProjectRevisionIdentitySchema
   * @throws IOException if the JSON string is invalid with respect to NormalizedProjectRevisionIdentitySchema
   */
  public static NormalizedProjectRevisionIdentitySchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormalizedProjectRevisionIdentitySchema.class);
  }

  /**
   * Convert an instance of NormalizedProjectRevisionIdentitySchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

