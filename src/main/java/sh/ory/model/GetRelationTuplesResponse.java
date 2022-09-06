/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.29
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.RelationTuple;

/**
 * GetRelationTuplesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T13:55:02.160309229Z[Etc/UTC]")
public class GetRelationTuplesResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "next_page_token";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_RELATION_TUPLES = "relation_tuples";
  @SerializedName(SERIALIZED_NAME_RELATION_TUPLES)
  private List<RelationTuple> relationTuples = null;

  public GetRelationTuplesResponse() { 
  }

  public GetRelationTuplesResponse nextPageToken(String nextPageToken) {
    
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * The opaque token to provide in a subsequent request to get the next page. It is the empty string iff this is the last page.
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The opaque token to provide in a subsequent request to get the next page. It is the empty string iff this is the last page.")

  public String getNextPageToken() {
    return nextPageToken;
  }


  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public GetRelationTuplesResponse relationTuples(List<RelationTuple> relationTuples) {
    
    this.relationTuples = relationTuples;
    return this;
  }

  public GetRelationTuplesResponse addRelationTuplesItem(RelationTuple relationTuplesItem) {
    if (this.relationTuples == null) {
      this.relationTuples = new ArrayList<>();
    }
    this.relationTuples.add(relationTuplesItem);
    return this;
  }

   /**
   * Get relationTuples
   * @return relationTuples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RelationTuple> getRelationTuples() {
    return relationTuples;
  }


  public void setRelationTuples(List<RelationTuple> relationTuples) {
    this.relationTuples = relationTuples;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRelationTuplesResponse getRelationTuplesResponse = (GetRelationTuplesResponse) o;
    return Objects.equals(this.nextPageToken, getRelationTuplesResponse.nextPageToken) &&
        Objects.equals(this.relationTuples, getRelationTuplesResponse.relationTuples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, relationTuples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRelationTuplesResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    relationTuples: ").append(toIndentedString(relationTuples)).append("\n");
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

