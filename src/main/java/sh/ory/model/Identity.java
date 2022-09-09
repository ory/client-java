/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.37
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import sh.ory.model.IdentityCredentials;
import sh.ory.model.IdentityState;
import sh.ory.model.RecoveryAddress;
import sh.ory.model.VerifiableIdentityAddress;

/**
 * An identity can be a real human, a service, an IoT device - everything that can be described as an \&quot;actor\&quot; in a system.
 */
@ApiModel(description = "An identity can be a real human, a service, an IoT device - everything that can be described as an \"actor\" in a system.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T08:29:13.059041099Z[Etc/UTC]")
public class Identity {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private Map<String, IdentityCredentials> credentials = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_METADATA_ADMIN = "metadata_admin";
  @SerializedName(SERIALIZED_NAME_METADATA_ADMIN)
  private Object metadataAdmin;

  public static final String SERIALIZED_NAME_METADATA_PUBLIC = "metadata_public";
  @SerializedName(SERIALIZED_NAME_METADATA_PUBLIC)
  private Object metadataPublic;

  public static final String SERIALIZED_NAME_RECOVERY_ADDRESSES = "recovery_addresses";
  @SerializedName(SERIALIZED_NAME_RECOVERY_ADDRESSES)
  private List<RecoveryAddress> recoveryAddresses = null;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_SCHEMA_URL = "schema_url";
  @SerializedName(SERIALIZED_NAME_SCHEMA_URL)
  private String schemaUrl;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private IdentityState state;

  public static final String SERIALIZED_NAME_STATE_CHANGED_AT = "state_changed_at";
  @SerializedName(SERIALIZED_NAME_STATE_CHANGED_AT)
  private OffsetDateTime stateChangedAt;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERIFIABLE_ADDRESSES = "verifiable_addresses";
  @SerializedName(SERIALIZED_NAME_VERIFIABLE_ADDRESSES)
  private List<VerifiableIdentityAddress> verifiableAddresses = null;

  public Identity() { 
  }

  public Identity createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * CreatedAt is a helper struct field for gobuffalo.pop.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CreatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Identity credentials(Map<String, IdentityCredentials> credentials) {
    
    this.credentials = credentials;
    return this;
  }

  public Identity putCredentialsItem(String key, IdentityCredentials credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new HashMap<>();
    }
    this.credentials.put(key, credentialsItem);
    return this;
  }

   /**
   * Credentials represents all credentials that can be used for authenticating this identity.
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credentials represents all credentials that can be used for authenticating this identity.")

  public Map<String, IdentityCredentials> getCredentials() {
    return credentials;
  }


  public void setCredentials(Map<String, IdentityCredentials> credentials) {
    this.credentials = credentials;
  }


  public Identity id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Identity metadataAdmin(Object metadataAdmin) {
    
    this.metadataAdmin = metadataAdmin;
    return this;
  }

   /**
   * NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-
   * @return metadataAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-")

  public Object getMetadataAdmin() {
    return metadataAdmin;
  }


  public void setMetadataAdmin(Object metadataAdmin) {
    this.metadataAdmin = metadataAdmin;
  }


  public Identity metadataPublic(Object metadataPublic) {
    
    this.metadataPublic = metadataPublic;
    return this;
  }

   /**
   * NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-
   * @return metadataPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-")

  public Object getMetadataPublic() {
    return metadataPublic;
  }


  public void setMetadataPublic(Object metadataPublic) {
    this.metadataPublic = metadataPublic;
  }


  public Identity recoveryAddresses(List<RecoveryAddress> recoveryAddresses) {
    
    this.recoveryAddresses = recoveryAddresses;
    return this;
  }

  public Identity addRecoveryAddressesItem(RecoveryAddress recoveryAddressesItem) {
    if (this.recoveryAddresses == null) {
      this.recoveryAddresses = new ArrayList<>();
    }
    this.recoveryAddresses.add(recoveryAddressesItem);
    return this;
  }

   /**
   * RecoveryAddresses contains all the addresses that can be used to recover an identity.
   * @return recoveryAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RecoveryAddresses contains all the addresses that can be used to recover an identity.")

  public List<RecoveryAddress> getRecoveryAddresses() {
    return recoveryAddresses;
  }


  public void setRecoveryAddresses(List<RecoveryAddress> recoveryAddresses) {
    this.recoveryAddresses = recoveryAddresses;
  }


  public Identity schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits.
   * @return schemaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public Identity schemaUrl(String schemaUrl) {
    
    this.schemaUrl = schemaUrl;
    return this;
  }

   /**
   * SchemaURL is the URL of the endpoint where the identity&#39;s traits schema can be fetched from.  format: url
   * @return schemaUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SchemaURL is the URL of the endpoint where the identity's traits schema can be fetched from.  format: url")

  public String getSchemaUrl() {
    return schemaUrl;
  }


  public void setSchemaUrl(String schemaUrl) {
    this.schemaUrl = schemaUrl;
  }


  public Identity state(IdentityState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityState getState() {
    return state;
  }


  public void setState(IdentityState state) {
    this.state = state;
  }


  public Identity stateChangedAt(OffsetDateTime stateChangedAt) {
    
    this.stateChangedAt = stateChangedAt;
    return this;
  }

   /**
   * Get stateChangedAt
   * @return stateChangedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStateChangedAt() {
    return stateChangedAt;
  }


  public void setStateChangedAt(OffsetDateTime stateChangedAt) {
    this.stateChangedAt = stateChangedAt;
  }


  public Identity traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_url&#x60;.
   * @return traits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public Identity updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * UpdatedAt is a helper struct field for gobuffalo.pop.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UpdatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Identity verifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    
    this.verifiableAddresses = verifiableAddresses;
    return this;
  }

  public Identity addVerifiableAddressesItem(VerifiableIdentityAddress verifiableAddressesItem) {
    if (this.verifiableAddresses == null) {
      this.verifiableAddresses = new ArrayList<>();
    }
    this.verifiableAddresses.add(verifiableAddressesItem);
    return this;
  }

   /**
   * VerifiableAddresses contains all the addresses that can be verified by the user.
   * @return verifiableAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VerifiableAddresses contains all the addresses that can be verified by the user.")

  public List<VerifiableIdentityAddress> getVerifiableAddresses() {
    return verifiableAddresses;
  }


  public void setVerifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    this.verifiableAddresses = verifiableAddresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.createdAt, identity.createdAt) &&
        Objects.equals(this.credentials, identity.credentials) &&
        Objects.equals(this.id, identity.id) &&
        Objects.equals(this.metadataAdmin, identity.metadataAdmin) &&
        Objects.equals(this.metadataPublic, identity.metadataPublic) &&
        Objects.equals(this.recoveryAddresses, identity.recoveryAddresses) &&
        Objects.equals(this.schemaId, identity.schemaId) &&
        Objects.equals(this.schemaUrl, identity.schemaUrl) &&
        Objects.equals(this.state, identity.state) &&
        Objects.equals(this.stateChangedAt, identity.stateChangedAt) &&
        Objects.equals(this.traits, identity.traits) &&
        Objects.equals(this.updatedAt, identity.updatedAt) &&
        Objects.equals(this.verifiableAddresses, identity.verifiableAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, credentials, id, metadataAdmin, metadataPublic, recoveryAddresses, schemaId, schemaUrl, state, stateChangedAt, traits, updatedAt, verifiableAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadataAdmin: ").append(toIndentedString(metadataAdmin)).append("\n");
    sb.append("    metadataPublic: ").append(toIndentedString(metadataPublic)).append("\n");
    sb.append("    recoveryAddresses: ").append(toIndentedString(recoveryAddresses)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaUrl: ").append(toIndentedString(schemaUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateChangedAt: ").append(toIndentedString(stateChangedAt)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    verifiableAddresses: ").append(toIndentedString(verifiableAddresses)).append("\n");
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

