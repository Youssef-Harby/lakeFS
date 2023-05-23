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
 * ObjectCopyCreation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ObjectCopyCreation {
  public static final String SERIALIZED_NAME_SRC_PATH = "src_path";
  @SerializedName(SERIALIZED_NAME_SRC_PATH)
  private String srcPath;

  public static final String SERIALIZED_NAME_SRC_REF = "src_ref";
  @SerializedName(SERIALIZED_NAME_SRC_REF)
  private String srcRef;


  public ObjectCopyCreation srcPath(String srcPath) {
    
    this.srcPath = srcPath;
    return this;
  }

   /**
   * path of the copied object relative to the ref
   * @return srcPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "path of the copied object relative to the ref")

  public String getSrcPath() {
    return srcPath;
  }


  public void setSrcPath(String srcPath) {
    this.srcPath = srcPath;
  }


  public ObjectCopyCreation srcRef(String srcRef) {
    
    this.srcRef = srcRef;
    return this;
  }

   /**
   * a reference, if empty uses the provided branch as ref
   * @return srcRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a reference, if empty uses the provided branch as ref")

  public String getSrcRef() {
    return srcRef;
  }


  public void setSrcRef(String srcRef) {
    this.srcRef = srcRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectCopyCreation objectCopyCreation = (ObjectCopyCreation) o;
    return Objects.equals(this.srcPath, objectCopyCreation.srcPath) &&
        Objects.equals(this.srcRef, objectCopyCreation.srcRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcPath, srcRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectCopyCreation {\n");
    sb.append("    srcPath: ").append(toIndentedString(srcPath)).append("\n");
    sb.append("    srcRef: ").append(toIndentedString(srcRef)).append("\n");
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

