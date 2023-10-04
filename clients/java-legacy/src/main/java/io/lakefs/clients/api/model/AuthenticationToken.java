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
 * AuthenticationToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthenticationToken {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TOKEN_EXPIRATION = "token_expiration";
  @SerializedName(SERIALIZED_NAME_TOKEN_EXPIRATION)
  private Long tokenExpiration;


  public AuthenticationToken token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * a JWT token that could be used to authenticate requests
   * @return token
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "a JWT token that could be used to authenticate requests")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public AuthenticationToken tokenExpiration(Long tokenExpiration) {
    
    this.tokenExpiration = tokenExpiration;
    return this;
  }

   /**
   * Unix Epoch in seconds
   * @return tokenExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix Epoch in seconds")

  public Long getTokenExpiration() {
    return tokenExpiration;
  }


  public void setTokenExpiration(Long tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationToken authenticationToken = (AuthenticationToken) o;
    return Objects.equals(this.token, authenticationToken.token) &&
        Objects.equals(this.tokenExpiration, authenticationToken.tokenExpiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokenExpiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationToken {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenExpiration: ").append(toIndentedString(tokenExpiration)).append("\n");
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
