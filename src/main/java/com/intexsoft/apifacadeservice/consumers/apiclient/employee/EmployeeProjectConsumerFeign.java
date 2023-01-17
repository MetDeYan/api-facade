package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.ProjectAddDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with employee project api-service requests
 */
@FeignClient(value = "employee-project-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeProjectConsumerFeign {

    String URL_EMPLOYEE_PROJECTS = "/{employeeId}/projects";
    String URL_EMPLOYEE_PROJECTS_ID = "/{employeeId}/projects/{projectId}";

    @GetMapping(URL_EMPLOYEE_PROJECTS)
    ResponseEntity<Object> getEmployeeProjects(@PathVariable final String employeeId);

    @PostMapping(URL_EMPLOYEE_PROJECTS)
    ResponseEntity<EntityId> addEmployeeProject(@PathVariable final String employeeId,
                                                @RequestBody final ProjectAddDto projectAddDto);

    @DeleteMapping(URL_EMPLOYEE_PROJECTS_ID)
    ResponseEntity<EntityId> deleteEmployeeProject(@PathVariable final String employeeId,
                                                   @PathVariable final String projectId);

}
