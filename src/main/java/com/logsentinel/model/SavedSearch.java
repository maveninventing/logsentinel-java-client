/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/en/latest/index.html
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * SavedSearch
 */

public class SavedSearch {
  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("end")
  private Long end = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("query")
  private String query = null;

  @JsonProperty("relativePeriod")
  private Boolean relativePeriod = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("updated")
  private LocalDateTime updated = null;

  @JsonProperty("userId")
  private UUID userId = null;

  public SavedSearch created(LocalDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public SavedSearch end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public SavedSearch id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SavedSearch name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SavedSearch page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SavedSearch pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public SavedSearch query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SavedSearch relativePeriod(Boolean relativePeriod) {
    this.relativePeriod = relativePeriod;
    return this;
  }

   /**
   * Get relativePeriod
   * @return relativePeriod
  **/
  @ApiModelProperty(value = "")
  public Boolean isRelativePeriod() {
    return relativePeriod;
  }

  public void setRelativePeriod(Boolean relativePeriod) {
    this.relativePeriod = relativePeriod;
  }

  public SavedSearch start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public SavedSearch updated(LocalDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public SavedSearch userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSearch savedSearch = (SavedSearch) o;
    return Objects.equals(this.created, savedSearch.created) &&
        Objects.equals(this.end, savedSearch.end) &&
        Objects.equals(this.id, savedSearch.id) &&
        Objects.equals(this.name, savedSearch.name) &&
        Objects.equals(this.page, savedSearch.page) &&
        Objects.equals(this.pageSize, savedSearch.pageSize) &&
        Objects.equals(this.query, savedSearch.query) &&
        Objects.equals(this.relativePeriod, savedSearch.relativePeriod) &&
        Objects.equals(this.start, savedSearch.start) &&
        Objects.equals(this.updated, savedSearch.updated) &&
        Objects.equals(this.userId, savedSearch.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, end, id, name, page, pageSize, query, relativePeriod, start, updated, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSearch {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    relativePeriod: ").append(toIndentedString(relativePeriod)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

