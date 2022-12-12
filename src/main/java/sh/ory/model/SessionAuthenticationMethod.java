/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.0
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
import sh.ory.model.AuthenticatorAssuranceLevel;

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
 * A singular authenticator used during authentication / login.
 */
@ApiModel(description = "A singular authenticator used during authentication / login.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T09:17:11.733875213Z[Etc/UTC]")
public class SessionAuthenticationMethod {
  public static final String SERIALIZED_NAME_AAL = "aal";
  @SerializedName(SERIALIZED_NAME_AAL)
  private AuthenticatorAssuranceLevel aal;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    LINK_RECOVERY("link_recovery"),
    
    CODE_RECOVERY("code_recovery"),
    
    PASSWORD("password"),
    
    TOTP("totp"),
    
    OIDC("oidc"),
    
    WEBAUTHN("webauthn"),
    
    LOOKUP_SECRET("lookup_secret"),
    
    V0_6_LEGACY_SESSION("v0.6_legacy_session");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public SessionAuthenticationMethod() {
  }

  public SessionAuthenticationMethod aal(AuthenticatorAssuranceLevel aal) {
    
    this.aal = aal;
    return this;
  }

   /**
   * Get aal
   * @return aal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthenticatorAssuranceLevel getAal() {
    return aal;
  }


  public void setAal(AuthenticatorAssuranceLevel aal) {
    this.aal = aal;
  }


  public SessionAuthenticationMethod completedAt(OffsetDateTime completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * When the authentication challenge was completed.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the authentication challenge was completed.")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public SessionAuthenticationMethod method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionAuthenticationMethod sessionAuthenticationMethod = (SessionAuthenticationMethod) o;
    return Objects.equals(this.aal, sessionAuthenticationMethod.aal) &&
        Objects.equals(this.completedAt, sessionAuthenticationMethod.completedAt) &&
        Objects.equals(this.method, sessionAuthenticationMethod.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aal, completedAt, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionAuthenticationMethod {\n");
    sb.append("    aal: ").append(toIndentedString(aal)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
    openapiFields.add("aal");
    openapiFields.add("completed_at");
    openapiFields.add("method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SessionAuthenticationMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SessionAuthenticationMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SessionAuthenticationMethod is not found in the empty JSON string", SessionAuthenticationMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SessionAuthenticationMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SessionAuthenticationMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SessionAuthenticationMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SessionAuthenticationMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SessionAuthenticationMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SessionAuthenticationMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<SessionAuthenticationMethod>() {
           @Override
           public void write(JsonWriter out, SessionAuthenticationMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SessionAuthenticationMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SessionAuthenticationMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionAuthenticationMethod
  * @throws IOException if the JSON string is invalid with respect to SessionAuthenticationMethod
  */
  public static SessionAuthenticationMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionAuthenticationMethod.class);
  }

 /**
  * Convert an instance of SessionAuthenticationMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

