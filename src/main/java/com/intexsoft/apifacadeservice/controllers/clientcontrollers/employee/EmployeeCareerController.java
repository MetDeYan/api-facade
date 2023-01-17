package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeCareerConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.CareerAddDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeCareerController {

    @Getter
    private final EmployeeCareerConsumerFeign employeeCareerConsumerFeign;

    private static final String URL_EMPLOYEE_CAREER = "/{employeeId}/career";
    private static final String URL_EMPLOYEE_CAREER_ID = "/{employeeId}/career/{careerId}";

    @GetMapping(URL_EMPLOYEE_CAREER)
    public ResponseEntity<Object> getEmployeeCareer(@PathVariable final String employeeId) {
        return employeeCareerConsumerFeign.getEmployeeCareer(employeeId);
    }

    @PostMapping(URL_EMPLOYEE_CAREER)
    public ResponseEntity<EntityId> addEmployeeCareer(@PathVariable final String employeeId,
                                                      @RequestBody final CareerAddDto careerAddDto) {
        return employeeCareerConsumerFeign.addEmployeeCareer(employeeId, careerAddDto);
    }

    @PutMapping(URL_EMPLOYEE_CAREER_ID)
    public ResponseEntity<EntityId> updateEmployeeCareer(@PathVariable final String employeeId,
                                                         @PathVariable final String careerId,
                                                         @RequestBody final CareerAddDto careerAddDto) {
        return employeeCareerConsumerFeign.updateEmployeeCareer(employeeId, careerId, careerAddDto);
    }

    @DeleteMapping(URL_EMPLOYEE_CAREER_ID)
    public ResponseEntity<EntityId> deleteEmployeeCareer(@PathVariable final String employeeId,
                                                         @PathVariable final String careerId) {
        return employeeCareerConsumerFeign.deleteEmployeeCareer(employeeId, careerId);
    }

}
