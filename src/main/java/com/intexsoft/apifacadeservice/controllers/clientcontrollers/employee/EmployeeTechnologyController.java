package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeTechnologyConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.EmployeeTechnologyAddDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeTechnologyController {

    @Getter
    private final EmployeeTechnologyConsumerFeign employeeTechnologyConsumerFeign;

    private static final String URL_EMPLOYEE_TECHNOLOGIES = "/{employeeId}/technologies";
    private static final String URL_EMPLOYEE_TECHNOLOGIES_ID = "/{employeeId}/technologies/{technologyId}";

    @GetMapping(URL_EMPLOYEE_TECHNOLOGIES)
    public ResponseEntity<Object> getEmployeeTechnologies(@PathVariable final String employeeId) {
        return employeeTechnologyConsumerFeign.getEmployeeTechnologies(employeeId);
    }

    @PostMapping(URL_EMPLOYEE_TECHNOLOGIES)
    public ResponseEntity<EntityId> addEmployeeTechnology(@PathVariable final String employeeId,
                                                          @RequestBody final EmployeeTechnologyAddDto employeeTechnologyAddDto) {
        return employeeTechnologyConsumerFeign.addEmployeeTechnology(employeeId, employeeTechnologyAddDto);
    }

    @PutMapping(URL_EMPLOYEE_TECHNOLOGIES_ID)
    public ResponseEntity<EntityId> updateEmployeeTechnology(@PathVariable final String employeeId,
                                                             @PathVariable final String technologyId,
                                                             @RequestBody final EmployeeTechnologyAddDto employeeTechnologyAddDto) {
        return employeeTechnologyConsumerFeign.updateEmployeeTechnology(employeeId, technologyId, employeeTechnologyAddDto);
    }

    @DeleteMapping(URL_EMPLOYEE_TECHNOLOGIES_ID)
    public ResponseEntity<EntityId> deleteEmployeeTechnology(@PathVariable final String employeeId,
                                                             @PathVariable final String technologyId) {
        return employeeTechnologyConsumerFeign.deleteEmployeeTechnology(employeeId, technologyId);
    }

}
