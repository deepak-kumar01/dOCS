package io.swagger.api;

import io.swagger.model.Agent;
import io.swagger.model.BaseResponse;
import io.swagger.model.Service;
import io.swagger.model.ServiceCreate;
import io.swagger.model.ServiceSuggest;
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
public class ServicesApiController implements ServicesApi {

    private static final Logger log = LoggerFactory.getLogger(ServicesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServicesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Service> createService(@ApiParam(value = "Service JSON" ,required=true )  @Valid @RequestBody ServiceCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Service>(objectMapper.readValue("{  \"management_dept\" : \"B2C-Logistics\",  \"name\" : \"B2C-XXX\",  \"id\" : \"service-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"person_in_charge\" : {    \"role\" : \"ARCHITECT\",    \"group_name\" : \"CAN-GROUP1\",    \"name\" : \"RPLAIRD\",    \"telephone\" : \"1-519-804-2832\",    \"email\" : \"robert.laird@vvdntech.in\"  },  \"created_by\" : \"user-uuid\",  \"subsystems\" : [ {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  }, {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  } ],  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"healthy\"}", Service.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Service>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Service>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Service> deleteServiceById(@ApiParam(value = "Service id to delete",required=true) @PathVariable("serviceId") String serviceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Service>(objectMapper.readValue("{  \"management_dept\" : \"B2C-Logistics\",  \"name\" : \"B2C-XXX\",  \"id\" : \"service-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"person_in_charge\" : {    \"role\" : \"ARCHITECT\",    \"group_name\" : \"CAN-GROUP1\",    \"name\" : \"RPLAIRD\",    \"telephone\" : \"1-519-804-2832\",    \"email\" : \"robert.laird@vvdntech.in\"  },  \"created_by\" : \"user-uuid\",  \"subsystems\" : [ {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  }, {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  } ],  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"healthy\"}", Service.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Service>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Service>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Service> fetchServiceById(@ApiParam(value = "ID of service to return",required=true) @PathVariable("serviceId") String serviceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Service>(objectMapper.readValue("{  \"management_dept\" : \"B2C-Logistics\",  \"name\" : \"B2C-XXX\",  \"id\" : \"service-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"person_in_charge\" : {    \"role\" : \"ARCHITECT\",    \"group_name\" : \"CAN-GROUP1\",    \"name\" : \"RPLAIRD\",    \"telephone\" : \"1-519-804-2832\",    \"email\" : \"robert.laird@vvdntech.in\"  },  \"created_by\" : \"user-uuid\",  \"subsystems\" : [ {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  }, {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  } ],  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"healthy\"}", Service.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Service>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Service>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Service> modifyServiceById(@ApiParam(value = "service id to modify",required=true) @PathVariable("serviceId") String serviceId,@ApiParam(value = "Service JSON" ,required=true )  @Valid @RequestBody Service body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Service>(objectMapper.readValue("{  \"management_dept\" : \"B2C-Logistics\",  \"name\" : \"B2C-XXX\",  \"id\" : \"service-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"person_in_charge\" : {    \"role\" : \"ARCHITECT\",    \"group_name\" : \"CAN-GROUP1\",    \"name\" : \"RPLAIRD\",    \"telephone\" : \"1-519-804-2832\",    \"email\" : \"robert.laird@vvdntech.in\"  },  \"created_by\" : \"user-uuid\",  \"subsystems\" : [ {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  }, {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  } ],  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"healthy\"}", Service.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Service>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Service>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Agent> patchServiceById(@ApiParam(value = "Service id to modify",required=true) @PathVariable("serviceId") String serviceId,@ApiParam(value = "Agent JSON" ,required=true )  @Valid @RequestBody Agent body) {
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

    public ResponseEntity<List<Service>> serviceSearch(@ApiParam(value = "") @Valid @RequestParam(value = "service", required = false) String service,@ApiParam(value = "") @Valid @RequestParam(value = "state", required = false) String state,@ApiParam(value = "") @Valid @RequestParam(value = "pic", required = false) String pic) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Service>>(objectMapper.readValue("[ {  \"management_dept\" : \"B2C-Logistics\",  \"name\" : \"B2C-XXX\",  \"id\" : \"service-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"person_in_charge\" : {    \"role\" : \"ARCHITECT\",    \"group_name\" : \"CAN-GROUP1\",    \"name\" : \"RPLAIRD\",    \"telephone\" : \"1-519-804-2832\",    \"email\" : \"robert.laird@vvdntech.in\"  },  \"created_by\" : \"user-uuid\",  \"subsystems\" : [ {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  }, {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  } ],  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"healthy\"}, {  \"management_dept\" : \"B2C-Logistics\",  \"name\" : \"B2C-XXX\",  \"id\" : \"service-uuid\",  \"create_date\" : \"2018-03-20T09:12:28Z\",  \"person_in_charge\" : {    \"role\" : \"ARCHITECT\",    \"group_name\" : \"CAN-GROUP1\",    \"name\" : \"RPLAIRD\",    \"telephone\" : \"1-519-804-2832\",    \"email\" : \"robert.laird@vvdntech.in\"  },  \"created_by\" : \"user-uuid\",  \"subsystems\" : [ {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  }, {    \"name\" : \"B2C-XXX\",    \"id\" : \"system-uuid\",    \"create_date\" : \"2018-03-20T09:12:28Z\",    \"created_by\" : \"user-uuid\",    \"last_date\" : \"2018-03-20T09:12:28Z\",    \"status\" : \"healthy\"  } ],  \"last_date\" : \"2018-03-20T09:12:28Z\",  \"status\" : \"healthy\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Service>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Service>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ServiceSuggest>> serviceSuggest(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "type", required = true) String type,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "input", required = true) String input) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ServiceSuggest>>(objectMapper.readValue("[ {  \"result\" : \"{ dynamic json }\",  \"result_type\" : \"pic\",  \"display_string\" : \"rplaird\"}, {  \"result\" : \"{ dynamic json }\",  \"result_type\" : \"pic\",  \"display_string\" : \"rplaird\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ServiceSuggest>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ServiceSuggest>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
