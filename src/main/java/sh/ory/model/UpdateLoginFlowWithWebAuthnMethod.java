/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.13.4
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
import java.util.Arrays;

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
 * Update Login Flow with WebAuthn Method
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T09:36:37.636902014Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UpdateLoginFlowWithWebAuthnMethod {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TRANSIENT_PAYLOAD = "transient_payload";
  @SerializedName(SERIALIZED_NAME_TRANSIENT_PAYLOAD)
  private Object transientPayload;

  public static final String SERIALIZED_NAME_WEBAUTHN_LOGIN = "webauthn_login";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_LOGIN)
  private String webauthnLogin;

  public UpdateLoginFlowWithWebAuthnMethod() {
  }

  public UpdateLoginFlowWithWebAuthnMethod csrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
    return this;
  }

  /**
   * Sending the anti-csrf token is only required for browser login flows.
   * @return csrfToken
   */
  @javax.annotation.Nullable
  public String getCsrfToken() {
    return csrfToken;
  }

  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public UpdateLoginFlowWithWebAuthnMethod identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Identifier is the email or username of the user trying to log in.
   * @return identifier
   */
  @javax.annotation.Nonnull
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public UpdateLoginFlowWithWebAuthnMethod method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Method should be set to \&quot;webAuthn\&quot; when logging in using the WebAuthn strategy.
   * @return method
   */
  @javax.annotation.Nonnull
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  public UpdateLoginFlowWithWebAuthnMethod transientPayload(Object transientPayload) {
    this.transientPayload = transientPayload;
    return this;
  }

  /**
   * Transient data to pass along to any webhooks
   * @return transientPayload
   */
  @javax.annotation.Nullable
  public Object getTransientPayload() {
    return transientPayload;
  }

  public void setTransientPayload(Object transientPayload) {
    this.transientPayload = transientPayload;
  }


  public UpdateLoginFlowWithWebAuthnMethod webauthnLogin(String webauthnLogin) {
    this.webauthnLogin = webauthnLogin;
    return this;
  }

  /**
   * Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
   * @return webauthnLogin
   */
  @javax.annotation.Nullable
  public String getWebauthnLogin() {
    return webauthnLogin;
  }

  public void setWebauthnLogin(String webauthnLogin) {
    this.webauthnLogin = webauthnLogin;
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
   * @return the UpdateLoginFlowWithWebAuthnMethod instance itself
   */
  public UpdateLoginFlowWithWebAuthnMethod putAdditionalProperty(String key, Object value) {
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
    UpdateLoginFlowWithWebAuthnMethod updateLoginFlowWithWebAuthnMethod = (UpdateLoginFlowWithWebAuthnMethod) o;
    return Objects.equals(this.csrfToken, updateLoginFlowWithWebAuthnMethod.csrfToken) &&
        Objects.equals(this.identifier, updateLoginFlowWithWebAuthnMethod.identifier) &&
        Objects.equals(this.method, updateLoginFlowWithWebAuthnMethod.method) &&
        Objects.equals(this.transientPayload, updateLoginFlowWithWebAuthnMethod.transientPayload) &&
        Objects.equals(this.webauthnLogin, updateLoginFlowWithWebAuthnMethod.webauthnLogin)&&
        Objects.equals(this.additionalProperties, updateLoginFlowWithWebAuthnMethod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, identifier, method, transientPayload, webauthnLogin, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLoginFlowWithWebAuthnMethod {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    transientPayload: ").append(toIndentedString(transientPayload)).append("\n");
    sb.append("    webauthnLogin: ").append(toIndentedString(webauthnLogin)).append("\n");
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
    openapiFields.add("csrf_token");
    openapiFields.add("identifier");
    openapiFields.add("method");
    openapiFields.add("transient_payload");
    openapiFields.add("webauthn_login");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("method");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateLoginFlowWithWebAuthnMethod
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLoginFlowWithWebAuthnMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLoginFlowWithWebAuthnMethod is not found in the empty JSON string", UpdateLoginFlowWithWebAuthnMethod.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateLoginFlowWithWebAuthnMethod.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonNull()) && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (!jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("webauthn_login") != null && !jsonObj.get("webauthn_login").isJsonNull()) && !jsonObj.get("webauthn_login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webauthn_login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webauthn_login").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLoginFlowWithWebAuthnMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLoginFlowWithWebAuthnMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLoginFlowWithWebAuthnMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithWebAuthnMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLoginFlowWithWebAuthnMethod>() {
           @Override
           public void write(JsonWriter out, UpdateLoginFlowWithWebAuthnMethod value) throws IOException {
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
           public UpdateLoginFlowWithWebAuthnMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdateLoginFlowWithWebAuthnMethod instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdateLoginFlowWithWebAuthnMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateLoginFlowWithWebAuthnMethod
   * @throws IOException if the JSON string is invalid with respect to UpdateLoginFlowWithWebAuthnMethod
   */
  public static UpdateLoginFlowWithWebAuthnMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLoginFlowWithWebAuthnMethod.class);
  }

  /**
   * Convert an instance of UpdateLoginFlowWithWebAuthnMethod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

