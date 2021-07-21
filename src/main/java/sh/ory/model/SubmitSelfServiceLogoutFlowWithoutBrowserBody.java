/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.16
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
 * nolint:deadcode,unused
 */
@ApiModel(description = "nolint:deadcode,unused")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-21T14:59:19.567844330Z[Etc/UTC]")
public class SubmitSelfServiceLogoutFlowWithoutBrowserBody {
  public static final String SERIALIZED_NAME_SESSION_TOKEN = "session_token";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN)
  private String sessionToken;


  public SubmitSelfServiceLogoutFlowWithoutBrowserBody sessionToken(String sessionToken) {
    
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * The Session Token  Invalidate this session token.
   * @return sessionToken
  **/
  @ApiModelProperty(required = true, value = "The Session Token  Invalidate this session token.")

  public String getSessionToken() {
    return sessionToken;
  }


  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceLogoutFlowWithoutBrowserBody submitSelfServiceLogoutFlowWithoutBrowserBody = (SubmitSelfServiceLogoutFlowWithoutBrowserBody) o;
    return Objects.equals(this.sessionToken, submitSelfServiceLogoutFlowWithoutBrowserBody.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceLogoutFlowWithoutBrowserBody {\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
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

