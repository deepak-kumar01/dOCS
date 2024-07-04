package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Schedule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class Schedule   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("agent_id")
  private String agentId = null;

  @JsonProperty("job_ids")
  @Valid
  private List<String> jobIds = null;

  public Schedule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "account-uuid", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Schedule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "monitoring-account", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Schedule agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Get agentId
   * @return agentId
  **/
  @ApiModelProperty(example = "agent-uuid", value = "")


  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public Schedule jobIds(List<String> jobIds) {
    this.jobIds = jobIds;
    return this;
  }

  public Schedule addJobIdsItem(String jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<String>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

  /**
   * Get jobIds
   * @return jobIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getJobIds() {
    return jobIds;
  }

  public void setJobIds(List<String> jobIds) {
    this.jobIds = jobIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.id, schedule.id) &&
        Objects.equals(this.name, schedule.name) &&
        Objects.equals(this.agentId, schedule.agentId) &&
        Objects.equals(this.jobIds, schedule.jobIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agentId, jobIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
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

