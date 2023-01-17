package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with employee career api-service requests
 */
@FeignClient(value = "employee-career-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeCareerConsumerFeign {

    String URL_EMPLOYEE_CAREER = "/{employeeId}/career";
    String URL_EMPLOYEE_CAREER_ID = "/{employeeId}/career/{careerId}";

    @GetMapping(URL_EMPLOYEE_CAREER)
    ResponseEntity<Object> getEmployeeCareer(@PathVariable final String employeeId);

    @PostMapping(URL_EMPLOYEE_CAREER)
    ResponseEntity<EntityId> addEmployeeCareer(@PathVariable final String employeeId,
                                               @RequestBody final CareerAddDto careerAddDto);

    @PutMapping(URL_EMPLOYEE_CAREER_ID)
    ResponseEntity<EntityId> updateEmployeeCareer(@PathVariable final String employeeId,
                                                  @PathVariable final String careerId,
                                                  @RequestBody final CareerAddDto careerAddDto);

    @DeleteMapping(URL_EMPLOYEE_CAREER_ID)
    ResponseEntity<EntityId> deleteEmployeeCareer(@PathVariable final String employeeId,
                                                  @PathVariable final String careerId);

}
