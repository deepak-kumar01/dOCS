package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subsystem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class Subsystem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("create_date")
  private OffsetDateTime createDate = null;

  @JsonProperty("last_date")
  private OffsetDateTime lastDate = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Service status
   */
  public enum StatusEnum {
    HEALTHY("healthy"),
    
    ATTENTION_REQUIRED("attention_required"),
    
    UNAVAILABLE("unavailable");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public Subsystem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "system-uuid", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Subsystem createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-03-20T09:12:28Z", value = "")

  @Valid

  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public Subsystem lastDate(OffsetDateTime lastDate) {
    this.lastDate = lastDate;
    return this;
  }

  /**
   * Get lastDate
   * @return lastDate
  **/
  @ApiModelProperty(example = "2018-03-20T09:12:28Z", value = "")

  @Valid

  public OffsetDateTime getLastDate() {
    return lastDate;
  }

  public void setLastDate(OffsetDateTime lastDate) {
    this.lastDate = lastDate;
  }

  public Subsystem createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "user-uuid", value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Subsystem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "B2C-XXX", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subsystem status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Service status
   * @return status
  **/
  @ApiModelProperty(value = "Service status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subsystem subsystem = (Subsystem) o;
    return Objects.equals(this.id, subsystem.id) &&
        Objects.equals(this.createDate, subsystem.createDate) &&
        Objects.equals(this.lastDate, subsystem.lastDate) &&
        Objects.equals(this.createdBy, subsystem.createdBy) &&
        Objects.equals(this.name, subsystem.name) &&
        Objects.equals(this.status, subsystem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, lastDate, createdBy, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subsystem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

