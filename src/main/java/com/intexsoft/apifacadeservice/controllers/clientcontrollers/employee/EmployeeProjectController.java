package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeProjectConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.ProjectAddDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeProjectController {

    @Getter
    private final EmployeeProjectConsumerFeign employeeProjectConsumerFeign;

    private static final String URL_EMPLOYEE_PROJECTS = "/{employeeId}/projects";
    private static final String URL_EMPLOYEE_PROJECTS_ID = "/{employeeId}/projects/{projectId}";

    @GetMapping(URL_EMPLOYEE_PROJECTS)
    public ResponseEntity<Object> getEmployeeProjects(@PathVariable final String employeeId) {
        return employeeProjectConsumerFeign.getEmployeeProjects(employeeId);
    }

    @PostMapping(URL_EMPLOYEE_PROJECTS)
    public ResponseEntity<EntityId> addEmployeeProject(@PathVariable final String employeeId,
                                                       @RequestBody final ProjectAddDto projectAddDto) {
        return employeeProjectConsumerFeign.addEmployeeProject(employeeId, projectAddDto);
    }

    @DeleteMapping(URL_EMPLOYEE_PROJECTS_ID)
    public ResponseEntity<EntityId> deleteEmployeeProject(@PathVariable final String employeeId,
                                                          @PathVariable final String projectId) {
        return employeeProjectConsumerFeign.deleteEmployeeProject(employeeId, projectId);
    }

}
