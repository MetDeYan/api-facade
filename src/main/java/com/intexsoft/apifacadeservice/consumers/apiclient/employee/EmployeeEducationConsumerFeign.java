package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.EducationAddDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with employee education api-service requests
 */
@FeignClient(value = "employee-education-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeEducationConsumerFeign {

    String URL_EMPLOYEE_EDUCATION = "/{employeeId}/education";
    String URL_EMPLOYEE_EDUCATION_ID = "/{employeeId}/education/{educationId}";

    @GetMapping(URL_EMPLOYEE_EDUCATION)
    ResponseEntity<Object> getEmployeeEducations(@PathVariable final String employeeId);

    @PostMapping(URL_EMPLOYEE_EDUCATION)
    ResponseEntity<EntityId> addEmployeeEducation(@PathVariable final String employeeId,
                                                  @RequestBody final EducationAddDto educationAddDto);

    @PutMapping(URL_EMPLOYEE_EDUCATION_ID)
    ResponseEntity<EntityId> updateEmployeeEducation(@PathVariable final String employeeId,
                                                     @PathVariable final String educationId,
                                                     @RequestBody final EducationAddDto educationAddDto);

    @DeleteMapping(URL_EMPLOYEE_EDUCATION_ID)
    ResponseEntity<EntityId> deleteEmployeeEducation(@PathVariable final String employeeId,
                                                     @PathVariable final String educationId);

}
