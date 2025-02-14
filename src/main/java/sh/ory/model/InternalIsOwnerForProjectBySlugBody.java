/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.7
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
import java.util.Arrays;

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
 * Is Owner For Project By Slug Request Body
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-14T11:28:32.199778394Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class InternalIsOwnerForProjectBySlugBody {
  /**
   * Namespace is the namespace of the subject.
   */
  @JsonAdapter(NamespaceEnum.Adapter.class)
  public enum NamespaceEnum {
    USER("User"),
    
    _API_KEY(" ApiKey");

    private String value;

    NamespaceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NamespaceEnum fromValue(String value) {
      for (NamespaceEnum b : NamespaceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NamespaceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NamespaceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NamespaceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NamespaceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NamespaceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private NamespaceEnum namespace;

  public static final String SERIALIZED_NAME_PROJECT_SCOPE = "project_scope";
  @SerializedName(SERIALIZED_NAME_PROJECT_SCOPE)
  private String projectScope;

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "project_slug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG)
  private String projectSlug;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public InternalIsOwnerForProjectBySlugBody() {
  }

  public InternalIsOwnerForProjectBySlugBody namespace(NamespaceEnum namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is the namespace of the subject.
   * @return namespace
   */
  @javax.annotation.Nonnull
  public NamespaceEnum getNamespace() {
    return namespace;
  }

  public void setNamespace(NamespaceEnum namespace) {
    this.namespace = namespace;
  }


  public InternalIsOwnerForProjectBySlugBody projectScope(String projectScope) {
    this.projectScope = projectScope;
    return this;
  }

  /**
   * ProjectScope is the project_id resolved from the API key.
   * @return projectScope
   */
  @javax.annotation.Nullable
  public String getProjectScope() {
    return projectScope;
  }

  public void setProjectScope(String projectScope) {
    this.projectScope = projectScope;
  }


  public InternalIsOwnerForProjectBySlugBody projectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
    return this;
  }

  /**
   * ProjectSlug is the project&#39;s slug.
   * @return projectSlug
   */
  @javax.annotation.Nonnull
  public String getProjectSlug() {
    return projectSlug;
  }

  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }


  public InternalIsOwnerForProjectBySlugBody subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject is the subject acting (user or API key).
   * @return subject
   */
  @javax.annotation.Nonnull
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
   * @return the InternalIsOwnerForProjectBySlugBody instance itself
   */
  public InternalIsOwnerForProjectBySlugBody putAdditionalProperty(String key, Object value) {
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
    InternalIsOwnerForProjectBySlugBody internalIsOwnerForProjectBySlugBody = (InternalIsOwnerForProjectBySlugBody) o;
    return Objects.equals(this.namespace, internalIsOwnerForProjectBySlugBody.namespace) &&
        Objects.equals(this.projectScope, internalIsOwnerForProjectBySlugBody.projectScope) &&
        Objects.equals(this.projectSlug, internalIsOwnerForProjectBySlugBody.projectSlug) &&
        Objects.equals(this.subject, internalIsOwnerForProjectBySlugBody.subject)&&
        Objects.equals(this.additionalProperties, internalIsOwnerForProjectBySlugBody.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, projectScope, projectSlug, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalIsOwnerForProjectBySlugBody {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    projectScope: ").append(toIndentedString(projectScope)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("namespace");
    openapiFields.add("project_scope");
    openapiFields.add("project_slug");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("namespace");
    openapiRequiredFields.add("project_slug");
    openapiRequiredFields.add("subject");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InternalIsOwnerForProjectBySlugBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InternalIsOwnerForProjectBySlugBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InternalIsOwnerForProjectBySlugBody is not found in the empty JSON string", InternalIsOwnerForProjectBySlugBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InternalIsOwnerForProjectBySlugBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      // validate the required field `namespace`
      NamespaceEnum.validateJsonElement(jsonObj.get("namespace"));
      if ((jsonObj.get("project_scope") != null && !jsonObj.get("project_scope").isJsonNull()) && !jsonObj.get("project_scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_scope").toString()));
      }
      if (!jsonObj.get("project_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_slug").toString()));
      }
      if (!jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InternalIsOwnerForProjectBySlugBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InternalIsOwnerForProjectBySlugBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InternalIsOwnerForProjectBySlugBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InternalIsOwnerForProjectBySlugBody.class));

       return (TypeAdapter<T>) new TypeAdapter<InternalIsOwnerForProjectBySlugBody>() {
           @Override
           public void write(JsonWriter out, InternalIsOwnerForProjectBySlugBody value) throws IOException {
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
           public InternalIsOwnerForProjectBySlugBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             InternalIsOwnerForProjectBySlugBody instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of InternalIsOwnerForProjectBySlugBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InternalIsOwnerForProjectBySlugBody
   * @throws IOException if the JSON string is invalid with respect to InternalIsOwnerForProjectBySlugBody
   */
  public static InternalIsOwnerForProjectBySlugBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InternalIsOwnerForProjectBySlugBody.class);
  }

  /**
   * Convert an instance of InternalIsOwnerForProjectBySlugBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

