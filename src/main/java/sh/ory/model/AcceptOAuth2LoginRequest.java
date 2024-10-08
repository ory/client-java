/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.15.6
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * AcceptOAuth2LoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-08T09:23:17.065376539Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class AcceptOAuth2LoginRequest {
  public static final String SERIALIZED_NAME_ACR = "acr";
  @SerializedName(SERIALIZED_NAME_ACR)
  private String acr;

  public static final String SERIALIZED_NAME_AMR = "amr";
  @SerializedName(SERIALIZED_NAME_AMR)
  private List<String> amr = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Object context;

  public static final String SERIALIZED_NAME_EXTEND_SESSION_LIFESPAN = "extend_session_lifespan";
  @SerializedName(SERIALIZED_NAME_EXTEND_SESSION_LIFESPAN)
  private Boolean extendSessionLifespan;

  public static final String SERIALIZED_NAME_FORCE_SUBJECT_IDENTIFIER = "force_subject_identifier";
  @SerializedName(SERIALIZED_NAME_FORCE_SUBJECT_IDENTIFIER)
  private String forceSubjectIdentifier;

  public static final String SERIALIZED_NAME_IDENTITY_PROVIDER_SESSION_ID = "identity_provider_session_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_PROVIDER_SESSION_ID)
  private String identityProviderSessionId;

  public static final String SERIALIZED_NAME_REMEMBER = "remember";
  @SerializedName(SERIALIZED_NAME_REMEMBER)
  private Boolean remember;

  public static final String SERIALIZED_NAME_REMEMBER_FOR = "remember_for";
  @SerializedName(SERIALIZED_NAME_REMEMBER_FOR)
  private Long rememberFor;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public AcceptOAuth2LoginRequest() {
  }

  public AcceptOAuth2LoginRequest acr(String acr) {
    this.acr = acr;
    return this;
  }

  /**
   * ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
   * @return acr
   */
  @javax.annotation.Nullable
  public String getAcr() {
    return acr;
  }

  public void setAcr(String acr) {
    this.acr = acr;
  }


  public AcceptOAuth2LoginRequest amr(List<String> amr) {
    this.amr = amr;
    return this;
  }

  public AcceptOAuth2LoginRequest addAmrItem(String amrItem) {
    if (this.amr == null) {
      this.amr = new ArrayList<>();
    }
    this.amr.add(amrItem);
    return this;
  }

  /**
   * Get amr
   * @return amr
   */
  @javax.annotation.Nullable
  public List<String> getAmr() {
    return amr;
  }

  public void setAmr(List<String> amr) {
    this.amr = amr;
  }


  public AcceptOAuth2LoginRequest context(Object context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @javax.annotation.Nullable
  public Object getContext() {
    return context;
  }

  public void setContext(Object context) {
    this.context = context;
  }


  public AcceptOAuth2LoginRequest extendSessionLifespan(Boolean extendSessionLifespan) {
    this.extendSessionLifespan = extendSessionLifespan;
    return this;
  }

  /**
   * Extend OAuth2 authentication session lifespan  If set to &#x60;true&#x60;, the OAuth2 authentication cookie lifespan is extended. This is for example useful if you want the user to be able to use &#x60;prompt&#x3D;none&#x60; continuously.  This value can only be set to &#x60;true&#x60; if the user has an authentication, which is the case if the &#x60;skip&#x60; value is &#x60;true&#x60;.
   * @return extendSessionLifespan
   */
  @javax.annotation.Nullable
  public Boolean getExtendSessionLifespan() {
    return extendSessionLifespan;
  }

  public void setExtendSessionLifespan(Boolean extendSessionLifespan) {
    this.extendSessionLifespan = extendSessionLifespan;
  }


  public AcceptOAuth2LoginRequest forceSubjectIdentifier(String forceSubjectIdentifier) {
    this.forceSubjectIdentifier = forceSubjectIdentifier;
    return this;
  }

  /**
   * ForceSubjectIdentifier forces the \&quot;pairwise\&quot; user ID of the end-user that authenticated. The \&quot;pairwise\&quot; user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\&quot;user\&quot;) identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if &#x60;pairwise&#x60; is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via &#x60;subject_type&#x60; key in the client&#39;s configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.
   * @return forceSubjectIdentifier
   */
  @javax.annotation.Nullable
  public String getForceSubjectIdentifier() {
    return forceSubjectIdentifier;
  }

  public void setForceSubjectIdentifier(String forceSubjectIdentifier) {
    this.forceSubjectIdentifier = forceSubjectIdentifier;
  }


  public AcceptOAuth2LoginRequest identityProviderSessionId(String identityProviderSessionId) {
    this.identityProviderSessionId = identityProviderSessionId;
    return this;
  }

  /**
   * IdentityProviderSessionID is the session ID of the end-user that authenticated. If specified, we will use this value to propagate the logout.
   * @return identityProviderSessionId
   */
  @javax.annotation.Nullable
  public String getIdentityProviderSessionId() {
    return identityProviderSessionId;
  }

  public void setIdentityProviderSessionId(String identityProviderSessionId) {
    this.identityProviderSessionId = identityProviderSessionId;
  }


  public AcceptOAuth2LoginRequest remember(Boolean remember) {
    this.remember = remember;
    return this;
  }

  /**
   * Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.
   * @return remember
   */
  @javax.annotation.Nullable
  public Boolean getRemember() {
    return remember;
  }

  public void setRemember(Boolean remember) {
    this.remember = remember;
  }


  public AcceptOAuth2LoginRequest rememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
    return this;
  }

  /**
   * RememberFor sets how long the authentication should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered for the duration of the browser session (using a session cookie).
   * @return rememberFor
   */
  @javax.annotation.Nullable
  public Long getRememberFor() {
    return rememberFor;
  }

  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }


  public AcceptOAuth2LoginRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject is the user ID of the end-user that authenticated.
   * @return subject
   */
  @javax.annotation.Nonnull
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
   * @return the AcceptOAuth2LoginRequest instance itself
   */
  public AcceptOAuth2LoginRequest putAdditionalProperty(String key, Object value) {
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
    AcceptOAuth2LoginRequest acceptOAuth2LoginRequest = (AcceptOAuth2LoginRequest) o;
    return Objects.equals(this.acr, acceptOAuth2LoginRequest.acr) &&
        Objects.equals(this.amr, acceptOAuth2LoginRequest.amr) &&
        Objects.equals(this.context, acceptOAuth2LoginRequest.context) &&
        Objects.equals(this.extendSessionLifespan, acceptOAuth2LoginRequest.extendSessionLifespan) &&
        Objects.equals(this.forceSubjectIdentifier, acceptOAuth2LoginRequest.forceSubjectIdentifier) &&
        Objects.equals(this.identityProviderSessionId, acceptOAuth2LoginRequest.identityProviderSessionId) &&
        Objects.equals(this.remember, acceptOAuth2LoginRequest.remember) &&
        Objects.equals(this.rememberFor, acceptOAuth2LoginRequest.rememberFor) &&
        Objects.equals(this.subject, acceptOAuth2LoginRequest.subject)&&
        Objects.equals(this.additionalProperties, acceptOAuth2LoginRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, amr, context, extendSessionLifespan, forceSubjectIdentifier, identityProviderSessionId, remember, rememberFor, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptOAuth2LoginRequest {\n");
    sb.append("    acr: ").append(toIndentedString(acr)).append("\n");
    sb.append("    amr: ").append(toIndentedString(amr)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    extendSessionLifespan: ").append(toIndentedString(extendSessionLifespan)).append("\n");
    sb.append("    forceSubjectIdentifier: ").append(toIndentedString(forceSubjectIdentifier)).append("\n");
    sb.append("    identityProviderSessionId: ").append(toIndentedString(identityProviderSessionId)).append("\n");
    sb.append("    remember: ").append(toIndentedString(remember)).append("\n");
    sb.append("    rememberFor: ").append(toIndentedString(rememberFor)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("acr");
    openapiFields.add("amr");
    openapiFields.add("context");
    openapiFields.add("extend_session_lifespan");
    openapiFields.add("force_subject_identifier");
    openapiFields.add("identity_provider_session_id");
    openapiFields.add("remember");
    openapiFields.add("remember_for");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subject");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AcceptOAuth2LoginRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AcceptOAuth2LoginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AcceptOAuth2LoginRequest is not found in the empty JSON string", AcceptOAuth2LoginRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AcceptOAuth2LoginRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("acr") != null && !jsonObj.get("acr").isJsonNull()) && !jsonObj.get("acr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acr").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("amr") != null && !jsonObj.get("amr").isJsonNull() && !jsonObj.get("amr").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `amr` to be an array in the JSON string but got `%s`", jsonObj.get("amr").toString()));
      }
      if ((jsonObj.get("force_subject_identifier") != null && !jsonObj.get("force_subject_identifier").isJsonNull()) && !jsonObj.get("force_subject_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `force_subject_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("force_subject_identifier").toString()));
      }
      if ((jsonObj.get("identity_provider_session_id") != null && !jsonObj.get("identity_provider_session_id").isJsonNull()) && !jsonObj.get("identity_provider_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_provider_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_provider_session_id").toString()));
      }
      if (!jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AcceptOAuth2LoginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AcceptOAuth2LoginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AcceptOAuth2LoginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AcceptOAuth2LoginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AcceptOAuth2LoginRequest>() {
           @Override
           public void write(JsonWriter out, AcceptOAuth2LoginRequest value) throws IOException {
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
           public AcceptOAuth2LoginRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AcceptOAuth2LoginRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of AcceptOAuth2LoginRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcceptOAuth2LoginRequest
   * @throws IOException if the JSON string is invalid with respect to AcceptOAuth2LoginRequest
   */
  public static AcceptOAuth2LoginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AcceptOAuth2LoginRequest.class);
  }

  /**
   * Convert an instance of AcceptOAuth2LoginRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

