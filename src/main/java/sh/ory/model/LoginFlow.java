/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.33
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
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.AuthenticatorAssuranceLevel;
import sh.ory.model.IdentityCredentialsType;
import sh.ory.model.OAuth2LoginRequest;
import sh.ory.model.UiContainer;

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
 * This object represents a login flow. A login flow is initiated at the \&quot;Initiate Login API / Browser Flow\&quot; endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.
 */
@ApiModel(description = "This object represents a login flow. A login flow is initiated at the \"Initiate Login API / Browser Flow\" endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T13:18:59.927245844Z[Etc/UTC]")
public class LoginFlow {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private IdentityCredentialsType active;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_OAUTH2_LOGIN_CHALLENGE = "oauth2_login_challenge";
  @SerializedName(SERIALIZED_NAME_OAUTH2_LOGIN_CHALLENGE)
  private String oauth2LoginChallenge;

  public static final String SERIALIZED_NAME_OAUTH2_LOGIN_REQUEST = "oauth2_login_request";
  @SerializedName(SERIALIZED_NAME_OAUTH2_LOGIN_REQUEST)
  private OAuth2LoginRequest oauth2LoginRequest;

  public static final String SERIALIZED_NAME_REFRESH = "refresh";
  @SerializedName(SERIALIZED_NAME_REFRESH)
  private Boolean refresh;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_REQUESTED_AAL = "requested_aal";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AAL)
  private AuthenticatorAssuranceLevel requestedAal;

  public static final String SERIALIZED_NAME_RETURN_TO = "return_to";
  @SerializedName(SERIALIZED_NAME_RETURN_TO)
  private String returnTo;

  public static final String SERIALIZED_NAME_SESSION_TOKEN_EXCHANGE_CODE = "session_token_exchange_code";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN_EXCHANGE_CODE)
  private String sessionTokenExchangeCode;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UI = "ui";
  @SerializedName(SERIALIZED_NAME_UI)
  private UiContainer ui;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public LoginFlow() {
  }

  public LoginFlow active(IdentityCredentialsType active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityCredentialsType getActive() {
    return active;
  }


  public void setActive(IdentityCredentialsType active) {
    this.active = active;
  }


  public LoginFlow createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * CreatedAt is a helper struct field for gobuffalo.pop.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CreatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LoginFlow expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public LoginFlow id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID represents the flow&#39;s unique ID. When performing the login flow, this represents the id in the login UI&#39;s query parameter: http://&lt;selfservice.flows.login.ui_url&gt;/?flow&#x3D;&lt;flow_id&gt;
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID represents the flow's unique ID. When performing the login flow, this represents the id in the login UI's query parameter: http://<selfservice.flows.login.ui_url>/?flow=<flow_id>")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LoginFlow issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the flow started.
   * @return issuedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IssuedAt is the time (UTC) when the flow started.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public LoginFlow oauth2LoginChallenge(String oauth2LoginChallenge) {
    
    this.oauth2LoginChallenge = oauth2LoginChallenge;
    return this;
  }

   /**
   * Get oauth2LoginChallenge
   * @return oauth2LoginChallenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOauth2LoginChallenge() {
    return oauth2LoginChallenge;
  }


  public void setOauth2LoginChallenge(String oauth2LoginChallenge) {
    this.oauth2LoginChallenge = oauth2LoginChallenge;
  }


  public LoginFlow oauth2LoginRequest(OAuth2LoginRequest oauth2LoginRequest) {
    
    this.oauth2LoginRequest = oauth2LoginRequest;
    return this;
  }

   /**
   * Get oauth2LoginRequest
   * @return oauth2LoginRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2LoginRequest getOauth2LoginRequest() {
    return oauth2LoginRequest;
  }


  public void setOauth2LoginRequest(OAuth2LoginRequest oauth2LoginRequest) {
    this.oauth2LoginRequest = oauth2LoginRequest;
  }


  public LoginFlow refresh(Boolean refresh) {
    
    this.refresh = refresh;
    return this;
  }

   /**
   * Refresh stores whether this login flow should enforce re-authentication.
   * @return refresh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Refresh stores whether this login flow should enforce re-authentication.")

  public Boolean getRefresh() {
    return refresh;
  }


  public void setRefresh(Boolean refresh) {
    this.refresh = refresh;
  }


  public LoginFlow requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public LoginFlow requestedAal(AuthenticatorAssuranceLevel requestedAal) {
    
    this.requestedAal = requestedAal;
    return this;
  }

   /**
   * Get requestedAal
   * @return requestedAal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthenticatorAssuranceLevel getRequestedAal() {
    return requestedAal;
  }


  public void setRequestedAal(AuthenticatorAssuranceLevel requestedAal) {
    this.requestedAal = requestedAal;
  }


  public LoginFlow returnTo(String returnTo) {
    
    this.returnTo = returnTo;
    return this;
  }

   /**
   * ReturnTo contains the requested return_to URL.
   * @return returnTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReturnTo contains the requested return_to URL.")

  public String getReturnTo() {
    return returnTo;
  }


  public void setReturnTo(String returnTo) {
    this.returnTo = returnTo;
  }


  public LoginFlow sessionTokenExchangeCode(String sessionTokenExchangeCode) {
    
    this.sessionTokenExchangeCode = sessionTokenExchangeCode;
    return this;
  }

   /**
   * SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the login flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \&quot;api\&quot;, and only on creating the login flow.
   * @return sessionTokenExchangeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the login flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \"api\", and only on creating the login flow.")

  public String getSessionTokenExchangeCode() {
    return sessionTokenExchangeCode;
  }


  public void setSessionTokenExchangeCode(String sessionTokenExchangeCode) {
    this.sessionTokenExchangeCode = sessionTokenExchangeCode;
  }


  public LoginFlow type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The flow type can either be `api` or `browser`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LoginFlow ui(UiContainer ui) {
    
    this.ui = ui;
    return this;
  }

   /**
   * Get ui
   * @return ui
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UiContainer getUi() {
    return ui;
  }


  public void setUi(UiContainer ui) {
    this.ui = ui;
  }


  public LoginFlow updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * UpdatedAt is a helper struct field for gobuffalo.pop.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UpdatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginFlow loginFlow = (LoginFlow) o;
    return Objects.equals(this.active, loginFlow.active) &&
        Objects.equals(this.createdAt, loginFlow.createdAt) &&
        Objects.equals(this.expiresAt, loginFlow.expiresAt) &&
        Objects.equals(this.id, loginFlow.id) &&
        Objects.equals(this.issuedAt, loginFlow.issuedAt) &&
        Objects.equals(this.oauth2LoginChallenge, loginFlow.oauth2LoginChallenge) &&
        Objects.equals(this.oauth2LoginRequest, loginFlow.oauth2LoginRequest) &&
        Objects.equals(this.refresh, loginFlow.refresh) &&
        Objects.equals(this.requestUrl, loginFlow.requestUrl) &&
        Objects.equals(this.requestedAal, loginFlow.requestedAal) &&
        Objects.equals(this.returnTo, loginFlow.returnTo) &&
        Objects.equals(this.sessionTokenExchangeCode, loginFlow.sessionTokenExchangeCode) &&
        Objects.equals(this.type, loginFlow.type) &&
        Objects.equals(this.ui, loginFlow.ui) &&
        Objects.equals(this.updatedAt, loginFlow.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createdAt, expiresAt, id, issuedAt, oauth2LoginChallenge, oauth2LoginRequest, refresh, requestUrl, requestedAal, returnTo, sessionTokenExchangeCode, type, ui, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginFlow {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    oauth2LoginChallenge: ").append(toIndentedString(oauth2LoginChallenge)).append("\n");
    sb.append("    oauth2LoginRequest: ").append(toIndentedString(oauth2LoginRequest)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestedAal: ").append(toIndentedString(requestedAal)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
    sb.append("    sessionTokenExchangeCode: ").append(toIndentedString(sessionTokenExchangeCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("created_at");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("issued_at");
    openapiFields.add("oauth2_login_challenge");
    openapiFields.add("oauth2_login_request");
    openapiFields.add("refresh");
    openapiFields.add("request_url");
    openapiFields.add("requested_aal");
    openapiFields.add("return_to");
    openapiFields.add("session_token_exchange_code");
    openapiFields.add("type");
    openapiFields.add("ui");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expires_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("request_url");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("ui");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LoginFlow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LoginFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoginFlow is not found in the empty JSON string", LoginFlow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LoginFlow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoginFlow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoginFlow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("oauth2_login_challenge") != null && !jsonObj.get("oauth2_login_challenge").isJsonNull()) && !jsonObj.get("oauth2_login_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oauth2_login_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oauth2_login_challenge").toString()));
      }
      // validate the optional field `oauth2_login_request`
      if (jsonObj.get("oauth2_login_request") != null && !jsonObj.get("oauth2_login_request").isJsonNull()) {
        OAuth2LoginRequest.validateJsonObject(jsonObj.getAsJsonObject("oauth2_login_request"));
      }
      if (!jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      if ((jsonObj.get("return_to") != null && !jsonObj.get("return_to").isJsonNull()) && !jsonObj.get("return_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_to").toString()));
      }
      if ((jsonObj.get("session_token_exchange_code") != null && !jsonObj.get("session_token_exchange_code").isJsonNull()) && !jsonObj.get("session_token_exchange_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_token_exchange_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_token_exchange_code").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `ui`
      UiContainer.validateJsonObject(jsonObj.getAsJsonObject("ui"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoginFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoginFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoginFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoginFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<LoginFlow>() {
           @Override
           public void write(JsonWriter out, LoginFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoginFlow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoginFlow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoginFlow
  * @throws IOException if the JSON string is invalid with respect to LoginFlow
  */
  public static LoginFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoginFlow.class);
  }

 /**
  * Convert an instance of LoginFlow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

