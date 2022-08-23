/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.14
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
 * AdminCreateJsonWebKeySetBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T15:32:08.220513927Z[Etc/UTC]")
public class AdminCreateJsonWebKeySetBody {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private String use;

  public AdminCreateJsonWebKeySetBody() { 
  }

  public AdminCreateJsonWebKeySetBody alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * The algorithm to be used for creating the key. Supports \&quot;RS256\&quot;, \&quot;ES256\&quot;, \&quot;ES512\&quot;, \&quot;HS512\&quot;, and \&quot;HS256\&quot;
   * @return alg
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The algorithm to be used for creating the key. Supports \"RS256\", \"ES256\", \"ES512\", \"HS512\", and \"HS256\"")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public AdminCreateJsonWebKeySetBody kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The kid of the key to be created
   * @return kid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The kid of the key to be created")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public AdminCreateJsonWebKeySetBody use(String use) {
    
    this.use = use;
    return this;
  }

   /**
   * The \&quot;use\&quot; (public key use) parameter identifies the intended use of the public key. The \&quot;use\&quot; parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \&quot;enc\&quot; and \&quot;sig\&quot;.
   * @return use
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The \"use\" (public key use) parameter identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \"enc\" and \"sig\".")

  public String getUse() {
    return use;
  }


  public void setUse(String use) {
    this.use = use;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateJsonWebKeySetBody adminCreateJsonWebKeySetBody = (AdminCreateJsonWebKeySetBody) o;
    return Objects.equals(this.alg, adminCreateJsonWebKeySetBody.alg) &&
        Objects.equals(this.kid, adminCreateJsonWebKeySetBody.kid) &&
        Objects.equals(this.use, adminCreateJsonWebKeySetBody.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, kid, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateJsonWebKeySetBody {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

