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
 * UiNodeImageAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T15:32:08.220513927Z[Etc/UTC]")
public class UiNodeImageAttributes {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NODE_TYPE = "node_type";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE)
  private String nodeType;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private String src;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width;

  public UiNodeImageAttributes() { 
  }

  public UiNodeImageAttributes height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of the image
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Height of the image")

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public UiNodeImageAttributes id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UiNodeImageAttributes nodeType(String nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * NodeType represents this node&#39;s types. It is a mirror of &#x60;node.type&#x60; and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \&quot;img\&quot;.
   * @return nodeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"img\".")

  public String getNodeType() {
    return nodeType;
  }


  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  public UiNodeImageAttributes src(String src) {
    
    this.src = src;
    return this;
  }

   /**
   * The image&#39;s source URL.  format: uri
   * @return src
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The image's source URL.  format: uri")

  public String getSrc() {
    return src;
  }


  public void setSrc(String src) {
    this.src = src;
  }


  public UiNodeImageAttributes width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width of the image
   * @return width
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Width of the image")

  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNodeImageAttributes uiNodeImageAttributes = (UiNodeImageAttributes) o;
    return Objects.equals(this.height, uiNodeImageAttributes.height) &&
        Objects.equals(this.id, uiNodeImageAttributes.id) &&
        Objects.equals(this.nodeType, uiNodeImageAttributes.nodeType) &&
        Objects.equals(this.src, uiNodeImageAttributes.src) &&
        Objects.equals(this.width, uiNodeImageAttributes.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, id, nodeType, src, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNodeImageAttributes {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

