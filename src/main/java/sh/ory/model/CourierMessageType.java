/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.46
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * It can either be &#x60;email&#x60; or &#x60;phone&#x60;
 */
@JsonAdapter(CourierMessageType.Adapter.class)
public enum CourierMessageType {
  
  EMAIL("email"),
  
  PHONE("phone");

  private String value;

  CourierMessageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CourierMessageType fromValue(String value) {
    for (CourierMessageType b : CourierMessageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CourierMessageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CourierMessageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CourierMessageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CourierMessageType.fromValue(value);
    }
  }
}

