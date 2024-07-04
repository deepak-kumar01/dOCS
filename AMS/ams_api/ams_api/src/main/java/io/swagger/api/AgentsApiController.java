package io.swagger.api;

import io.swagger.model.ActionParams;
import io.swagger.model.ActionResult;
import io.swagger.model.Agent;
import io.swagger.model.AgentCreate;
import io.swagger.model.BaseResponse;
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
public class AgentsApiController implements AgentsApi {

    private static final Logger log = LoggerFactory.getLogger(AgentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AgentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Agent>> agentSearch(@ApiParam(value = "") @Valid @RequestParam(value = "os", required = false) String os,@ApiParam(value = "") @Valid @RequestParam(value = "state", required = false) String state,@ApiParam(value = "") @Valid @RequestParam(value = "host_name", required = false) String hostName,@ApiParam(value = "") @Valid @RequestParam(value = "ip", required = false) String ip) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Agent>>(objectMapper.readValue("[ {  \"sub_system_count\" : 1,  \"os\" : \"windows 10\",  \"concurrent_jobs_limit\" : 0,  \"concurrent_jobs\" : 6,  \"service_name\" : \"B2C\",  \"ip\" : \"192.168.1.1\",  \"current_version\" : \"V1.2.5\",  \"modified_date\" : \"2018-03-20T09:12:28Z\",  \"created_by\" : \"user-uuid\",  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"service_id\" : \"B2C-uuid\",  \"name\" : \"host01\",  \"topic\" : \"host_name-uuid\",  \"region_name\" : \"region-1\",  \"id\" : \"agent-uuid\",  \"metrics\" : {    \"disk\" : 22456,    \"memory\" : 22.5,    \"cpu\" : 22.5  },  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}, {  \"sub_system_count\" : 1,  \"os\" : \"windows 10\",  \"concurrent_jobs_limit\" : 0,  \"concurrent_jobs\" : 6,  \"service_name\" : \"B2C\",  \"ip\" : \"192.168.1.1\",  \"current_version\" : \"V1.2.5\",  \"modified_date\" : \"2018-03-20T09:12:28Z\",  \"created_by\" : \"user-uuid\",  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"service_id\" : \"B2C-uuid\",  \"name\" : \"host01\",  \"topic\" : \"host_name-uuid\",  \"region_name\" : \"region-1\",  \"id\" : \"agent-uuid\",  \"metrics\" : {    \"disk\" : 22456,    \"memory\" : 22.5,    \"cpu\" : 22.5  },  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Agent>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Agent>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Agent> createAgent(@ApiParam(value = "Agent JSON" ,required=true )  @Valid @RequestBody AgentCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Agent>(objectMapper.readValue("{  \"sub_system_count\" : 1,  \"os\" : \"windows 10\",  \"concurrent_jobs_limit\" : 0,  \"concurrent_jobs\" : 6,  \"service_name\" : \"B2C\",  \"ip\" : \"192.168.1.1\",  \"current_version\" : \"V1.2.5\",  \"modified_date\" : \"2018-03-20T09:12:28Z\",  \"created_by\" : \"user-uuid\",  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"service_id\" : \"B2C-uuid\",  \"name\" : \"host01\",  \"topic\" : \"host_name-uuid\",  \"region_name\" : \"region-1\",  \"id\" : \"agent-uuid\",  \"metrics\" : {    \"disk\" : 22456,    \"memory\" : 22.5,    \"cpu\" : 22.5  },  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Agent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Agent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Agent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BaseResponse> deleteAgentById(@ApiParam(value = "agent id to delete",required=true) @PathVariable("agentId") String agentId) {
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

    public ResponseEntity<ActionResult> executeAgentAction(@ApiParam(value = "ID of agent to execute action on",required=true) @PathVariable("agentId") String agentId,@ApiParam(value = "Name of the action to execute",required=true) @PathVariable("action") String action,@ApiParam(value = "Parameters for the action" ,required=true )  @Valid @RequestBody ActionParams body) {
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

    public ResponseEntity<Agent> fetchAgentById(@ApiParam(value = "ID of agent to return",required=true) @PathVariable("agentId") String agentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Agent>(objectMapper.readValue("{  \"sub_system_count\" : 1,  \"os\" : \"windows 10\",  \"concurrent_jobs_limit\" : 0,  \"concurrent_jobs\" : 6,  \"service_name\" : \"B2C\",  \"ip\" : \"192.168.1.1\",  \"current_version\" : \"V1.2.5\",  \"modified_date\" : \"2018-03-20T09:12:28Z\",  \"created_by\" : \"user-uuid\",  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"service_id\" : \"B2C-uuid\",  \"name\" : \"host01\",  \"topic\" : \"host_name-uuid\",  \"region_name\" : \"region-1\",  \"id\" : \"agent-uuid\",  \"metrics\" : {    \"disk\" : 22456,    \"memory\" : 22.5,    \"cpu\" : 22.5  },  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Agent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Agent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Agent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Agent> modifyAgentById(@ApiParam(value = "agent id to modify",required=true) @PathVariable("agentId") String agentId,@ApiParam(value = "Agent JSON" ,required=true )  @Valid @RequestBody Agent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Agent>(objectMapper.readValue("{  \"sub_system_count\" : 1,  \"os\" : \"windows 10\",  \"concurrent_jobs_limit\" : 0,  \"concurrent_jobs\" : 6,  \"service_name\" : \"B2C\",  \"ip\" : \"192.168.1.1\",  \"current_version\" : \"V1.2.5\",  \"modified_date\" : \"2018-03-20T09:12:28Z\",  \"created_by\" : \"user-uuid\",  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"service_id\" : \"B2C-uuid\",  \"name\" : \"host01\",  \"topic\" : \"host_name-uuid\",  \"region_name\" : \"region-1\",  \"id\" : \"agent-uuid\",  \"metrics\" : {    \"disk\" : 22456,    \"memory\" : 22.5,    \"cpu\" : 22.5  },  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Agent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Agent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Agent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Agent> patchAgentById(@ApiParam(value = "agent id to modify",required=true) @PathVariable("agentId") String agentId,@ApiParam(value = "Agent JSON" ,required=true )  @Valid @RequestBody Agent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Agent>(objectMapper.readValue("{  \"sub_system_count\" : 1,  \"os\" : \"windows 10\",  \"concurrent_jobs_limit\" : 0,  \"concurrent_jobs\" : 6,  \"service_name\" : \"B2C\",  \"ip\" : \"192.168.1.1\",  \"current_version\" : \"V1.2.5\",  \"modified_date\" : \"2018-03-20T09:12:28Z\",  \"created_by\" : \"user-uuid\",  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"service_id\" : \"B2C-uuid\",  \"name\" : \"host01\",  \"topic\" : \"host_name-uuid\",  \"region_name\" : \"region-1\",  \"id\" : \"agent-uuid\",  \"metrics\" : {    \"disk\" : 22456,    \"memory\" : 22.5,    \"cpu\" : 22.5  },  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"running\"}", Agent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Agent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Agent>(HttpStatus.NOT_IMPLEMENTED);
    }

}
