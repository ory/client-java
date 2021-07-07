/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.14
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
import sh.ory.model.UiText;

/**
 * UiNodeAnchorAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-07T10:27:17.267939776Z[Etc/UTC]")
public class UiNodeAnchorAttributes {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private UiText title;


  public UiNodeAnchorAttributes href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * The link&#39;s href (destination) URL.  format: uri
   * @return href
  **/
  @ApiModelProperty(required = true, value = "The link's href (destination) URL.  format: uri")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public UiNodeAnchorAttributes title(UiText title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")

  public UiText getTitle() {
    return title;
  }


  public void setTitle(UiText title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNodeAnchorAttributes uiNodeAnchorAttributes = (UiNodeAnchorAttributes) o;
    return Objects.equals(this.href, uiNodeAnchorAttributes.href) &&
        Objects.equals(this.title, uiNodeAnchorAttributes.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNodeAnchorAttributes {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

