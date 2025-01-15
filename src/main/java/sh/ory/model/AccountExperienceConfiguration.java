/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.1
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
import java.util.HashMap;
import java.util.Map;

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
 * AccountExperienceConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T16:05:48.020332781Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class AccountExperienceConfiguration {
  public static final String SERIALIZED_NAME_ACCOUNT_EXPERIENCE_THEME_STYLESHEET = "account_experience_theme_stylesheet";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_EXPERIENCE_THEME_STYLESHEET)
  private String accountExperienceThemeStylesheet;

  public static final String SERIALIZED_NAME_FAVICON_TYPE = "favicon_type";
  @SerializedName(SERIALIZED_NAME_FAVICON_TYPE)
  private String faviconType;

  public static final String SERIALIZED_NAME_FAVICON_URL = "favicon_url";
  @SerializedName(SERIALIZED_NAME_FAVICON_URL)
  private String faviconUrl;

  public static final String SERIALIZED_NAME_KRATOS_SELFSERVICE_DEFAULT_BROWSER_RETURN_URL = "kratos_selfservice_default_browser_return_url";
  @SerializedName(SERIALIZED_NAME_KRATOS_SELFSERVICE_DEFAULT_BROWSER_RETURN_URL)
  private String kratosSelfserviceDefaultBrowserReturnUrl;

  public static final String SERIALIZED_NAME_KRATOS_SELFSERVICE_FLOWS_RECOVERY_ENABLED = "kratos_selfservice_flows_recovery_enabled";
  @SerializedName(SERIALIZED_NAME_KRATOS_SELFSERVICE_FLOWS_RECOVERY_ENABLED)
  private Boolean kratosSelfserviceFlowsRecoveryEnabled;

  public static final String SERIALIZED_NAME_KRATOS_SELFSERVICE_FLOWS_REGISTRATION_ENABLED = "kratos_selfservice_flows_registration_enabled";
  @SerializedName(SERIALIZED_NAME_KRATOS_SELFSERVICE_FLOWS_REGISTRATION_ENABLED)
  private Boolean kratosSelfserviceFlowsRegistrationEnabled;

  public static final String SERIALIZED_NAME_KRATOS_SELFSERVICE_FLOWS_VERIFICATION_ENABLED = "kratos_selfservice_flows_verification_enabled";
  @SerializedName(SERIALIZED_NAME_KRATOS_SELFSERVICE_FLOWS_VERIFICATION_ENABLED)
  private Boolean kratosSelfserviceFlowsVerificationEnabled;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORGANIZATION_MAP = "organization_map";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_MAP)
  private Map<String, String> organizationMap = new HashMap<>();

  public AccountExperienceConfiguration() {
  }

  public AccountExperienceConfiguration accountExperienceThemeStylesheet(String accountExperienceThemeStylesheet) {
    this.accountExperienceThemeStylesheet = accountExperienceThemeStylesheet;
    return this;
  }

  /**
   * Get accountExperienceThemeStylesheet
   * @return accountExperienceThemeStylesheet
   */
  @javax.annotation.Nullable
  public String getAccountExperienceThemeStylesheet() {
    return accountExperienceThemeStylesheet;
  }

  public void setAccountExperienceThemeStylesheet(String accountExperienceThemeStylesheet) {
    this.accountExperienceThemeStylesheet = accountExperienceThemeStylesheet;
  }


  public AccountExperienceConfiguration faviconType(String faviconType) {
    this.faviconType = faviconType;
    return this;
  }

  /**
   * Get faviconType
   * @return faviconType
   */
  @javax.annotation.Nullable
  public String getFaviconType() {
    return faviconType;
  }

  public void setFaviconType(String faviconType) {
    this.faviconType = faviconType;
  }


  public AccountExperienceConfiguration faviconUrl(String faviconUrl) {
    this.faviconUrl = faviconUrl;
    return this;
  }

  /**
   * Get faviconUrl
   * @return faviconUrl
   */
  @javax.annotation.Nullable
  public String getFaviconUrl() {
    return faviconUrl;
  }

  public void setFaviconUrl(String faviconUrl) {
    this.faviconUrl = faviconUrl;
  }


  public AccountExperienceConfiguration kratosSelfserviceDefaultBrowserReturnUrl(String kratosSelfserviceDefaultBrowserReturnUrl) {
    this.kratosSelfserviceDefaultBrowserReturnUrl = kratosSelfserviceDefaultBrowserReturnUrl;
    return this;
  }

  /**
   * Get kratosSelfserviceDefaultBrowserReturnUrl
   * @return kratosSelfserviceDefaultBrowserReturnUrl
   */
  @javax.annotation.Nullable
  public String getKratosSelfserviceDefaultBrowserReturnUrl() {
    return kratosSelfserviceDefaultBrowserReturnUrl;
  }

  public void setKratosSelfserviceDefaultBrowserReturnUrl(String kratosSelfserviceDefaultBrowserReturnUrl) {
    this.kratosSelfserviceDefaultBrowserReturnUrl = kratosSelfserviceDefaultBrowserReturnUrl;
  }


  public AccountExperienceConfiguration kratosSelfserviceFlowsRecoveryEnabled(Boolean kratosSelfserviceFlowsRecoveryEnabled) {
    this.kratosSelfserviceFlowsRecoveryEnabled = kratosSelfserviceFlowsRecoveryEnabled;
    return this;
  }

  /**
   * Get kratosSelfserviceFlowsRecoveryEnabled
   * @return kratosSelfserviceFlowsRecoveryEnabled
   */
  @javax.annotation.Nullable
  public Boolean getKratosSelfserviceFlowsRecoveryEnabled() {
    return kratosSelfserviceFlowsRecoveryEnabled;
  }

  public void setKratosSelfserviceFlowsRecoveryEnabled(Boolean kratosSelfserviceFlowsRecoveryEnabled) {
    this.kratosSelfserviceFlowsRecoveryEnabled = kratosSelfserviceFlowsRecoveryEnabled;
  }


  public AccountExperienceConfiguration kratosSelfserviceFlowsRegistrationEnabled(Boolean kratosSelfserviceFlowsRegistrationEnabled) {
    this.kratosSelfserviceFlowsRegistrationEnabled = kratosSelfserviceFlowsRegistrationEnabled;
    return this;
  }

  /**
   * Get kratosSelfserviceFlowsRegistrationEnabled
   * @return kratosSelfserviceFlowsRegistrationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getKratosSelfserviceFlowsRegistrationEnabled() {
    return kratosSelfserviceFlowsRegistrationEnabled;
  }

  public void setKratosSelfserviceFlowsRegistrationEnabled(Boolean kratosSelfserviceFlowsRegistrationEnabled) {
    this.kratosSelfserviceFlowsRegistrationEnabled = kratosSelfserviceFlowsRegistrationEnabled;
  }


  public AccountExperienceConfiguration kratosSelfserviceFlowsVerificationEnabled(Boolean kratosSelfserviceFlowsVerificationEnabled) {
    this.kratosSelfserviceFlowsVerificationEnabled = kratosSelfserviceFlowsVerificationEnabled;
    return this;
  }

  /**
   * Get kratosSelfserviceFlowsVerificationEnabled
   * @return kratosSelfserviceFlowsVerificationEnabled
   */
  @javax.annotation.Nullable
  public Boolean getKratosSelfserviceFlowsVerificationEnabled() {
    return kratosSelfserviceFlowsVerificationEnabled;
  }

  public void setKratosSelfserviceFlowsVerificationEnabled(Boolean kratosSelfserviceFlowsVerificationEnabled) {
    this.kratosSelfserviceFlowsVerificationEnabled = kratosSelfserviceFlowsVerificationEnabled;
  }


  public AccountExperienceConfiguration logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * Get logoUrl
   * @return logoUrl
   */
  @javax.annotation.Nullable
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public AccountExperienceConfiguration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccountExperienceConfiguration organizationMap(Map<String, String> organizationMap) {
    this.organizationMap = organizationMap;
    return this;
  }

  public AccountExperienceConfiguration putOrganizationMapItem(String key, String organizationMapItem) {
    if (this.organizationMap == null) {
      this.organizationMap = new HashMap<>();
    }
    this.organizationMap.put(key, organizationMapItem);
    return this;
  }

  /**
   * Get organizationMap
   * @return organizationMap
   */
  @javax.annotation.Nullable
  public Map<String, String> getOrganizationMap() {
    return organizationMap;
  }

  public void setOrganizationMap(Map<String, String> organizationMap) {
    this.organizationMap = organizationMap;
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
   * @return the AccountExperienceConfiguration instance itself
   */
  public AccountExperienceConfiguration putAdditionalProperty(String key, Object value) {
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
    AccountExperienceConfiguration accountExperienceConfiguration = (AccountExperienceConfiguration) o;
    return Objects.equals(this.accountExperienceThemeStylesheet, accountExperienceConfiguration.accountExperienceThemeStylesheet) &&
        Objects.equals(this.faviconType, accountExperienceConfiguration.faviconType) &&
        Objects.equals(this.faviconUrl, accountExperienceConfiguration.faviconUrl) &&
        Objects.equals(this.kratosSelfserviceDefaultBrowserReturnUrl, accountExperienceConfiguration.kratosSelfserviceDefaultBrowserReturnUrl) &&
        Objects.equals(this.kratosSelfserviceFlowsRecoveryEnabled, accountExperienceConfiguration.kratosSelfserviceFlowsRecoveryEnabled) &&
        Objects.equals(this.kratosSelfserviceFlowsRegistrationEnabled, accountExperienceConfiguration.kratosSelfserviceFlowsRegistrationEnabled) &&
        Objects.equals(this.kratosSelfserviceFlowsVerificationEnabled, accountExperienceConfiguration.kratosSelfserviceFlowsVerificationEnabled) &&
        Objects.equals(this.logoUrl, accountExperienceConfiguration.logoUrl) &&
        Objects.equals(this.name, accountExperienceConfiguration.name) &&
        Objects.equals(this.organizationMap, accountExperienceConfiguration.organizationMap)&&
        Objects.equals(this.additionalProperties, accountExperienceConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountExperienceThemeStylesheet, faviconType, faviconUrl, kratosSelfserviceDefaultBrowserReturnUrl, kratosSelfserviceFlowsRecoveryEnabled, kratosSelfserviceFlowsRegistrationEnabled, kratosSelfserviceFlowsVerificationEnabled, logoUrl, name, organizationMap, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountExperienceConfiguration {\n");
    sb.append("    accountExperienceThemeStylesheet: ").append(toIndentedString(accountExperienceThemeStylesheet)).append("\n");
    sb.append("    faviconType: ").append(toIndentedString(faviconType)).append("\n");
    sb.append("    faviconUrl: ").append(toIndentedString(faviconUrl)).append("\n");
    sb.append("    kratosSelfserviceDefaultBrowserReturnUrl: ").append(toIndentedString(kratosSelfserviceDefaultBrowserReturnUrl)).append("\n");
    sb.append("    kratosSelfserviceFlowsRecoveryEnabled: ").append(toIndentedString(kratosSelfserviceFlowsRecoveryEnabled)).append("\n");
    sb.append("    kratosSelfserviceFlowsRegistrationEnabled: ").append(toIndentedString(kratosSelfserviceFlowsRegistrationEnabled)).append("\n");
    sb.append("    kratosSelfserviceFlowsVerificationEnabled: ").append(toIndentedString(kratosSelfserviceFlowsVerificationEnabled)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationMap: ").append(toIndentedString(organizationMap)).append("\n");
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
    openapiFields.add("account_experience_theme_stylesheet");
    openapiFields.add("favicon_type");
    openapiFields.add("favicon_url");
    openapiFields.add("kratos_selfservice_default_browser_return_url");
    openapiFields.add("kratos_selfservice_flows_recovery_enabled");
    openapiFields.add("kratos_selfservice_flows_registration_enabled");
    openapiFields.add("kratos_selfservice_flows_verification_enabled");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("organization_map");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccountExperienceConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountExperienceConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountExperienceConfiguration is not found in the empty JSON string", AccountExperienceConfiguration.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_experience_theme_stylesheet") != null && !jsonObj.get("account_experience_theme_stylesheet").isJsonNull()) && !jsonObj.get("account_experience_theme_stylesheet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_experience_theme_stylesheet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_experience_theme_stylesheet").toString()));
      }
      if ((jsonObj.get("favicon_type") != null && !jsonObj.get("favicon_type").isJsonNull()) && !jsonObj.get("favicon_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favicon_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favicon_type").toString()));
      }
      if ((jsonObj.get("favicon_url") != null && !jsonObj.get("favicon_url").isJsonNull()) && !jsonObj.get("favicon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favicon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favicon_url").toString()));
      }
      if ((jsonObj.get("kratos_selfservice_default_browser_return_url") != null && !jsonObj.get("kratos_selfservice_default_browser_return_url").isJsonNull()) && !jsonObj.get("kratos_selfservice_default_browser_return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kratos_selfservice_default_browser_return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kratos_selfservice_default_browser_return_url").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountExperienceConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountExperienceConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountExperienceConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountExperienceConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountExperienceConfiguration>() {
           @Override
           public void write(JsonWriter out, AccountExperienceConfiguration value) throws IOException {
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
           public AccountExperienceConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AccountExperienceConfiguration instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AccountExperienceConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountExperienceConfiguration
   * @throws IOException if the JSON string is invalid with respect to AccountExperienceConfiguration
   */
  public static AccountExperienceConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountExperienceConfiguration.class);
  }

  /**
   * Convert an instance of AccountExperienceConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

