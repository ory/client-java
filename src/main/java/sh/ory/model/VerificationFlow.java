/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.33
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
import sh.ory.model.UiContainer;
import sh.ory.model.VerificationFlowState;

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
 * Used to verify an out-of-band communication channel such as an email address or a phone number.  For more information head over to: https://www.ory.sh/docs/kratos/self-service/flows/verify-email-account-activation
 */
@ApiModel(description = "Used to verify an out-of-band communication channel such as an email address or a phone number.  For more information head over to: https://www.ory.sh/docs/kratos/self-service/flows/verify-email-account-activation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T13:18:59.927245844Z[Etc/UTC]")
public class VerificationFlow {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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
  private VerificationFlowState state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UI = "ui";
  @SerializedName(SERIALIZED_NAME_UI)
  private UiContainer ui;

  public VerificationFlow() {
  }

  public VerificationFlow active(String active) {
    
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


  public VerificationFlow expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to verify the address, a new request has to be initiated.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExpiresAt is the time (UTC) when the request expires. If the user still wishes to verify the address, a new request has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public VerificationFlow id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID represents the request&#39;s unique ID. When performing the verification flow, this represents the id in the verify ui&#39;s query parameter: http://&lt;selfservice.flows.verification.ui_url&gt;?request&#x3D;&lt;id&gt;  type: string format: uuid
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID represents the request's unique ID. When performing the verification flow, this represents the id in the verify ui's query parameter: http://<selfservice.flows.verification.ui_url>?request=<id>  type: string format: uuid")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VerificationFlow issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the request occurred.
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IssuedAt is the time (UTC) when the request occurred.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public VerificationFlow requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public VerificationFlow returnTo(String returnTo) {
    
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


  public VerificationFlow state(VerificationFlowState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VerificationFlowState getState() {
    return state;
  }


  public void setState(VerificationFlowState state) {
    this.state = state;
  }


  public VerificationFlow type(String type) {
    
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


  public VerificationFlow ui(UiContainer ui) {
    
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
    VerificationFlow verificationFlow = (VerificationFlow) o;
    return Objects.equals(this.active, verificationFlow.active) &&
        Objects.equals(this.expiresAt, verificationFlow.expiresAt) &&
        Objects.equals(this.id, verificationFlow.id) &&
        Objects.equals(this.issuedAt, verificationFlow.issuedAt) &&
        Objects.equals(this.requestUrl, verificationFlow.requestUrl) &&
        Objects.equals(this.returnTo, verificationFlow.returnTo) &&
        Objects.equals(this.state, verificationFlow.state) &&
        Objects.equals(this.type, verificationFlow.type) &&
        Objects.equals(this.ui, verificationFlow.ui);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expiresAt, id, issuedAt, requestUrl, returnTo, state, type, ui);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationFlow {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("issued_at");
    openapiFields.add("request_url");
    openapiFields.add("return_to");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("ui");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("ui");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerificationFlow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerificationFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationFlow is not found in the empty JSON string", VerificationFlow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerificationFlow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerificationFlow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerificationFlow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) && !jsonObj.get("active").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("request_url") != null && !jsonObj.get("request_url").isJsonNull()) && !jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      if ((jsonObj.get("return_to") != null && !jsonObj.get("return_to").isJsonNull()) && !jsonObj.get("return_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_to").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `ui`
      UiContainer.validateJsonObject(jsonObj.getAsJsonObject("ui"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationFlow>() {
           @Override
           public void write(JsonWriter out, VerificationFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerificationFlow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerificationFlow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerificationFlow
  * @throws IOException if the JSON string is invalid with respect to VerificationFlow
  */
  public static VerificationFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationFlow.class);
  }

 /**
  * Convert an instance of VerificationFlow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

