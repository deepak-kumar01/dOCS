package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceSuggest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class ServiceSuggest   {
  @JsonProperty("display_string")
  private String displayString = null;

  @JsonProperty("result_type")
  private String resultType = null;

  @JsonProperty("result")
  private Object result = null;

  public ServiceSuggest displayString(String displayString) {
    this.displayString = displayString;
    return this;
  }

  /**
   * Get displayString
   * @return displayString
  **/
  @ApiModelProperty(example = "rplaird", required = true, value = "")
  @NotNull


  public String getDisplayString() {
    return displayString;
  }

  public void setDisplayString(String displayString) {
    this.displayString = displayString;
  }

  public ServiceSuggest resultType(String resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Get resultType
   * @return resultType
  **/
  @ApiModelProperty(example = "pic", required = true, value = "")
  @NotNull


  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }

  public ServiceSuggest result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(example = "\"{ dynamic json }\"", value = "")


  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSuggest serviceSuggest = (ServiceSuggest) o;
    return Objects.equals(this.displayString, serviceSuggest.displayString) &&
        Objects.equals(this.resultType, serviceSuggest.resultType) &&
        Objects.equals(this.result, serviceSuggest.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayString, resultType, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSuggest {\n");
    
    sb.append("    displayString: ").append(toIndentedString(displayString)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

