/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.16
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
 * Update Login Flow with OpenID Connect Method
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T11:51:29.942568361Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UpdateLoginFlowWithOidcMethod {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_ID_TOKEN = "id_token";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN)
  private String idToken;

  public static final String SERIALIZED_NAME_ID_TOKEN_NONCE = "id_token_nonce";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN_NONCE)
  private String idTokenNonce;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_TRANSIENT_PAYLOAD = "transient_payload";
  @SerializedName(SERIALIZED_NAME_TRANSIENT_PAYLOAD)
  private Object transientPayload;

  public static final String SERIALIZED_NAME_UPSTREAM_PARAMETERS = "upstream_parameters";
  @SerializedName(SERIALIZED_NAME_UPSTREAM_PARAMETERS)
  private Object upstreamParameters;

  public UpdateLoginFlowWithOidcMethod() {
  }

  public UpdateLoginFlowWithOidcMethod csrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
    return this;
  }

  /**
   * The CSRF Token
   * @return csrfToken
   */
  @javax.annotation.Nullable
  public String getCsrfToken() {
    return csrfToken;
  }

  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public UpdateLoginFlowWithOidcMethod idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * IDToken is an optional id token provided by an OIDC provider  If submitted, it is verified using the OIDC provider&#39;s public key set and the claims are used to populate the OIDC credentials of the identity. If the OIDC provider does not store additional claims (such as name, etc.) in the IDToken itself, you can use the &#x60;traits&#x60; field to populate the identity&#39;s traits. Note, that Apple only includes the users email in the IDToken.  Supported providers are Apple Google
   * @return idToken
   */
  @javax.annotation.Nullable
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }


  public UpdateLoginFlowWithOidcMethod idTokenNonce(String idTokenNonce) {
    this.idTokenNonce = idTokenNonce;
    return this;
  }

  /**
   * IDTokenNonce is the nonce, used when generating the IDToken. If the provider supports nonce validation, the nonce will be validated against this value and required.
   * @return idTokenNonce
   */
  @javax.annotation.Nullable
  public String getIdTokenNonce() {
    return idTokenNonce;
  }

  public void setIdTokenNonce(String idTokenNonce) {
    this.idTokenNonce = idTokenNonce;
  }


  public UpdateLoginFlowWithOidcMethod method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Method to use  This field must be set to &#x60;oidc&#x60; when using the oidc method.
   * @return method
   */
  @javax.annotation.Nonnull
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  public UpdateLoginFlowWithOidcMethod provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * The provider to register with
   * @return provider
   */
  @javax.annotation.Nonnull
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  public UpdateLoginFlowWithOidcMethod traits(Object traits) {
    this.traits = traits;
    return this;
  }

  /**
   * The identity traits. This is a placeholder for the registration flow.
   * @return traits
   */
  @javax.annotation.Nullable
  public Object getTraits() {
    return traits;
  }

  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public UpdateLoginFlowWithOidcMethod transientPayload(Object transientPayload) {
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


  public UpdateLoginFlowWithOidcMethod upstreamParameters(Object upstreamParameters) {
    this.upstreamParameters = upstreamParameters;
    return this;
  }

  /**
   * UpstreamParameters are the parameters that are passed to the upstream identity provider.  These parameters are optional and depend on what the upstream identity provider supports. Supported parameters are: &#x60;login_hint&#x60; (string): The &#x60;login_hint&#x60; parameter suppresses the account chooser and either pre-fills the email box on the sign-in form, or selects the proper session. &#x60;hd&#x60; (string): The &#x60;hd&#x60; parameter limits the login/registration process to a Google Organization, e.g. &#x60;mycollege.edu&#x60;. &#x60;prompt&#x60; (string): The &#x60;prompt&#x60; specifies whether the Authorization Server prompts the End-User for reauthentication and consent, e.g. &#x60;select_account&#x60;.
   * @return upstreamParameters
   */
  @javax.annotation.Nullable
  public Object getUpstreamParameters() {
    return upstreamParameters;
  }

  public void setUpstreamParameters(Object upstreamParameters) {
    this.upstreamParameters = upstreamParameters;
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
   * @return the UpdateLoginFlowWithOidcMethod instance itself
   */
  public UpdateLoginFlowWithOidcMethod putAdditionalProperty(String key, Object value) {
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
    UpdateLoginFlowWithOidcMethod updateLoginFlowWithOidcMethod = (UpdateLoginFlowWithOidcMethod) o;
    return Objects.equals(this.csrfToken, updateLoginFlowWithOidcMethod.csrfToken) &&
        Objects.equals(this.idToken, updateLoginFlowWithOidcMethod.idToken) &&
        Objects.equals(this.idTokenNonce, updateLoginFlowWithOidcMethod.idTokenNonce) &&
        Objects.equals(this.method, updateLoginFlowWithOidcMethod.method) &&
        Objects.equals(this.provider, updateLoginFlowWithOidcMethod.provider) &&
        Objects.equals(this.traits, updateLoginFlowWithOidcMethod.traits) &&
        Objects.equals(this.transientPayload, updateLoginFlowWithOidcMethod.transientPayload) &&
        Objects.equals(this.upstreamParameters, updateLoginFlowWithOidcMethod.upstreamParameters)&&
        Objects.equals(this.additionalProperties, updateLoginFlowWithOidcMethod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, idToken, idTokenNonce, method, provider, traits, transientPayload, upstreamParameters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLoginFlowWithOidcMethod {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    idTokenNonce: ").append(toIndentedString(idTokenNonce)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    transientPayload: ").append(toIndentedString(transientPayload)).append("\n");
    sb.append("    upstreamParameters: ").append(toIndentedString(upstreamParameters)).append("\n");
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
    openapiFields.add("id_token");
    openapiFields.add("id_token_nonce");
    openapiFields.add("method");
    openapiFields.add("provider");
    openapiFields.add("traits");
    openapiFields.add("transient_payload");
    openapiFields.add("upstream_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("provider");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateLoginFlowWithOidcMethod
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLoginFlowWithOidcMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLoginFlowWithOidcMethod is not found in the empty JSON string", UpdateLoginFlowWithOidcMethod.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateLoginFlowWithOidcMethod.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonNull()) && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if ((jsonObj.get("id_token") != null && !jsonObj.get("id_token").isJsonNull()) && !jsonObj.get("id_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_token").toString()));
      }
      if ((jsonObj.get("id_token_nonce") != null && !jsonObj.get("id_token_nonce").isJsonNull()) && !jsonObj.get("id_token_nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_token_nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_token_nonce").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (!jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLoginFlowWithOidcMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLoginFlowWithOidcMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLoginFlowWithOidcMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginFlowWithOidcMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLoginFlowWithOidcMethod>() {
           @Override
           public void write(JsonWriter out, UpdateLoginFlowWithOidcMethod value) throws IOException {
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
           public UpdateLoginFlowWithOidcMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UpdateLoginFlowWithOidcMethod instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UpdateLoginFlowWithOidcMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateLoginFlowWithOidcMethod
   * @throws IOException if the JSON string is invalid with respect to UpdateLoginFlowWithOidcMethod
   */
  public static UpdateLoginFlowWithOidcMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLoginFlowWithOidcMethod.class);
  }

  /**
   * Convert an instance of UpdateLoginFlowWithOidcMethod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

