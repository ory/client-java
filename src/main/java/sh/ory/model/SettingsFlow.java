/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0
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
import sh.ory.model.Identity;
import sh.ory.model.SettingsFlowState;
import sh.ory.model.UiContainer;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * This flow is used when an identity wants to update settings (e.g. profile data, passwords, ...) in a selfservice manner.  We recommend reading the [User Settings Documentation](../self-service/flows/user-settings)
 */
@ApiModel(description = "This flow is used when an identity wants to update settings (e.g. profile data, passwords, ...) in a selfservice manner.  We recommend reading the [User Settings Documentation](../self-service/flows/user-settings)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T09:59:07.712807273Z[Etc/UTC]")
public class SettingsFlow {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Identity identity;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_RETURN_TO = "return_to";
  @SerializedName(SERIALIZED_NAME_RETURN_TO)
  private String returnTo;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private SettingsFlowState state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UI = "ui";
  @SerializedName(SERIALIZED_NAME_UI)
  private UiContainer ui;

  public SettingsFlow() { 
  }

  public SettingsFlow active(String active) {
    
    this.active = active;
    return this;
  }

   /**
   * Active, if set, contains the registration method that is being used. It is initially not set.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active, if set, contains the registration method that is being used. It is initially not set.")

  public String getActive() {
    return active;
  }


  public void setActive(String active) {
    this.active = active;
  }


  public SettingsFlow expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to update the setting, a new flow has to be initiated.
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to update the setting, a new flow has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public SettingsFlow id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID represents the flow&#39;s unique ID. When performing the settings flow, this represents the id in the settings ui&#39;s query parameter: http://&lt;selfservice.flows.settings.ui_url&gt;?flow&#x3D;&lt;id&gt;
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID represents the flow's unique ID. When performing the settings flow, this represents the id in the settings ui's query parameter: http://<selfservice.flows.settings.ui_url>?flow=<id>")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SettingsFlow identity(Identity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Identity getIdentity() {
    return identity;
  }


  public void setIdentity(Identity identity) {
    this.identity = identity;
  }


  public SettingsFlow issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the flow occurred.
   * @return issuedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IssuedAt is the time (UTC) when the flow occurred.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public SettingsFlow requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public SettingsFlow returnTo(String returnTo) {
    
    this.returnTo = returnTo;
    return this;
  }

   /**
   * ReturnTo contains the requested return_to URL.
   * @return returnTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReturnTo contains the requested return_to URL.")

  public String getReturnTo() {
    return returnTo;
  }


  public void setReturnTo(String returnTo) {
    this.returnTo = returnTo;
  }


  public SettingsFlow state(SettingsFlowState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SettingsFlowState getState() {
    return state;
  }


  public void setState(SettingsFlowState state) {
    this.state = state;
  }


  public SettingsFlow type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The flow type can either be `api` or `browser`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SettingsFlow ui(UiContainer ui) {
    
    this.ui = ui;
    return this;
  }

   /**
   * Get ui
   * @return ui
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UiContainer getUi() {
    return ui;
  }


  public void setUi(UiContainer ui) {
    this.ui = ui;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsFlow settingsFlow = (SettingsFlow) o;
    return Objects.equals(this.active, settingsFlow.active) &&
        Objects.equals(this.expiresAt, settingsFlow.expiresAt) &&
        Objects.equals(this.id, settingsFlow.id) &&
        Objects.equals(this.identity, settingsFlow.identity) &&
        Objects.equals(this.issuedAt, settingsFlow.issuedAt) &&
        Objects.equals(this.requestUrl, settingsFlow.requestUrl) &&
        Objects.equals(this.returnTo, settingsFlow.returnTo) &&
        Objects.equals(this.state, settingsFlow.state) &&
        Objects.equals(this.type, settingsFlow.type) &&
        Objects.equals(this.ui, settingsFlow.ui);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expiresAt, id, identity, issuedAt, requestUrl, returnTo, state, type, ui);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsFlow {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("identity");
    openapiFields.add("issued_at");
    openapiFields.add("request_url");
    openapiFields.add("return_to");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("ui");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expires_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("identity");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("request_url");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("ui");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SettingsFlow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SettingsFlow.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettingsFlow is not found in the empty JSON string", SettingsFlow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SettingsFlow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettingsFlow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SettingsFlow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("active") != null && !jsonObj.get("active").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `identity`
      if (jsonObj.getAsJsonObject("identity") != null) {
        Identity.validateJsonObject(jsonObj.getAsJsonObject("identity"));
      }
      if (jsonObj.get("request_url") != null && !jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      if (jsonObj.get("return_to") != null && !jsonObj.get("return_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_to").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `ui`
      if (jsonObj.getAsJsonObject("ui") != null) {
        UiContainer.validateJsonObject(jsonObj.getAsJsonObject("ui"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettingsFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettingsFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettingsFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettingsFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<SettingsFlow>() {
           @Override
           public void write(JsonWriter out, SettingsFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettingsFlow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettingsFlow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettingsFlow
  * @throws IOException if the JSON string is invalid with respect to SettingsFlow
  */
  public static SettingsFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettingsFlow.class);
  }

 /**
  * Convert an instance of SettingsFlow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

