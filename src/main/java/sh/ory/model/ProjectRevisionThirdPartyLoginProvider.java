/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.79
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ProjectRevisionThirdPartyLoginProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-09T10:19:31.002746651Z[Etc/UTC]")
public class ProjectRevisionThirdPartyLoginProvider {
  public static final String SERIALIZED_NAME_APPLE_PRIVATE_KEY = "apple_private_key";
  @SerializedName(SERIALIZED_NAME_APPLE_PRIVATE_KEY)
  private String applePrivateKey;

  public static final String SERIALIZED_NAME_APPLE_PRIVATE_KEY_ID = "apple_private_key_id";
  @SerializedName(SERIALIZED_NAME_APPLE_PRIVATE_KEY_ID)
  private String applePrivateKeyId;

  public static final String SERIALIZED_NAME_APPLE_TEAM_ID = "apple_team_id";
  @SerializedName(SERIALIZED_NAME_APPLE_TEAM_ID)
  private String appleTeamId;

  public static final String SERIALIZED_NAME_AUTH_URL = "auth_url";
  @SerializedName(SERIALIZED_NAME_AUTH_URL)
  private String authUrl;

  public static final String SERIALIZED_NAME_AZURE_TENANT = "azure_tenant";
  @SerializedName(SERIALIZED_NAME_AZURE_TENANT)
  private String azureTenant;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ISSUER_URL = "issuer_url";
  @SerializedName(SERIALIZED_NAME_ISSUER_URL)
  private String issuerUrl;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_MAPPER_URL = "mapper_url";
  @SerializedName(SERIALIZED_NAME_MAPPER_URL)
  private String mapperUrl;

  public static final String SERIALIZED_NAME_PROJECT_REVISION_ID = "project_revision_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_REVISION_ID)
  private UUID projectRevisionId;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "provider_id";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private String providerId;

  public static final String SERIALIZED_NAME_REQUESTED_CLAIMS = "requested_claims";
  @SerializedName(SERIALIZED_NAME_REQUESTED_CLAIMS)
  private Object requestedClaims;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private List<String> scope = null;

  public static final String SERIALIZED_NAME_TOKEN_URL = "token_url";
  @SerializedName(SERIALIZED_NAME_TOKEN_URL)
  private String tokenUrl;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ProjectRevisionThirdPartyLoginProvider() { 
  }

  
  public ProjectRevisionThirdPartyLoginProvider(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public ProjectRevisionThirdPartyLoginProvider applePrivateKey(String applePrivateKey) {
    
    this.applePrivateKey = applePrivateKey;
    return this;
  }

   /**
   * Apple Private Key  Sign In with Apple Private Key needed for generating a JWT token for client secret
   * @return applePrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-----BEGIN PRIVATE KEY----- ........ -----END PRIVATE KEY-----", value = "Apple Private Key  Sign In with Apple Private Key needed for generating a JWT token for client secret")

  public String getApplePrivateKey() {
    return applePrivateKey;
  }


  public void setApplePrivateKey(String applePrivateKey) {
    this.applePrivateKey = applePrivateKey;
  }


  public ProjectRevisionThirdPartyLoginProvider applePrivateKeyId(String applePrivateKeyId) {
    
    this.applePrivateKeyId = applePrivateKeyId;
    return this;
  }

   /**
   * Apple Private Key Identifier  Sign In with Apple Private Key Identifier needed for generating a JWT token for client secret
   * @return applePrivateKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UX56C66723", value = "Apple Private Key Identifier  Sign In with Apple Private Key Identifier needed for generating a JWT token for client secret")

  public String getApplePrivateKeyId() {
    return applePrivateKeyId;
  }


  public void setApplePrivateKeyId(String applePrivateKeyId) {
    this.applePrivateKeyId = applePrivateKeyId;
  }


  public ProjectRevisionThirdPartyLoginProvider appleTeamId(String appleTeamId) {
    
    this.appleTeamId = appleTeamId;
    return this;
  }

   /**
   * Apple Developer Team ID  Apple Developer Team ID needed for generating a JWT token for client secret
   * @return appleTeamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KP76DQS54M", value = "Apple Developer Team ID  Apple Developer Team ID needed for generating a JWT token for client secret")

  public String getAppleTeamId() {
    return appleTeamId;
  }


  public void setAppleTeamId(String appleTeamId) {
    this.appleTeamId = appleTeamId;
  }


  public ProjectRevisionThirdPartyLoginProvider authUrl(String authUrl) {
    
    this.authUrl = authUrl;
    return this;
  }

   /**
   * AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.
   * @return authUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.googleapis.com/oauth2/v2/auth", value = "AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.")

  public String getAuthUrl() {
    return authUrl;
  }


  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public ProjectRevisionThirdPartyLoginProvider azureTenant(String azureTenant) {
    
    this.azureTenant = azureTenant;
    return this;
  }

   /**
   * Tenant is the Azure AD Tenant to use for authentication, and must be set when &#x60;provider&#x60; is set to &#x60;microsoft&#x60;.  Can be either &#x60;common&#x60;, &#x60;organizations&#x60;, &#x60;consumers&#x60; for a multitenant application or a specific tenant like &#x60;8eaef023-2b34-4da1-9baa-8bc8c9d6a490&#x60; or &#x60;contoso.onmicrosoft.com&#x60;.
   * @return azureTenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contoso.onmicrosoft.com", value = "Tenant is the Azure AD Tenant to use for authentication, and must be set when `provider` is set to `microsoft`.  Can be either `common`, `organizations`, `consumers` for a multitenant application or a specific tenant like `8eaef023-2b34-4da1-9baa-8bc8c9d6a490` or `contoso.onmicrosoft.com`.")

  public String getAzureTenant() {
    return azureTenant;
  }


  public void setAzureTenant(String azureTenant) {
    this.azureTenant = azureTenant;
  }


  public ProjectRevisionThirdPartyLoginProvider clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * ClientID is the application&#39;s Client ID.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClientID is the application's Client ID.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ProjectRevisionThirdPartyLoginProvider clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * ClientSecret is the application&#39;s secret.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClientSecret is the application's secret.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


   /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Project's Revision Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public ProjectRevisionThirdPartyLoginProvider id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ProjectRevisionThirdPartyLoginProvider issuerUrl(String issuerUrl) {
    
    this.issuerUrl = issuerUrl;
    return this;
  }

   /**
   * IssuerURL is the OpenID Connect Server URL. You can leave this empty if &#x60;provider&#x60; is not set to &#x60;generic&#x60;. If set, neither &#x60;auth_url&#x60; nor &#x60;token_url&#x60; are required.
   * @return issuerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://accounts.google.com", value = "IssuerURL is the OpenID Connect Server URL. You can leave this empty if `provider` is not set to `generic`. If set, neither `auth_url` nor `token_url` are required.")

  public String getIssuerUrl() {
    return issuerUrl;
  }


  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }


  public ProjectRevisionThirdPartyLoginProvider label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Label represents an optional label which can be used in the UI generation.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label represents an optional label which can be used in the UI generation.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ProjectRevisionThirdPartyLoginProvider mapperUrl(String mapperUrl) {
    
    this.mapperUrl = mapperUrl;
    return this;
  }

   /**
   * Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider&#39;s data (e.g. GitHub or Google profile information) to hydrate the identity&#39;s data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet.
   * @return mapperUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider's data (e.g. GitHub or Google profile information) to hydrate the identity's data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet.")

  public String getMapperUrl() {
    return mapperUrl;
  }


  public void setMapperUrl(String mapperUrl) {
    this.mapperUrl = mapperUrl;
  }


  public ProjectRevisionThirdPartyLoginProvider projectRevisionId(UUID projectRevisionId) {
    
    this.projectRevisionId = projectRevisionId;
    return this;
  }

   /**
   * Get projectRevisionId
   * @return projectRevisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProjectRevisionId() {
    return projectRevisionId;
  }


  public void setProjectRevisionId(UUID projectRevisionId) {
    this.projectRevisionId = projectRevisionId;
  }


  public ProjectRevisionThirdPartyLoginProvider provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Provider is either \&quot;generic\&quot; for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex apple
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "google", value = "Provider is either \"generic\" for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex apple")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public ProjectRevisionThirdPartyLoginProvider providerId(String providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * ID is the provider&#39;s ID
   * @return providerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID is the provider's ID")

  public String getProviderId() {
    return providerId;
  }


  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public ProjectRevisionThirdPartyLoginProvider requestedClaims(Object requestedClaims) {
    
    this.requestedClaims = requestedClaims;
    return this;
  }

   /**
   * Get requestedClaims
   * @return requestedClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRequestedClaims() {
    return requestedClaims;
  }


  public void setRequestedClaims(Object requestedClaims) {
    this.requestedClaims = requestedClaims;
  }


  public ProjectRevisionThirdPartyLoginProvider scope(List<String> scope) {
    
    this.scope = scope;
    return this;
  }

  public ProjectRevisionThirdPartyLoginProvider addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScope() {
    return scope;
  }


  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  public ProjectRevisionThirdPartyLoginProvider tokenUrl(String tokenUrl) {
    
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * TokenURL is the token url, typically something like: https://example.org/oauth2/token  Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.
   * @return tokenUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.googleapis.com/oauth2/v4/token", value = "TokenURL is the token url, typically something like: https://example.org/oauth2/token  Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.")

  public String getTokenUrl() {
    return tokenUrl;
  }


  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


   /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last Time Project's Revision was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRevisionThirdPartyLoginProvider projectRevisionThirdPartyLoginProvider = (ProjectRevisionThirdPartyLoginProvider) o;
    return Objects.equals(this.applePrivateKey, projectRevisionThirdPartyLoginProvider.applePrivateKey) &&
        Objects.equals(this.applePrivateKeyId, projectRevisionThirdPartyLoginProvider.applePrivateKeyId) &&
        Objects.equals(this.appleTeamId, projectRevisionThirdPartyLoginProvider.appleTeamId) &&
        Objects.equals(this.authUrl, projectRevisionThirdPartyLoginProvider.authUrl) &&
        Objects.equals(this.azureTenant, projectRevisionThirdPartyLoginProvider.azureTenant) &&
        Objects.equals(this.clientId, projectRevisionThirdPartyLoginProvider.clientId) &&
        Objects.equals(this.clientSecret, projectRevisionThirdPartyLoginProvider.clientSecret) &&
        Objects.equals(this.createdAt, projectRevisionThirdPartyLoginProvider.createdAt) &&
        Objects.equals(this.id, projectRevisionThirdPartyLoginProvider.id) &&
        Objects.equals(this.issuerUrl, projectRevisionThirdPartyLoginProvider.issuerUrl) &&
        Objects.equals(this.label, projectRevisionThirdPartyLoginProvider.label) &&
        Objects.equals(this.mapperUrl, projectRevisionThirdPartyLoginProvider.mapperUrl) &&
        Objects.equals(this.projectRevisionId, projectRevisionThirdPartyLoginProvider.projectRevisionId) &&
        Objects.equals(this.provider, projectRevisionThirdPartyLoginProvider.provider) &&
        Objects.equals(this.providerId, projectRevisionThirdPartyLoginProvider.providerId) &&
        Objects.equals(this.requestedClaims, projectRevisionThirdPartyLoginProvider.requestedClaims) &&
        Objects.equals(this.scope, projectRevisionThirdPartyLoginProvider.scope) &&
        Objects.equals(this.tokenUrl, projectRevisionThirdPartyLoginProvider.tokenUrl) &&
        Objects.equals(this.updatedAt, projectRevisionThirdPartyLoginProvider.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applePrivateKey, applePrivateKeyId, appleTeamId, authUrl, azureTenant, clientId, clientSecret, createdAt, id, issuerUrl, label, mapperUrl, projectRevisionId, provider, providerId, requestedClaims, scope, tokenUrl, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRevisionThirdPartyLoginProvider {\n");
    sb.append("    applePrivateKey: ").append(toIndentedString(applePrivateKey)).append("\n");
    sb.append("    applePrivateKeyId: ").append(toIndentedString(applePrivateKeyId)).append("\n");
    sb.append("    appleTeamId: ").append(toIndentedString(appleTeamId)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    azureTenant: ").append(toIndentedString(azureTenant)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mapperUrl: ").append(toIndentedString(mapperUrl)).append("\n");
    sb.append("    projectRevisionId: ").append(toIndentedString(projectRevisionId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    requestedClaims: ").append(toIndentedString(requestedClaims)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
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

}

