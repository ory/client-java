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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sh.ory.model.AcceptOAuth2ConsentRequestSession;
import sh.ory.model.OAuth2ConsentRequest;
import sh.ory.model.OAuth2ConsentSessionExpiresAt;

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
 * A completed OAuth 2.0 Consent Session.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-04T09:12:04.786643499Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class OAuth2ConsentSession {
  public static final String SERIALIZED_NAME_CONSENT_REQUEST = "consent_request";
  @SerializedName(SERIALIZED_NAME_CONSENT_REQUEST)
  private OAuth2ConsentRequest consentRequest;

  public static final String SERIALIZED_NAME_CONSENT_REQUEST_ID = "consent_request_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_REQUEST_ID)
  private String consentRequestId;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Object context;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OAuth2ConsentSessionExpiresAt expiresAt;

  public static final String SERIALIZED_NAME_GRANT_ACCESS_TOKEN_AUDIENCE = "grant_access_token_audience";
  @SerializedName(SERIALIZED_NAME_GRANT_ACCESS_TOKEN_AUDIENCE)
  private List<String> grantAccessTokenAudience = new ArrayList<>();

  public static final String SERIALIZED_NAME_GRANT_SCOPE = "grant_scope";
  @SerializedName(SERIALIZED_NAME_GRANT_SCOPE)
  private List<String> grantScope = new ArrayList<>();

  public static final String SERIALIZED_NAME_HANDLED_AT = "handled_at";
  @SerializedName(SERIALIZED_NAME_HANDLED_AT)
  private OffsetDateTime handledAt;

  public static final String SERIALIZED_NAME_REMEMBER = "remember";
  @SerializedName(SERIALIZED_NAME_REMEMBER)
  private Boolean remember;

  public static final String SERIALIZED_NAME_REMEMBER_FOR = "remember_for";
  @SerializedName(SERIALIZED_NAME_REMEMBER_FOR)
  private Long rememberFor;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private AcceptOAuth2ConsentRequestSession session;

  public OAuth2ConsentSession() {
  }

  public OAuth2ConsentSession consentRequest(OAuth2ConsentRequest consentRequest) {
    this.consentRequest = consentRequest;
    return this;
  }

  /**
   * Get consentRequest
   * @return consentRequest
   */
  @javax.annotation.Nullable
  public OAuth2ConsentRequest getConsentRequest() {
    return consentRequest;
  }

  public void setConsentRequest(OAuth2ConsentRequest consentRequest) {
    this.consentRequest = consentRequest;
  }


  public OAuth2ConsentSession consentRequestId(String consentRequestId) {
    this.consentRequestId = consentRequestId;
    return this;
  }

  /**
   * ConsentRequestID is the identifier of the consent request that initiated this consent session.
   * @return consentRequestId
   */
  @javax.annotation.Nullable
  public String getConsentRequestId() {
    return consentRequestId;
  }

  public void setConsentRequestId(String consentRequestId) {
    this.consentRequestId = consentRequestId;
  }


  public OAuth2ConsentSession context(Object context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @javax.annotation.Nullable
  public Object getContext() {
    return context;
  }

  public void setContext(Object context) {
    this.context = context;
  }


  public OAuth2ConsentSession expiresAt(OAuth2ConsentSessionExpiresAt expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
   */
  @javax.annotation.Nullable
  public OAuth2ConsentSessionExpiresAt getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OAuth2ConsentSessionExpiresAt expiresAt) {
    this.expiresAt = expiresAt;
  }


  public OAuth2ConsentSession grantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    this.grantAccessTokenAudience = grantAccessTokenAudience;
    return this;
  }

  public OAuth2ConsentSession addGrantAccessTokenAudienceItem(String grantAccessTokenAudienceItem) {
    if (this.grantAccessTokenAudience == null) {
      this.grantAccessTokenAudience = new ArrayList<>();
    }
    this.grantAccessTokenAudience.add(grantAccessTokenAudienceItem);
    return this;
  }

  /**
   * Get grantAccessTokenAudience
   * @return grantAccessTokenAudience
   */
  @javax.annotation.Nullable
  public List<String> getGrantAccessTokenAudience() {
    return grantAccessTokenAudience;
  }

  public void setGrantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    this.grantAccessTokenAudience = grantAccessTokenAudience;
  }


  public OAuth2ConsentSession grantScope(List<String> grantScope) {
    this.grantScope = grantScope;
    return this;
  }

  public OAuth2ConsentSession addGrantScopeItem(String grantScopeItem) {
    if (this.grantScope == null) {
      this.grantScope = new ArrayList<>();
    }
    this.grantScope.add(grantScopeItem);
    return this;
  }

  /**
   * Get grantScope
   * @return grantScope
   */
  @javax.annotation.Nullable
  public List<String> getGrantScope() {
    return grantScope;
  }

  public void setGrantScope(List<String> grantScope) {
    this.grantScope = grantScope;
  }


  public OAuth2ConsentSession handledAt(OffsetDateTime handledAt) {
    this.handledAt = handledAt;
    return this;
  }

  /**
   * Get handledAt
   * @return handledAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getHandledAt() {
    return handledAt;
  }

  public void setHandledAt(OffsetDateTime handledAt) {
    this.handledAt = handledAt;
  }


  public OAuth2ConsentSession remember(Boolean remember) {
    this.remember = remember;
    return this;
  }

  /**
   * Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
   * @return remember
   */
  @javax.annotation.Nullable
  public Boolean getRemember() {
    return remember;
  }

  public void setRemember(Boolean remember) {
    this.remember = remember;
  }


  public OAuth2ConsentSession rememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
    return this;
  }

  /**
   * Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely.
   * @return rememberFor
   */
  @javax.annotation.Nullable
  public Long getRememberFor() {
    return rememberFor;
  }

  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }


  public OAuth2ConsentSession session(AcceptOAuth2ConsentRequestSession session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
   */
  @javax.annotation.Nullable
  public AcceptOAuth2ConsentRequestSession getSession() {
    return session;
  }

  public void setSession(AcceptOAuth2ConsentRequestSession session) {
    this.session = session;
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
   * @return the OAuth2ConsentSession instance itself
   */
  public OAuth2ConsentSession putAdditionalProperty(String key, Object value) {
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
    OAuth2ConsentSession oAuth2ConsentSession = (OAuth2ConsentSession) o;
    return Objects.equals(this.consentRequest, oAuth2ConsentSession.consentRequest) &&
        Objects.equals(this.consentRequestId, oAuth2ConsentSession.consentRequestId) &&
        Objects.equals(this.context, oAuth2ConsentSession.context) &&
        Objects.equals(this.expiresAt, oAuth2ConsentSession.expiresAt) &&
        Objects.equals(this.grantAccessTokenAudience, oAuth2ConsentSession.grantAccessTokenAudience) &&
        Objects.equals(this.grantScope, oAuth2ConsentSession.grantScope) &&
        Objects.equals(this.handledAt, oAuth2ConsentSession.handledAt) &&
        Objects.equals(this.remember, oAuth2ConsentSession.remember) &&
        Objects.equals(this.rememberFor, oAuth2ConsentSession.rememberFor) &&
        Objects.equals(this.session, oAuth2ConsentSession.session)&&
        Objects.equals(this.additionalProperties, oAuth2ConsentSession.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentRequest, consentRequestId, context, expiresAt, grantAccessTokenAudience, grantScope, handledAt, remember, rememberFor, session, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ConsentSession {\n");
    sb.append("    consentRequest: ").append(toIndentedString(consentRequest)).append("\n");
    sb.append("    consentRequestId: ").append(toIndentedString(consentRequestId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    grantAccessTokenAudience: ").append(toIndentedString(grantAccessTokenAudience)).append("\n");
    sb.append("    grantScope: ").append(toIndentedString(grantScope)).append("\n");
    sb.append("    handledAt: ").append(toIndentedString(handledAt)).append("\n");
    sb.append("    remember: ").append(toIndentedString(remember)).append("\n");
    sb.append("    rememberFor: ").append(toIndentedString(rememberFor)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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
    openapiFields.add("consent_request");
    openapiFields.add("consent_request_id");
    openapiFields.add("context");
    openapiFields.add("expires_at");
    openapiFields.add("grant_access_token_audience");
    openapiFields.add("grant_scope");
    openapiFields.add("handled_at");
    openapiFields.add("remember");
    openapiFields.add("remember_for");
    openapiFields.add("session");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OAuth2ConsentSession
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OAuth2ConsentSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuth2ConsentSession is not found in the empty JSON string", OAuth2ConsentSession.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `consent_request`
      if (jsonObj.get("consent_request") != null && !jsonObj.get("consent_request").isJsonNull()) {
        OAuth2ConsentRequest.validateJsonElement(jsonObj.get("consent_request"));
      }
      if ((jsonObj.get("consent_request_id") != null && !jsonObj.get("consent_request_id").isJsonNull()) && !jsonObj.get("consent_request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consent_request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consent_request_id").toString()));
      }
      // validate the optional field `expires_at`
      if (jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()) {
        OAuth2ConsentSessionExpiresAt.validateJsonElement(jsonObj.get("expires_at"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("grant_access_token_audience") != null && !jsonObj.get("grant_access_token_audience").isJsonNull() && !jsonObj.get("grant_access_token_audience").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_access_token_audience` to be an array in the JSON string but got `%s`", jsonObj.get("grant_access_token_audience").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("grant_scope") != null && !jsonObj.get("grant_scope").isJsonNull() && !jsonObj.get("grant_scope").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_scope` to be an array in the JSON string but got `%s`", jsonObj.get("grant_scope").toString()));
      }
      // validate the optional field `session`
      if (jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) {
        AcceptOAuth2ConsentRequestSession.validateJsonElement(jsonObj.get("session"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuth2ConsentSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuth2ConsentSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuth2ConsentSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuth2ConsentSession.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuth2ConsentSession>() {
           @Override
           public void write(JsonWriter out, OAuth2ConsentSession value) throws IOException {
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
           public OAuth2ConsentSession read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OAuth2ConsentSession instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OAuth2ConsentSession given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OAuth2ConsentSession
   * @throws IOException if the JSON string is invalid with respect to OAuth2ConsentSession
   */
  public static OAuth2ConsentSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuth2ConsentSession.class);
  }

  /**
   * Convert an instance of OAuth2ConsentSession to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

