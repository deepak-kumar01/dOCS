package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import io.swagger.model.Agent;
import io.swagger.model.Indicator;
import io.swagger.model.Rule;
import io.swagger.model.Schedule;
import io.swagger.model.Service;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Job
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

public class Job   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("create_date")
  private OffsetDateTime createDate = null;

  @JsonProperty("last_ran_date")
  private OffsetDateTime lastRanDate = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SHELL("shell"),
    
    LOG("log"),
    
    QUERY("query");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * Gets or Sets approval
   */
  public enum ApprovalEnum {
    APPROVED("approved"),
    
    PENDING("pending"),
    
    DENIED("denied");

    private String value;

    ApprovalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalEnum fromValue(String text) {
      for (ApprovalEnum b : ApprovalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("approval")
  private ApprovalEnum approval = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RUNNING("running"),
    
    SCHEDULED("scheduled"),
    
    IDLE("idle"),
    
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

  @JsonProperty("settings")
  private Object settings = null;

  @JsonProperty("agent_info")
  private Agent agentInfo = null;

  @JsonProperty("accounts_info")
  @Valid
  private List<Account> accountsInfo = null;

  @JsonProperty("indicators")
  @Valid
  private List<Indicator> indicators = null;

  @JsonProperty("rules")
  @Valid
  private List<Rule> rules = null;

  @JsonProperty("schedule")
  private Schedule schedule = null;

  @JsonProperty("service_info")
  private Service serviceInfo = null;

  public Job id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "job-uuid", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Job createDate(OffsetDateTime createDate) {
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

  public Job lastRanDate(OffsetDateTime lastRanDate) {
    this.lastRanDate = lastRanDate;
    return this;
  }

  /**
   * Get lastRanDate
   * @return lastRanDate
  **/
  @ApiModelProperty(example = "2018-03-20T09:12:28Z", value = "")

  @Valid

  public OffsetDateTime getLastRanDate() {
    return lastRanDate;
  }

  public void setLastRanDate(OffsetDateTime lastRanDate) {
    this.lastRanDate = lastRanDate;
  }

  public Job name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "firstjob", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Job type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Job approval(ApprovalEnum approval) {
    this.approval = approval;
    return this;
  }

  /**
   * Get approval
   * @return approval
  **/
  @ApiModelProperty(value = "")


  public ApprovalEnum getApproval() {
    return approval;
  }

  public void setApproval(ApprovalEnum approval) {
    this.approval = approval;
  }

  public Job status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Job settings(Object settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(example = "\"{ settings json }\"", value = "")


  public Object getSettings() {
    return settings;
  }

  public void setSettings(Object settings) {
    this.settings = settings;
  }

  public Job agentInfo(Agent agentInfo) {
    this.agentInfo = agentInfo;
    return this;
  }

  /**
   * Get agentInfo
   * @return agentInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Agent getAgentInfo() {
    return agentInfo;
  }

  public void setAgentInfo(Agent agentInfo) {
    this.agentInfo = agentInfo;
  }

  public Job accountsInfo(List<Account> accountsInfo) {
    this.accountsInfo = accountsInfo;
    return this;
  }

  public Job addAccountsInfoItem(Account accountsInfoItem) {
    if (this.accountsInfo == null) {
      this.accountsInfo = new ArrayList<Account>();
    }
    this.accountsInfo.add(accountsInfoItem);
    return this;
  }

  /**
   * Get accountsInfo
   * @return accountsInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Account> getAccountsInfo() {
    return accountsInfo;
  }

  public void setAccountsInfo(List<Account> accountsInfo) {
    this.accountsInfo = accountsInfo;
  }

  public Job indicators(List<Indicator> indicators) {
    this.indicators = indicators;
    return this;
  }

  public Job addIndicatorsItem(Indicator indicatorsItem) {
    if (this.indicators == null) {
      this.indicators = new ArrayList<Indicator>();
    }
    this.indicators.add(indicatorsItem);
    return this;
  }

  /**
   * Get indicators
   * @return indicators
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Indicator> getIndicators() {
    return indicators;
  }

  public void setIndicators(List<Indicator> indicators) {
    this.indicators = indicators;
  }

  public Job rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public Job addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Rule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Rule> getRules() {
    return rules;
  }

  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  public Job schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public Job serviceInfo(Service serviceInfo) {
    this.serviceInfo = serviceInfo;
    return this;
  }

  /**
   * Get serviceInfo
   * @return serviceInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Service getServiceInfo() {
    return serviceInfo;
  }

  public void setServiceInfo(Service serviceInfo) {
    this.serviceInfo = serviceInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.createDate, job.createDate) &&
        Objects.equals(this.lastRanDate, job.lastRanDate) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.type, job.type) &&
        Objects.equals(this.approval, job.approval) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.settings, job.settings) &&
        Objects.equals(this.agentInfo, job.agentInfo) &&
        Objects.equals(this.accountsInfo, job.accountsInfo) &&
        Objects.equals(this.indicators, job.indicators) &&
        Objects.equals(this.rules, job.rules) &&
        Objects.equals(this.schedule, job.schedule) &&
        Objects.equals(this.serviceInfo, job.serviceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, lastRanDate, name, type, approval, status, settings, agentInfo, accountsInfo, indicators, rules, schedule, serviceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    lastRanDate: ").append(toIndentedString(lastRanDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    approval: ").append(toIndentedString(approval)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    agentInfo: ").append(toIndentedString(agentInfo)).append("\n");
    sb.append("    accountsInfo: ").append(toIndentedString(accountsInfo)).append("\n");
    sb.append("    indicators: ").append(toIndentedString(indicators)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    serviceInfo: ").append(toIndentedString(serviceInfo)).append("\n");
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

