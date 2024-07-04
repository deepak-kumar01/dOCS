package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PersonInCharge;
import io.swagger.model.Subsystem;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Service
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class Service   {
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

  @JsonProperty("management_dept")
  private String managementDept = null;

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

  @JsonProperty("subsystems")
  @Valid
  private List<Subsystem> subsystems = null;

  @JsonProperty("person_in_charge")
  private PersonInCharge personInCharge = null;

  public Service id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "service-uuid", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Service createDate(OffsetDateTime createDate) {
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

  public Service lastDate(OffsetDateTime lastDate) {
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

  public Service createdBy(String createdBy) {
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

  public Service name(String name) {
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

  public Service managementDept(String managementDept) {
    this.managementDept = managementDept;
    return this;
  }

  /**
   * Get managementDept
   * @return managementDept
  **/
  @ApiModelProperty(example = "B2C-Logistics", value = "")


  public String getManagementDept() {
    return managementDept;
  }

  public void setManagementDept(String managementDept) {
    this.managementDept = managementDept;
  }

  public Service status(StatusEnum status) {
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

  public Service subsystems(List<Subsystem> subsystems) {
    this.subsystems = subsystems;
    return this;
  }

  public Service addSubsystemsItem(Subsystem subsystemsItem) {
    if (this.subsystems == null) {
      this.subsystems = new ArrayList<Subsystem>();
    }
    this.subsystems.add(subsystemsItem);
    return this;
  }

  /**
   * Get subsystems
   * @return subsystems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Subsystem> getSubsystems() {
    return subsystems;
  }

  public void setSubsystems(List<Subsystem> subsystems) {
    this.subsystems = subsystems;
  }

  public Service personInCharge(PersonInCharge personInCharge) {
    this.personInCharge = personInCharge;
    return this;
  }

  /**
   * Get personInCharge
   * @return personInCharge
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonInCharge getPersonInCharge() {
    return personInCharge;
  }

  public void setPersonInCharge(PersonInCharge personInCharge) {
    this.personInCharge = personInCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.createDate, service.createDate) &&
        Objects.equals(this.lastDate, service.lastDate) &&
        Objects.equals(this.createdBy, service.createdBy) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.managementDept, service.managementDept) &&
        Objects.equals(this.status, service.status) &&
        Objects.equals(this.subsystems, service.subsystems) &&
        Objects.equals(this.personInCharge, service.personInCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, lastDate, createdBy, name, managementDept, status, subsystems, personInCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managementDept: ").append(toIndentedString(managementDept)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subsystems: ").append(toIndentedString(subsystems)).append("\n");
    sb.append("    personInCharge: ").append(toIndentedString(personInCharge)).append("\n");
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

