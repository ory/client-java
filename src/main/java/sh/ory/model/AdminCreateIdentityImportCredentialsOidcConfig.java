/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.1.0-alpha.11
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
import sh.ory.model.AdminCreateIdentityImportCredentialsOidcProvider;
import sh.ory.model.AdminCreateIdentityImportCredentialsPasswordConfig;

/**
 * AdminCreateIdentityImportCredentialsOidcConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T10:31:44.206857586Z[Etc/UTC]")
public class AdminCreateIdentityImportCredentialsOidcConfig {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private AdminCreateIdentityImportCredentialsPasswordConfig config;

  public static final String SERIALIZED_NAME_PROVIDERS = "providers";
  @SerializedName(SERIALIZED_NAME_PROVIDERS)
  private List<AdminCreateIdentityImportCredentialsOidcProvider> providers = null;

  public AdminCreateIdentityImportCredentialsOidcConfig() { 
  }

  public AdminCreateIdentityImportCredentialsOidcConfig config(AdminCreateIdentityImportCredentialsPasswordConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminCreateIdentityImportCredentialsPasswordConfig getConfig() {
    return config;
  }


  public void setConfig(AdminCreateIdentityImportCredentialsPasswordConfig config) {
    this.config = config;
  }


  public AdminCreateIdentityImportCredentialsOidcConfig providers(List<AdminCreateIdentityImportCredentialsOidcProvider> providers) {
    
    this.providers = providers;
    return this;
  }

  public AdminCreateIdentityImportCredentialsOidcConfig addProvidersItem(AdminCreateIdentityImportCredentialsOidcProvider providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

   /**
   * A list of OpenID Connect Providers
   * @return providers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of OpenID Connect Providers")

  public List<AdminCreateIdentityImportCredentialsOidcProvider> getProviders() {
    return providers;
  }


  public void setProviders(List<AdminCreateIdentityImportCredentialsOidcProvider> providers) {
    this.providers = providers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateIdentityImportCredentialsOidcConfig adminCreateIdentityImportCredentialsOidcConfig = (AdminCreateIdentityImportCredentialsOidcConfig) o;
    return Objects.equals(this.config, adminCreateIdentityImportCredentialsOidcConfig.config) &&
        Objects.equals(this.providers, adminCreateIdentityImportCredentialsOidcConfig.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateIdentityImportCredentialsOidcConfig {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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

