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
import com.logsentinel.model.AsyncTaskExecutor;
import com.logsentinel.model.CallableOfobject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WebAsyncTaskOfInclusionProof
 */

public class WebAsyncTaskOfInclusionProof {
  @JsonProperty("callable")
  private CallableOfobject callable = null;

  @JsonProperty("executor")
  private AsyncTaskExecutor executor = null;

  @JsonProperty("timeout")
  private Long timeout = null;

  public WebAsyncTaskOfInclusionProof callable(CallableOfobject callable) {
    this.callable = callable;
    return this;
  }

   /**
   * Get callable
   * @return callable
  **/
  @ApiModelProperty(value = "")
  public CallableOfobject getCallable() {
    return callable;
  }

  public void setCallable(CallableOfobject callable) {
    this.callable = callable;
  }

  public WebAsyncTaskOfInclusionProof executor(AsyncTaskExecutor executor) {
    this.executor = executor;
    return this;
  }

   /**
   * Get executor
   * @return executor
  **/
  @ApiModelProperty(value = "")
  public AsyncTaskExecutor getExecutor() {
    return executor;
  }

  public void setExecutor(AsyncTaskExecutor executor) {
    this.executor = executor;
  }

  public WebAsyncTaskOfInclusionProof timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @ApiModelProperty(value = "")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebAsyncTaskOfInclusionProof webAsyncTaskOfInclusionProof = (WebAsyncTaskOfInclusionProof) o;
    return Objects.equals(this.callable, webAsyncTaskOfInclusionProof.callable) &&
        Objects.equals(this.executor, webAsyncTaskOfInclusionProof.executor) &&
        Objects.equals(this.timeout, webAsyncTaskOfInclusionProof.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callable, executor, timeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebAsyncTaskOfInclusionProof {\n");
    
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
    sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

