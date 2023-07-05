/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.39
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
 * IdentityCredentialsOidcProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-05T08:40:39.704702380Z[Etc/UTC]")
public class IdentityCredentialsOidcProvider {
  public static final String SERIALIZED_NAME_INITIAL_ACCESS_TOKEN = "initial_access_token";
  @SerializedName(SERIALIZED_NAME_INITIAL_ACCESS_TOKEN)
  private String initialAccessToken;

  public static final String SERIALIZED_NAME_INITIAL_ID_TOKEN = "initial_id_token";
  @SerializedName(SERIALIZED_NAME_INITIAL_ID_TOKEN)
  private String initialIdToken;

  public static final String SERIALIZED_NAME_INITIAL_REFRESH_TOKEN = "initial_refresh_token";
  @SerializedName(SERIALIZED_NAME_INITIAL_REFRESH_TOKEN)
  private String initialRefreshToken;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public IdentityCredentialsOidcProvider() {
  }

  public IdentityCredentialsOidcProvider initialAccessToken(String initialAccessToken) {
    
    this.initialAccessToken = initialAccessToken;
    return this;
  }

   /**
   * Get initialAccessToken
   * @return initialAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialAccessToken() {
    return initialAccessToken;
  }


  public void setInitialAccessToken(String initialAccessToken) {
    this.initialAccessToken = initialAccessToken;
  }


  public IdentityCredentialsOidcProvider initialIdToken(String initialIdToken) {
    
    this.initialIdToken = initialIdToken;
    return this;
  }

   /**
   * Get initialIdToken
   * @return initialIdToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialIdToken() {
    return initialIdToken;
  }


  public void setInitialIdToken(String initialIdToken) {
    this.initialIdToken = initialIdToken;
  }


  public IdentityCredentialsOidcProvider initialRefreshToken(String initialRefreshToken) {
    
    this.initialRefreshToken = initialRefreshToken;
    return this;
  }

   /**
   * Get initialRefreshToken
   * @return initialRefreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialRefreshToken() {
    return initialRefreshToken;
  }


  public void setInitialRefreshToken(String initialRefreshToken) {
    this.initialRefreshToken = initialRefreshToken;
  }


  public IdentityCredentialsOidcProvider provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public IdentityCredentialsOidcProvider subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * @return the IdentityCredentialsOidcProvider instance itself
   */
  public IdentityCredentialsOidcProvider putAdditionalProperty(String key, Object value) {
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
    IdentityCredentialsOidcProvider identityCredentialsOidcProvider = (IdentityCredentialsOidcProvider) o;
    return Objects.equals(this.initialAccessToken, identityCredentialsOidcProvider.initialAccessToken) &&
        Objects.equals(this.initialIdToken, identityCredentialsOidcProvider.initialIdToken) &&
        Objects.equals(this.initialRefreshToken, identityCredentialsOidcProvider.initialRefreshToken) &&
        Objects.equals(this.provider, identityCredentialsOidcProvider.provider) &&
        Objects.equals(this.subject, identityCredentialsOidcProvider.subject)&&
        Objects.equals(this.additionalProperties, identityCredentialsOidcProvider.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialAccessToken, initialIdToken, initialRefreshToken, provider, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCredentialsOidcProvider {\n");
    sb.append("    initialAccessToken: ").append(toIndentedString(initialAccessToken)).append("\n");
    sb.append("    initialIdToken: ").append(toIndentedString(initialIdToken)).append("\n");
    sb.append("    initialRefreshToken: ").append(toIndentedString(initialRefreshToken)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
    openapiFields.add("initial_access_token");
    openapiFields.add("initial_id_token");
    openapiFields.add("initial_refresh_token");
    openapiFields.add("provider");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityCredentialsOidcProvider
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IdentityCredentialsOidcProvider.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityCredentialsOidcProvider is not found in the empty JSON string", IdentityCredentialsOidcProvider.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("initial_access_token") != null && !jsonObj.get("initial_access_token").isJsonNull()) && !jsonObj.get("initial_access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_access_token").toString()));
      }
      if ((jsonObj.get("initial_id_token") != null && !jsonObj.get("initial_id_token").isJsonNull()) && !jsonObj.get("initial_id_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_id_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_id_token").toString()));
      }
      if ((jsonObj.get("initial_refresh_token") != null && !jsonObj.get("initial_refresh_token").isJsonNull()) && !jsonObj.get("initial_refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_refresh_token").toString()));
      }
      if ((jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull()) && !jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityCredentialsOidcProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityCredentialsOidcProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityCredentialsOidcProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityCredentialsOidcProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityCredentialsOidcProvider>() {
           @Override
           public void write(JsonWriter out, IdentityCredentialsOidcProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityCredentialsOidcProvider read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IdentityCredentialsOidcProvider instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IdentityCredentialsOidcProvider given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityCredentialsOidcProvider
  * @throws IOException if the JSON string is invalid with respect to IdentityCredentialsOidcProvider
  */
  public static IdentityCredentialsOidcProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityCredentialsOidcProvider.class);
  }

 /**
  * Convert an instance of IdentityCredentialsOidcProvider to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

