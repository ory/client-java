/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.28
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
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * OAuth2ConsentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-12T07:24:28.228249689Z[Etc/UTC]")
public class OAuth2ConsentRequest {
  public static final String SERIALIZED_NAME_ACR = "acr";
  @SerializedName(SERIALIZED_NAME_ACR)
  private String acr;

  public static final String SERIALIZED_NAME_AMR = "amr";
  @SerializedName(SERIALIZED_NAME_AMR)
  private List<String> amr = null;

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
  private List<String> requestedAccessTokenAudience = null;

  public static final String SERIALIZED_NAME_REQUESTED_SCOPE = "requested_scope";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SCOPE)
  private List<String> requestedScope = null;

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It's value can generally be used to associate consecutive login requests by a certain user.")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
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
        Objects.equals(this.subject, oAuth2ConsentRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, amr, challenge, client, context, loginChallenge, loginSessionId, oidcContext, requestUrl, requestedAccessTokenAudience, requestedScope, skip, subject);
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OAuth2ConsentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OAuth2ConsentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuth2ConsentRequest is not found in the empty JSON string", OAuth2ConsentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OAuth2ConsentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OAuth2ConsentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuth2ConsentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("acr") != null && !jsonObj.get("acr").isJsonNull()) && !jsonObj.get("acr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acr").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("amr") != null && !jsonObj.get("amr").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `amr` to be an array in the JSON string but got `%s`", jsonObj.get("amr").toString()));
      }
      if (!jsonObj.get("challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challenge").toString()));
      }
      // validate the optional field `client`
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) {
        OAuth2Client.validateJsonObject(jsonObj.getAsJsonObject("client"));
      }
      if ((jsonObj.get("login_challenge") != null && !jsonObj.get("login_challenge").isJsonNull()) && !jsonObj.get("login_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_challenge").toString()));
      }
      if ((jsonObj.get("login_session_id") != null && !jsonObj.get("login_session_id").isJsonNull()) && !jsonObj.get("login_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_session_id").toString()));
      }
      // validate the optional field `oidc_context`
      if (jsonObj.get("oidc_context") != null && !jsonObj.get("oidc_context").isJsonNull()) {
        OAuth2ConsentRequestOpenIDConnectContext.validateJsonObject(jsonObj.getAsJsonObject("oidc_context"));
      }
      if ((jsonObj.get("request_url") != null && !jsonObj.get("request_url").isJsonNull()) && !jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requested_access_token_audience") != null && !jsonObj.get("requested_access_token_audience").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested_access_token_audience` to be an array in the JSON string but got `%s`", jsonObj.get("requested_access_token_audience").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requested_scope") != null && !jsonObj.get("requested_scope").isJsonArray()) {
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
             elementAdapter.write(out, obj);
           }

           @Override
           public OAuth2ConsentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

