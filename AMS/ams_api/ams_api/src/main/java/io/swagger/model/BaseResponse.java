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
 * BaseResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class BaseResponse   {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("message_json")
  private Object messageJson = null;

  public BaseResponse code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "200", value = "")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public BaseResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "succcess", value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BaseResponse messageJson(Object messageJson) {
    this.messageJson = messageJson;
    return this;
  }

  /**
   * Get messageJson
   * @return messageJson
  **/
  @ApiModelProperty(example = "\"success object\"", value = "")


  public Object getMessageJson() {
    return messageJson;
  }

  public void setMessageJson(Object messageJson) {
    this.messageJson = messageJson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseResponse baseResponse = (BaseResponse) o;
    return Objects.equals(this.code, baseResponse.code) &&
        Objects.equals(this.message, baseResponse.message) &&
        Objects.equals(this.messageJson, baseResponse.messageJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, messageJson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageJson: ").append(toIndentedString(messageJson)).append("\n");
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

