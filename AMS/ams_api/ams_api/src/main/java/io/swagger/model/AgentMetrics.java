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
 * AgentMetrics
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class AgentMetrics   {
  @JsonProperty("cpu")
  private Float cpu = null;

  @JsonProperty("memory")
  private Float memory = null;

  @JsonProperty("disk")
  private Long disk = null;

  public AgentMetrics cpu(Float cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Get cpu
   * @return cpu
  **/
  @ApiModelProperty(example = "22.5", value = "")


  public Float getCpu() {
    return cpu;
  }

  public void setCpu(Float cpu) {
    this.cpu = cpu;
  }

  public AgentMetrics memory(Float memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
  **/
  @ApiModelProperty(example = "22.5", value = "")


  public Float getMemory() {
    return memory;
  }

  public void setMemory(Float memory) {
    this.memory = memory;
  }

  public AgentMetrics disk(Long disk) {
    this.disk = disk;
    return this;
  }

  /**
   * Get disk
   * @return disk
  **/
  @ApiModelProperty(example = "22456", value = "")


  public Long getDisk() {
    return disk;
  }

  public void setDisk(Long disk) {
    this.disk = disk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentMetrics agentMetrics = (AgentMetrics) o;
    return Objects.equals(this.cpu, agentMetrics.cpu) &&
        Objects.equals(this.memory, agentMetrics.memory) &&
        Objects.equals(this.disk, agentMetrics.disk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory, disk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentMetrics {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
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

