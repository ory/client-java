/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.28
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
import java.util.UUID;
import sh.ory.model.NullString;
import sh.ory.model.NullUUID;
import sh.ory.model.ProjectRevision;

/**
 * Project
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-23T13:06:56.339941300Z[Etc/UTC]")
public class Project {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CURRENT_REVISION = "current_revision";
  @SerializedName(SERIALIZED_NAME_CURRENT_REVISION)
  private ProjectRevision currentRevision;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ONGOING_STRIPE_CHECKOUT_ID = "ongoing_stripe_checkout_id";
  @SerializedName(SERIALIZED_NAME_ONGOING_STRIPE_CHECKOUT_ID)
  private NullString ongoingStripeCheckoutId;

  public static final String SERIALIZED_NAME_REVISIONS = "revisions";
  @SerializedName(SERIALIZED_NAME_REVISIONS)
  private List<ProjectRevision> revisions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  /**
   * The state of the project.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("running"),
    
    HALTED("halted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private NullUUID subscriptionId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


   /**
   * The Project&#39;s Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Project's Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public Project currentRevision(ProjectRevision currentRevision) {
    
    this.currentRevision = currentRevision;
    return this;
  }

   /**
   * Get currentRevision
   * @return currentRevision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectRevision getCurrentRevision() {
    return currentRevision;
  }


  public void setCurrentRevision(ProjectRevision currentRevision) {
    this.currentRevision = currentRevision;
  }


  public Project id(UUID id) {
    
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


  public Project ongoingStripeCheckoutId(NullString ongoingStripeCheckoutId) {
    
    this.ongoingStripeCheckoutId = ongoingStripeCheckoutId;
    return this;
  }

   /**
   * Get ongoingStripeCheckoutId
   * @return ongoingStripeCheckoutId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NullString getOngoingStripeCheckoutId() {
    return ongoingStripeCheckoutId;
  }


  public void setOngoingStripeCheckoutId(NullString ongoingStripeCheckoutId) {
    this.ongoingStripeCheckoutId = ongoingStripeCheckoutId;
  }


  public Project revisions(List<ProjectRevision> revisions) {
    
    this.revisions = revisions;
    return this;
  }

  public Project addRevisionsItem(ProjectRevision revisionsItem) {
    this.revisions.add(revisionsItem);
    return this;
  }

   /**
   * Get revisions
   * @return revisions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ProjectRevision> getRevisions() {
    return revisions;
  }


  public void setRevisions(List<ProjectRevision> revisions) {
    this.revisions = revisions;
  }


   /**
   * The project&#39;s slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The project's slug")

  public String getSlug() {
    return slug;
  }




   /**
   * The state of the project.
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The state of the project.")

  public StateEnum getState() {
    return state;
  }




  public Project subscriptionId(NullUUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NullUUID getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(NullUUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


   /**
   * Last Time Project was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Last Time Project was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.currentRevision, project.currentRevision) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.ongoingStripeCheckoutId, project.ongoingStripeCheckoutId) &&
        Objects.equals(this.revisions, project.revisions) &&
        Objects.equals(this.slug, project.slug) &&
        Objects.equals(this.state, project.state) &&
        Objects.equals(this.subscriptionId, project.subscriptionId) &&
        Objects.equals(this.updatedAt, project.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currentRevision, id, ongoingStripeCheckoutId, revisions, slug, state, subscriptionId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ongoingStripeCheckoutId: ").append(toIndentedString(ongoingStripeCheckoutId)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

