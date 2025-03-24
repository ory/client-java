/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.19.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.Workspace;

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
 * ProjectMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T11:29:18.613405246Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ProjectMetadata {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The environment of the project. prod Production stage Staging dev Development
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    PROD("prod"),
    
    STAGE("stage"),
    
    DEV("dev");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EnvironmentEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment;

  /**
   * The project&#39;s data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global
   */
  @JsonAdapter(HomeRegionEnum.Adapter.class)
  public enum HomeRegionEnum {
    EU_CENTRAL("eu-central"),
    
    ASIA_NORTHEAST("asia-northeast"),
    
    US_EAST("us-east"),
    
    US_WEST("us-west"),
    
    US("us"),
    
    GLOBAL("global");

    private String value;

    HomeRegionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HomeRegionEnum fromValue(String value) {
      for (HomeRegionEnum b : HomeRegionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HomeRegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HomeRegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HomeRegionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HomeRegionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      HomeRegionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_HOME_REGION = "home_region";
  @SerializedName(SERIALIZED_NAME_HOME_REGION)
  private HomeRegionEnum homeRegion;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<String> hosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  /**
   * The state of the project. running Running halted Halted deleted Deleted
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("running"),
    
    HALTED("halted"),
    
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PLAN = "subscription_plan";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PLAN)
  private String subscriptionPlan;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private Workspace workspace;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspace_id";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public ProjectMetadata() {
  }

  public ProjectMetadata(
     String id, 
     String slug
  ) {
    this();
    this.id = id;
    this.slug = slug;
  }

  public ProjectMetadata createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Project&#39;s Creation Date
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ProjectMetadata environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The environment of the project. prod Production stage Staging dev Development
   * @return environment
   */
  @javax.annotation.Nonnull
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }


  public ProjectMetadata homeRegion(HomeRegionEnum homeRegion) {
    this.homeRegion = homeRegion;
    return this;
  }

  /**
   * The project&#39;s data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global
   * @return homeRegion
   */
  @javax.annotation.Nonnull
  public HomeRegionEnum getHomeRegion() {
    return homeRegion;
  }

  public void setHomeRegion(HomeRegionEnum homeRegion) {
    this.homeRegion = homeRegion;
  }


  public ProjectMetadata hosts(List<String> hosts) {
    this.hosts = hosts;
    return this;
  }

  public ProjectMetadata addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

  /**
   * Get hosts
   * @return hosts
   */
  @javax.annotation.Nonnull
  public List<String> getHosts() {
    return hosts;
  }

  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }


  /**
   * The project&#39;s ID.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public ProjectMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The project&#39;s name if set
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * The project&#39;s slug
   * @return slug
   */
  @javax.annotation.Nonnull
  public String getSlug() {
    return slug;
  }



  public ProjectMetadata state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * The state of the project. running Running halted Halted deleted Deleted
   * @return state
   */
  @javax.annotation.Nonnull
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  public ProjectMetadata subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId
   * @return subscriptionId
   */
  @javax.annotation.Nullable
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public ProjectMetadata subscriptionPlan(String subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

  /**
   * Get subscriptionPlan
   * @return subscriptionPlan
   */
  @javax.annotation.Nullable
  public String getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(String subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }


  public ProjectMetadata updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last Time Project was Updated
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ProjectMetadata workspace(Workspace workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
   */
  @javax.annotation.Nullable
  public Workspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(Workspace workspace) {
    this.workspace = workspace;
  }


  public ProjectMetadata workspaceId(String workspaceId) {
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
   * @return the ProjectMetadata instance itself
   */
  public ProjectMetadata putAdditionalProperty(String key, Object value) {
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
    ProjectMetadata projectMetadata = (ProjectMetadata) o;
    return Objects.equals(this.createdAt, projectMetadata.createdAt) &&
        Objects.equals(this.environment, projectMetadata.environment) &&
        Objects.equals(this.homeRegion, projectMetadata.homeRegion) &&
        Objects.equals(this.hosts, projectMetadata.hosts) &&
        Objects.equals(this.id, projectMetadata.id) &&
        Objects.equals(this.name, projectMetadata.name) &&
        Objects.equals(this.slug, projectMetadata.slug) &&
        Objects.equals(this.state, projectMetadata.state) &&
        Objects.equals(this.subscriptionId, projectMetadata.subscriptionId) &&
        Objects.equals(this.subscriptionPlan, projectMetadata.subscriptionPlan) &&
        Objects.equals(this.updatedAt, projectMetadata.updatedAt) &&
        Objects.equals(this.workspace, projectMetadata.workspace) &&
        Objects.equals(this.workspaceId, projectMetadata.workspaceId)&&
        Objects.equals(this.additionalProperties, projectMetadata.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, environment, homeRegion, hosts, id, name, slug, state, subscriptionId, subscriptionPlan, updatedAt, workspace, workspaceId, additionalProperties);
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
    sb.append("class ProjectMetadata {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionPlan: ").append(toIndentedString(subscriptionPlan)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
    openapiFields.add("environment");
    openapiFields.add("home_region");
    openapiFields.add("hosts");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("state");
    openapiFields.add("subscription_id");
    openapiFields.add("subscription_plan");
    openapiFields.add("updated_at");
    openapiFields.add("workspace");
    openapiFields.add("workspace_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("environment");
    openapiRequiredFields.add("home_region");
    openapiRequiredFields.add("hosts");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProjectMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProjectMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectMetadata is not found in the empty JSON string", ProjectMetadata.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      // validate the required field `environment`
      EnvironmentEnum.validateJsonElement(jsonObj.get("environment"));
      if (!jsonObj.get("home_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `home_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("home_region").toString()));
      }
      // validate the required field `home_region`
      HomeRegionEnum.validateJsonElement(jsonObj.get("home_region"));
      // ensure the required json array is present
      if (jsonObj.get("hosts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("hosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `state`
      StateEnum.validateJsonElement(jsonObj.get("state"));
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("subscription_plan") != null && !jsonObj.get("subscription_plan").isJsonNull()) && !jsonObj.get("subscription_plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_plan").toString()));
      }
      // validate the optional field `workspace`
      if (jsonObj.get("workspace") != null && !jsonObj.get("workspace").isJsonNull()) {
        Workspace.validateJsonElement(jsonObj.get("workspace"));
      }
      if ((jsonObj.get("workspace_id") != null && !jsonObj.get("workspace_id").isJsonNull()) && !jsonObj.get("workspace_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspace_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspace_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectMetadata>() {
           @Override
           public void write(JsonWriter out, ProjectMetadata value) throws IOException {
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
           public ProjectMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProjectMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ProjectMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProjectMetadata
   * @throws IOException if the JSON string is invalid with respect to ProjectMetadata
   */
  public static ProjectMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectMetadata.class);
  }

  /**
   * Convert an instance of ProjectMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

