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
 * GenericUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-22T13:18:59.927245844Z[Etc/UTC]")
public class GenericUsage {
  public static final String SERIALIZED_NAME_ADDITIONAL_PRICE = "additional_price";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PRICE)
  private Long additionalPrice;

  public static final String SERIALIZED_NAME_INCLUDED_USAGE = "included_usage";
  @SerializedName(SERIALIZED_NAME_INCLUDED_USAGE)
  private Long includedUsage;

  public GenericUsage() {
  }

  public GenericUsage additionalPrice(Long additionalPrice) {
    
    this.additionalPrice = additionalPrice;
    return this;
  }

   /**
   * AdditionalPrice is the price per-unit exceeding IncludedUsage. A price of 0 means that no other items can be consumed.
   * @return additionalPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "AdditionalPrice is the price per-unit exceeding IncludedUsage. A price of 0 means that no other items can be consumed.")

  public Long getAdditionalPrice() {
    return additionalPrice;
  }


  public void setAdditionalPrice(Long additionalPrice) {
    this.additionalPrice = additionalPrice;
  }


  public GenericUsage includedUsage(Long includedUsage) {
    
    this.includedUsage = includedUsage;
    return this;
  }

   /**
   * IncludedUsage is the number of included items.
   * @return includedUsage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IncludedUsage is the number of included items.")

  public Long getIncludedUsage() {
    return includedUsage;
  }


  public void setIncludedUsage(Long includedUsage) {
    this.includedUsage = includedUsage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericUsage genericUsage = (GenericUsage) o;
    return Objects.equals(this.additionalPrice, genericUsage.additionalPrice) &&
        Objects.equals(this.includedUsage, genericUsage.includedUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPrice, includedUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericUsage {\n");
    sb.append("    additionalPrice: ").append(toIndentedString(additionalPrice)).append("\n");
    sb.append("    includedUsage: ").append(toIndentedString(includedUsage)).append("\n");
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
    openapiFields.add("additional_price");
    openapiFields.add("included_usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("additional_price");
    openapiRequiredFields.add("included_usage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenericUsage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GenericUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenericUsage is not found in the empty JSON string", GenericUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenericUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenericUsage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenericUsage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericUsage>() {
           @Override
           public void write(JsonWriter out, GenericUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericUsage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenericUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenericUsage
  * @throws IOException if the JSON string is invalid with respect to GenericUsage
  */
  public static GenericUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenericUsage.class);
  }

 /**
  * Convert an instance of GenericUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

