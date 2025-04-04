/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.20.3
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
 * AccountExperienceConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T09:12:04.786643499Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class AccountExperienceConfiguration {
  public static final String SERIALIZED_NAME_DEFAULT_REDIRECT_URL = "default_redirect_url";
  @SerializedName(SERIALIZED_NAME_DEFAULT_REDIRECT_URL)
  private String defaultRedirectUrl;

  public static final String SERIALIZED_NAME_ERROR_UI_URL = "error_ui_url";
  @SerializedName(SERIALIZED_NAME_ERROR_UI_URL)
  private String errorUiUrl;

  public static final String SERIALIZED_NAME_FAVICON_DARK_URL = "favicon_dark_url";
  @SerializedName(SERIALIZED_NAME_FAVICON_DARK_URL)
  private String faviconDarkUrl;

  public static final String SERIALIZED_NAME_FAVICON_LIGHT_URL = "favicon_light_url";
  @SerializedName(SERIALIZED_NAME_FAVICON_LIGHT_URL)
  private String faviconLightUrl;

  public static final String SERIALIZED_NAME_LOGIN_UI_URL = "login_ui_url";
  @SerializedName(SERIALIZED_NAME_LOGIN_UI_URL)
  private String loginUiUrl;

  public static final String SERIALIZED_NAME_LOGO_DARK_URL = "logo_dark_url";
  @SerializedName(SERIALIZED_NAME_LOGO_DARK_URL)
  private String logoDarkUrl;

  public static final String SERIALIZED_NAME_LOGO_LIGHT_URL = "logo_light_url";
  @SerializedName(SERIALIZED_NAME_LOGO_LIGHT_URL)
  private String logoLightUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECOVERY_ENABLED = "recovery_enabled";
  @SerializedName(SERIALIZED_NAME_RECOVERY_ENABLED)
  private Boolean recoveryEnabled;

  public static final String SERIALIZED_NAME_RECOVERY_UI_URL = "recovery_ui_url";
  @SerializedName(SERIALIZED_NAME_RECOVERY_UI_URL)
  private String recoveryUiUrl;

  public static final String SERIALIZED_NAME_REGISTRATION_ENABLED = "registration_enabled";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_ENABLED)
  private Boolean registrationEnabled;

  public static final String SERIALIZED_NAME_REGISTRATION_UI_URL = "registration_ui_url";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_UI_URL)
  private String registrationUiUrl;

  public static final String SERIALIZED_NAME_SETTINGS_UI_URL = "settings_ui_url";
  @SerializedName(SERIALIZED_NAME_SETTINGS_UI_URL)
  private String settingsUiUrl;

  public static final String SERIALIZED_NAME_STYLESHEET = "stylesheet";
  @SerializedName(SERIALIZED_NAME_STYLESHEET)
  private String stylesheet;

  public static final String SERIALIZED_NAME_VERIFICATION_ENABLED = "verification_enabled";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ENABLED)
  private Boolean verificationEnabled;

  public static final String SERIALIZED_NAME_VERIFICATION_UI_URL = "verification_ui_url";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_UI_URL)
  private String verificationUiUrl;

  public AccountExperienceConfiguration() {
  }

  public AccountExperienceConfiguration defaultRedirectUrl(String defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

  /**
   * Get defaultRedirectUrl
   * @return defaultRedirectUrl
   */
  @javax.annotation.Nonnull
  public String getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  public void setDefaultRedirectUrl(String defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }


  public AccountExperienceConfiguration errorUiUrl(String errorUiUrl) {
    this.errorUiUrl = errorUiUrl;
    return this;
  }

  /**
   * Get errorUiUrl
   * @return errorUiUrl
   */
  @javax.annotation.Nonnull
  public String getErrorUiUrl() {
    return errorUiUrl;
  }

  public void setErrorUiUrl(String errorUiUrl) {
    this.errorUiUrl = errorUiUrl;
  }


  public AccountExperienceConfiguration faviconDarkUrl(String faviconDarkUrl) {
    this.faviconDarkUrl = faviconDarkUrl;
    return this;
  }

  /**
   * Get faviconDarkUrl
   * @return faviconDarkUrl
   */
  @javax.annotation.Nullable
  public String getFaviconDarkUrl() {
    return faviconDarkUrl;
  }

  public void setFaviconDarkUrl(String faviconDarkUrl) {
    this.faviconDarkUrl = faviconDarkUrl;
  }


  public AccountExperienceConfiguration faviconLightUrl(String faviconLightUrl) {
    this.faviconLightUrl = faviconLightUrl;
    return this;
  }

  /**
   * Get faviconLightUrl
   * @return faviconLightUrl
   */
  @javax.annotation.Nullable
  public String getFaviconLightUrl() {
    return faviconLightUrl;
  }

  public void setFaviconLightUrl(String faviconLightUrl) {
    this.faviconLightUrl = faviconLightUrl;
  }


  public AccountExperienceConfiguration loginUiUrl(String loginUiUrl) {
    this.loginUiUrl = loginUiUrl;
    return this;
  }

  /**
   * Get loginUiUrl
   * @return loginUiUrl
   */
  @javax.annotation.Nonnull
  public String getLoginUiUrl() {
    return loginUiUrl;
  }

  public void setLoginUiUrl(String loginUiUrl) {
    this.loginUiUrl = loginUiUrl;
  }


  public AccountExperienceConfiguration logoDarkUrl(String logoDarkUrl) {
    this.logoDarkUrl = logoDarkUrl;
    return this;
  }

  /**
   * Get logoDarkUrl
   * @return logoDarkUrl
   */
  @javax.annotation.Nullable
  public String getLogoDarkUrl() {
    return logoDarkUrl;
  }

  public void setLogoDarkUrl(String logoDarkUrl) {
    this.logoDarkUrl = logoDarkUrl;
  }


  public AccountExperienceConfiguration logoLightUrl(String logoLightUrl) {
    this.logoLightUrl = logoLightUrl;
    return this;
  }

  /**
   * Get logoLightUrl
   * @return logoLightUrl
   */
  @javax.annotation.Nullable
  public String getLogoLightUrl() {
    return logoLightUrl;
  }

  public void setLogoLightUrl(String logoLightUrl) {
    this.logoLightUrl = logoLightUrl;
  }


  public AccountExperienceConfiguration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccountExperienceConfiguration recoveryEnabled(Boolean recoveryEnabled) {
    this.recoveryEnabled = recoveryEnabled;
    return this;
  }

  /**
   * Get recoveryEnabled
   * @return recoveryEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getRecoveryEnabled() {
    return recoveryEnabled;
  }

  public void setRecoveryEnabled(Boolean recoveryEnabled) {
    this.recoveryEnabled = recoveryEnabled;
  }


  public AccountExperienceConfiguration recoveryUiUrl(String recoveryUiUrl) {
    this.recoveryUiUrl = recoveryUiUrl;
    return this;
  }

  /**
   * Get recoveryUiUrl
   * @return recoveryUiUrl
   */
  @javax.annotation.Nonnull
  public String getRecoveryUiUrl() {
    return recoveryUiUrl;
  }

  public void setRecoveryUiUrl(String recoveryUiUrl) {
    this.recoveryUiUrl = recoveryUiUrl;
  }


  public AccountExperienceConfiguration registrationEnabled(Boolean registrationEnabled) {
    this.registrationEnabled = registrationEnabled;
    return this;
  }

  /**
   * Get registrationEnabled
   * @return registrationEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getRegistrationEnabled() {
    return registrationEnabled;
  }

  public void setRegistrationEnabled(Boolean registrationEnabled) {
    this.registrationEnabled = registrationEnabled;
  }


  public AccountExperienceConfiguration registrationUiUrl(String registrationUiUrl) {
    this.registrationUiUrl = registrationUiUrl;
    return this;
  }

  /**
   * Get registrationUiUrl
   * @return registrationUiUrl
   */
  @javax.annotation.Nonnull
  public String getRegistrationUiUrl() {
    return registrationUiUrl;
  }

  public void setRegistrationUiUrl(String registrationUiUrl) {
    this.registrationUiUrl = registrationUiUrl;
  }


  public AccountExperienceConfiguration settingsUiUrl(String settingsUiUrl) {
    this.settingsUiUrl = settingsUiUrl;
    return this;
  }

  /**
   * Get settingsUiUrl
   * @return settingsUiUrl
   */
  @javax.annotation.Nonnull
  public String getSettingsUiUrl() {
    return settingsUiUrl;
  }

  public void setSettingsUiUrl(String settingsUiUrl) {
    this.settingsUiUrl = settingsUiUrl;
  }


  public AccountExperienceConfiguration stylesheet(String stylesheet) {
    this.stylesheet = stylesheet;
    return this;
  }

  /**
   * Get stylesheet
   * @return stylesheet
   */
  @javax.annotation.Nullable
  public String getStylesheet() {
    return stylesheet;
  }

  public void setStylesheet(String stylesheet) {
    this.stylesheet = stylesheet;
  }


  public AccountExperienceConfiguration verificationEnabled(Boolean verificationEnabled) {
    this.verificationEnabled = verificationEnabled;
    return this;
  }

  /**
   * Get verificationEnabled
   * @return verificationEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getVerificationEnabled() {
    return verificationEnabled;
  }

  public void setVerificationEnabled(Boolean verificationEnabled) {
    this.verificationEnabled = verificationEnabled;
  }


  public AccountExperienceConfiguration verificationUiUrl(String verificationUiUrl) {
    this.verificationUiUrl = verificationUiUrl;
    return this;
  }

  /**
   * Get verificationUiUrl
   * @return verificationUiUrl
   */
  @javax.annotation.Nonnull
  public String getVerificationUiUrl() {
    return verificationUiUrl;
  }

  public void setVerificationUiUrl(String verificationUiUrl) {
    this.verificationUiUrl = verificationUiUrl;
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
    return Objects.equals(this.defaultRedirectUrl, accountExperienceConfiguration.defaultRedirectUrl) &&
        Objects.equals(this.errorUiUrl, accountExperienceConfiguration.errorUiUrl) &&
        Objects.equals(this.faviconDarkUrl, accountExperienceConfiguration.faviconDarkUrl) &&
        Objects.equals(this.faviconLightUrl, accountExperienceConfiguration.faviconLightUrl) &&
        Objects.equals(this.loginUiUrl, accountExperienceConfiguration.loginUiUrl) &&
        Objects.equals(this.logoDarkUrl, accountExperienceConfiguration.logoDarkUrl) &&
        Objects.equals(this.logoLightUrl, accountExperienceConfiguration.logoLightUrl) &&
        Objects.equals(this.name, accountExperienceConfiguration.name) &&
        Objects.equals(this.recoveryEnabled, accountExperienceConfiguration.recoveryEnabled) &&
        Objects.equals(this.recoveryUiUrl, accountExperienceConfiguration.recoveryUiUrl) &&
        Objects.equals(this.registrationEnabled, accountExperienceConfiguration.registrationEnabled) &&
        Objects.equals(this.registrationUiUrl, accountExperienceConfiguration.registrationUiUrl) &&
        Objects.equals(this.settingsUiUrl, accountExperienceConfiguration.settingsUiUrl) &&
        Objects.equals(this.stylesheet, accountExperienceConfiguration.stylesheet) &&
        Objects.equals(this.verificationEnabled, accountExperienceConfiguration.verificationEnabled) &&
        Objects.equals(this.verificationUiUrl, accountExperienceConfiguration.verificationUiUrl)&&
        Objects.equals(this.additionalProperties, accountExperienceConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRedirectUrl, errorUiUrl, faviconDarkUrl, faviconLightUrl, loginUiUrl, logoDarkUrl, logoLightUrl, name, recoveryEnabled, recoveryUiUrl, registrationEnabled, registrationUiUrl, settingsUiUrl, stylesheet, verificationEnabled, verificationUiUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountExperienceConfiguration {\n");
    sb.append("    defaultRedirectUrl: ").append(toIndentedString(defaultRedirectUrl)).append("\n");
    sb.append("    errorUiUrl: ").append(toIndentedString(errorUiUrl)).append("\n");
    sb.append("    faviconDarkUrl: ").append(toIndentedString(faviconDarkUrl)).append("\n");
    sb.append("    faviconLightUrl: ").append(toIndentedString(faviconLightUrl)).append("\n");
    sb.append("    loginUiUrl: ").append(toIndentedString(loginUiUrl)).append("\n");
    sb.append("    logoDarkUrl: ").append(toIndentedString(logoDarkUrl)).append("\n");
    sb.append("    logoLightUrl: ").append(toIndentedString(logoLightUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recoveryEnabled: ").append(toIndentedString(recoveryEnabled)).append("\n");
    sb.append("    recoveryUiUrl: ").append(toIndentedString(recoveryUiUrl)).append("\n");
    sb.append("    registrationEnabled: ").append(toIndentedString(registrationEnabled)).append("\n");
    sb.append("    registrationUiUrl: ").append(toIndentedString(registrationUiUrl)).append("\n");
    sb.append("    settingsUiUrl: ").append(toIndentedString(settingsUiUrl)).append("\n");
    sb.append("    stylesheet: ").append(toIndentedString(stylesheet)).append("\n");
    sb.append("    verificationEnabled: ").append(toIndentedString(verificationEnabled)).append("\n");
    sb.append("    verificationUiUrl: ").append(toIndentedString(verificationUiUrl)).append("\n");
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
    openapiFields.add("default_redirect_url");
    openapiFields.add("error_ui_url");
    openapiFields.add("favicon_dark_url");
    openapiFields.add("favicon_light_url");
    openapiFields.add("login_ui_url");
    openapiFields.add("logo_dark_url");
    openapiFields.add("logo_light_url");
    openapiFields.add("name");
    openapiFields.add("recovery_enabled");
    openapiFields.add("recovery_ui_url");
    openapiFields.add("registration_enabled");
    openapiFields.add("registration_ui_url");
    openapiFields.add("settings_ui_url");
    openapiFields.add("stylesheet");
    openapiFields.add("verification_enabled");
    openapiFields.add("verification_ui_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("default_redirect_url");
    openapiRequiredFields.add("error_ui_url");
    openapiRequiredFields.add("login_ui_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("recovery_enabled");
    openapiRequiredFields.add("recovery_ui_url");
    openapiRequiredFields.add("registration_enabled");
    openapiRequiredFields.add("registration_ui_url");
    openapiRequiredFields.add("settings_ui_url");
    openapiRequiredFields.add("verification_enabled");
    openapiRequiredFields.add("verification_ui_url");
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

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountExperienceConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("default_redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_redirect_url").toString()));
      }
      if (!jsonObj.get("error_ui_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_ui_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_ui_url").toString()));
      }
      if ((jsonObj.get("favicon_dark_url") != null && !jsonObj.get("favicon_dark_url").isJsonNull()) && !jsonObj.get("favicon_dark_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favicon_dark_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favicon_dark_url").toString()));
      }
      if ((jsonObj.get("favicon_light_url") != null && !jsonObj.get("favicon_light_url").isJsonNull()) && !jsonObj.get("favicon_light_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favicon_light_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favicon_light_url").toString()));
      }
      if (!jsonObj.get("login_ui_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_ui_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_ui_url").toString()));
      }
      if ((jsonObj.get("logo_dark_url") != null && !jsonObj.get("logo_dark_url").isJsonNull()) && !jsonObj.get("logo_dark_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_dark_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_dark_url").toString()));
      }
      if ((jsonObj.get("logo_light_url") != null && !jsonObj.get("logo_light_url").isJsonNull()) && !jsonObj.get("logo_light_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_light_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_light_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("recovery_ui_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery_ui_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery_ui_url").toString()));
      }
      if (!jsonObj.get("registration_ui_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_ui_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_ui_url").toString()));
      }
      if (!jsonObj.get("settings_ui_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settings_ui_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settings_ui_url").toString()));
      }
      if ((jsonObj.get("stylesheet") != null && !jsonObj.get("stylesheet").isJsonNull()) && !jsonObj.get("stylesheet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stylesheet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stylesheet").toString()));
      }
      if (!jsonObj.get("verification_ui_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_ui_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verification_ui_url").toString()));
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

