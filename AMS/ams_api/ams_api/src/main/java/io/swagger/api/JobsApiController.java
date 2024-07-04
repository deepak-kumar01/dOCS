package io.swagger.api;

import io.swagger.model.ActionParams;
import io.swagger.model.ActionResult;
import io.swagger.model.BaseResponse;
import io.swagger.model.Job;
import io.swagger.model.JobCreate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

@Controller
public class JobsApiController implements JobsApi {

    private static final Logger log = LoggerFactory.getLogger(JobsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public JobsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Job> createJob(@ApiParam(value = "job JSON" ,required=true )  @Valid @RequestBody JobCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Job>(objectMapper.readValue("{  \"settings\" : \"{ settings json }\",  \"accounts_info\" : [ {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  }, {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  } ],  \"approval\" : \"approved\",  \"service_info\" : {    \"management_dept\" : \"B2C-Logistics\",    \"name\" : \"B2C-XXX\",    \"id\" : \"service-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"person_in_charge\" : {      \"role\" : \"ARCHITECT\",      \"group_name\" : \"CAN-GROUP1\",      \"name\" : \"RPLAIRD\",      \"telephone\" : \"1-519-804-2832\",      \"email\" : \"robert.laird@vvdntech.in\"    },    \"created_by\" : \"user-uuid\",    \"subsystems\" : [ {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    }, {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    } ],    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  },  \"rules\" : [ {    \"parameters\" : \"arbitrary json specific to the job\"  }, {    \"parameters\" : \"arbitrary json specific to the job\"  } ],  \"type\" : \"shell\",  \"indicators\" : [ {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  }, {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  } ],  \"schedule\" : {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  },  \"agent_info\" : {    \"sub_system_count\" : 1,    \"os\" : \"windows 10\",    \"concurrent_jobs_limit\" : 0,    \"concurrent_jobs\" : 6,    \"service_name\" : \"B2C\",    \"ip\" : \"192.168.1.1\",    \"current_version\" : \"V1.2.5\",    \"modified_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"service_id\" : \"B2C-uuid\",    \"name\" : \"host01\",    \"topic\" : \"host_name-uuid\",    \"region_name\" : \"region-1\",    \"id\" : \"agent-uuid\",    \"metrics\" : {      \"disk\" : 22456,      \"memory\" : 22.5,      \"cpu\" : 22.5    },    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"running\"  },  \"last_ran_date\" : \"2018-03-20T09:12:28Z\",  \"name\" : \"firstjob\",  \"id\" : \"job-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Job.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Job>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Job>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BaseResponse> deleteJobById(@ApiParam(value = "Job id to delete",required=true) @PathVariable("jobId") String jobId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BaseResponse>(objectMapper.readValue("{  \"code\" : 200,  \"message_json\" : \"success object\",  \"message\" : \"succcess\"}", BaseResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BaseResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BaseResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ActionResult> executeJobAction(@ApiParam(value = "Name of the action to execute",required=true) @PathVariable("action") String action,@ApiParam(value = "ID of Job to execute action against",required=true) @PathVariable("jobId") String jobId,@ApiParam(value = "Parameters for the action" ,required=true )  @Valid @RequestBody ActionParams body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ActionResult>(objectMapper.readValue("{  \"result\" : \"arbitrary json specific to the job\",  \"success\" : true,  \"message\" : \"you were successful\"}", ActionResult.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ActionResult>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ActionResult>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Job> fetchJobById(@ApiParam(value = "Id of job to return",required=true) @PathVariable("jobId") String jobId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Job>(objectMapper.readValue("{  \"settings\" : \"{ settings json }\",  \"accounts_info\" : [ {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  }, {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  } ],  \"approval\" : \"approved\",  \"service_info\" : {    \"management_dept\" : \"B2C-Logistics\",    \"name\" : \"B2C-XXX\",    \"id\" : \"service-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"person_in_charge\" : {      \"role\" : \"ARCHITECT\",      \"group_name\" : \"CAN-GROUP1\",      \"name\" : \"RPLAIRD\",      \"telephone\" : \"1-519-804-2832\",      \"email\" : \"robert.laird@vvdntech.in\"    },    \"created_by\" : \"user-uuid\",    \"subsystems\" : [ {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    }, {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    } ],    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  },  \"rules\" : [ {    \"parameters\" : \"arbitrary json specific to the job\"  }, {    \"parameters\" : \"arbitrary json specific to the job\"  } ],  \"type\" : \"shell\",  \"indicators\" : [ {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  }, {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  } ],  \"schedule\" : {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  },  \"agent_info\" : {    \"sub_system_count\" : 1,    \"os\" : \"windows 10\",    \"concurrent_jobs_limit\" : 0,    \"concurrent_jobs\" : 6,    \"service_name\" : \"B2C\",    \"ip\" : \"192.168.1.1\",    \"current_version\" : \"V1.2.5\",    \"modified_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"service_id\" : \"B2C-uuid\",    \"name\" : \"host01\",    \"topic\" : \"host_name-uuid\",    \"region_name\" : \"region-1\",    \"id\" : \"agent-uuid\",    \"metrics\" : {      \"disk\" : 22456,      \"memory\" : 22.5,      \"cpu\" : 22.5    },    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"running\"  },  \"last_ran_date\" : \"2018-03-20T09:12:28Z\",  \"name\" : \"firstjob\",  \"id\" : \"job-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Job.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Job>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Job>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Job>> jobSearch(@ApiParam(value = "") @Valid @RequestParam(value = "os", required = false) String os,@ApiParam(value = "") @Valid @RequestParam(value = "state", required = false) String state,@ApiParam(value = "") @Valid @RequestParam(value = "host_name", required = false) String hostName,@ApiParam(value = "") @Valid @RequestParam(value = "ip", required = false) String ip) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Job>>(objectMapper.readValue("[ {  \"settings\" : \"{ settings json }\",  \"accounts_info\" : [ {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  }, {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  } ],  \"approval\" : \"approved\",  \"service_info\" : {    \"management_dept\" : \"B2C-Logistics\",    \"name\" : \"B2C-XXX\",    \"id\" : \"service-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"person_in_charge\" : {      \"role\" : \"ARCHITECT\",      \"group_name\" : \"CAN-GROUP1\",      \"name\" : \"RPLAIRD\",      \"telephone\" : \"1-519-804-2832\",      \"email\" : \"robert.laird@vvdntech.in\"    },    \"created_by\" : \"user-uuid\",    \"subsystems\" : [ {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    }, {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    } ],    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  },  \"rules\" : [ {    \"parameters\" : \"arbitrary json specific to the job\"  }, {    \"parameters\" : \"arbitrary json specific to the job\"  } ],  \"type\" : \"shell\",  \"indicators\" : [ {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  }, {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  } ],  \"schedule\" : {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  },  \"agent_info\" : {    \"sub_system_count\" : 1,    \"os\" : \"windows 10\",    \"concurrent_jobs_limit\" : 0,    \"concurrent_jobs\" : 6,    \"service_name\" : \"B2C\",    \"ip\" : \"192.168.1.1\",    \"current_version\" : \"V1.2.5\",    \"modified_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"service_id\" : \"B2C-uuid\",    \"name\" : \"host01\",    \"topic\" : \"host_name-uuid\",    \"region_name\" : \"region-1\",    \"id\" : \"agent-uuid\",    \"metrics\" : {      \"disk\" : 22456,      \"memory\" : 22.5,      \"cpu\" : 22.5    },    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"running\"  },  \"last_ran_date\" : \"2018-03-20T09:12:28Z\",  \"name\" : \"firstjob\",  \"id\" : \"job-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}, {  \"settings\" : \"{ settings json }\",  \"accounts_info\" : [ {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  }, {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  } ],  \"approval\" : \"approved\",  \"service_info\" : {    \"management_dept\" : \"B2C-Logistics\",    \"name\" : \"B2C-XXX\",    \"id\" : \"service-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"person_in_charge\" : {      \"role\" : \"ARCHITECT\",      \"group_name\" : \"CAN-GROUP1\",      \"name\" : \"RPLAIRD\",      \"telephone\" : \"1-519-804-2832\",      \"email\" : \"robert.laird@vvdntech.in\"    },    \"created_by\" : \"user-uuid\",    \"subsystems\" : [ {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    }, {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    } ],    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  },  \"rules\" : [ {    \"parameters\" : \"arbitrary json specific to the job\"  }, {    \"parameters\" : \"arbitrary json specific to the job\"  } ],  \"type\" : \"shell\",  \"indicators\" : [ {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  }, {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  } ],  \"schedule\" : {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  },  \"agent_info\" : {    \"sub_system_count\" : 1,    \"os\" : \"windows 10\",    \"concurrent_jobs_limit\" : 0,    \"concurrent_jobs\" : 6,    \"service_name\" : \"B2C\",    \"ip\" : \"192.168.1.1\",    \"current_version\" : \"V1.2.5\",    \"modified_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"service_id\" : \"B2C-uuid\",    \"name\" : \"host01\",    \"topic\" : \"host_name-uuid\",    \"region_name\" : \"region-1\",    \"id\" : \"agent-uuid\",    \"metrics\" : {      \"disk\" : 22456,      \"memory\" : 22.5,      \"cpu\" : 22.5    },    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"running\"  },  \"last_ran_date\" : \"2018-03-20T09:12:28Z\",  \"name\" : \"firstjob\",  \"id\" : \"job-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Job>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Job>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Job> modifyJobById(@ApiParam(value = "Job id to modify",required=true) @PathVariable("jobId") String jobId,@ApiParam(value = "Job JSON" ,required=true )  @Valid @RequestBody Job body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Job>(objectMapper.readValue("{  \"settings\" : \"{ settings json }\",  \"accounts_info\" : [ {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  }, {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  } ],  \"approval\" : \"approved\",  \"service_info\" : {    \"management_dept\" : \"B2C-Logistics\",    \"name\" : \"B2C-XXX\",    \"id\" : \"service-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"person_in_charge\" : {      \"role\" : \"ARCHITECT\",      \"group_name\" : \"CAN-GROUP1\",      \"name\" : \"RPLAIRD\",      \"telephone\" : \"1-519-804-2832\",      \"email\" : \"robert.laird@vvdntech.in\"    },    \"created_by\" : \"user-uuid\",    \"subsystems\" : [ {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    }, {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    } ],    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  },  \"rules\" : [ {    \"parameters\" : \"arbitrary json specific to the job\"  }, {    \"parameters\" : \"arbitrary json specific to the job\"  } ],  \"type\" : \"shell\",  \"indicators\" : [ {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  }, {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  } ],  \"schedule\" : {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  },  \"agent_info\" : {    \"sub_system_count\" : 1,    \"os\" : \"windows 10\",    \"concurrent_jobs_limit\" : 0,    \"concurrent_jobs\" : 6,    \"service_name\" : \"B2C\",    \"ip\" : \"192.168.1.1\",    \"current_version\" : \"V1.2.5\",    \"modified_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"service_id\" : \"B2C-uuid\",    \"name\" : \"host01\",    \"topic\" : \"host_name-uuid\",    \"region_name\" : \"region-1\",    \"id\" : \"agent-uuid\",    \"metrics\" : {      \"disk\" : 22456,      \"memory\" : 22.5,      \"cpu\" : 22.5    },    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"running\"  },  \"last_ran_date\" : \"2018-03-20T09:12:28Z\",  \"name\" : \"firstjob\",  \"id\" : \"job-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Job.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Job>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Job>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Job> patchJobById(@ApiParam(value = "Job id to modify",required=true) @PathVariable("jobId") String jobId,@ApiParam(value = "Job JSON" ,required=true )  @Valid @RequestBody Job body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Job>(objectMapper.readValue("{  \"settings\" : \"{ settings json }\",  \"accounts_info\" : [ {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  }, {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  } ],  \"approval\" : \"approved\",  \"service_info\" : {    \"management_dept\" : \"B2C-Logistics\",    \"name\" : \"B2C-XXX\",    \"id\" : \"service-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"person_in_charge\" : {      \"role\" : \"ARCHITECT\",      \"group_name\" : \"CAN-GROUP1\",      \"name\" : \"RPLAIRD\",      \"telephone\" : \"1-519-804-2832\",      \"email\" : \"robert.laird@vvdntech.in\"    },    \"created_by\" : \"user-uuid\",    \"subsystems\" : [ {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    }, {      \"name\" : \"B2C-XXX\",      \"id\" : \"system-uuid\",      \"create_date\" : \"2018-03-20T09:12:28Z\",      \"created_by\" : \"user-uuid\",      \"last_date\" : \"2018-03-20T09:12:28Z\",      \"status\" : \"healthy\"    } ],    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  },  \"rules\" : [ {    \"parameters\" : \"arbitrary json specific to the job\"  }, {    \"parameters\" : \"arbitrary json specific to the job\"  } ],  \"type\" : \"shell\",  \"indicators\" : [ {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  }, {    \"name\" : \"level\",    \"id\" : \"indicator-uuid\",    \"status\" : \"number\"  } ],  \"schedule\" : {    \"agent_id\" : \"agent-uuid\",    \"job_ids\" : [ \"job-uuid\", \"job-uuid\" ],    \"name\" : \"monitoring-account\",    \"id\" : \"account-uuid\"  },  \"agent_info\" : {    \"sub_system_count\" : 1,    \"os\" : \"windows 10\",    \"concurrent_jobs_limit\" : 0,    \"concurrent_jobs\" : 6,    \"service_name\" : \"B2C\",    \"ip\" : \"192.168.1.1\",    \"current_version\" : \"V1.2.5\",    \"modified_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"service_id\" : \"B2C-uuid\",    \"name\" : \"host01\",    \"topic\" : \"host_name-uuid\",    \"region_name\" : \"region-1\",    \"id\" : \"agent-uuid\",    \"metrics\" : {      \"disk\" : 22456,      \"memory\" : 22.5,      \"cpu\" : 22.5    },    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"running\"  },  \"last_ran_date\" : \"2018-03-20T09:12:28Z\",  \"name\" : \"firstjob\",  \"id\" : \"job-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Job.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Job>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Job>(HttpStatus.NOT_IMPLEMENTED);
    }

}
