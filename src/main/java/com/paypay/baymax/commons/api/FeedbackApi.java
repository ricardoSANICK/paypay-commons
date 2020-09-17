/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.paypay.baymax.commons.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.paypay.baymax.commons.type.OperFeedbackAllType;
import com.paypay.baymax.commons.type.OperFeedbackListAllType;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-15T01:25:18.202-05:00[America/Mexico_City]")
@Api(value = "feedback", description = "the feedback API")
public interface FeedbackApi {

    @ApiOperation(value = "Delete a record.", nickname = "disable", notes = "Delete (Logically) one or multiple records of a feedback ", tags={ "Performance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation") })
    @RequestMapping(value = "/feedback/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> disable(@ApiParam(value = "Feedback ID",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "Get all records.", nickname = "getAll", notes = "Get all the records of the feedbacks ", response = OperFeedbackListAllType.class, tags={ "Performance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = OperFeedbackListAllType.class) })
    @RequestMapping(value = "/feedback",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OperFeedbackListAllType> getAll();


    @ApiOperation(value = "Gets a feedback by ID.", nickname = "getFeedbackById", notes = "Get all the feedbacks by an ID as an object ", response = OperFeedbackAllType.class, tags={ "Performance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = OperFeedbackAllType.class) })
    @RequestMapping(value = "/feedback/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OperFeedbackAllType> getFeedbackById(@ApiParam(value = "Feedback ID",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "Insert a new Object.", nickname = "save", notes = "Insert one single record of a feedback ", response = OperFeedbackAllType.class, tags={ "Performance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = OperFeedbackAllType.class) })
    @RequestMapping(value = "/feedback",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OperFeedbackAllType> save(@ApiParam(value = "Insert a feedback object." ,required=true )  @Valid @RequestBody OperFeedbackAllType body);


    @ApiOperation(value = "Update a record.", nickname = "update", notes = "Update one single record of a feedback ", response = OperFeedbackAllType.class, tags={ "Performance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = OperFeedbackAllType.class) })
    @RequestMapping(value = "/feedback",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<OperFeedbackAllType> update(@ApiParam(value = "Update a feedback object." ,required=true )  @Valid @RequestBody OperFeedbackAllType body);

}
