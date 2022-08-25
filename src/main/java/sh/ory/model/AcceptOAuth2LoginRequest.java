/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.18
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

/**
 * AcceptOAuth2LoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T18:35:46.223806189Z[Etc/UTC]")
public class AcceptOAuth2LoginRequest {
  public static final String SERIALIZED_NAME_ACR = "acr";
  @SerializedName(SERIALIZED_NAME_ACR)
  private String acr;

  public static final String SERIALIZED_NAME_AMR = "amr";
  @SerializedName(SERIALIZED_NAME_AMR)
  private List<String> amr = null;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Object context;

  public static final String SERIALIZED_NAME_FORCE_SUBJECT_IDENTIFIER = "force_subject_identifier";
  @SerializedName(SERIALIZED_NAME_FORCE_SUBJECT_IDENTIFIER)
  private String forceSubjectIdentifier;

  public static final String SERIALIZED_NAME_REMEMBER = "remember";
  @SerializedName(SERIALIZED_NAME_REMEMBER)
  private Boolean remember;

  public static final String SERIALIZED_NAME_REMEMBER_FOR = "remember_for";
  @SerializedName(SERIALIZED_NAME_REMEMBER_FOR)
  private Long rememberFor;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public AcceptOAuth2LoginRequest() { 
  }

  public AcceptOAuth2LoginRequest acr(String acr) {
    
    this.acr = acr;
    return this;
  }

   /**
   * ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
   * @return acr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.")

  public String getAcr() {
    return acr;
  }


  public void setAcr(String acr) {
    this.acr = acr;
  }


  public AcceptOAuth2LoginRequest amr(List<String> amr) {
    
    this.amr = amr;
    return this;
  }

  public AcceptOAuth2LoginRequest addAmrItem(String amrItem) {
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


  public AcceptOAuth2LoginRequest context(Object context) {
    
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


  public AcceptOAuth2LoginRequest forceSubjectIdentifier(String forceSubjectIdentifier) {
    
    this.forceSubjectIdentifier = forceSubjectIdentifier;
    return this;
  }

   /**
   * ForceSubjectIdentifier forces the \&quot;pairwise\&quot; user ID of the end-user that authenticated. The \&quot;pairwise\&quot; user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\&quot;user\&quot;) identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if &#x60;pairwise&#x60; is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via &#x60;subject_type&#x60; key in the client&#39;s configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.
   * @return forceSubjectIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ForceSubjectIdentifier forces the \"pairwise\" user ID of the end-user that authenticated. The \"pairwise\" user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\"user\") identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if `pairwise` is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via `subject_type` key in the client's configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.")

  public String getForceSubjectIdentifier() {
    return forceSubjectIdentifier;
  }


  public void setForceSubjectIdentifier(String forceSubjectIdentifier) {
    this.forceSubjectIdentifier = forceSubjectIdentifier;
  }


  public AcceptOAuth2LoginRequest remember(Boolean remember) {
    
    this.remember = remember;
    return this;
  }

   /**
   * Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.
   * @return remember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.")

  public Boolean getRemember() {
    return remember;
  }


  public void setRemember(Boolean remember) {
    this.remember = remember;
  }


  public AcceptOAuth2LoginRequest rememberFor(Long rememberFor) {
    
    this.rememberFor = rememberFor;
    return this;
  }

   /**
   * RememberFor sets how long the authentication should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered for the duration of the browser session (using a session cookie).
   * @return rememberFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RememberFor sets how long the authentication should be remembered for in seconds. If set to `0`, the authorization will be remembered for the duration of the browser session (using a session cookie).")

  public Long getRememberFor() {
    return rememberFor;
  }


  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }


  public AcceptOAuth2LoginRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the user ID of the end-user that authenticated.
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Subject is the user ID of the end-user that authenticated.")

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
    AcceptOAuth2LoginRequest acceptOAuth2LoginRequest = (AcceptOAuth2LoginRequest) o;
    return Objects.equals(this.acr, acceptOAuth2LoginRequest.acr) &&
        Objects.equals(this.amr, acceptOAuth2LoginRequest.amr) &&
        Objects.equals(this.context, acceptOAuth2LoginRequest.context) &&
        Objects.equals(this.forceSubjectIdentifier, acceptOAuth2LoginRequest.forceSubjectIdentifier) &&
        Objects.equals(this.remember, acceptOAuth2LoginRequest.remember) &&
        Objects.equals(this.rememberFor, acceptOAuth2LoginRequest.rememberFor) &&
        Objects.equals(this.subject, acceptOAuth2LoginRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, amr, context, forceSubjectIdentifier, remember, rememberFor, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptOAuth2LoginRequest {\n");
    sb.append("    acr: ").append(toIndentedString(acr)).append("\n");
    sb.append("    amr: ").append(toIndentedString(amr)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    forceSubjectIdentifier: ").append(toIndentedString(forceSubjectIdentifier)).append("\n");
    sb.append("    remember: ").append(toIndentedString(remember)).append("\n");
    sb.append("    rememberFor: ").append(toIndentedString(rememberFor)).append("\n");
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

