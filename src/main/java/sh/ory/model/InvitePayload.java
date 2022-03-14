/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.125
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
 * InvitePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T17:16:34.528362018Z[Etc/UTC]")
public class InvitePayload {
  public static final String SERIALIZED_NAME_INVITEE_EMAIL = "invitee_email";
  @SerializedName(SERIALIZED_NAME_INVITEE_EMAIL)
  private String inviteeEmail;

  public InvitePayload() { 
  }

  public InvitePayload inviteeEmail(String inviteeEmail) {
    
    this.inviteeEmail = inviteeEmail;
    return this;
  }

   /**
   * Get inviteeEmail
   * @return inviteeEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInviteeEmail() {
    return inviteeEmail;
  }


  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitePayload invitePayload = (InvitePayload) o;
    return Objects.equals(this.inviteeEmail, invitePayload.inviteeEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteeEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitePayload {\n");
    sb.append("    inviteeEmail: ").append(toIndentedString(inviteeEmail)).append("\n");
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

