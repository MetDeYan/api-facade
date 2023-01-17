package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.EmployeeTechnologyAddDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with employee technology api-service requests
 */
@FeignClient(value = "employee-technology-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeTechnologyConsumerFeign {

    String URL_EMPLOYEE_TECHNOLOGIES = "/{employeeId}/technologies";
    String URL_EMPLOYEE_TECHNOLOGIES_ID = "/{employeeId}/technologies/{technologyId}";

    @GetMapping(URL_EMPLOYEE_TECHNOLOGIES)
    ResponseEntity<Object> getEmployeeTechnologies(@PathVariable final String employeeId);

    @PostMapping(URL_EMPLOYEE_TECHNOLOGIES)
    ResponseEntity<EntityId> addEmployeeTechnology(@PathVariable final String employeeId,
                                                   @RequestBody final EmployeeTechnologyAddDto employeeTechnologyAddDto);

    @PutMapping(URL_EMPLOYEE_TECHNOLOGIES_ID)
    ResponseEntity<EntityId> updateEmployeeTechnology(@PathVariable final String employeeId,
                                                      @PathVariable final String technologyId,
                                                      @RequestBody final EmployeeTechnologyAddDto employeeTechnologyAddDto);

    @DeleteMapping(URL_EMPLOYEE_TECHNOLOGIES_ID)
    ResponseEntity<EntityId> deleteEmployeeTechnology(@PathVariable final String employeeId,
                                                      @PathVariable final String technologyId);

}
