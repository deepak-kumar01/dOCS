package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgentMetrics;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Agent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class Agent   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("create_date")
  private OffsetDateTime createDate = null;

  @JsonProperty("last_date")
  private OffsetDateTime lastDate = null;

  @JsonProperty("modified_date")
  private OffsetDateTime modifiedDate = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("region_name")
  private String regionName = null;

  @JsonProperty("ip")
  private String ip = null;

  @JsonProperty("topic")
  private String topic = null;

  @JsonProperty("os")
  private String os = null;

  @JsonProperty("current_version")
  private String currentVersion = null;

  @JsonProperty("concurrent_jobs_limit")
  private Long concurrentJobsLimit = null;

  @JsonProperty("concurrent_jobs")
  private Long concurrentJobs = null;

  /**
   * agent status
   */
  public enum StatusEnum {
    RUNNING("running"),
    
    STARTING("starting"),
    
    STOPPED("stopped"),
    
    UNKNOWN("unknown");

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

  @JsonProperty("service_name")
  private String serviceName = null;

  @JsonProperty("service_id")
  private String serviceId = null;

  @JsonProperty("sub_system_count")
  private Long subSystemCount = null;

  @JsonProperty("metrics")
  private AgentMetrics metrics = null;

  public Agent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "agent-uuid", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Agent createDate(OffsetDateTime createDate) {
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

  public Agent lastDate(OffsetDateTime lastDate) {
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

  public Agent modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @ApiModelProperty(example = "2018-03-20T09:12:28Z", value = "")

  @Valid

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public Agent createdBy(String createdBy) {
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

  public Agent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "host01", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Agent regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

  /**
   * Get regionName
   * @return regionName
  **/
  @ApiModelProperty(example = "region-1", value = "")


  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public Agent ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
  **/
  @ApiModelProperty(example = "192.168.1.1", value = "")


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Agent topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
  **/
  @ApiModelProperty(example = "host_name-uuid", value = "")


  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public Agent os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
  **/
  @ApiModelProperty(example = "windows 10", value = "")


  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public Agent currentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * Get currentVersion
   * @return currentVersion
  **/
  @ApiModelProperty(example = "V1.2.5", value = "")


  public String getCurrentVersion() {
    return currentVersion;
  }

  public void setCurrentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
  }

  public Agent concurrentJobsLimit(Long concurrentJobsLimit) {
    this.concurrentJobsLimit = concurrentJobsLimit;
    return this;
  }

  /**
   * Get concurrentJobsLimit
   * @return concurrentJobsLimit
  **/
  @ApiModelProperty(value = "")


  public Long getConcurrentJobsLimit() {
    return concurrentJobsLimit;
  }

  public void setConcurrentJobsLimit(Long concurrentJobsLimit) {
    this.concurrentJobsLimit = concurrentJobsLimit;
  }

  public Agent concurrentJobs(Long concurrentJobs) {
    this.concurrentJobs = concurrentJobs;
    return this;
  }

  /**
   * Get concurrentJobs
   * @return concurrentJobs
  **/
  @ApiModelProperty(value = "")


  public Long getConcurrentJobs() {
    return concurrentJobs;
  }

  public void setConcurrentJobs(Long concurrentJobs) {
    this.concurrentJobs = concurrentJobs;
  }

  public Agent status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * agent status
   * @return status
  **/
  @ApiModelProperty(value = "agent status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Agent serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(example = "B2C", value = "")


  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public Agent serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(example = "B2C-uuid", value = "")


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public Agent subSystemCount(Long subSystemCount) {
    this.subSystemCount = subSystemCount;
    return this;
  }

  /**
   * Get subSystemCount
   * @return subSystemCount
  **/
  @ApiModelProperty(value = "")


  public Long getSubSystemCount() {
    return subSystemCount;
  }

  public void setSubSystemCount(Long subSystemCount) {
    this.subSystemCount = subSystemCount;
  }

  public Agent metrics(AgentMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Get metrics
   * @return metrics
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AgentMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(AgentMetrics metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.id, agent.id) &&
        Objects.equals(this.createDate, agent.createDate) &&
        Objects.equals(this.lastDate, agent.lastDate) &&
        Objects.equals(this.modifiedDate, agent.modifiedDate) &&
        Objects.equals(this.createdBy, agent.createdBy) &&
        Objects.equals(this.name, agent.name) &&
        Objects.equals(this.regionName, agent.regionName) &&
        Objects.equals(this.ip, agent.ip) &&
        Objects.equals(this.topic, agent.topic) &&
        Objects.equals(this.os, agent.os) &&
        Objects.equals(this.currentVersion, agent.currentVersion) &&
        Objects.equals(this.concurrentJobsLimit, agent.concurrentJobsLimit) &&
        Objects.equals(this.concurrentJobs, agent.concurrentJobs) &&
        Objects.equals(this.status, agent.status) &&
        Objects.equals(this.serviceName, agent.serviceName) &&
        Objects.equals(this.serviceId, agent.serviceId) &&
        Objects.equals(this.subSystemCount, agent.subSystemCount) &&
        Objects.equals(this.metrics, agent.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, lastDate, modifiedDate, createdBy, name, regionName, ip, topic, os, currentVersion, concurrentJobsLimit, concurrentJobs, status, serviceName, serviceId, subSystemCount, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    concurrentJobsLimit: ").append(toIndentedString(concurrentJobsLimit)).append("\n");
    sb.append("    concurrentJobs: ").append(toIndentedString(concurrentJobs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    subSystemCount: ").append(toIndentedString(subSystemCount)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

