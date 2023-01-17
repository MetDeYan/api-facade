package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeApiConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeesController {

    @Getter
    private final EmployeeApiConsumerFeign employeeApiConsumerFeign;

    private static final String URL_EMPLOYEE = "/{employeeId}";
    private static final String URL_SEARCH_EMPLOYEES = "/search";

    @GetMapping
    public ResponseEntity<Object> getAllEmployees(@RequestParam("fields") final String fields) {
        return employeeApiConsumerFeign.getAllEmployees(fields);
    }

    @PostMapping
    public ResponseEntity<Object> addEmployee(@RequestBody final Object request) {
        return employeeApiConsumerFeign.addEmployee(request);
    }

    @GetMapping(URL_EMPLOYEE)
    public ResponseEntity<Object> getEmployee(@PathVariable final String employeeId,
                                              @RequestParam("fields") final String fields) {
        return employeeApiConsumerFeign.getEmployee(employeeId, fields);
    }

    @PutMapping(URL_EMPLOYEE)
    public ResponseEntity<Object> editEmployee(@PathVariable final String employeeId,
                                               @RequestBody final Object request) {
        return employeeApiConsumerFeign.editEmployee(employeeId, request);
    }

    @DeleteMapping(URL_EMPLOYEE)
    public ResponseEntity<Object> deleteEmployee(@PathVariable final String employeeId) {
        return employeeApiConsumerFeign.deleteEmployee(employeeId);
    }

    @PostMapping(URL_SEARCH_EMPLOYEES)
    public ResponseEntity<Object> searchEmployees(@RequestParam("fields") final String fields,
                                                  @RequestParam("sort") final String sort,
                                                  @RequestParam("limit") final String limit,
                                                  @RequestParam("offset") final String offset) {
        return employeeApiConsumerFeign.searchEmployees(fields, sort, limit, offset);
    }

}
