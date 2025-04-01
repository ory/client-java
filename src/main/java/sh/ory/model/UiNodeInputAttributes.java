/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.20.2
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
import sh.ory.model.UiText;

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
 * InputAttributes represents the attributes of an input node
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T15:51:38.282386477Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class UiNodeInputAttributes {
  /**
   * The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode
   */
  @JsonAdapter(AutocompleteEnum.Adapter.class)
  public enum AutocompleteEnum {
    EMAIL("email"),
    
    TEL("tel"),
    
    URL("url"),
    
    CURRENT_PASSWORD("current-password"),
    
    NEW_PASSWORD("new-password"),
    
    ONE_TIME_CODE("one-time-code");

    private String value;

    AutocompleteEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutocompleteEnum fromValue(String value) {
      for (AutocompleteEnum b : AutocompleteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AutocompleteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutocompleteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutocompleteEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AutocompleteEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AutocompleteEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AUTOCOMPLETE = "autocomplete";
  @SerializedName(SERIALIZED_NAME_AUTOCOMPLETE)
  private AutocompleteEnum autocomplete;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private UiText label;

  public static final String SERIALIZED_NAME_MAXLENGTH = "maxlength";
  @SerializedName(SERIALIZED_NAME_MAXLENGTH)
  private Long maxlength;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * NodeType represents this node&#39;s types. It is a mirror of &#x60;node.type&#x60; and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \&quot;input\&quot;. text Text input Input img Image a Anchor script Script div Division
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    TEXT("text"),
    
    INPUT("input"),
    
    IMG("img"),
    
    A("a"),
    
    SCRIPT("script"),
    
    DIV("div");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NodeTypeEnum fromValue(String value) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NodeTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NodeTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NODE_TYPE = "node_type";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE)
  private NodeTypeEnum nodeType;

  public static final String SERIALIZED_NAME_ONCLICK = "onclick";
  @SerializedName(SERIALIZED_NAME_ONCLICK)
  private String onclick;

  /**
   * OnClickTrigger may contain a WebAuthn trigger which should be executed on click.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
   */
  @JsonAdapter(OnclickTriggerEnum.Adapter.class)
  public enum OnclickTriggerEnum {
    ORY_WEB_AUTHN_REGISTRATION("oryWebAuthnRegistration"),
    
    ORY_WEB_AUTHN_LOGIN("oryWebAuthnLogin"),
    
    ORY_PASSKEY_LOGIN("oryPasskeyLogin"),
    
    ORY_PASSKEY_LOGIN_AUTOCOMPLETE_INIT("oryPasskeyLoginAutocompleteInit"),
    
    ORY_PASSKEY_REGISTRATION("oryPasskeyRegistration"),
    
    ORY_PASSKEY_SETTINGS_REGISTRATION("oryPasskeySettingsRegistration");

    private String value;

    OnclickTriggerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OnclickTriggerEnum fromValue(String value) {
      for (OnclickTriggerEnum b : OnclickTriggerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OnclickTriggerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnclickTriggerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnclickTriggerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OnclickTriggerEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OnclickTriggerEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ONCLICK_TRIGGER = "onclickTrigger";
  @SerializedName(SERIALIZED_NAME_ONCLICK_TRIGGER)
  private OnclickTriggerEnum onclickTrigger;

  public static final String SERIALIZED_NAME_ONLOAD = "onload";
  @SerializedName(SERIALIZED_NAME_ONLOAD)
  private String onload;

  /**
   * OnLoadTrigger may contain a WebAuthn trigger which should be executed on load.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
   */
  @JsonAdapter(OnloadTriggerEnum.Adapter.class)
  public enum OnloadTriggerEnum {
    ORY_WEB_AUTHN_REGISTRATION("oryWebAuthnRegistration"),
    
    ORY_WEB_AUTHN_LOGIN("oryWebAuthnLogin"),
    
    ORY_PASSKEY_LOGIN("oryPasskeyLogin"),
    
    ORY_PASSKEY_LOGIN_AUTOCOMPLETE_INIT("oryPasskeyLoginAutocompleteInit"),
    
    ORY_PASSKEY_REGISTRATION("oryPasskeyRegistration"),
    
    ORY_PASSKEY_SETTINGS_REGISTRATION("oryPasskeySettingsRegistration");

    private String value;

    OnloadTriggerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OnloadTriggerEnum fromValue(String value) {
      for (OnloadTriggerEnum b : OnloadTriggerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OnloadTriggerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnloadTriggerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnloadTriggerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OnloadTriggerEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OnloadTriggerEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ONLOAD_TRIGGER = "onloadTrigger";
  @SerializedName(SERIALIZED_NAME_ONLOAD_TRIGGER)
  private OnloadTriggerEnum onloadTrigger;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  /**
   * The input&#39;s element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("text"),
    
    PASSWORD("password"),
    
    NUMBER("number"),
    
    CHECKBOX("checkbox"),
    
    HIDDEN("hidden"),
    
    EMAIL("email"),
    
    TEL("tel"),
    
    SUBMIT("submit"),
    
    BUTTON("button"),
    
    DATETIME_LOCAL("datetime-local"),
    
    DATE("date"),
    
    URL("url");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public UiNodeInputAttributes() {
  }

  public UiNodeInputAttributes autocomplete(AutocompleteEnum autocomplete) {
    this.autocomplete = autocomplete;
    return this;
  }

  /**
   * The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode
   * @return autocomplete
   */
  @javax.annotation.Nullable
  public AutocompleteEnum getAutocomplete() {
    return autocomplete;
  }

  public void setAutocomplete(AutocompleteEnum autocomplete) {
    this.autocomplete = autocomplete;
  }


  public UiNodeInputAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Sets the input&#39;s disabled field to true or false.
   * @return disabled
   */
  @javax.annotation.Nonnull
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public UiNodeInputAttributes label(UiText label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public UiText getLabel() {
    return label;
  }

  public void setLabel(UiText label) {
    this.label = label;
  }


  public UiNodeInputAttributes maxlength(Long maxlength) {
    this.maxlength = maxlength;
    return this;
  }

  /**
   * MaxLength may contain the input&#39;s maximum length.
   * @return maxlength
   */
  @javax.annotation.Nullable
  public Long getMaxlength() {
    return maxlength;
  }

  public void setMaxlength(Long maxlength) {
    this.maxlength = maxlength;
  }


  public UiNodeInputAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The input&#39;s element name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UiNodeInputAttributes nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * NodeType represents this node&#39;s types. It is a mirror of &#x60;node.type&#x60; and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \&quot;input\&quot;. text Text input Input img Image a Anchor script Script div Division
   * @return nodeType
   */
  @javax.annotation.Nonnull
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }


  public UiNodeInputAttributes onclick(String onclick) {
    this.onclick = onclick;
    return this;
  }

  /**
   * OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.  Deprecated: Using OnClick requires the use of eval() which is a security risk. Use OnClickTrigger instead.
   * @return onclick
   */
  @javax.annotation.Nullable
  public String getOnclick() {
    return onclick;
  }

  public void setOnclick(String onclick) {
    this.onclick = onclick;
  }


  public UiNodeInputAttributes onclickTrigger(OnclickTriggerEnum onclickTrigger) {
    this.onclickTrigger = onclickTrigger;
    return this;
  }

  /**
   * OnClickTrigger may contain a WebAuthn trigger which should be executed on click.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
   * @return onclickTrigger
   */
  @javax.annotation.Nullable
  public OnclickTriggerEnum getOnclickTrigger() {
    return onclickTrigger;
  }

  public void setOnclickTrigger(OnclickTriggerEnum onclickTrigger) {
    this.onclickTrigger = onclickTrigger;
  }


  public UiNodeInputAttributes onload(String onload) {
    this.onload = onload;
    return this;
  }

  /**
   * OnLoad may contain javascript which should be executed on load. This is primarily used for WebAuthn.  Deprecated: Using OnLoad requires the use of eval() which is a security risk. Use OnLoadTrigger instead.
   * @return onload
   */
  @javax.annotation.Nullable
  public String getOnload() {
    return onload;
  }

  public void setOnload(String onload) {
    this.onload = onload;
  }


  public UiNodeInputAttributes onloadTrigger(OnloadTriggerEnum onloadTrigger) {
    this.onloadTrigger = onloadTrigger;
    return this;
  }

  /**
   * OnLoadTrigger may contain a WebAuthn trigger which should be executed on load.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
   * @return onloadTrigger
   */
  @javax.annotation.Nullable
  public OnloadTriggerEnum getOnloadTrigger() {
    return onloadTrigger;
  }

  public void setOnloadTrigger(OnloadTriggerEnum onloadTrigger) {
    this.onloadTrigger = onloadTrigger;
  }


  public UiNodeInputAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * The input&#39;s pattern.
   * @return pattern
   */
  @javax.annotation.Nullable
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public UiNodeInputAttributes required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Mark this input field as required.
   * @return required
   */
  @javax.annotation.Nullable
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  public UiNodeInputAttributes type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The input&#39;s element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public UiNodeInputAttributes value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The input&#39;s value.
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
   * @return the UiNodeInputAttributes instance itself
   */
  public UiNodeInputAttributes putAdditionalProperty(String key, Object value) {
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
    UiNodeInputAttributes uiNodeInputAttributes = (UiNodeInputAttributes) o;
    return Objects.equals(this.autocomplete, uiNodeInputAttributes.autocomplete) &&
        Objects.equals(this.disabled, uiNodeInputAttributes.disabled) &&
        Objects.equals(this.label, uiNodeInputAttributes.label) &&
        Objects.equals(this.maxlength, uiNodeInputAttributes.maxlength) &&
        Objects.equals(this.name, uiNodeInputAttributes.name) &&
        Objects.equals(this.nodeType, uiNodeInputAttributes.nodeType) &&
        Objects.equals(this.onclick, uiNodeInputAttributes.onclick) &&
        Objects.equals(this.onclickTrigger, uiNodeInputAttributes.onclickTrigger) &&
        Objects.equals(this.onload, uiNodeInputAttributes.onload) &&
        Objects.equals(this.onloadTrigger, uiNodeInputAttributes.onloadTrigger) &&
        Objects.equals(this.pattern, uiNodeInputAttributes.pattern) &&
        Objects.equals(this.required, uiNodeInputAttributes.required) &&
        Objects.equals(this.type, uiNodeInputAttributes.type) &&
        Objects.equals(this.value, uiNodeInputAttributes.value)&&
        Objects.equals(this.additionalProperties, uiNodeInputAttributes.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(autocomplete, disabled, label, maxlength, name, nodeType, onclick, onclickTrigger, onload, onloadTrigger, pattern, required, type, value, additionalProperties);
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
    sb.append("class UiNodeInputAttributes {\n");
    sb.append("    autocomplete: ").append(toIndentedString(autocomplete)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    maxlength: ").append(toIndentedString(maxlength)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    onclick: ").append(toIndentedString(onclick)).append("\n");
    sb.append("    onclickTrigger: ").append(toIndentedString(onclickTrigger)).append("\n");
    sb.append("    onload: ").append(toIndentedString(onload)).append("\n");
    sb.append("    onloadTrigger: ").append(toIndentedString(onloadTrigger)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("autocomplete");
    openapiFields.add("disabled");
    openapiFields.add("label");
    openapiFields.add("maxlength");
    openapiFields.add("name");
    openapiFields.add("node_type");
    openapiFields.add("onclick");
    openapiFields.add("onclickTrigger");
    openapiFields.add("onload");
    openapiFields.add("onloadTrigger");
    openapiFields.add("pattern");
    openapiFields.add("required");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("disabled");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("node_type");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UiNodeInputAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UiNodeInputAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UiNodeInputAttributes is not found in the empty JSON string", UiNodeInputAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UiNodeInputAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("autocomplete") != null && !jsonObj.get("autocomplete").isJsonNull()) && !jsonObj.get("autocomplete").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autocomplete` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autocomplete").toString()));
      }
      // validate the optional field `autocomplete`
      if (jsonObj.get("autocomplete") != null && !jsonObj.get("autocomplete").isJsonNull()) {
        AutocompleteEnum.validateJsonElement(jsonObj.get("autocomplete"));
      }
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        UiText.validateJsonElement(jsonObj.get("label"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("node_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_type").toString()));
      }
      // validate the required field `node_type`
      NodeTypeEnum.validateJsonElement(jsonObj.get("node_type"));
      if ((jsonObj.get("onclick") != null && !jsonObj.get("onclick").isJsonNull()) && !jsonObj.get("onclick").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onclick` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onclick").toString()));
      }
      if ((jsonObj.get("onclickTrigger") != null && !jsonObj.get("onclickTrigger").isJsonNull()) && !jsonObj.get("onclickTrigger").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onclickTrigger` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onclickTrigger").toString()));
      }
      // validate the optional field `onclickTrigger`
      if (jsonObj.get("onclickTrigger") != null && !jsonObj.get("onclickTrigger").isJsonNull()) {
        OnclickTriggerEnum.validateJsonElement(jsonObj.get("onclickTrigger"));
      }
      if ((jsonObj.get("onload") != null && !jsonObj.get("onload").isJsonNull()) && !jsonObj.get("onload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onload").toString()));
      }
      if ((jsonObj.get("onloadTrigger") != null && !jsonObj.get("onloadTrigger").isJsonNull()) && !jsonObj.get("onloadTrigger").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onloadTrigger` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onloadTrigger").toString()));
      }
      // validate the optional field `onloadTrigger`
      if (jsonObj.get("onloadTrigger") != null && !jsonObj.get("onloadTrigger").isJsonNull()) {
        OnloadTriggerEnum.validateJsonElement(jsonObj.get("onloadTrigger"));
      }
      if ((jsonObj.get("pattern") != null && !jsonObj.get("pattern").isJsonNull()) && !jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UiNodeInputAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UiNodeInputAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UiNodeInputAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UiNodeInputAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UiNodeInputAttributes>() {
           @Override
           public void write(JsonWriter out, UiNodeInputAttributes value) throws IOException {
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
           public UiNodeInputAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             UiNodeInputAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of UiNodeInputAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UiNodeInputAttributes
   * @throws IOException if the JSON string is invalid with respect to UiNodeInputAttributes
   */
  public static UiNodeInputAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UiNodeInputAttributes.class);
  }

  /**
   * Convert an instance of UiNodeInputAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

