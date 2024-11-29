/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.13
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sh.ory.model.ContinueWith;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sh.ory.JSON;

/**
 * This request is used when an identity wants to recover their account.  We recommend reading the [Account Recovery Documentation](../self-service/flows/password-reset-account-recovery)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T11:34:10.105792443Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class RecoveryFlow {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_CONTINUE_WITH = "continue_with";
  @SerializedName(SERIALIZED_NAME_CONTINUE_WITH)
  private List<ContinueWith> continueWith = new ArrayList<>();

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
  private Object state = null;

  public static final String SERIALIZED_NAME_TRANSIENT_PAYLOAD = "transient_payload";
  @SerializedName(SERIALIZED_NAME_TRANSIENT_PAYLOAD)
  private Object transientPayload;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UI = "ui";
  @SerializedName(SERIALIZED_NAME_UI)
  private UiContainer ui;

  public RecoveryFlow() {
  }

  public RecoveryFlow active(String active) {
    this.active = active;
    return this;
  }

  /**
   * Active, if set, contains the recovery method that is being used. It is initially not set.
   * @return active
   */
  @javax.annotation.Nullable
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }


  public RecoveryFlow continueWith(List<ContinueWith> continueWith) {
    this.continueWith = continueWith;
    return this;
  }

  public RecoveryFlow addContinueWithItem(ContinueWith continueWithItem) {
    if (this.continueWith == null) {
      this.continueWith = new ArrayList<>();
    }
    this.continueWith.add(continueWithItem);
    return this;
  }

  /**
   * Contains possible actions that could follow this flow
   * @return continueWith
   */
  @javax.annotation.Nullable
  public List<ContinueWith> getContinueWith() {
    return continueWith;
  }

  public void setContinueWith(List<ContinueWith> continueWith) {
    this.continueWith = continueWith;
  }


  public RecoveryFlow expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the setting, a new request has to be initiated.
   * @return expiresAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RecoveryFlow id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID represents the request&#39;s unique ID. When performing the recovery flow, this represents the id in the recovery ui&#39;s query parameter: http://&lt;selfservice.flows.recovery.ui_url&gt;?request&#x3D;&lt;id&gt;
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RecoveryFlow issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * IssuedAt is the time (UTC) when the request occurred.
   * @return issuedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public RecoveryFlow requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
   */
  @javax.annotation.Nonnull
  public String getRequestUrl() {
    return requestUrl;
  }

  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public RecoveryFlow returnTo(String returnTo) {
    this.returnTo = returnTo;
    return this;
  }

  /**
   * ReturnTo contains the requested return_to URL.
   * @return returnTo
   */
  @javax.annotation.Nullable
  public String getReturnTo() {
    return returnTo;
  }

  public void setReturnTo(String returnTo) {
    this.returnTo = returnTo;
  }


  public RecoveryFlow state(Object state) {
    this.state = state;
    return this;
  }

  /**
   * State represents the state of this request:  choose_method: ask the user to choose a method (e.g. recover account via email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the recovery challenge was passed.
   * @return state
   */
  @javax.annotation.Nullable
  public Object getState() {
    return state;
  }

  public void setState(Object state) {
    this.state = state;
  }


  public RecoveryFlow transientPayload(Object transientPayload) {
    this.transientPayload = transientPayload;
    return this;
  }

  /**
   * TransientPayload is used to pass data from the recovery flow to hooks and email templates
   * @return transientPayload
   */
  @javax.annotation.Nullable
  public Object getTransientPayload() {
    return transientPayload;
  }

  public void setTransientPayload(Object transientPayload) {
    this.transientPayload = transientPayload;
  }


  public RecoveryFlow type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public RecoveryFlow ui(UiContainer ui) {
    this.ui = ui;
    return this;
  }

  /**
   * Get ui
   * @return ui
   */
  @javax.annotation.Nonnull
  public UiContainer getUi() {
    return ui;
  }

  public void setUi(UiContainer ui) {
    this.ui = ui;
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
   * @return the RecoveryFlow instance itself
   */
  public RecoveryFlow putAdditionalProperty(String key, Object value) {
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
    RecoveryFlow recoveryFlow = (RecoveryFlow) o;
    return Objects.equals(this.active, recoveryFlow.active) &&
        Objects.equals(this.continueWith, recoveryFlow.continueWith) &&
        Objects.equals(this.expiresAt, recoveryFlow.expiresAt) &&
        Objects.equals(this.id, recoveryFlow.id) &&
        Objects.equals(this.issuedAt, recoveryFlow.issuedAt) &&
        Objects.equals(this.requestUrl, recoveryFlow.requestUrl) &&
        Objects.equals(this.returnTo, recoveryFlow.returnTo) &&
        Objects.equals(this.state, recoveryFlow.state) &&
        Objects.equals(this.transientPayload, recoveryFlow.transientPayload) &&
        Objects.equals(this.type, recoveryFlow.type) &&
        Objects.equals(this.ui, recoveryFlow.ui)&&
        Objects.equals(this.additionalProperties, recoveryFlow.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, continueWith, expiresAt, id, issuedAt, requestUrl, returnTo, state, transientPayload, type, ui, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryFlow {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    continueWith: ").append(toIndentedString(continueWith)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transientPayload: ").append(toIndentedString(transientPayload)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("continue_with");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("issued_at");
    openapiFields.add("request_url");
    openapiFields.add("return_to");
    openapiFields.add("state");
    openapiFields.add("transient_payload");
    openapiFields.add("type");
    openapiFields.add("ui");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expires_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("request_url");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("ui");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RecoveryFlow
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecoveryFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecoveryFlow is not found in the empty JSON string", RecoveryFlow.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecoveryFlow.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) && !jsonObj.get("active").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active").toString()));
      }
      if (jsonObj.get("continue_with") != null && !jsonObj.get("continue_with").isJsonNull()) {
        JsonArray jsonArraycontinueWith = jsonObj.getAsJsonArray("continue_with");
        if (jsonArraycontinueWith != null) {
          // ensure the json data is an array
          if (!jsonObj.get("continue_with").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `continue_with` to be an array in the JSON string but got `%s`", jsonObj.get("continue_with").toString()));
          }

          // validate the optional field `continue_with` (array)
          for (int i = 0; i < jsonArraycontinueWith.size(); i++) {
            ContinueWith.validateJsonElement(jsonArraycontinueWith.get(i));
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      if ((jsonObj.get("return_to") != null && !jsonObj.get("return_to").isJsonNull()) && !jsonObj.get("return_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_to").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `ui`
      UiContainer.validateJsonElement(jsonObj.get("ui"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecoveryFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecoveryFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecoveryFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecoveryFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<RecoveryFlow>() {
           @Override
           public void write(JsonWriter out, RecoveryFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RecoveryFlow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RecoveryFlow instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of RecoveryFlow given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecoveryFlow
   * @throws IOException if the JSON string is invalid with respect to RecoveryFlow
   */
  public static RecoveryFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecoveryFlow.class);
  }

  /**
   * Convert an instance of RecoveryFlow to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

