/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api.model;

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

/**
 * RefsDump
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefsDump {
  public static final String SERIALIZED_NAME_COMMITS_META_RANGE_ID = "commits_meta_range_id";
  @SerializedName(SERIALIZED_NAME_COMMITS_META_RANGE_ID)
  private String commitsMetaRangeId;

  public static final String SERIALIZED_NAME_TAGS_META_RANGE_ID = "tags_meta_range_id";
  @SerializedName(SERIALIZED_NAME_TAGS_META_RANGE_ID)
  private String tagsMetaRangeId;

  public static final String SERIALIZED_NAME_BRANCHES_META_RANGE_ID = "branches_meta_range_id";
  @SerializedName(SERIALIZED_NAME_BRANCHES_META_RANGE_ID)
  private String branchesMetaRangeId;


  public RefsDump commitsMetaRangeId(String commitsMetaRangeId) {
    
    this.commitsMetaRangeId = commitsMetaRangeId;
    return this;
  }

   /**
   * Get commitsMetaRangeId
   * @return commitsMetaRangeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCommitsMetaRangeId() {
    return commitsMetaRangeId;
  }


  public void setCommitsMetaRangeId(String commitsMetaRangeId) {
    this.commitsMetaRangeId = commitsMetaRangeId;
  }


  public RefsDump tagsMetaRangeId(String tagsMetaRangeId) {
    
    this.tagsMetaRangeId = tagsMetaRangeId;
    return this;
  }

   /**
   * Get tagsMetaRangeId
   * @return tagsMetaRangeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTagsMetaRangeId() {
    return tagsMetaRangeId;
  }


  public void setTagsMetaRangeId(String tagsMetaRangeId) {
    this.tagsMetaRangeId = tagsMetaRangeId;
  }


  public RefsDump branchesMetaRangeId(String branchesMetaRangeId) {
    
    this.branchesMetaRangeId = branchesMetaRangeId;
    return this;
  }

   /**
   * Get branchesMetaRangeId
   * @return branchesMetaRangeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBranchesMetaRangeId() {
    return branchesMetaRangeId;
  }


  public void setBranchesMetaRangeId(String branchesMetaRangeId) {
    this.branchesMetaRangeId = branchesMetaRangeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefsDump refsDump = (RefsDump) o;
    return Objects.equals(this.commitsMetaRangeId, refsDump.commitsMetaRangeId) &&
        Objects.equals(this.tagsMetaRangeId, refsDump.tagsMetaRangeId) &&
        Objects.equals(this.branchesMetaRangeId, refsDump.branchesMetaRangeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitsMetaRangeId, tagsMetaRangeId, branchesMetaRangeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefsDump {\n");
    sb.append("    commitsMetaRangeId: ").append(toIndentedString(commitsMetaRangeId)).append("\n");
    sb.append("    tagsMetaRangeId: ").append(toIndentedString(tagsMetaRangeId)).append("\n");
    sb.append("    branchesMetaRangeId: ").append(toIndentedString(branchesMetaRangeId)).append("\n");
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

