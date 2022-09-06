/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.26
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
import sh.ory.model.JsonWebKey;

/**
 * AdminTrustOAuth2JwtGrantIssuerBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T11:35:36.962578076Z[Etc/UTC]")
public class AdminTrustOAuth2JwtGrantIssuerBody {
  public static final String SERIALIZED_NAME_ALLOW_ANY_SUBJECT = "allow_any_subject";
  @SerializedName(SERIALIZED_NAME_ALLOW_ANY_SUBJECT)
  private Boolean allowAnySubject;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_JWK = "jwk";
  @SerializedName(SERIALIZED_NAME_JWK)
  private JsonWebKey jwk;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private List<String> scope = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public AdminTrustOAuth2JwtGrantIssuerBody() { 
  }

  public AdminTrustOAuth2JwtGrantIssuerBody allowAnySubject(Boolean allowAnySubject) {
    
    this.allowAnySubject = allowAnySubject;
    return this;
  }

   /**
   * The \&quot;allow_any_subject\&quot; indicates that the issuer is allowed to have any principal as the subject of the JWT.
   * @return allowAnySubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"allow_any_subject\" indicates that the issuer is allowed to have any principal as the subject of the JWT.")

  public Boolean getAllowAnySubject() {
    return allowAnySubject;
  }


  public void setAllowAnySubject(Boolean allowAnySubject) {
    this.allowAnySubject = allowAnySubject;
  }


  public AdminTrustOAuth2JwtGrantIssuerBody expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The \&quot;expires_at\&quot; indicates, when grant will expire, so we will reject assertion from \&quot;issuer\&quot; targeting \&quot;subject\&quot;.
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The \"expires_at\" indicates, when grant will expire, so we will reject assertion from \"issuer\" targeting \"subject\".")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public AdminTrustOAuth2JwtGrantIssuerBody issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * The \&quot;issuer\&quot; identifies the principal that issued the JWT assertion (same as \&quot;iss\&quot; claim in JWT).
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://jwt-idp.example.com", required = true, value = "The \"issuer\" identifies the principal that issued the JWT assertion (same as \"iss\" claim in JWT).")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public AdminTrustOAuth2JwtGrantIssuerBody jwk(JsonWebKey jwk) {
    
    this.jwk = jwk;
    return this;
  }

   /**
   * Get jwk
   * @return jwk
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonWebKey getJwk() {
    return jwk;
  }


  public void setJwk(JsonWebKey jwk) {
    this.jwk = jwk;
  }


  public AdminTrustOAuth2JwtGrantIssuerBody scope(List<String> scope) {
    
    this.scope = scope;
    return this;
  }

  public AdminTrustOAuth2JwtGrantIssuerBody addScopeItem(String scopeItem) {
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * The \&quot;scope\&quot; contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"openid\",\"offline\"]", required = true, value = "The \"scope\" contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])")

  public List<String> getScope() {
    return scope;
  }


  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  public AdminTrustOAuth2JwtGrantIssuerBody subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The \&quot;subject\&quot; identifies the principal that is the subject of the JWT.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mike@example.com", value = "The \"subject\" identifies the principal that is the subject of the JWT.")

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
    AdminTrustOAuth2JwtGrantIssuerBody adminTrustOAuth2JwtGrantIssuerBody = (AdminTrustOAuth2JwtGrantIssuerBody) o;
    return Objects.equals(this.allowAnySubject, adminTrustOAuth2JwtGrantIssuerBody.allowAnySubject) &&
        Objects.equals(this.expiresAt, adminTrustOAuth2JwtGrantIssuerBody.expiresAt) &&
        Objects.equals(this.issuer, adminTrustOAuth2JwtGrantIssuerBody.issuer) &&
        Objects.equals(this.jwk, adminTrustOAuth2JwtGrantIssuerBody.jwk) &&
        Objects.equals(this.scope, adminTrustOAuth2JwtGrantIssuerBody.scope) &&
        Objects.equals(this.subject, adminTrustOAuth2JwtGrantIssuerBody.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAnySubject, expiresAt, issuer, jwk, scope, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminTrustOAuth2JwtGrantIssuerBody {\n");
    sb.append("    allowAnySubject: ").append(toIndentedString(allowAnySubject)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    jwk: ").append(toIndentedString(jwk)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

}

