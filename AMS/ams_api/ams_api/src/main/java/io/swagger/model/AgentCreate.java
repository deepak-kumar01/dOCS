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
 * AgentCreate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class AgentCreate   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("service_name")
  private String serviceName = null;

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

  public AgentCreate name(String name) {
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

  public AgentCreate serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(example = "host01", value = "")


  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public AgentCreate regionName(String regionName) {
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

  public AgentCreate ip(String ip) {
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

  public AgentCreate topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
  **/
  @ApiModelProperty(example = "name-xxx", value = "")


  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public AgentCreate os(String os) {
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

  public AgentCreate currentVersion(String currentVersion) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCreate agentCreate = (AgentCreate) o;
    return Objects.equals(this.name, agentCreate.name) &&
        Objects.equals(this.serviceName, agentCreate.serviceName) &&
        Objects.equals(this.regionName, agentCreate.regionName) &&
        Objects.equals(this.ip, agentCreate.ip) &&
        Objects.equals(this.topic, agentCreate.topic) &&
        Objects.equals(this.os, agentCreate.os) &&
        Objects.equals(this.currentVersion, agentCreate.currentVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serviceName, regionName, ip, topic, os, currentVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
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

