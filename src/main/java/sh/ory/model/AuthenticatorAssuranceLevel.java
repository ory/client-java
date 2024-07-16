/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The authenticator assurance level can be one of \&quot;aal1\&quot;, \&quot;aal2\&quot;, or \&quot;aal3\&quot;. A higher number means that it is harder for an attacker to compromise the account.  Generally, \&quot;aal1\&quot; implies that one authentication factor was used while AAL2 implies that two factors (e.g. password + TOTP) have been used.  To learn more about these levels please head over to: https://www.ory.sh/kratos/docs/concepts/credentials
 */
@JsonAdapter(AuthenticatorAssuranceLevel.Adapter.class)
public enum AuthenticatorAssuranceLevel {
  
  AAL0("aal0"),
  
  AAL1("aal1"),
  
  AAL2("aal2"),
  
  AAL3("aal3");

  private String value;

  AuthenticatorAssuranceLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AuthenticatorAssuranceLevel fromValue(String value) {
    for (AuthenticatorAssuranceLevel b : AuthenticatorAssuranceLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AuthenticatorAssuranceLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final AuthenticatorAssuranceLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AuthenticatorAssuranceLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AuthenticatorAssuranceLevel.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AuthenticatorAssuranceLevel.fromValue(value);
  }
}

