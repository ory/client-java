/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.21
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
 * IdentityCredentialsOidcProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-26T15:01:38.488459285Z[Etc/UTC]")
public class IdentityCredentialsOidcProvider {
  public static final String SERIALIZED_NAME_INITIAL_ACCESS_TOKEN = "initial_access_token";
  @SerializedName(SERIALIZED_NAME_INITIAL_ACCESS_TOKEN)
  private String initialAccessToken;

  public static final String SERIALIZED_NAME_INITIAL_ID_TOKEN = "initial_id_token";
  @SerializedName(SERIALIZED_NAME_INITIAL_ID_TOKEN)
  private String initialIdToken;

  public static final String SERIALIZED_NAME_INITIAL_REFRESH_TOKEN = "initial_refresh_token";
  @SerializedName(SERIALIZED_NAME_INITIAL_REFRESH_TOKEN)
  private String initialRefreshToken;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public IdentityCredentialsOidcProvider() { 
  }

  public IdentityCredentialsOidcProvider initialAccessToken(String initialAccessToken) {
    
    this.initialAccessToken = initialAccessToken;
    return this;
  }

   /**
   * Get initialAccessToken
   * @return initialAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialAccessToken() {
    return initialAccessToken;
  }


  public void setInitialAccessToken(String initialAccessToken) {
    this.initialAccessToken = initialAccessToken;
  }


  public IdentityCredentialsOidcProvider initialIdToken(String initialIdToken) {
    
    this.initialIdToken = initialIdToken;
    return this;
  }

   /**
   * Get initialIdToken
   * @return initialIdToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialIdToken() {
    return initialIdToken;
  }


  public void setInitialIdToken(String initialIdToken) {
    this.initialIdToken = initialIdToken;
  }


  public IdentityCredentialsOidcProvider initialRefreshToken(String initialRefreshToken) {
    
    this.initialRefreshToken = initialRefreshToken;
    return this;
  }

   /**
   * Get initialRefreshToken
   * @return initialRefreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitialRefreshToken() {
    return initialRefreshToken;
  }


  public void setInitialRefreshToken(String initialRefreshToken) {
    this.initialRefreshToken = initialRefreshToken;
  }


  public IdentityCredentialsOidcProvider provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public IdentityCredentialsOidcProvider subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    IdentityCredentialsOidcProvider identityCredentialsOidcProvider = (IdentityCredentialsOidcProvider) o;
    return Objects.equals(this.initialAccessToken, identityCredentialsOidcProvider.initialAccessToken) &&
        Objects.equals(this.initialIdToken, identityCredentialsOidcProvider.initialIdToken) &&
        Objects.equals(this.initialRefreshToken, identityCredentialsOidcProvider.initialRefreshToken) &&
        Objects.equals(this.provider, identityCredentialsOidcProvider.provider) &&
        Objects.equals(this.subject, identityCredentialsOidcProvider.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialAccessToken, initialIdToken, initialRefreshToken, provider, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCredentialsOidcProvider {\n");
    sb.append("    initialAccessToken: ").append(toIndentedString(initialAccessToken)).append("\n");
    sb.append("    initialIdToken: ").append(toIndentedString(initialIdToken)).append("\n");
    sb.append("    initialRefreshToken: ").append(toIndentedString(initialRefreshToken)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

