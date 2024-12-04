/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.14
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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.AuthenticatorAssuranceLevel;
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
 * This object represents a login flow. A login flow is initiated at the \&quot;Initiate Login API / Browser Flow\&quot; endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T09:35:11.581942706Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class LoginFlow {
  /**
   * The active login method  If set contains the login method used. If the flow is new, it is unset. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
   */
  @JsonAdapter(ActiveEnum.Adapter.class)
  public enum ActiveEnum {
    PASSWORD("password"),
    
    OIDC("oidc"),
    
    TOTP("totp"),
    
    LOOKUP_SECRET("lookup_secret"),
    
    WEBAUTHN("webauthn"),
    
    CODE("code"),
    
    PASSKEY("passkey"),
    
    PROFILE("profile"),
    
    LINK_RECOVERY("link_recovery"),
    
    CODE_RECOVERY("code_recovery");

    private String value;

    ActiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActiveEnum fromValue(String value) {
      for (ActiveEnum b : ActiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActiveEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActiveEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ActiveEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private ActiveEnum active;

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

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

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

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private Object state = null;

  public static final String SERIALIZED_NAME_TRANSIENT_PAYLOAD = "transient_payload";
  @SerializedName(SERIALIZED_NAME_TRANSIENT_PAYLOAD)
  private Object transientPayload;

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

  public LoginFlow active(ActiveEnum active) {
    this.active = active;
    return this;
  }

  /**
   * The active login method  If set contains the login method used. If the flow is new, it is unset. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
   * @return active
   */
  @javax.annotation.Nullable
  public ActiveEnum getActive() {
    return active;
  }

  public void setActive(ActiveEnum active) {
    this.active = active;
  }


  public LoginFlow createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * CreatedAt is a helper struct field for gobuffalo.pop.
   * @return createdAt
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nonnull
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
   * Ory OAuth 2.0 Login Challenge.  This value is set using the &#x60;login_challenge&#x60; query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider.
   * @return oauth2LoginChallenge
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
  public OAuth2LoginRequest getOauth2LoginRequest() {
    return oauth2LoginRequest;
  }

  public void setOauth2LoginRequest(OAuth2LoginRequest oauth2LoginRequest) {
    this.oauth2LoginRequest = oauth2LoginRequest;
  }


  public LoginFlow organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   * @return organizationId
   */
  @javax.annotation.Nullable
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public LoginFlow refresh(Boolean refresh) {
    this.refresh = refresh;
    return this;
  }

  /**
   * Refresh stores whether this login flow should enforce re-authentication.
   * @return refresh
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
  public String getSessionTokenExchangeCode() {
    return sessionTokenExchangeCode;
  }

  public void setSessionTokenExchangeCode(String sessionTokenExchangeCode) {
    this.sessionTokenExchangeCode = sessionTokenExchangeCode;
  }


  public LoginFlow state(Object state) {
    this.state = state;
    return this;
  }

  /**
   * State represents the state of this request:  choose_method: ask the user to choose a method to sign in with sent_email: the email has been sent to the user passed_challenge: the request was successful and the login challenge was passed.
   * @return state
   */
  @javax.annotation.Nullable
  public Object getState() {
    return state;
  }

  public void setState(Object state) {
    this.state = state;
  }


  public LoginFlow transientPayload(Object transientPayload) {
    this.transientPayload = transientPayload;
    return this;
  }

  /**
   * TransientPayload is used to pass data from the login to hooks and email templates
   * @return transientPayload
   */
  @javax.annotation.Nullable
  public Object getTransientPayload() {
    return transientPayload;
  }

  public void setTransientPayload(Object transientPayload) {
    this.transientPayload = transientPayload;
  }


  public LoginFlow type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
   * @return type
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nonnull
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
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return the LoginFlow instance itself
   */
  public LoginFlow putAdditionalProperty(String key, Object value) {
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
    LoginFlow loginFlow = (LoginFlow) o;
    return Objects.equals(this.active, loginFlow.active) &&
        Objects.equals(this.createdAt, loginFlow.createdAt) &&
        Objects.equals(this.expiresAt, loginFlow.expiresAt) &&
        Objects.equals(this.id, loginFlow.id) &&
        Objects.equals(this.issuedAt, loginFlow.issuedAt) &&
        Objects.equals(this.oauth2LoginChallenge, loginFlow.oauth2LoginChallenge) &&
        Objects.equals(this.oauth2LoginRequest, loginFlow.oauth2LoginRequest) &&
        Objects.equals(this.organizationId, loginFlow.organizationId) &&
        Objects.equals(this.refresh, loginFlow.refresh) &&
        Objects.equals(this.requestUrl, loginFlow.requestUrl) &&
        Objects.equals(this.requestedAal, loginFlow.requestedAal) &&
        Objects.equals(this.returnTo, loginFlow.returnTo) &&
        Objects.equals(this.sessionTokenExchangeCode, loginFlow.sessionTokenExchangeCode) &&
        Objects.equals(this.state, loginFlow.state) &&
        Objects.equals(this.transientPayload, loginFlow.transientPayload) &&
        Objects.equals(this.type, loginFlow.type) &&
        Objects.equals(this.ui, loginFlow.ui) &&
        Objects.equals(this.updatedAt, loginFlow.updatedAt)&&
        Objects.equals(this.additionalProperties, loginFlow.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createdAt, expiresAt, id, issuedAt, oauth2LoginChallenge, oauth2LoginRequest, organizationId, refresh, requestUrl, requestedAal, returnTo, sessionTokenExchangeCode, state, transientPayload, type, ui, updatedAt, additionalProperties);
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
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestedAal: ").append(toIndentedString(requestedAal)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
    sb.append("    sessionTokenExchangeCode: ").append(toIndentedString(sessionTokenExchangeCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transientPayload: ").append(toIndentedString(transientPayload)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("created_at");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("issued_at");
    openapiFields.add("oauth2_login_challenge");
    openapiFields.add("oauth2_login_request");
    openapiFields.add("organization_id");
    openapiFields.add("refresh");
    openapiFields.add("request_url");
    openapiFields.add("requested_aal");
    openapiFields.add("return_to");
    openapiFields.add("session_token_exchange_code");
    openapiFields.add("state");
    openapiFields.add("transient_payload");
    openapiFields.add("type");
    openapiFields.add("ui");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expires_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("request_url");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("ui");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoginFlow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoginFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoginFlow is not found in the empty JSON string", LoginFlow.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoginFlow.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) && !jsonObj.get("active").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active").toString()));
      }
      // validate the optional field `active`
      if (jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) {
        ActiveEnum.validateJsonElement(jsonObj.get("active"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("oauth2_login_challenge") != null && !jsonObj.get("oauth2_login_challenge").isJsonNull()) && !jsonObj.get("oauth2_login_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oauth2_login_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oauth2_login_challenge").toString()));
      }
      // validate the optional field `oauth2_login_request`
      if (jsonObj.get("oauth2_login_request") != null && !jsonObj.get("oauth2_login_request").isJsonNull()) {
        OAuth2LoginRequest.validateJsonElement(jsonObj.get("oauth2_login_request"));
      }
      if ((jsonObj.get("organization_id") != null && !jsonObj.get("organization_id").isJsonNull()) && !jsonObj.get("organization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_id").toString()));
      }
      if (!jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      // validate the optional field `requested_aal`
      if (jsonObj.get("requested_aal") != null && !jsonObj.get("requested_aal").isJsonNull()) {
        AuthenticatorAssuranceLevel.validateJsonElement(jsonObj.get("requested_aal"));
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
      UiContainer.validateJsonElement(jsonObj.get("ui"));
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
           public LoginFlow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LoginFlow instance = thisAdapter.fromJsonTree(jsonObj);
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

