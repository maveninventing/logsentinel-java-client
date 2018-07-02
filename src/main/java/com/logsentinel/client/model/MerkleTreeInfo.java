/*
 * LogSentinel RESTful API
 * Read more at https://logsentinel.com/documentation/
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * MerkleTreeInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-02T11:34:18.314+03:00")
public class MerkleTreeInfo {
  @SerializedName("hashAlgorithmOid")
  private String hashAlgorithmOid = null;

  @SerializedName("leafHashAlgorithmOid")
  private String leafHashAlgorithmOid = null;

  @SerializedName("publicKey")
  private String publicKey = null;

  @SerializedName("timestampAlgorithmOid")
  private String timestampAlgorithmOid = null;

  public MerkleTreeInfo hashAlgorithmOid(String hashAlgorithmOid) {
    this.hashAlgorithmOid = hashAlgorithmOid;
    return this;
  }

   /**
   * Get hashAlgorithmOid
   * @return hashAlgorithmOid
  **/
  @ApiModelProperty(value = "")
  public String getHashAlgorithmOid() {
    return hashAlgorithmOid;
  }

  public void setHashAlgorithmOid(String hashAlgorithmOid) {
    this.hashAlgorithmOid = hashAlgorithmOid;
  }

  public MerkleTreeInfo leafHashAlgorithmOid(String leafHashAlgorithmOid) {
    this.leafHashAlgorithmOid = leafHashAlgorithmOid;
    return this;
  }

   /**
   * Get leafHashAlgorithmOid
   * @return leafHashAlgorithmOid
  **/
  @ApiModelProperty(value = "")
  public String getLeafHashAlgorithmOid() {
    return leafHashAlgorithmOid;
  }

  public void setLeafHashAlgorithmOid(String leafHashAlgorithmOid) {
    this.leafHashAlgorithmOid = leafHashAlgorithmOid;
  }

  public MerkleTreeInfo publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @ApiModelProperty(value = "")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public MerkleTreeInfo timestampAlgorithmOid(String timestampAlgorithmOid) {
    this.timestampAlgorithmOid = timestampAlgorithmOid;
    return this;
  }

   /**
   * Get timestampAlgorithmOid
   * @return timestampAlgorithmOid
  **/
  @ApiModelProperty(value = "")
  public String getTimestampAlgorithmOid() {
    return timestampAlgorithmOid;
  }

  public void setTimestampAlgorithmOid(String timestampAlgorithmOid) {
    this.timestampAlgorithmOid = timestampAlgorithmOid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerkleTreeInfo merkleTreeInfo = (MerkleTreeInfo) o;
    return Objects.equals(this.hashAlgorithmOid, merkleTreeInfo.hashAlgorithmOid) &&
        Objects.equals(this.leafHashAlgorithmOid, merkleTreeInfo.leafHashAlgorithmOid) &&
        Objects.equals(this.publicKey, merkleTreeInfo.publicKey) &&
        Objects.equals(this.timestampAlgorithmOid, merkleTreeInfo.timestampAlgorithmOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashAlgorithmOid, leafHashAlgorithmOid, publicKey, timestampAlgorithmOid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerkleTreeInfo {\n");

    sb.append("    hashAlgorithmOid: ").append(toIndentedString(hashAlgorithmOid)).append("\n");
    sb.append("    leafHashAlgorithmOid: ").append(toIndentedString(leafHashAlgorithmOid)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    timestampAlgorithmOid: ").append(toIndentedString(timestampAlgorithmOid)).append("\n");
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

