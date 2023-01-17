package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeEducationConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.EducationAddDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeEducationController {

    @Getter
    private final EmployeeEducationConsumerFeign employeeEducationConsumerFeign;

    private static final String URL_EMPLOYEE_EDUCATION = "/{employeeId}/education";
    private static final String URL_EMPLOYEE_EDUCATION_ID = "/{employeeId}/education/{educationId}";

    @GetMapping(URL_EMPLOYEE_EDUCATION)
    public ResponseEntity<Object> getEmployeeEducations(@PathVariable final String employeeId) {
        return employeeEducationConsumerFeign.getEmployeeEducations(employeeId);
    }

    @PostMapping(URL_EMPLOYEE_EDUCATION)
    public ResponseEntity<EntityId> addEmployeeEducation(@PathVariable final String employeeId,
                                                         @RequestBody final EducationAddDto educationAddDto) {
        return employeeEducationConsumerFeign.addEmployeeEducation(employeeId, educationAddDto);
    }

    @PutMapping(URL_EMPLOYEE_EDUCATION_ID)
    public ResponseEntity<EntityId> updateEmployeeEducation(@PathVariable final String employeeId,
                                                            @PathVariable final String educationId,
                                                            @RequestBody final EducationAddDto educationAddDto) {
        return employeeEducationConsumerFeign.updateEmployeeEducation(employeeId, educationId, educationAddDto);
    }

    @DeleteMapping(URL_EMPLOYEE_EDUCATION_ID)
    public ResponseEntity<EntityId> deleteEmployeeEducation(@PathVariable final String employeeId,
                                                            @PathVariable final String educationId) {
        return employeeEducationConsumerFeign.deleteEmployeeEducation(employeeId, educationId);
    }

}
