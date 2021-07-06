/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.10
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
 * PluginConfigRootfs plugin config rootfs
 */
@ApiModel(description = "PluginConfigRootfs plugin config rootfs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-06T14:20:59.215524089Z[Etc/UTC]")
public class PluginConfigRootfs {
  public static final String SERIALIZED_NAME_DIFF_IDS = "diff_ids";
  @SerializedName(SERIALIZED_NAME_DIFF_IDS)
  private List<String> diffIds = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public PluginConfigRootfs diffIds(List<String> diffIds) {
    
    this.diffIds = diffIds;
    return this;
  }

  public PluginConfigRootfs addDiffIdsItem(String diffIdsItem) {
    if (this.diffIds == null) {
      this.diffIds = new ArrayList<>();
    }
    this.diffIds.add(diffIdsItem);
    return this;
  }

   /**
   * diff ids
   * @return diffIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "diff ids")

  public List<String> getDiffIds() {
    return diffIds;
  }


  public void setDiffIds(List<String> diffIds) {
    this.diffIds = diffIds;
  }


  public PluginConfigRootfs type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigRootfs pluginConfigRootfs = (PluginConfigRootfs) o;
    return Objects.equals(this.diffIds, pluginConfigRootfs.diffIds) &&
        Objects.equals(this.type, pluginConfigRootfs.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diffIds, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigRootfs {\n");
    sb.append("    diffIds: ").append(toIndentedString(diffIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

