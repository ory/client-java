/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.87
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
import java.util.UUID;

/**
 * CreateSubscriptionPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T14:06:29.637217896Z[Etc/UTC]")
public class CreateSubscriptionPayload {
  public static final String SERIALIZED_NAME_PLAN_OR_PRICE = "plan_or_price";
  @SerializedName(SERIALIZED_NAME_PLAN_OR_PRICE)
  private String planOrPrice;

  public static final String SERIALIZED_NAME_PROVISION_FIRST_PROJECT = "provision_first_project";
  @SerializedName(SERIALIZED_NAME_PROVISION_FIRST_PROJECT)
  private UUID provisionFirstProject;

  public static final String SERIALIZED_NAME_RETURN_TO = "return_to";
  @SerializedName(SERIALIZED_NAME_RETURN_TO)
  private String returnTo;

  public CreateSubscriptionPayload() { 
  }

  public CreateSubscriptionPayload planOrPrice(String planOrPrice) {
    
    this.planOrPrice = planOrPrice;
    return this;
  }

   /**
   * Get planOrPrice
   * @return planOrPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPlanOrPrice() {
    return planOrPrice;
  }


  public void setPlanOrPrice(String planOrPrice) {
    this.planOrPrice = planOrPrice;
  }


  public CreateSubscriptionPayload provisionFirstProject(UUID provisionFirstProject) {
    
    this.provisionFirstProject = provisionFirstProject;
    return this;
  }

   /**
   * Get provisionFirstProject
   * @return provisionFirstProject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getProvisionFirstProject() {
    return provisionFirstProject;
  }


  public void setProvisionFirstProject(UUID provisionFirstProject) {
    this.provisionFirstProject = provisionFirstProject;
  }


  public CreateSubscriptionPayload returnTo(String returnTo) {
    
    this.returnTo = returnTo;
    return this;
  }

   /**
   * Get returnTo
   * @return returnTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReturnTo() {
    return returnTo;
  }


  public void setReturnTo(String returnTo) {
    this.returnTo = returnTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionPayload createSubscriptionPayload = (CreateSubscriptionPayload) o;
    return Objects.equals(this.planOrPrice, createSubscriptionPayload.planOrPrice) &&
        Objects.equals(this.provisionFirstProject, createSubscriptionPayload.provisionFirstProject) &&
        Objects.equals(this.returnTo, createSubscriptionPayload.returnTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planOrPrice, provisionFirstProject, returnTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionPayload {\n");
    sb.append("    planOrPrice: ").append(toIndentedString(planOrPrice)).append("\n");
    sb.append("    provisionFirstProject: ").append(toIndentedString(provisionFirstProject)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
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

