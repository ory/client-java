/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.3
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
 * Custom Hostname
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T11:58:14.260098998Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class CustomDomain {
  public static final String SERIALIZED_NAME_COOKIE_DOMAIN = "cookie_domain";
  @SerializedName(SERIALIZED_NAME_COOKIE_DOMAIN)
  private String cookieDomain;

  public static final String SERIALIZED_NAME_CORS_ALLOWED_ORIGINS = "cors_allowed_origins";
  @SerializedName(SERIALIZED_NAME_CORS_ALLOWED_ORIGINS)
  private List<String> corsAllowedOrigins = new ArrayList<>();

  public static final String SERIALIZED_NAME_CORS_ENABLED = "cors_enabled";
  @SerializedName(SERIALIZED_NAME_CORS_ENABLED)
  private Boolean corsEnabled;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOM_UI_BASE_URL = "custom_ui_base_url";
  @SerializedName(SERIALIZED_NAME_CUSTOM_UI_BASE_URL)
  private String customUiBaseUrl;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets sslStatus
   */
  @JsonAdapter(SslStatusEnum.Adapter.class)
  public enum SslStatusEnum {
    INITIALIZING("initializing"),
    
    PENDING_VALIDATION("pending_validation"),
    
    DELETED("deleted"),
    
    PENDING_ISSUANCE("pending_issuance"),
    
    PENDING_DEPLOYMENT("pending_deployment"),
    
    PENDING_DELETION("pending_deletion"),
    
    PENDING_EXPIRATION("pending_expiration"),
    
    EXPIRED("expired"),
    
    ACTIVE("active"),
    
    INITIALIZING_TIMED_OUT("initializing_timed_out"),
    
    VALIDATION_TIMED_OUT("validation_timed_out"),
    
    ISSUANCE_TIMED_OUT("issuance_timed_out"),
    
    DEPLOYMENT_TIMED_OUT("deployment_timed_out"),
    
    DELETION_TIMED_OUT("deletion_timed_out"),
    
    PENDING_CLEANUP("pending_cleanup"),
    
    STAGING_DEPLOYMENT("staging_deployment"),
    
    STAGING_ACTIVE("staging_active"),
    
    DEACTIVATING("deactivating"),
    
    INACTIVE("inactive"),
    
    BACKUP_ISSUED("backup_issued"),
    
    HOLDING_DEPLOYMENT("holding_deployment"),
    
    EMPTY("");

    private String value;

    SslStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SslStatusEnum fromValue(String value) {
      for (SslStatusEnum b : SslStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SslStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SslStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SslStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SslStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SslStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SSL_STATUS = "ssl_status";
  @SerializedName(SERIALIZED_NAME_SSL_STATUS)
  private SslStatusEnum sslStatus;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERIFICATION_ERRORS = "verification_errors";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ERRORS)
  private List<String> verificationErrors = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;

  public CustomDomain() {
  }

  public CustomDomain cookieDomain(String cookieDomain) {
    this.cookieDomain = cookieDomain;
    return this;
  }

  /**
   * Get cookieDomain
   * @return cookieDomain
   */
  @javax.annotation.Nullable
  public String getCookieDomain() {
    return cookieDomain;
  }

  public void setCookieDomain(String cookieDomain) {
    this.cookieDomain = cookieDomain;
  }


  public CustomDomain corsAllowedOrigins(List<String> corsAllowedOrigins) {
    this.corsAllowedOrigins = corsAllowedOrigins;
    return this;
  }

  public CustomDomain addCorsAllowedOriginsItem(String corsAllowedOriginsItem) {
    if (this.corsAllowedOrigins == null) {
      this.corsAllowedOrigins = new ArrayList<>();
    }
    this.corsAllowedOrigins.add(corsAllowedOriginsItem);
    return this;
  }

  /**
   * Get corsAllowedOrigins
   * @return corsAllowedOrigins
   */
  @javax.annotation.Nullable
  public List<String> getCorsAllowedOrigins() {
    return corsAllowedOrigins;
  }

  public void setCorsAllowedOrigins(List<String> corsAllowedOrigins) {
    this.corsAllowedOrigins = corsAllowedOrigins;
  }


  public CustomDomain corsEnabled(Boolean corsEnabled) {
    this.corsEnabled = corsEnabled;
    return this;
  }

  /**
   * Get corsEnabled
   * @return corsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getCorsEnabled() {
    return corsEnabled;
  }

  public void setCorsEnabled(Boolean corsEnabled) {
    this.corsEnabled = corsEnabled;
  }


  public CustomDomain createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CustomDomain customUiBaseUrl(String customUiBaseUrl) {
    this.customUiBaseUrl = customUiBaseUrl;
    return this;
  }

  /**
   * Get customUiBaseUrl
   * @return customUiBaseUrl
   */
  @javax.annotation.Nullable
  public String getCustomUiBaseUrl() {
    return customUiBaseUrl;
  }

  public void setCustomUiBaseUrl(String customUiBaseUrl) {
    this.customUiBaseUrl = customUiBaseUrl;
  }


  public CustomDomain hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
   */
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public CustomDomain id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CustomDomain sslStatus(SslStatusEnum sslStatus) {
    this.sslStatus = sslStatus;
    return this;
  }

  /**
   * Get sslStatus
   * @return sslStatus
   */
  @javax.annotation.Nullable
  public SslStatusEnum getSslStatus() {
    return sslStatus;
  }

  public void setSslStatus(SslStatusEnum sslStatus) {
    this.sslStatus = sslStatus;
  }


  public CustomDomain updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CustomDomain verificationErrors(List<String> verificationErrors) {
    this.verificationErrors = verificationErrors;
    return this;
  }

  public CustomDomain addVerificationErrorsItem(String verificationErrorsItem) {
    if (this.verificationErrors == null) {
      this.verificationErrors = new ArrayList<>();
    }
    this.verificationErrors.add(verificationErrorsItem);
    return this;
  }

  /**
   * Get verificationErrors
   * @return verificationErrors
   */
  @javax.annotation.Nullable
  public List<String> getVerificationErrors() {
    return verificationErrors;
  }

  public void setVerificationErrors(List<String> verificationErrors) {
    this.verificationErrors = verificationErrors;
  }


  public CustomDomain verificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  /**
   * Get verificationStatus
   * @return verificationStatus
   */
  @javax.annotation.Nullable
  public String getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
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
   * @return the CustomDomain instance itself
   */
  public CustomDomain putAdditionalProperty(String key, Object value) {
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
    CustomDomain customDomain = (CustomDomain) o;
    return Objects.equals(this.cookieDomain, customDomain.cookieDomain) &&
        Objects.equals(this.corsAllowedOrigins, customDomain.corsAllowedOrigins) &&
        Objects.equals(this.corsEnabled, customDomain.corsEnabled) &&
        Objects.equals(this.createdAt, customDomain.createdAt) &&
        Objects.equals(this.customUiBaseUrl, customDomain.customUiBaseUrl) &&
        Objects.equals(this.hostname, customDomain.hostname) &&
        Objects.equals(this.id, customDomain.id) &&
        Objects.equals(this.sslStatus, customDomain.sslStatus) &&
        Objects.equals(this.updatedAt, customDomain.updatedAt) &&
        Objects.equals(this.verificationErrors, customDomain.verificationErrors) &&
        Objects.equals(this.verificationStatus, customDomain.verificationStatus)&&
        Objects.equals(this.additionalProperties, customDomain.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieDomain, corsAllowedOrigins, corsEnabled, createdAt, customUiBaseUrl, hostname, id, sslStatus, updatedAt, verificationErrors, verificationStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDomain {\n");
    sb.append("    cookieDomain: ").append(toIndentedString(cookieDomain)).append("\n");
    sb.append("    corsAllowedOrigins: ").append(toIndentedString(corsAllowedOrigins)).append("\n");
    sb.append("    corsEnabled: ").append(toIndentedString(corsEnabled)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customUiBaseUrl: ").append(toIndentedString(customUiBaseUrl)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sslStatus: ").append(toIndentedString(sslStatus)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    verificationErrors: ").append(toIndentedString(verificationErrors)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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
    openapiFields.add("cookie_domain");
    openapiFields.add("cors_allowed_origins");
    openapiFields.add("cors_enabled");
    openapiFields.add("created_at");
    openapiFields.add("custom_ui_base_url");
    openapiFields.add("hostname");
    openapiFields.add("id");
    openapiFields.add("ssl_status");
    openapiFields.add("updated_at");
    openapiFields.add("verification_errors");
    openapiFields.add("verification_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomDomain
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomDomain.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomDomain is not found in the empty JSON string", CustomDomain.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cookie_domain") != null && !jsonObj.get("cookie_domain").isJsonNull()) && !jsonObj.get("cookie_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookie_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cookie_domain").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cors_allowed_origins") != null && !jsonObj.get("cors_allowed_origins").isJsonNull() && !jsonObj.get("cors_allowed_origins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cors_allowed_origins` to be an array in the JSON string but got `%s`", jsonObj.get("cors_allowed_origins").toString()));
      }
      if ((jsonObj.get("custom_ui_base_url") != null && !jsonObj.get("custom_ui_base_url").isJsonNull()) && !jsonObj.get("custom_ui_base_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_ui_base_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_ui_base_url").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ssl_status") != null && !jsonObj.get("ssl_status").isJsonNull()) && !jsonObj.get("ssl_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssl_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssl_status").toString()));
      }
      // validate the optional field `ssl_status`
      if (jsonObj.get("ssl_status") != null && !jsonObj.get("ssl_status").isJsonNull()) {
        SslStatusEnum.validateJsonElement(jsonObj.get("ssl_status"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("verification_errors") != null && !jsonObj.get("verification_errors").isJsonNull() && !jsonObj.get("verification_errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_errors` to be an array in the JSON string but got `%s`", jsonObj.get("verification_errors").toString()));
      }
      if ((jsonObj.get("verification_status") != null && !jsonObj.get("verification_status").isJsonNull()) && !jsonObj.get("verification_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomDomain.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomDomain' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomDomain> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomDomain.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomDomain>() {
           @Override
           public void write(JsonWriter out, CustomDomain value) throws IOException {
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
           public CustomDomain read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CustomDomain instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CustomDomain given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomDomain
   * @throws IOException if the JSON string is invalid with respect to CustomDomain
   */
  public static CustomDomain fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomDomain.class);
  }

  /**
   * Convert an instance of CustomDomain to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

