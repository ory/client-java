/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.3
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * A JSONPatch document as defined by RFC 6902
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T11:58:14.260098998Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class JsonPatch {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  /**
   * The operation to be performed. One of \&quot;add\&quot;, \&quot;remove\&quot;, \&quot;replace\&quot;, \&quot;move\&quot;, \&quot;copy\&quot;, or \&quot;test\&quot;.
   */
  @JsonAdapter(OpEnum.Adapter.class)
  public enum OpEnum {
    ADD("add"),
    
    REMOVE("remove"),
    
    REPLACE("replace"),
    
    MOVE("move"),
    
    COPY("copy"),
    
    TEST("test");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OpEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OpEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OpEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  private OpEnum op;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public JsonPatch() {
  }

  public JsonPatch from(String from) {
    this.from = from;
    return this;
  }

  /**
   * This field is used together with operation \&quot;move\&quot; and uses JSON Pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
   * @return from
   */
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }


  public JsonPatch op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * The operation to be performed. One of \&quot;add\&quot;, \&quot;remove\&quot;, \&quot;replace\&quot;, \&quot;move\&quot;, \&quot;copy\&quot;, or \&quot;test\&quot;.
   * @return op
   */
  @javax.annotation.Nonnull
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }


  public JsonPatch path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path to the target path. Uses JSON pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
   * @return path
   */
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public JsonPatch value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The value to be used within the operations.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
   * @return value
   */
  @javax.annotation.Nullable
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
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
   * @return the JsonPatch instance itself
   */
  public JsonPatch putAdditionalProperty(String key, Object value) {
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
    JsonPatch jsonPatch = (JsonPatch) o;
    return Objects.equals(this.from, jsonPatch.from) &&
        Objects.equals(this.op, jsonPatch.op) &&
        Objects.equals(this.path, jsonPatch.path) &&
        Objects.equals(this.value, jsonPatch.value)&&
        Objects.equals(this.additionalProperties, jsonPatch.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, op, path, value, additionalProperties);
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
    sb.append("class JsonPatch {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("op");
    openapiFields.add("path");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("op");
    openapiRequiredFields.add("path");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JsonPatch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JsonPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JsonPatch is not found in the empty JSON string", JsonPatch.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JsonPatch.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if (!jsonObj.get("op").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `op` to be a primitive type in the JSON string but got `%s`", jsonObj.get("op").toString()));
      }
      // validate the required field `op`
      OpEnum.validateJsonElement(jsonObj.get("op"));
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JsonPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JsonPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JsonPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JsonPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<JsonPatch>() {
           @Override
           public void write(JsonWriter out, JsonPatch value) throws IOException {
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
           public JsonPatch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             JsonPatch instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of JsonPatch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JsonPatch
   * @throws IOException if the JSON string is invalid with respect to JsonPatch
   */
  public static JsonPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonPatch.class);
  }

  /**
   * Convert an instance of JsonPatch to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

