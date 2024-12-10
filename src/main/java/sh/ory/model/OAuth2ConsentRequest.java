/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.15
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
import sh.ory.model.OAuth2Client;
import sh.ory.model.OAuth2ConsentRequestOpenIDConnectContext;

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
 * OAuth2ConsentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T15:01:40.810271087Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class OAuth2ConsentRequest {
  public static final String SERIALIZED_NAME_ACR = "acr";
  @SerializedName(SERIALIZED_NAME_ACR)
  private String acr;

  public static final String SERIALIZED_NAME_AMR = "amr";
  @SerializedName(SERIALIZED_NAME_AMR)
  private List<String> amr = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
  @SerializedName(SERIALIZED_NAME_CHALLENGE)
  private String challenge;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private OAuth2Client client;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Object context;

  public static final String SERIALIZED_NAME_LOGIN_CHALLENGE = "login_challenge";
  @SerializedName(SERIALIZED_NAME_LOGIN_CHALLENGE)
  private String loginChallenge;

  public static final String SERIALIZED_NAME_LOGIN_SESSION_ID = "login_session_id";
  @SerializedName(SERIALIZED_NAME_LOGIN_SESSION_ID)
  private String loginSessionId;

  public static final String SERIALIZED_NAME_OIDC_CONTEXT = "oidc_context";
  @SerializedName(SERIALIZED_NAME_OIDC_CONTEXT)
  private OAuth2ConsentRequestOpenIDConnectContext oidcContext;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE = "requested_access_token_audience";
  @SerializedName(SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE)
  private List<String> requestedAccessTokenAudience = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUESTED_SCOPE = "requested_scope";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SCOPE)
  private List<String> requestedScope = new ArrayList<>();

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Boolean skip;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public OAuth2ConsentRequest() {
  }

  public OAuth2ConsentRequest acr(String acr) {
    this.acr = acr;
    return this;
  }

  /**
   * ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
   * @return acr
   */
  @javax.annotation.Nullable
  public String getAcr() {
    return acr;
  }

  public void setAcr(String acr) {
    this.acr = acr;
  }


  public OAuth2ConsentRequest amr(List<String> amr) {
    this.amr = amr;
    return this;
  }

  public OAuth2ConsentRequest addAmrItem(String amrItem) {
    if (this.amr == null) {
      this.amr = new ArrayList<>();
    }
    this.amr.add(amrItem);
    return this;
  }

  /**
   * Get amr
   * @return amr
   */
  @javax.annotation.Nullable
  public List<String> getAmr() {
    return amr;
  }

  public void setAmr(List<String> amr) {
    this.amr = amr;
  }


  public OAuth2ConsentRequest challenge(String challenge) {
    this.challenge = challenge;
    return this;
  }

  /**
   * ID is the identifier (\&quot;authorization challenge\&quot;) of the consent authorization request. It is used to identify the session.
   * @return challenge
   */
  @javax.annotation.Nonnull
  public String getChallenge() {
    return challenge;
  }

  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  public OAuth2ConsentRequest client(OAuth2Client client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nullable
  public OAuth2Client getClient() {
    return client;
  }

  public void setClient(OAuth2Client client) {
    this.client = client;
  }


  public OAuth2ConsentRequest context(Object context) {
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


  public OAuth2ConsentRequest loginChallenge(String loginChallenge) {
    this.loginChallenge = loginChallenge;
    return this;
  }

  /**
   * LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login &amp; consent app.
   * @return loginChallenge
   */
  @javax.annotation.Nullable
  public String getLoginChallenge() {
    return loginChallenge;
  }

  public void setLoginChallenge(String loginChallenge) {
    this.loginChallenge = loginChallenge;
  }


  public OAuth2ConsentRequest loginSessionId(String loginSessionId) {
    this.loginSessionId = loginSessionId;
    return this;
  }

  /**
   * LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \&quot;sid\&quot; parameter in the ID Token and in OIDC Front-/Back- channel logout. It&#39;s value can generally be used to associate consecutive login requests by a certain user.
   * @return loginSessionId
   */
  @javax.annotation.Nullable
  public String getLoginSessionId() {
    return loginSessionId;
  }

  public void setLoginSessionId(String loginSessionId) {
    this.loginSessionId = loginSessionId;
  }


  public OAuth2ConsentRequest oidcContext(OAuth2ConsentRequestOpenIDConnectContext oidcContext) {
    this.oidcContext = oidcContext;
    return this;
  }

  /**
   * Get oidcContext
   * @return oidcContext
   */
  @javax.annotation.Nullable
  public OAuth2ConsentRequestOpenIDConnectContext getOidcContext() {
    return oidcContext;
  }

  public void setOidcContext(OAuth2ConsentRequestOpenIDConnectContext oidcContext) {
    this.oidcContext = oidcContext;
  }


  public OAuth2ConsentRequest requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
   * @return requestUrl
   */
  @javax.annotation.Nullable
  public String getRequestUrl() {
    return requestUrl;
  }

  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public OAuth2ConsentRequest requestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
    return this;
  }

  public OAuth2ConsentRequest addRequestedAccessTokenAudienceItem(String requestedAccessTokenAudienceItem) {
    if (this.requestedAccessTokenAudience == null) {
      this.requestedAccessTokenAudience = new ArrayList<>();
    }
    this.requestedAccessTokenAudience.add(requestedAccessTokenAudienceItem);
    return this;
  }

  /**
   * Get requestedAccessTokenAudience
   * @return requestedAccessTokenAudience
   */
  @javax.annotation.Nullable
  public List<String> getRequestedAccessTokenAudience() {
    return requestedAccessTokenAudience;
  }

  public void setRequestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
  }


  public OAuth2ConsentRequest requestedScope(List<String> requestedScope) {
    this.requestedScope = requestedScope;
    return this;
  }

  public OAuth2ConsentRequest addRequestedScopeItem(String requestedScopeItem) {
    if (this.requestedScope == null) {
      this.requestedScope = new ArrayList<>();
    }
    this.requestedScope.add(requestedScopeItem);
    return this;
  }

  /**
   * Get requestedScope
   * @return requestedScope
   */
  @javax.annotation.Nullable
  public List<String> getRequestedScope() {
    return requestedScope;
  }

  public void setRequestedScope(List<String> requestedScope) {
    this.requestedScope = requestedScope;
  }


  public OAuth2ConsentRequest skip(Boolean skip) {
    this.skip = skip;
    return this;
  }

  /**
   * Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
   * @return skip
   */
  @javax.annotation.Nullable
  public Boolean getSkip() {
    return skip;
  }

  public void setSkip(Boolean skip) {
    this.skip = skip;
  }


  public OAuth2ConsentRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
   * @return subject
   */
  @javax.annotation.Nullable
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
   * @return the OAuth2ConsentRequest instance itself
   */
  public OAuth2ConsentRequest putAdditionalProperty(String key, Object value) {
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
    OAuth2ConsentRequest oAuth2ConsentRequest = (OAuth2ConsentRequest) o;
    return Objects.equals(this.acr, oAuth2ConsentRequest.acr) &&
        Objects.equals(this.amr, oAuth2ConsentRequest.amr) &&
        Objects.equals(this.challenge, oAuth2ConsentRequest.challenge) &&
        Objects.equals(this.client, oAuth2ConsentRequest.client) &&
        Objects.equals(this.context, oAuth2ConsentRequest.context) &&
        Objects.equals(this.loginChallenge, oAuth2ConsentRequest.loginChallenge) &&
        Objects.equals(this.loginSessionId, oAuth2ConsentRequest.loginSessionId) &&
        Objects.equals(this.oidcContext, oAuth2ConsentRequest.oidcContext) &&
        Objects.equals(this.requestUrl, oAuth2ConsentRequest.requestUrl) &&
        Objects.equals(this.requestedAccessTokenAudience, oAuth2ConsentRequest.requestedAccessTokenAudience) &&
        Objects.equals(this.requestedScope, oAuth2ConsentRequest.requestedScope) &&
        Objects.equals(this.skip, oAuth2ConsentRequest.skip) &&
        Objects.equals(this.subject, oAuth2ConsentRequest.subject)&&
        Objects.equals(this.additionalProperties, oAuth2ConsentRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, amr, challenge, client, context, loginChallenge, loginSessionId, oidcContext, requestUrl, requestedAccessTokenAudience, requestedScope, skip, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ConsentRequest {\n");
    sb.append("    acr: ").append(toIndentedString(acr)).append("\n");
    sb.append("    amr: ").append(toIndentedString(amr)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    loginChallenge: ").append(toIndentedString(loginChallenge)).append("\n");
    sb.append("    loginSessionId: ").append(toIndentedString(loginSessionId)).append("\n");
    sb.append("    oidcContext: ").append(toIndentedString(oidcContext)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestedAccessTokenAudience: ").append(toIndentedString(requestedAccessTokenAudience)).append("\n");
    sb.append("    requestedScope: ").append(toIndentedString(requestedScope)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
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
    openapiFields.add("acr");
    openapiFields.add("amr");
    openapiFields.add("challenge");
    openapiFields.add("client");
    openapiFields.add("context");
    openapiFields.add("login_challenge");
    openapiFields.add("login_session_id");
    openapiFields.add("oidc_context");
    openapiFields.add("request_url");
    openapiFields.add("requested_access_token_audience");
    openapiFields.add("requested_scope");
    openapiFields.add("skip");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challenge");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OAuth2ConsentRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OAuth2ConsentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuth2ConsentRequest is not found in the empty JSON string", OAuth2ConsentRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuth2ConsentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("acr") != null && !jsonObj.get("acr").isJsonNull()) && !jsonObj.get("acr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acr").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("amr") != null && !jsonObj.get("amr").isJsonNull() && !jsonObj.get("amr").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `amr` to be an array in the JSON string but got `%s`", jsonObj.get("amr").toString()));
      }
      if (!jsonObj.get("challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challenge").toString()));
      }
      // validate the optional field `client`
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) {
        OAuth2Client.validateJsonElement(jsonObj.get("client"));
      }
      if ((jsonObj.get("login_challenge") != null && !jsonObj.get("login_challenge").isJsonNull()) && !jsonObj.get("login_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_challenge").toString()));
      }
      if ((jsonObj.get("login_session_id") != null && !jsonObj.get("login_session_id").isJsonNull()) && !jsonObj.get("login_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_session_id").toString()));
      }
      // validate the optional field `oidc_context`
      if (jsonObj.get("oidc_context") != null && !jsonObj.get("oidc_context").isJsonNull()) {
        OAuth2ConsentRequestOpenIDConnectContext.validateJsonElement(jsonObj.get("oidc_context"));
      }
      if ((jsonObj.get("request_url") != null && !jsonObj.get("request_url").isJsonNull()) && !jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requested_access_token_audience") != null && !jsonObj.get("requested_access_token_audience").isJsonNull() && !jsonObj.get("requested_access_token_audience").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested_access_token_audience` to be an array in the JSON string but got `%s`", jsonObj.get("requested_access_token_audience").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requested_scope") != null && !jsonObj.get("requested_scope").isJsonNull() && !jsonObj.get("requested_scope").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested_scope` to be an array in the JSON string but got `%s`", jsonObj.get("requested_scope").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuth2ConsentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuth2ConsentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuth2ConsentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuth2ConsentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuth2ConsentRequest>() {
           @Override
           public void write(JsonWriter out, OAuth2ConsentRequest value) throws IOException {
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
           public OAuth2ConsentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OAuth2ConsentRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of OAuth2ConsentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OAuth2ConsentRequest
   * @throws IOException if the JSON string is invalid with respect to OAuth2ConsentRequest
   */
  public static OAuth2ConsentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuth2ConsentRequest.class);
  }

  /**
   * Convert an instance of OAuth2ConsentRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

