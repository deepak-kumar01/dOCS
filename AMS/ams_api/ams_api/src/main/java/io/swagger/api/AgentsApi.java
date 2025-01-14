/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ActionParams;
import io.swagger.model.ActionResult;
import io.swagger.model.Agent;
import io.swagger.model.AgentCreate;
import io.swagger.model.BaseResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-23T02:39:15.205Z")

@Api(value = "agents", description = "the agents API")
public interface AgentsApi {

    @ApiOperation(value = "Search for agent", nickname = "agentSearch", notes = "", response = Agent.class, responseContainer = "List", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "agents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Agent.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request", response = BaseResponse.class),
        @ApiResponse(code = 404, message = "Agent not found", response = BaseResponse.class) })
    @RequestMapping(value = "/agents/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Agent>> agentSearch(@ApiParam(value = "") @Valid @RequestParam(value = "os", required = false) String os,@ApiParam(value = "") @Valid @RequestParam(value = "state", required = false) String state,@ApiParam(value = "") @Valid @RequestParam(value = "host_name", required = false) String hostName,@ApiParam(value = "") @Valid @RequestParam(value = "ip", required = false) String ip);


    @ApiOperation(value = "Create a new agent", nickname = "createAgent", notes = "", response = Agent.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "agents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Agent.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = BaseResponse.class) })
    @RequestMapping(value = "/agents",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Agent> createAgent(@ApiParam(value = "Agent JSON" ,required=true )  @Valid @RequestBody AgentCreate body);


    @ApiOperation(value = "Delete agent by id", nickname = "deleteAgentById", notes = "", response = BaseResponse.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "agents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = BaseResponse.class),
        @ApiResponse(code = 400, message = "Invalid request", response = BaseResponse.class),
        @ApiResponse(code = 404, message = "Agent not found", response = BaseResponse.class) })
    @RequestMapping(value = "/agents/{agentId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<BaseResponse> deleteAgentById(@ApiParam(value = "agent id to delete",required=true) @PathVariable("agentId") String agentId);


    @ApiOperation(value = "Execute Action", nickname = "executeAgentAction", notes = "", response = ActionResult.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "agents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ActionResult.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = BaseResponse.class),
        @ApiResponse(code = 404, message = "Agent not found", response = BaseResponse.class) })
    @RequestMapping(value = "/agents/{agentId}/actions/{action}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ActionResult> executeAgentAction(@ApiParam(value = "ID of agent to execute action on",required=true) @PathVariable("agentId") String agentId,@ApiParam(value = "Name of the action to execute",required=true) @PathVariable("action") String action,@ApiParam(value = "Parameters for the action" ,required=true )  @Valid @RequestBody ActionParams body);


    @ApiOperation(value = "Fetch agent by id", nickname = "fetchAgentById", notes = "", response = Agent.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "agents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Agent.class),
        @ApiResponse(code = 400, message = "Invalid request", response = BaseResponse.class),
        @ApiResponse(code = 404, message = "Agent not found", response = BaseResponse.class) })
    @RequestMapping(value = "/agents/{agentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Agent> fetchAgentById(@ApiParam(value = "ID of agent to return",required=true) @PathVariable("agentId") String agentId);


    @ApiOperation(value = "Modify agent by id", nickname = "modifyAgentById", notes = "", response = Agent.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "agents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Agent.class),
        @ApiResponse(code = 400, message = "Invalid request", response = BaseResponse.class),
        @ApiResponse(code = 404, message = "Agent not found", response = BaseResponse.class) })
    @RequestMapping(value = "/agents/{agentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Agent> modifyAgentById(@ApiParam(value = "agent id to modify",required=true) @PathVariable("agentId") String agentId,@ApiParam(value = "Agent JSON" ,required=true )  @Valid @RequestBody Agent body);


    @ApiOperation(value = "Modify agent by id", nickname = "patchAgentById", notes = "", response = Agent.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "agents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Agent.class),
        @ApiResponse(code = 400, message = "Invalid request", response = BaseResponse.class),
        @ApiResponse(code = 404, message = "Agent not found", response = BaseResponse.class) })
    @RequestMapping(value = "/agents/{agentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Agent> patchAgentById(@ApiParam(value = "agent id to modify",required=true) @PathVariable("agentId") String agentId,@ApiParam(value = "Agent JSON" ,required=true )  @Valid @RequestBody Agent body);

}
