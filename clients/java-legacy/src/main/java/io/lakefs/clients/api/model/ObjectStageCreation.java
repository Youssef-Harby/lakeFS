/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 1.0.0
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ObjectStageCreation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ObjectStageCreation {
  public static final String SERIALIZED_NAME_PHYSICAL_ADDRESS = "physical_address";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_ADDRESS)
  private String physicalAddress;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  private String checksum;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "size_bytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Long sizeBytes;

  public static final String SERIALIZED_NAME_MTIME = "mtime";
  @SerializedName(SERIALIZED_NAME_MTIME)
  private Long mtime;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force = false;


  public ObjectStageCreation physicalAddress(String physicalAddress) {
    
    this.physicalAddress = physicalAddress;
    return this;
  }

   /**
   * Get physicalAddress
   * @return physicalAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhysicalAddress() {
    return physicalAddress;
  }


  public void setPhysicalAddress(String physicalAddress) {
    this.physicalAddress = physicalAddress;
  }


  public ObjectStageCreation checksum(String checksum) {
    
    this.checksum = checksum;
    return this;
  }

   /**
   * Get checksum
   * @return checksum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getChecksum() {
    return checksum;
  }


  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public ObjectStageCreation sizeBytes(Long sizeBytes) {
    
    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * Get sizeBytes
   * @return sizeBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSizeBytes() {
    return sizeBytes;
  }


  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  public ObjectStageCreation mtime(Long mtime) {
    
    this.mtime = mtime;
    return this;
  }

   /**
   * Unix Epoch in seconds
   * @return mtime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix Epoch in seconds")

  public Long getMtime() {
    return mtime;
  }


  public void setMtime(Long mtime) {
    this.mtime = mtime;
  }


  public ObjectStageCreation metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ObjectStageCreation putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public ObjectStageCreation contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Object media type
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object media type")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public ObjectStageCreation force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStageCreation objectStageCreation = (ObjectStageCreation) o;
    return Objects.equals(this.physicalAddress, objectStageCreation.physicalAddress) &&
        Objects.equals(this.checksum, objectStageCreation.checksum) &&
        Objects.equals(this.sizeBytes, objectStageCreation.sizeBytes) &&
        Objects.equals(this.mtime, objectStageCreation.mtime) &&
        Objects.equals(this.metadata, objectStageCreation.metadata) &&
        Objects.equals(this.contentType, objectStageCreation.contentType) &&
        Objects.equals(this.force, objectStageCreation.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(physicalAddress, checksum, sizeBytes, mtime, metadata, contentType, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStageCreation {\n");
    sb.append("    physicalAddress: ").append(toIndentedString(physicalAddress)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

