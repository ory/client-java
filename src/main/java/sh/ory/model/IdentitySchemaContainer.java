/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.4
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
import sh.ory.model.IdentitySchema;

/**
 * IdentitySchemaContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-26T09:38:14.572024203Z[Etc/UTC]")
public class IdentitySchemaContainer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private IdentitySchema schema;

  public IdentitySchemaContainer() { 
  }

  public IdentitySchemaContainer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Identity JSON Schema
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Identity JSON Schema")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IdentitySchemaContainer schema(IdentitySchema schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentitySchema getSchema() {
    return schema;
  }


  public void setSchema(IdentitySchema schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentitySchemaContainer identitySchemaContainer = (IdentitySchemaContainer) o;
    return Objects.equals(this.id, identitySchemaContainer.id) &&
        Objects.equals(this.schema, identitySchemaContainer.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentitySchemaContainer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

}

