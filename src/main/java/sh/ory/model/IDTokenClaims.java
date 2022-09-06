/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.27
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IDTokenClaims represent the claims used in open id connect requests
 */
@ApiModel(description = "IDTokenClaims represent the claims used in open id connect requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T12:49:04.907927480Z[Etc/UTC]")
public class IDTokenClaims {
  public static final String SERIALIZED_NAME_ACR = "acr";
  @SerializedName(SERIALIZED_NAME_ACR)
  private String acr;

  public static final String SERIALIZED_NAME_AMR = "amr";
  @SerializedName(SERIALIZED_NAME_AMR)
  private List<String> amr = null;

  public static final String SERIALIZED_NAME_AT_HASH = "at_hash";
  @SerializedName(SERIALIZED_NAME_AT_HASH)
  private String atHash;

  public static final String SERIALIZED_NAME_AUD = "aud";
  @SerializedName(SERIALIZED_NAME_AUD)
  private List<String> aud = null;

  public static final String SERIALIZED_NAME_AUTH_TIME = "auth_time";
  @SerializedName(SERIALIZED_NAME_AUTH_TIME)
  private OffsetDateTime authTime;

  public static final String SERIALIZED_NAME_C_HASH = "c_hash";
  @SerializedName(SERIALIZED_NAME_C_HASH)
  private String cHash;

  public static final String SERIALIZED_NAME_EXP = "exp";
  @SerializedName(SERIALIZED_NAME_EXP)
  private OffsetDateTime exp;

  public static final String SERIALIZED_NAME_EXT = "ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private Map<String, Object> ext = null;

  public static final String SERIALIZED_NAME_IAT = "iat";
  @SerializedName(SERIALIZED_NAME_IAT)
  private OffsetDateTime iat;

  public static final String SERIALIZED_NAME_ISS = "iss";
  @SerializedName(SERIALIZED_NAME_ISS)
  private String iss;

  public static final String SERIALIZED_NAME_JTI = "jti";
  @SerializedName(SERIALIZED_NAME_JTI)
  private String jti;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_RAT = "rat";
  @SerializedName(SERIALIZED_NAME_RAT)
  private OffsetDateTime rat;

  public static final String SERIALIZED_NAME_SUB = "sub";
  @SerializedName(SERIALIZED_NAME_SUB)
  private String sub;

  public IDTokenClaims() { 
  }

  public IDTokenClaims acr(String acr) {
    
    this.acr = acr;
    return this;
  }

   /**
   * Get acr
   * @return acr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcr() {
    return acr;
  }


  public void setAcr(String acr) {
    this.acr = acr;
  }


  public IDTokenClaims amr(List<String> amr) {
    
    this.amr = amr;
    return this;
  }

  public IDTokenClaims addAmrItem(String amrItem) {
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


  public IDTokenClaims atHash(String atHash) {
    
    this.atHash = atHash;
    return this;
  }

   /**
   * Get atHash
   * @return atHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAtHash() {
    return atHash;
  }


  public void setAtHash(String atHash) {
    this.atHash = atHash;
  }


  public IDTokenClaims aud(List<String> aud) {
    
    this.aud = aud;
    return this;
  }

  public IDTokenClaims addAudItem(String audItem) {
    if (this.aud == null) {
      this.aud = new ArrayList<>();
    }
    this.aud.add(audItem);
    return this;
  }

   /**
   * Get aud
   * @return aud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAud() {
    return aud;
  }


  public void setAud(List<String> aud) {
    this.aud = aud;
  }


  public IDTokenClaims authTime(OffsetDateTime authTime) {
    
    this.authTime = authTime;
    return this;
  }

   /**
   * Get authTime
   * @return authTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAuthTime() {
    return authTime;
  }


  public void setAuthTime(OffsetDateTime authTime) {
    this.authTime = authTime;
  }


  public IDTokenClaims cHash(String cHash) {
    
    this.cHash = cHash;
    return this;
  }

   /**
   * Get cHash
   * @return cHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getcHash() {
    return cHash;
  }


  public void setcHash(String cHash) {
    this.cHash = cHash;
  }


  public IDTokenClaims exp(OffsetDateTime exp) {
    
    this.exp = exp;
    return this;
  }

   /**
   * Get exp
   * @return exp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExp() {
    return exp;
  }


  public void setExp(OffsetDateTime exp) {
    this.exp = exp;
  }


  public IDTokenClaims ext(Map<String, Object> ext) {
    
    this.ext = ext;
    return this;
  }

  public IDTokenClaims putExtItem(String key, Object extItem) {
    if (this.ext == null) {
      this.ext = new HashMap<>();
    }
    this.ext.put(key, extItem);
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getExt() {
    return ext;
  }


  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }


  public IDTokenClaims iat(OffsetDateTime iat) {
    
    this.iat = iat;
    return this;
  }

   /**
   * Get iat
   * @return iat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getIat() {
    return iat;
  }


  public void setIat(OffsetDateTime iat) {
    this.iat = iat;
  }


  public IDTokenClaims iss(String iss) {
    
    this.iss = iss;
    return this;
  }

   /**
   * Get iss
   * @return iss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIss() {
    return iss;
  }


  public void setIss(String iss) {
    this.iss = iss;
  }


  public IDTokenClaims jti(String jti) {
    
    this.jti = jti;
    return this;
  }

   /**
   * Get jti
   * @return jti
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJti() {
    return jti;
  }


  public void setJti(String jti) {
    this.jti = jti;
  }


  public IDTokenClaims nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public IDTokenClaims rat(OffsetDateTime rat) {
    
    this.rat = rat;
    return this;
  }

   /**
   * Get rat
   * @return rat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRat() {
    return rat;
  }


  public void setRat(OffsetDateTime rat) {
    this.rat = rat;
  }


  public IDTokenClaims sub(String sub) {
    
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSub() {
    return sub;
  }


  public void setSub(String sub) {
    this.sub = sub;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IDTokenClaims idTokenClaims = (IDTokenClaims) o;
    return Objects.equals(this.acr, idTokenClaims.acr) &&
        Objects.equals(this.amr, idTokenClaims.amr) &&
        Objects.equals(this.atHash, idTokenClaims.atHash) &&
        Objects.equals(this.aud, idTokenClaims.aud) &&
        Objects.equals(this.authTime, idTokenClaims.authTime) &&
        Objects.equals(this.cHash, idTokenClaims.cHash) &&
        Objects.equals(this.exp, idTokenClaims.exp) &&
        Objects.equals(this.ext, idTokenClaims.ext) &&
        Objects.equals(this.iat, idTokenClaims.iat) &&
        Objects.equals(this.iss, idTokenClaims.iss) &&
        Objects.equals(this.jti, idTokenClaims.jti) &&
        Objects.equals(this.nonce, idTokenClaims.nonce) &&
        Objects.equals(this.rat, idTokenClaims.rat) &&
        Objects.equals(this.sub, idTokenClaims.sub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, amr, atHash, aud, authTime, cHash, exp, ext, iat, iss, jti, nonce, rat, sub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDTokenClaims {\n");
    sb.append("    acr: ").append(toIndentedString(acr)).append("\n");
    sb.append("    amr: ").append(toIndentedString(amr)).append("\n");
    sb.append("    atHash: ").append(toIndentedString(atHash)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
    sb.append("    cHash: ").append(toIndentedString(cHash)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    rat: ").append(toIndentedString(rat)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
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

