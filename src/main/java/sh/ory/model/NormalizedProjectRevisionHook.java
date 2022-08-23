/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.14
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
import java.util.UUID;

/**
 * NormalizedProjectRevisionHook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T15:32:08.220513927Z[Etc/UTC]")
public class NormalizedProjectRevisionHook {
  public static final String SERIALIZED_NAME_CONFIG_KEY = "config_key";
  @SerializedName(SERIALIZED_NAME_CONFIG_KEY)
  private String configKey;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HOOK = "hook";
  @SerializedName(SERIALIZED_NAME_HOOK)
  private String hook;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PROJECT_REVISION_ID = "project_revision_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_REVISION_ID)
  private UUID projectRevisionId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_API_KEY_IN = "web_hook_config_auth_api_key_in";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_API_KEY_IN)
  private String webHookConfigAuthApiKeyIn;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_API_KEY_NAME = "web_hook_config_auth_api_key_name";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_API_KEY_NAME)
  private String webHookConfigAuthApiKeyName;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_API_KEY_VALUE = "web_hook_config_auth_api_key_value";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_API_KEY_VALUE)
  private String webHookConfigAuthApiKeyValue;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_BASIC_AUTH_PASSWORD = "web_hook_config_auth_basic_auth_password";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_BASIC_AUTH_PASSWORD)
  private String webHookConfigAuthBasicAuthPassword;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_BASIC_AUTH_USER = "web_hook_config_auth_basic_auth_user";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_BASIC_AUTH_USER)
  private String webHookConfigAuthBasicAuthUser;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_TYPE = "web_hook_config_auth_type";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_AUTH_TYPE)
  private String webHookConfigAuthType;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_BODY = "web_hook_config_body";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_BODY)
  private String webHookConfigBody;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_METHOD = "web_hook_config_method";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_METHOD)
  private String webHookConfigMethod;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_RESPONSE_IGNORE = "web_hook_config_response_ignore";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_RESPONSE_IGNORE)
  private Boolean webHookConfigResponseIgnore;

  public static final String SERIALIZED_NAME_WEB_HOOK_CONFIG_URL = "web_hook_config_url";
  @SerializedName(SERIALIZED_NAME_WEB_HOOK_CONFIG_URL)
  private String webHookConfigUrl;

  public NormalizedProjectRevisionHook() { 
  }

  
  public NormalizedProjectRevisionHook(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public NormalizedProjectRevisionHook configKey(String configKey) {
    
    this.configKey = configKey;
    return this;
  }

   /**
   * The Hooks Config Key
   * @return configKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Hooks Config Key")

  public String getConfigKey() {
    return configKey;
  }


  public void setConfigKey(String configKey) {
    this.configKey = configKey;
  }


   /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Project's Revision Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public NormalizedProjectRevisionHook hook(String hook) {
    
    this.hook = hook;
    return this;
  }

   /**
   * The Hook Type
   * @return hook
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Hook Type")

  public String getHook() {
    return hook;
  }


  public void setHook(String hook) {
    this.hook = hook;
  }


  public NormalizedProjectRevisionHook id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public NormalizedProjectRevisionHook projectRevisionId(UUID projectRevisionId) {
    
    this.projectRevisionId = projectRevisionId;
    return this;
  }

   /**
   * Get projectRevisionId
   * @return projectRevisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProjectRevisionId() {
    return projectRevisionId;
  }


  public void setProjectRevisionId(UUID projectRevisionId) {
    this.projectRevisionId = projectRevisionId;
  }


   /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last Time Project's Revision was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public NormalizedProjectRevisionHook webHookConfigAuthApiKeyIn(String webHookConfigAuthApiKeyIn) {
    
    this.webHookConfigAuthApiKeyIn = webHookConfigAuthApiKeyIn;
    return this;
  }

   /**
   * Whether to send the API Key in the HTTP Header or as a HTTP Cookie
   * @return webHookConfigAuthApiKeyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "header", value = "Whether to send the API Key in the HTTP Header or as a HTTP Cookie")

  public String getWebHookConfigAuthApiKeyIn() {
    return webHookConfigAuthApiKeyIn;
  }


  public void setWebHookConfigAuthApiKeyIn(String webHookConfigAuthApiKeyIn) {
    this.webHookConfigAuthApiKeyIn = webHookConfigAuthApiKeyIn;
  }


  public NormalizedProjectRevisionHook webHookConfigAuthApiKeyName(String webHookConfigAuthApiKeyName) {
    
    this.webHookConfigAuthApiKeyName = webHookConfigAuthApiKeyName;
    return this;
  }

   /**
   * The name of the api key
   * @return webHookConfigAuthApiKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "X-API-Key", value = "The name of the api key")

  public String getWebHookConfigAuthApiKeyName() {
    return webHookConfigAuthApiKeyName;
  }


  public void setWebHookConfigAuthApiKeyName(String webHookConfigAuthApiKeyName) {
    this.webHookConfigAuthApiKeyName = webHookConfigAuthApiKeyName;
  }


  public NormalizedProjectRevisionHook webHookConfigAuthApiKeyValue(String webHookConfigAuthApiKeyValue) {
    
    this.webHookConfigAuthApiKeyValue = webHookConfigAuthApiKeyValue;
    return this;
  }

   /**
   * The value of the api key
   * @return webHookConfigAuthApiKeyValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ", value = "The value of the api key")

  public String getWebHookConfigAuthApiKeyValue() {
    return webHookConfigAuthApiKeyValue;
  }


  public void setWebHookConfigAuthApiKeyValue(String webHookConfigAuthApiKeyValue) {
    this.webHookConfigAuthApiKeyValue = webHookConfigAuthApiKeyValue;
  }


  public NormalizedProjectRevisionHook webHookConfigAuthBasicAuthPassword(String webHookConfigAuthBasicAuthPassword) {
    
    this.webHookConfigAuthBasicAuthPassword = webHookConfigAuthBasicAuthPassword;
    return this;
  }

   /**
   * The password to be sent in the HTTP Basic Auth Header
   * @return webHookConfigAuthBasicAuthPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password to be sent in the HTTP Basic Auth Header")

  public String getWebHookConfigAuthBasicAuthPassword() {
    return webHookConfigAuthBasicAuthPassword;
  }


  public void setWebHookConfigAuthBasicAuthPassword(String webHookConfigAuthBasicAuthPassword) {
    this.webHookConfigAuthBasicAuthPassword = webHookConfigAuthBasicAuthPassword;
  }


  public NormalizedProjectRevisionHook webHookConfigAuthBasicAuthUser(String webHookConfigAuthBasicAuthUser) {
    
    this.webHookConfigAuthBasicAuthUser = webHookConfigAuthBasicAuthUser;
    return this;
  }

   /**
   * The username to be sent in the HTTP Basic Auth Header
   * @return webHookConfigAuthBasicAuthUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The username to be sent in the HTTP Basic Auth Header")

  public String getWebHookConfigAuthBasicAuthUser() {
    return webHookConfigAuthBasicAuthUser;
  }


  public void setWebHookConfigAuthBasicAuthUser(String webHookConfigAuthBasicAuthUser) {
    this.webHookConfigAuthBasicAuthUser = webHookConfigAuthBasicAuthUser;
  }


  public NormalizedProjectRevisionHook webHookConfigAuthType(String webHookConfigAuthType) {
    
    this.webHookConfigAuthType = webHookConfigAuthType;
    return this;
  }

   /**
   * HTTP Auth Method to use for the Web-Hook
   * @return webHookConfigAuthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP Auth Method to use for the Web-Hook")

  public String getWebHookConfigAuthType() {
    return webHookConfigAuthType;
  }


  public void setWebHookConfigAuthType(String webHookConfigAuthType) {
    this.webHookConfigAuthType = webHookConfigAuthType;
  }


  public NormalizedProjectRevisionHook webHookConfigBody(String webHookConfigBody) {
    
    this.webHookConfigBody = webHookConfigBody;
    return this;
  }

   /**
   * URI pointing to the JsonNet template used for Web-Hook payload generation. Only used for those HTTP methods, which support HTTP body payloads.
   * @return webHookConfigBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "base64://ZnVuY3Rpb24oY3R4KSB7CiAgaWRlbnRpdHlfaWQ6IGlmIGN0eFsiaWRlbnRpdHkiXSAhPSBudWxsIHRoZW4gY3R4LmlkZW50aXR5LmlkLAp9=", value = "URI pointing to the JsonNet template used for Web-Hook payload generation. Only used for those HTTP methods, which support HTTP body payloads.")

  public String getWebHookConfigBody() {
    return webHookConfigBody;
  }


  public void setWebHookConfigBody(String webHookConfigBody) {
    this.webHookConfigBody = webHookConfigBody;
  }


  public NormalizedProjectRevisionHook webHookConfigMethod(String webHookConfigMethod) {
    
    this.webHookConfigMethod = webHookConfigMethod;
    return this;
  }

   /**
   * The HTTP method to use (GET, POST, etc) for the Web-Hook
   * @return webHookConfigMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POST", value = "The HTTP method to use (GET, POST, etc) for the Web-Hook")

  public String getWebHookConfigMethod() {
    return webHookConfigMethod;
  }


  public void setWebHookConfigMethod(String webHookConfigMethod) {
    this.webHookConfigMethod = webHookConfigMethod;
  }


  public NormalizedProjectRevisionHook webHookConfigResponseIgnore(Boolean webHookConfigResponseIgnore) {
    
    this.webHookConfigResponseIgnore = webHookConfigResponseIgnore;
    return this;
  }

   /**
   * Whether to ignore the Web Hook response
   * @return webHookConfigResponseIgnore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to ignore the Web Hook response")

  public Boolean getWebHookConfigResponseIgnore() {
    return webHookConfigResponseIgnore;
  }


  public void setWebHookConfigResponseIgnore(Boolean webHookConfigResponseIgnore) {
    this.webHookConfigResponseIgnore = webHookConfigResponseIgnore;
  }


  public NormalizedProjectRevisionHook webHookConfigUrl(String webHookConfigUrl) {
    
    this.webHookConfigUrl = webHookConfigUrl;
    return this;
  }

   /**
   * The URL the Web-Hook should call
   * @return webHookConfigUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.org/web-hook-listener", value = "The URL the Web-Hook should call")

  public String getWebHookConfigUrl() {
    return webHookConfigUrl;
  }


  public void setWebHookConfigUrl(String webHookConfigUrl) {
    this.webHookConfigUrl = webHookConfigUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedProjectRevisionHook normalizedProjectRevisionHook = (NormalizedProjectRevisionHook) o;
    return Objects.equals(this.configKey, normalizedProjectRevisionHook.configKey) &&
        Objects.equals(this.createdAt, normalizedProjectRevisionHook.createdAt) &&
        Objects.equals(this.hook, normalizedProjectRevisionHook.hook) &&
        Objects.equals(this.id, normalizedProjectRevisionHook.id) &&
        Objects.equals(this.projectRevisionId, normalizedProjectRevisionHook.projectRevisionId) &&
        Objects.equals(this.updatedAt, normalizedProjectRevisionHook.updatedAt) &&
        Objects.equals(this.webHookConfigAuthApiKeyIn, normalizedProjectRevisionHook.webHookConfigAuthApiKeyIn) &&
        Objects.equals(this.webHookConfigAuthApiKeyName, normalizedProjectRevisionHook.webHookConfigAuthApiKeyName) &&
        Objects.equals(this.webHookConfigAuthApiKeyValue, normalizedProjectRevisionHook.webHookConfigAuthApiKeyValue) &&
        Objects.equals(this.webHookConfigAuthBasicAuthPassword, normalizedProjectRevisionHook.webHookConfigAuthBasicAuthPassword) &&
        Objects.equals(this.webHookConfigAuthBasicAuthUser, normalizedProjectRevisionHook.webHookConfigAuthBasicAuthUser) &&
        Objects.equals(this.webHookConfigAuthType, normalizedProjectRevisionHook.webHookConfigAuthType) &&
        Objects.equals(this.webHookConfigBody, normalizedProjectRevisionHook.webHookConfigBody) &&
        Objects.equals(this.webHookConfigMethod, normalizedProjectRevisionHook.webHookConfigMethod) &&
        Objects.equals(this.webHookConfigResponseIgnore, normalizedProjectRevisionHook.webHookConfigResponseIgnore) &&
        Objects.equals(this.webHookConfigUrl, normalizedProjectRevisionHook.webHookConfigUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configKey, createdAt, hook, id, projectRevisionId, updatedAt, webHookConfigAuthApiKeyIn, webHookConfigAuthApiKeyName, webHookConfigAuthApiKeyValue, webHookConfigAuthBasicAuthPassword, webHookConfigAuthBasicAuthUser, webHookConfigAuthType, webHookConfigBody, webHookConfigMethod, webHookConfigResponseIgnore, webHookConfigUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedProjectRevisionHook {\n");
    sb.append("    configKey: ").append(toIndentedString(configKey)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectRevisionId: ").append(toIndentedString(projectRevisionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    webHookConfigAuthApiKeyIn: ").append(toIndentedString(webHookConfigAuthApiKeyIn)).append("\n");
    sb.append("    webHookConfigAuthApiKeyName: ").append(toIndentedString(webHookConfigAuthApiKeyName)).append("\n");
    sb.append("    webHookConfigAuthApiKeyValue: ").append(toIndentedString(webHookConfigAuthApiKeyValue)).append("\n");
    sb.append("    webHookConfigAuthBasicAuthPassword: ").append(toIndentedString(webHookConfigAuthBasicAuthPassword)).append("\n");
    sb.append("    webHookConfigAuthBasicAuthUser: ").append(toIndentedString(webHookConfigAuthBasicAuthUser)).append("\n");
    sb.append("    webHookConfigAuthType: ").append(toIndentedString(webHookConfigAuthType)).append("\n");
    sb.append("    webHookConfigBody: ").append(toIndentedString(webHookConfigBody)).append("\n");
    sb.append("    webHookConfigMethod: ").append(toIndentedString(webHookConfigMethod)).append("\n");
    sb.append("    webHookConfigResponseIgnore: ").append(toIndentedString(webHookConfigResponseIgnore)).append("\n");
    sb.append("    webHookConfigUrl: ").append(toIndentedString(webHookConfigUrl)).append("\n");
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

}

