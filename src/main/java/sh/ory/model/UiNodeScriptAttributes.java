/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.41
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * UiNodeScriptAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-06T14:50:40.071456895Z[Etc/UTC]")
public class UiNodeScriptAttributes {
  public static final String SERIALIZED_NAME_ASYNC = "async";
  @SerializedName(SERIALIZED_NAME_ASYNC)
  private Boolean async;

  public static final String SERIALIZED_NAME_CROSSORIGIN = "crossorigin";
  @SerializedName(SERIALIZED_NAME_CROSSORIGIN)
  private String crossorigin;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTEGRITY = "integrity";
  @SerializedName(SERIALIZED_NAME_INTEGRITY)
  private String integrity;

  public static final String SERIALIZED_NAME_NODE_TYPE = "node_type";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE)
  private String nodeType;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_REFERRERPOLICY = "referrerpolicy";
  @SerializedName(SERIALIZED_NAME_REFERRERPOLICY)
  private String referrerpolicy;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private String src;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public UiNodeScriptAttributes() {
  }

  public UiNodeScriptAttributes async(Boolean async) {
    
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


  public UiNodeScriptAttributes crossorigin(String crossorigin) {
    
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


  public UiNodeScriptAttributes id(String id) {
    
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


  public UiNodeScriptAttributes integrity(String integrity) {
    
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


  public UiNodeScriptAttributes nodeType(String nodeType) {
    
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


  public UiNodeScriptAttributes nonce(String nonce) {
    
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


  public UiNodeScriptAttributes referrerpolicy(String referrerpolicy) {
    
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


  public UiNodeScriptAttributes src(String src) {
    
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


  public UiNodeScriptAttributes type(String type) {
    
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

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UiNodeScriptAttributes instance itself
   */
  public UiNodeScriptAttributes putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNodeScriptAttributes uiNodeScriptAttributes = (UiNodeScriptAttributes) o;
    return Objects.equals(this.async, uiNodeScriptAttributes.async) &&
        Objects.equals(this.crossorigin, uiNodeScriptAttributes.crossorigin) &&
        Objects.equals(this.id, uiNodeScriptAttributes.id) &&
        Objects.equals(this.integrity, uiNodeScriptAttributes.integrity) &&
        Objects.equals(this.nodeType, uiNodeScriptAttributes.nodeType) &&
        Objects.equals(this.nonce, uiNodeScriptAttributes.nonce) &&
        Objects.equals(this.referrerpolicy, uiNodeScriptAttributes.referrerpolicy) &&
        Objects.equals(this.src, uiNodeScriptAttributes.src) &&
        Objects.equals(this.type, uiNodeScriptAttributes.type)&&
        Objects.equals(this.additionalProperties, uiNodeScriptAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(async, crossorigin, id, integrity, nodeType, nonce, referrerpolicy, src, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNodeScriptAttributes {\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    crossorigin: ").append(toIndentedString(crossorigin)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    referrerpolicy: ").append(toIndentedString(referrerpolicy)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("async");
    openapiFields.add("crossorigin");
    openapiFields.add("id");
    openapiFields.add("integrity");
    openapiFields.add("node_type");
    openapiFields.add("nonce");
    openapiFields.add("referrerpolicy");
    openapiFields.add("src");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("async");
    openapiRequiredFields.add("crossorigin");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("integrity");
    openapiRequiredFields.add("node_type");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("referrerpolicy");
    openapiRequiredFields.add("src");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UiNodeScriptAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UiNodeScriptAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UiNodeScriptAttributes is not found in the empty JSON string", UiNodeScriptAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UiNodeScriptAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("crossorigin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crossorigin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crossorigin").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("integrity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrity").toString()));
      }
      if (!jsonObj.get("node_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_type").toString()));
      }
      if (!jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
      if (!jsonObj.get("referrerpolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referrerpolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referrerpolicy").toString()));
      }
      if (!jsonObj.get("src").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `src` to be a primitive type in the JSON string but got `%s`", jsonObj.get("src").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UiNodeScriptAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UiNodeScriptAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UiNodeScriptAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UiNodeScriptAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UiNodeScriptAttributes>() {
           @Override
           public void write(JsonWriter out, UiNodeScriptAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UiNodeScriptAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UiNodeScriptAttributes instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UiNodeScriptAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UiNodeScriptAttributes
  * @throws IOException if the JSON string is invalid with respect to UiNodeScriptAttributes
  */
  public static UiNodeScriptAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UiNodeScriptAttributes.class);
  }

 /**
  * Convert an instance of UiNodeScriptAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

