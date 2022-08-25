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

/**
 * IdentityCredentialsPassword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T18:35:46.223806189Z[Etc/UTC]")
public class IdentityCredentialsPassword {
  public static final String SERIALIZED_NAME_HASHED_PASSWORD = "hashed_password";
  @SerializedName(SERIALIZED_NAME_HASHED_PASSWORD)
  private String hashedPassword;

  public IdentityCredentialsPassword() { 
  }

  public IdentityCredentialsPassword hashedPassword(String hashedPassword) {
    
    this.hashedPassword = hashedPassword;
    return this;
  }

   /**
   * HashedPassword is a hash-representation of the password.
   * @return hashedPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HashedPassword is a hash-representation of the password.")

  public String getHashedPassword() {
    return hashedPassword;
  }


  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityCredentialsPassword identityCredentialsPassword = (IdentityCredentialsPassword) o;
    return Objects.equals(this.hashedPassword, identityCredentialsPassword.hashedPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashedPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCredentialsPassword {\n");
    sb.append("    hashedPassword: ").append(toIndentedString(hashedPassword)).append("\n");
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

