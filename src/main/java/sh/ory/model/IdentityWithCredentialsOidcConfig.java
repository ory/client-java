/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.2
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sh.ory.model.IdentityWithCredentialsOidcConfigProvider;
import sh.ory.model.IdentityWithCredentialsPasswordConfig;

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
 * IdentityWithCredentialsOidcConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-18T11:43:08.917400963Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class IdentityWithCredentialsOidcConfig {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private IdentityWithCredentialsPasswordConfig config;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  private List<IdentityWithCredentialsOidcConfigProvider> providers = new ArrayList<>();

  public IdentityWithCredentialsOidcConfig() {
  }

  public IdentityWithCredentialsOidcConfig config(IdentityWithCredentialsPasswordConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @javax.annotation.Nullable
  public IdentityWithCredentialsPasswordConfig getConfig() {
    return config;
  }

  public void setConfig(IdentityWithCredentialsPasswordConfig config) {
    this.config = config;
  }


  public IdentityWithCredentialsOidcConfig providers(List<IdentityWithCredentialsOidcConfigProvider> providers) {
    this.providers = providers;
    return this;
  }

  public IdentityWithCredentialsOidcConfig addProvidersItem(IdentityWithCredentialsOidcConfigProvider providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * A list of OpenID Connect Providers
   * @return providers
   */
  @javax.annotation.Nullable
  public List<IdentityWithCredentialsOidcConfigProvider> getProviders() {
    return providers;
  }

  public void setProviders(List<IdentityWithCredentialsOidcConfigProvider> providers) {
    this.providers = providers;
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
   * @return the IdentityWithCredentialsOidcConfig instance itself
   */
  public IdentityWithCredentialsOidcConfig putAdditionalProperty(String key, Object value) {
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
    IdentityWithCredentialsOidcConfig identityWithCredentialsOidcConfig = (IdentityWithCredentialsOidcConfig) o;
    return Objects.equals(this.config, identityWithCredentialsOidcConfig.config) &&
        Objects.equals(this.providers, identityWithCredentialsOidcConfig.providers)&&
        Objects.equals(this.additionalProperties, identityWithCredentialsOidcConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, providers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityWithCredentialsOidcConfig {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
    openapiFields.add("config");
    openapiFields.add("providers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IdentityWithCredentialsOidcConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdentityWithCredentialsOidcConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityWithCredentialsOidcConfig is not found in the empty JSON string", IdentityWithCredentialsOidcConfig.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        IdentityWithCredentialsPasswordConfig.validateJsonElement(jsonObj.get("config"));
      }
      if (jsonObj.get("providers") != null && !jsonObj.get("providers").isJsonNull()) {
        JsonArray jsonArrayproviders = jsonObj.getAsJsonArray("providers");
        if (jsonArrayproviders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("providers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `providers` to be an array in the JSON string but got `%s`", jsonObj.get("providers").toString()));
          }

          // validate the optional field `providers` (array)
          for (int i = 0; i < jsonArrayproviders.size(); i++) {
            IdentityWithCredentialsOidcConfigProvider.validateJsonElement(jsonArrayproviders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityWithCredentialsOidcConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityWithCredentialsOidcConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityWithCredentialsOidcConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityWithCredentialsOidcConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityWithCredentialsOidcConfig>() {
           @Override
           public void write(JsonWriter out, IdentityWithCredentialsOidcConfig value) throws IOException {
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
           public IdentityWithCredentialsOidcConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             IdentityWithCredentialsOidcConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of IdentityWithCredentialsOidcConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IdentityWithCredentialsOidcConfig
   * @throws IOException if the JSON string is invalid with respect to IdentityWithCredentialsOidcConfig
   */
  public static IdentityWithCredentialsOidcConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityWithCredentialsOidcConfig.class);
  }

  /**
   * Convert an instance of IdentityWithCredentialsOidcConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

