/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.12
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.ProjectBrandingTheme;

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
 * The Project Branding
 */
@ApiModel(description = "The Project Branding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-16T12:43:05.469126781Z[Etc/UTC]")
public class ProjectBranding {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DEFAULT_THEME = "default_theme";
  @SerializedName(SERIALIZED_NAME_DEFAULT_THEME)
  private ProjectBrandingTheme defaultTheme;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_THEMES = "themes";
  @SerializedName(SERIALIZED_NAME_THEMES)
  private List<ProjectBrandingTheme> themes = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ProjectBranding() {
  }

  
  public ProjectBranding(
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
   * The Customization Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Customization Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public ProjectBranding defaultTheme(ProjectBrandingTheme defaultTheme) {
    
    this.defaultTheme = defaultTheme;
    return this;
  }

   /**
   * Get defaultTheme
   * @return defaultTheme
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectBrandingTheme getDefaultTheme() {
    return defaultTheme;
  }


  public void setDefaultTheme(ProjectBrandingTheme defaultTheme) {
    this.defaultTheme = defaultTheme;
  }


   /**
   * The customization ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The customization ID.")

  public String getId() {
    return id;
  }




  public ProjectBranding projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The Project&#39;s ID this customization is associated with
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Project's ID this customization is associated with")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ProjectBranding themes(List<ProjectBrandingTheme> themes) {
    
    this.themes = themes;
    return this;
  }

  public ProjectBranding addThemesItem(ProjectBrandingTheme themesItem) {
    this.themes.add(themesItem);
    return this;
  }

   /**
   * The Project Branding Themes
   * @return themes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Project Branding Themes")

  public List<ProjectBrandingTheme> getThemes() {
    return themes;
  }


  public void setThemes(List<ProjectBrandingTheme> themes) {
    this.themes = themes;
  }


   /**
   * Last Time Branding was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Last Time Branding was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectBranding projectBranding = (ProjectBranding) o;
    return Objects.equals(this.createdAt, projectBranding.createdAt) &&
        Objects.equals(this.defaultTheme, projectBranding.defaultTheme) &&
        Objects.equals(this.id, projectBranding.id) &&
        Objects.equals(this.projectId, projectBranding.projectId) &&
        Objects.equals(this.themes, projectBranding.themes) &&
        Objects.equals(this.updatedAt, projectBranding.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, defaultTheme, id, projectId, themes, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBranding {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultTheme: ").append(toIndentedString(defaultTheme)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("default_theme");
    openapiFields.add("id");
    openapiFields.add("project_id");
    openapiFields.add("themes");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("default_theme");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("themes");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectBranding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectBranding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectBranding is not found in the empty JSON string", ProjectBranding.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectBranding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectBranding` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectBranding.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `default_theme`
      ProjectBrandingTheme.validateJsonObject(jsonObj.getAsJsonObject("default_theme"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("themes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `themes` to be an array in the JSON string but got `%s`", jsonObj.get("themes").toString()));
      }

      JsonArray jsonArraythemes = jsonObj.getAsJsonArray("themes");
      // validate the required field `themes` (array)
      for (int i = 0; i < jsonArraythemes.size(); i++) {
        ProjectBrandingTheme.validateJsonObject(jsonArraythemes.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectBranding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectBranding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectBranding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectBranding.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectBranding>() {
           @Override
           public void write(JsonWriter out, ProjectBranding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectBranding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectBranding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectBranding
  * @throws IOException if the JSON string is invalid with respect to ProjectBranding
  */
  public static ProjectBranding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectBranding.class);
  }

 /**
  * Convert an instance of ProjectBranding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

