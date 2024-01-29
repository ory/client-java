/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.5.2
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.CourierMessageStatus;
import sh.ory.model.CourierMessageType;
import sh.ory.model.MessageDispatch;

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
 * Message
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-29T17:23:41.282566484Z[Etc/UTC]")
public class Message {
  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DISPATCHES = "dispatches";
  @SerializedName(SERIALIZED_NAME_DISPATCHES)
  private List<MessageDispatch> dispatches = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_SEND_COUNT = "send_count";
  @SerializedName(SERIALIZED_NAME_SEND_COUNT)
  private Long sendCount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CourierMessageStatus status;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  /**
   *  recovery_invalid TypeRecoveryInvalid recovery_valid TypeRecoveryValid recovery_code_invalid TypeRecoveryCodeInvalid recovery_code_valid TypeRecoveryCodeValid verification_invalid TypeVerificationInvalid verification_valid TypeVerificationValid verification_code_invalid TypeVerificationCodeInvalid verification_code_valid TypeVerificationCodeValid stub TypeTestStub login_code_valid TypeLoginCodeValid registration_code_valid TypeRegistrationCodeValid
   */
  @JsonAdapter(TemplateTypeEnum.Adapter.class)
  public enum TemplateTypeEnum {
    RECOVERY_INVALID("recovery_invalid"),
    
    RECOVERY_VALID("recovery_valid"),
    
    RECOVERY_CODE_INVALID("recovery_code_invalid"),
    
    RECOVERY_CODE_VALID("recovery_code_valid"),
    
    VERIFICATION_INVALID("verification_invalid"),
    
    VERIFICATION_VALID("verification_valid"),
    
    VERIFICATION_CODE_INVALID("verification_code_invalid"),
    
    VERIFICATION_CODE_VALID("verification_code_valid"),
    
    STUB("stub"),
    
    LOGIN_CODE_VALID("login_code_valid"),
    
    REGISTRATION_CODE_VALID("registration_code_valid");

    private String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TemplateTypeEnum fromValue(String value) {
      for (TemplateTypeEnum b : TemplateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TemplateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TemplateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TemplateTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "template_type";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private TemplateTypeEnum templateType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CourierMessageType type;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Message() {
  }

  public Message body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public Message channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public Message createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * CreatedAt is a helper struct field for gobuffalo.pop.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "CreatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Message dispatches(List<MessageDispatch> dispatches) {
    
    this.dispatches = dispatches;
    return this;
  }

  public Message addDispatchesItem(MessageDispatch dispatchesItem) {
    if (this.dispatches == null) {
      this.dispatches = new ArrayList<>();
    }
    this.dispatches.add(dispatchesItem);
    return this;
  }

   /**
   * Dispatches store information about the attempts of delivering a message May contain an error if any happened, or just the &#x60;success&#x60; state.
   * @return dispatches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dispatches store information about the attempts of delivering a message May contain an error if any happened, or just the `success` state.")

  public List<MessageDispatch> getDispatches() {
    return dispatches;
  }


  public void setDispatches(List<MessageDispatch> dispatches) {
    this.dispatches = dispatches;
  }


  public Message id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Message recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public Message sendCount(Long sendCount) {
    
    this.sendCount = sendCount;
    return this;
  }

   /**
   * Get sendCount
   * @return sendCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSendCount() {
    return sendCount;
  }


  public void setSendCount(Long sendCount) {
    this.sendCount = sendCount;
  }


  public Message status(CourierMessageStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CourierMessageStatus getStatus() {
    return status;
  }


  public void setStatus(CourierMessageStatus status) {
    this.status = status;
  }


  public Message subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Message templateType(TemplateTypeEnum templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   *  recovery_invalid TypeRecoveryInvalid recovery_valid TypeRecoveryValid recovery_code_invalid TypeRecoveryCodeInvalid recovery_code_valid TypeRecoveryCodeValid verification_invalid TypeVerificationInvalid verification_valid TypeVerificationValid verification_code_invalid TypeVerificationCodeInvalid verification_code_valid TypeVerificationCodeValid stub TypeTestStub login_code_valid TypeLoginCodeValid registration_code_valid TypeRegistrationCodeValid
   * @return templateType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " recovery_invalid TypeRecoveryInvalid recovery_valid TypeRecoveryValid recovery_code_invalid TypeRecoveryCodeInvalid recovery_code_valid TypeRecoveryCodeValid verification_invalid TypeVerificationInvalid verification_valid TypeVerificationValid verification_code_invalid TypeVerificationCodeInvalid verification_code_valid TypeVerificationCodeValid stub TypeTestStub login_code_valid TypeLoginCodeValid registration_code_valid TypeRegistrationCodeValid")

  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }


  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }


  public Message type(CourierMessageType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CourierMessageType getType() {
    return type;
  }


  public void setType(CourierMessageType type) {
    this.type = type;
  }


  public Message updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * UpdatedAt is a helper struct field for gobuffalo.pop.
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "UpdatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return the Message instance itself
   */
  public Message putAdditionalProperty(String key, Object value) {
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
    Message message = (Message) o;
    return Objects.equals(this.body, message.body) &&
        Objects.equals(this.channel, message.channel) &&
        Objects.equals(this.createdAt, message.createdAt) &&
        Objects.equals(this.dispatches, message.dispatches) &&
        Objects.equals(this.id, message.id) &&
        Objects.equals(this.recipient, message.recipient) &&
        Objects.equals(this.sendCount, message.sendCount) &&
        Objects.equals(this.status, message.status) &&
        Objects.equals(this.subject, message.subject) &&
        Objects.equals(this.templateType, message.templateType) &&
        Objects.equals(this.type, message.type) &&
        Objects.equals(this.updatedAt, message.updatedAt)&&
        Objects.equals(this.additionalProperties, message.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, channel, createdAt, dispatches, id, recipient, sendCount, status, subject, templateType, type, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dispatches: ").append(toIndentedString(dispatches)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sendCount: ").append(toIndentedString(sendCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("body");
    openapiFields.add("channel");
    openapiFields.add("created_at");
    openapiFields.add("dispatches");
    openapiFields.add("id");
    openapiFields.add("recipient");
    openapiFields.add("send_count");
    openapiFields.add("status");
    openapiFields.add("subject");
    openapiFields.add("template_type");
    openapiFields.add("type");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("recipient");
    openapiRequiredFields.add("send_count");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("subject");
    openapiRequiredFields.add("template_type");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Message
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Message.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Message is not found in the empty JSON string", Message.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Message.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (jsonObj.get("dispatches") != null && !jsonObj.get("dispatches").isJsonNull()) {
        JsonArray jsonArraydispatches = jsonObj.getAsJsonArray("dispatches");
        if (jsonArraydispatches != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dispatches").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dispatches` to be an array in the JSON string but got `%s`", jsonObj.get("dispatches").toString()));
          }

          // validate the optional field `dispatches` (array)
          for (int i = 0; i < jsonArraydispatches.size(); i++) {
            MessageDispatch.validateJsonObject(jsonArraydispatches.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if (!jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (!jsonObj.get("template_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Message.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Message' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Message> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Message.class));

       return (TypeAdapter<T>) new TypeAdapter<Message>() {
           @Override
           public void write(JsonWriter out, Message value) throws IOException {
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
           public Message read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Message instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Message given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Message
  * @throws IOException if the JSON string is invalid with respect to Message
  */
  public static Message fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Message.class);
  }

 /**
  * Convert an instance of Message to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

