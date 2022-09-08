/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.36
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
 * ExpandTree
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-08T16:09:28.361097504Z[Etc/UTC]")
public class ExpandTree {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ExpandTree> children = null;

  public static final String SERIALIZED_NAME_TUPLE = "tuple";
  @SerializedName(SERIALIZED_NAME_TUPLE)
  private RelationTuple tuple;

  /**
   * The type of the node. union TreeNodeUnion exclusion TreeNodeExclusion intersection TreeNodeIntersection leaf TreeNodeLeaf tuple_to_subject_set TreeNodeTupleToSubjectSet computed_subject_set TreeNodeComputedSubjectSet not TreeNodeNot unspecified TreeNodeUnspecified
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNION("union"),
    
    EXCLUSION("exclusion"),
    
    INTERSECTION("intersection"),
    
    LEAF("leaf"),
    
    TUPLE_TO_SUBJECT_SET("tuple_to_subject_set"),
    
    COMPUTED_SUBJECT_SET("computed_subject_set"),
    
    NOT("not"),
    
    UNSPECIFIED("unspecified");

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
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public ExpandTree() { 
  }

  public ExpandTree children(List<ExpandTree> children) {
    
    this.children = children;
    return this;
  }

  public ExpandTree addChildrenItem(ExpandTree childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * The children of the node, possibly none.
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The children of the node, possibly none.")

  public List<ExpandTree> getChildren() {
    return children;
  }


  public void setChildren(List<ExpandTree> children) {
    this.children = children;
  }


  public ExpandTree tuple(RelationTuple tuple) {
    
    this.tuple = tuple;
    return this;
  }

   /**
   * Get tuple
   * @return tuple
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RelationTuple getTuple() {
    return tuple;
  }


  public void setTuple(RelationTuple tuple) {
    this.tuple = tuple;
  }


  public ExpandTree type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the node. union TreeNodeUnion exclusion TreeNodeExclusion intersection TreeNodeIntersection leaf TreeNodeLeaf tuple_to_subject_set TreeNodeTupleToSubjectSet computed_subject_set TreeNodeComputedSubjectSet not TreeNodeNot unspecified TreeNodeUnspecified
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the node. union TreeNodeUnion exclusion TreeNodeExclusion intersection TreeNodeIntersection leaf TreeNodeLeaf tuple_to_subject_set TreeNodeTupleToSubjectSet computed_subject_set TreeNodeComputedSubjectSet not TreeNodeNot unspecified TreeNodeUnspecified")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpandTree expandTree = (ExpandTree) o;
    return Objects.equals(this.children, expandTree.children) &&
        Objects.equals(this.tuple, expandTree.tuple) &&
        Objects.equals(this.type, expandTree.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, tuple, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpandTree {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    tuple: ").append(toIndentedString(tuple)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

