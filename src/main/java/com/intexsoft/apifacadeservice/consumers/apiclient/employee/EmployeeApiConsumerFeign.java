package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with employee api-service requests
 */
@FeignClient(value = "employee-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeApiConsumerFeign {

    String URL_EMPLOYEE = "/{employeeId}";
    String URL_SEARCH_EMPLOYEES = "/search";

    @GetMapping
    ResponseEntity<Object> getAllEmployees(@RequestParam("fields") final String fields);

    @PostMapping
    ResponseEntity<Object> addEmployee(@RequestBody final Object request);

    @GetMapping(URL_EMPLOYEE)
    ResponseEntity<Object> getEmployee(@PathVariable final String employeeId,
                                       @RequestParam("fields") final String fields);

    @PutMapping(URL_EMPLOYEE)
    ResponseEntity<Object> editEmployee(@PathVariable final String employeeId,
                                        @RequestBody final Object request);

    @DeleteMapping(URL_EMPLOYEE)
    ResponseEntity<Object> deleteEmployee(@PathVariable final String employeeId);

    @PostMapping(URL_SEARCH_EMPLOYEES)
    ResponseEntity<Object> searchEmployees(@RequestParam("fields") final String fields,
                                           @RequestParam("sort") final String sort,
                                           @RequestParam("limit") final String limit,
                                           @RequestParam("offset") final String offset);

}
