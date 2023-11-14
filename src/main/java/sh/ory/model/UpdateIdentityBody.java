/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.3.0
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
import sh.ory.model.IdentityState;
import sh.ory.model.IdentityWithCredentials;

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
 * Update Identity Body
 */
@ApiModel(description = "Update Identity Body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T12:40:48.136460218Z[Etc/UTC]")
public class UpdateIdentityBody {
  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private IdentityWithCredentials credentials;

  public static final String SERIALIZED_NAME_METADATA_ADMIN = "metadata_admin";
  @SerializedName(SERIALIZED_NAME_METADATA_ADMIN)
  private Object metadataAdmin = null;

  public static final String SERIALIZED_NAME_METADATA_PUBLIC = "metadata_public";
  @SerializedName(SERIALIZED_NAME_METADATA_PUBLIC)
  private Object metadataPublic = null;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private IdentityState state;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public UpdateIdentityBody() {
  }

  public UpdateIdentityBody credentials(IdentityWithCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityWithCredentials getCredentials() {
    return credentials;
  }


  public void setCredentials(IdentityWithCredentials credentials) {
    this.credentials = credentials;
  }


  public UpdateIdentityBody metadataAdmin(Object metadataAdmin) {
    
    this.metadataAdmin = metadataAdmin;
    return this;
  }

   /**
   * Store metadata about the user which is only accessible through admin APIs such as &#x60;GET /admin/identities/&lt;id&gt;&#x60;.
   * @return metadataAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Store metadata about the user which is only accessible through admin APIs such as `GET /admin/identities/<id>`.")

  public Object getMetadataAdmin() {
    return metadataAdmin;
  }


  public void setMetadataAdmin(Object metadataAdmin) {
    this.metadataAdmin = metadataAdmin;
  }


  public UpdateIdentityBody metadataPublic(Object metadataPublic) {
    
    this.metadataPublic = metadataPublic;
    return this;
  }

   /**
   * Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
   * @return metadataPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.")

  public Object getMetadataPublic() {
    return metadataPublic;
  }


  public void setMetadataPublic(Object metadataPublic) {
    this.metadataPublic = metadataPublic;
  }


  public UpdateIdentityBody schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits. If set will update the Identity&#39;s SchemaID.
   * @return schemaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SchemaID is the ID of the JSON Schema to be used for validating the identity's traits. If set will update the Identity's SchemaID.")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public UpdateIdentityBody state(IdentityState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IdentityState getState() {
    return state;
  }


  public void setState(IdentityState state) {
    this.state = state;
  }


  public UpdateIdentityBody traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_id&#x60;.
   * @return traits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_id`.")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
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
   * @return the UpdateIdentityBody instance itself
   */
  public UpdateIdentityBody putAdditionalProperty(String key, Object value) {
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
    UpdateIdentityBody updateIdentityBody = (UpdateIdentityBody) o;
    return Objects.equals(this.credentials, updateIdentityBody.credentials) &&
        Objects.equals(this.metadataAdmin, updateIdentityBody.metadataAdmin) &&
        Objects.equals(this.metadataPublic, updateIdentityBody.metadataPublic) &&
        Objects.equals(this.schemaId, updateIdentityBody.schemaId) &&
        Objects.equals(this.state, updateIdentityBody.state) &&
        Objects.equals(this.traits, updateIdentityBody.traits)&&
        Objects.equals(this.additionalProperties, updateIdentityBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, metadataAdmin, metadataPublic, schemaId, state, traits, additionalProperties);
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
    sb.append("class UpdateIdentityBody {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    metadataAdmin: ").append(toIndentedString(metadataAdmin)).append("\n");
    sb.append("    metadataPublic: ").append(toIndentedString(metadataPublic)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
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
    openapiFields.add("credentials");
    openapiFields.add("metadata_admin");
    openapiFields.add("metadata_public");
    openapiFields.add("schema_id");
    openapiFields.add("state");
    openapiFields.add("traits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schema_id");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("traits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateIdentityBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateIdentityBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateIdentityBody is not found in the empty JSON string", UpdateIdentityBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateIdentityBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `credentials`
      if (jsonObj.get("credentials") != null && !jsonObj.get("credentials").isJsonNull()) {
        IdentityWithCredentials.validateJsonObject(jsonObj.getAsJsonObject("credentials"));
      }
      if (!jsonObj.get("schema_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateIdentityBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateIdentityBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateIdentityBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateIdentityBody.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateIdentityBody>() {
           @Override
           public void write(JsonWriter out, UpdateIdentityBody value) throws IOException {
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
           public UpdateIdentityBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateIdentityBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateIdentityBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateIdentityBody
  * @throws IOException if the JSON string is invalid with respect to UpdateIdentityBody
  */
  public static UpdateIdentityBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateIdentityBody.class);
  }

 /**
  * Convert an instance of UpdateIdentityBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

