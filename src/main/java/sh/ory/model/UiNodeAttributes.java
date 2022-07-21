/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.1.0-alpha.12
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
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.UiNodeAnchorAttributes;
import sh.ory.model.UiNodeImageAttributes;
import sh.ory.model.UiNodeInputAttributes;
import sh.ory.model.UiNodeScriptAttributes;
import sh.ory.model.UiNodeTextAttributes;
import sh.ory.model.UiText;

/**
 * UiNodeAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T15:56:21.922601002Z[Etc/UTC]")
public class UiNodeAttributes {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private UiText label;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_TYPE = "node_type";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE)
  protected String nodeType;

  public static final String SERIALIZED_NAME_ONCLICK = "onclick";
  @SerializedName(SERIALIZED_NAME_ONCLICK)
  private String onclick;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private UiText text;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private String src;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private UiText title;

  public static final String SERIALIZED_NAME_ASYNC = "async";
  @SerializedName(SERIALIZED_NAME_ASYNC)
  private Boolean async;

  public static final String SERIALIZED_NAME_CROSSORIGIN = "crossorigin";
  @SerializedName(SERIALIZED_NAME_CROSSORIGIN)
  private String crossorigin;

  public static final String SERIALIZED_NAME_INTEGRITY = "integrity";
  @SerializedName(SERIALIZED_NAME_INTEGRITY)
  private String integrity;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_REFERRERPOLICY = "referrerpolicy";
  @SerializedName(SERIALIZED_NAME_REFERRERPOLICY)
  private String referrerpolicy;

  public UiNodeAttributes() { 
    this.nodeType = this.getClass().getSimpleName();
  }

  public UiNodeAttributes disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Sets the input&#39;s disabled field to true or false.
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Sets the input's disabled field to true or false.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public UiNodeAttributes label(UiText label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UiText getLabel() {
    return label;
  }


  public void setLabel(UiText label) {
    this.label = label;
  }


  public UiNodeAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The input&#39;s element name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The input's element name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UiNodeAttributes nodeType(String nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * NodeType represents this node&#39;s types. It is a mirror of &#x60;node.type&#x60; and is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is \&quot;script\&quot;.
   * @return nodeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is \"script\".")

  public String getNodeType() {
    return nodeType;
  }


  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  public UiNodeAttributes onclick(String onclick) {
    
    this.onclick = onclick;
    return this;
  }

   /**
   * OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.
   * @return onclick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.")

  public String getOnclick() {
    return onclick;
  }


  public void setOnclick(String onclick) {
    this.onclick = onclick;
  }


  public UiNodeAttributes pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * The input&#39;s pattern.
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input's pattern.")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public UiNodeAttributes required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Mark this input field as required.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mark this input field as required.")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public UiNodeAttributes type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The script MIME type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script MIME type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UiNodeAttributes value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The input&#39;s value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input's value.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public UiNodeAttributes id(String id) {
    
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


  public UiNodeAttributes text(UiText text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UiText getText() {
    return text;
  }


  public void setText(UiText text) {
    this.text = text;
  }


  public UiNodeAttributes height(Long height) {
    
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


  public UiNodeAttributes src(String src) {
    
    this.src = src;
    return this;
  }

   /**
   * The script source
   * @return src
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script source")

  public String getSrc() {
    return src;
  }


  public void setSrc(String src) {
    this.src = src;
  }


  public UiNodeAttributes width(Long width) {
    
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


  public UiNodeAttributes href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * The link&#39;s href (destination) URL.  format: uri
   * @return href
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The link's href (destination) URL.  format: uri")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public UiNodeAttributes title(UiText title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UiText getTitle() {
    return title;
  }


  public void setTitle(UiText title) {
    this.title = title;
  }


  public UiNodeAttributes async(Boolean async) {
    
    this.async = async;
    return this;
  }

   /**
   * The script async type
   * @return async
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script async type")

  public Boolean getAsync() {
    return async;
  }


  public void setAsync(Boolean async) {
    this.async = async;
  }


  public UiNodeAttributes crossorigin(String crossorigin) {
    
    this.crossorigin = crossorigin;
    return this;
  }

   /**
   * The script cross origin policy
   * @return crossorigin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script cross origin policy")

  public String getCrossorigin() {
    return crossorigin;
  }


  public void setCrossorigin(String crossorigin) {
    this.crossorigin = crossorigin;
  }


  public UiNodeAttributes integrity(String integrity) {
    
    this.integrity = integrity;
    return this;
  }

   /**
   * The script&#39;s integrity hash
   * @return integrity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script's integrity hash")

  public String getIntegrity() {
    return integrity;
  }


  public void setIntegrity(String integrity) {
    this.integrity = integrity;
  }


  public UiNodeAttributes nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Nonce for CSP  A nonce you may want to use to improve your Content Security Policy. You do not have to use this value but if you want to improve your CSP policies you may use it. You can also choose to use your own nonce value!
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Nonce for CSP  A nonce you may want to use to improve your Content Security Policy. You do not have to use this value but if you want to improve your CSP policies you may use it. You can also choose to use your own nonce value!")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public UiNodeAttributes referrerpolicy(String referrerpolicy) {
    
    this.referrerpolicy = referrerpolicy;
    return this;
  }

   /**
   * The script referrer policy
   * @return referrerpolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script referrer policy")

  public String getReferrerpolicy() {
    return referrerpolicy;
  }


  public void setReferrerpolicy(String referrerpolicy) {
    this.referrerpolicy = referrerpolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNodeAttributes uiNodeAttributes = (UiNodeAttributes) o;
    return Objects.equals(this.disabled, uiNodeAttributes.disabled) &&
        Objects.equals(this.label, uiNodeAttributes.label) &&
        Objects.equals(this.name, uiNodeAttributes.name) &&
        Objects.equals(this.nodeType, uiNodeAttributes.nodeType) &&
        Objects.equals(this.onclick, uiNodeAttributes.onclick) &&
        Objects.equals(this.pattern, uiNodeAttributes.pattern) &&
        Objects.equals(this.required, uiNodeAttributes.required) &&
        Objects.equals(this.type, uiNodeAttributes.type) &&
        Objects.equals(this.value, uiNodeAttributes.value) &&
        Objects.equals(this.id, uiNodeAttributes.id) &&
        Objects.equals(this.text, uiNodeAttributes.text) &&
        Objects.equals(this.height, uiNodeAttributes.height) &&
        Objects.equals(this.src, uiNodeAttributes.src) &&
        Objects.equals(this.width, uiNodeAttributes.width) &&
        Objects.equals(this.href, uiNodeAttributes.href) &&
        Objects.equals(this.title, uiNodeAttributes.title) &&
        Objects.equals(this.async, uiNodeAttributes.async) &&
        Objects.equals(this.crossorigin, uiNodeAttributes.crossorigin) &&
        Objects.equals(this.integrity, uiNodeAttributes.integrity) &&
        Objects.equals(this.nonce, uiNodeAttributes.nonce) &&
        Objects.equals(this.referrerpolicy, uiNodeAttributes.referrerpolicy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, label, name, nodeType, onclick, pattern, required, type, value, id, text, height, src, width, href, title, async, crossorigin, integrity, nonce, referrerpolicy);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNodeAttributes {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    onclick: ").append(toIndentedString(onclick)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    crossorigin: ").append(toIndentedString(crossorigin)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    referrerpolicy: ").append(toIndentedString(referrerpolicy)).append("\n");
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

