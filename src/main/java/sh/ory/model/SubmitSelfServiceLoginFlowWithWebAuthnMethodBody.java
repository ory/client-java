/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.127
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

/**
 * SubmitSelfServiceLoginFlowWithWebAuthnMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T07:44:30.986397481Z[Etc/UTC]")
public class SubmitSelfServiceLoginFlowWithWebAuthnMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_WEBAUTHN_LOGIN = "webauthn_login";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_LOGIN)
  private String webauthnLogin;

  public SubmitSelfServiceLoginFlowWithWebAuthnMethodBody() { 
  }

  public SubmitSelfServiceLoginFlowWithWebAuthnMethodBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * Sending the anti-csrf token is only required for browser login flows.
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sending the anti-csrf token is only required for browser login flows.")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceLoginFlowWithWebAuthnMethodBody identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Identifier is the email or username of the user trying to log in. This field is only required when using WebAuthn for passwordless login. When using WebAuthn for multi-factor authentication, it is not needed.
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier is the email or username of the user trying to log in. This field is only required when using WebAuthn for passwordless login. When using WebAuthn for multi-factor authentication, it is not needed.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public SubmitSelfServiceLoginFlowWithWebAuthnMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method should be set to \&quot;webAuthn\&quot; when logging in using the WebAuthn strategy.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method should be set to \"webAuthn\" when logging in using the WebAuthn strategy.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceLoginFlowWithWebAuthnMethodBody webauthnLogin(String webauthnLogin) {
    
    this.webauthnLogin = webauthnLogin;
    return this;
  }

   /**
   * Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
   * @return webauthnLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.")

  public String getWebauthnLogin() {
    return webauthnLogin;
  }


  public void setWebauthnLogin(String webauthnLogin) {
    this.webauthnLogin = webauthnLogin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceLoginFlowWithWebAuthnMethodBody submitSelfServiceLoginFlowWithWebAuthnMethodBody = (SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceLoginFlowWithWebAuthnMethodBody.csrfToken) &&
        Objects.equals(this.identifier, submitSelfServiceLoginFlowWithWebAuthnMethodBody.identifier) &&
        Objects.equals(this.method, submitSelfServiceLoginFlowWithWebAuthnMethodBody.method) &&
        Objects.equals(this.webauthnLogin, submitSelfServiceLoginFlowWithWebAuthnMethodBody.webauthnLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, identifier, method, webauthnLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceLoginFlowWithWebAuthnMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    webauthnLogin: ").append(toIndentedString(webauthnLogin)).append("\n");
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

