package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.GeneratedAddDocumentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer to work with employee generate docs api-service requests
 */
@FeignClient(value = "employee-gendoc-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeGenDocConsumerFeign {

    String URL_EMPLOYEE_GENERATE_DOC = "/{employeeId}/generate";
    String URL_EMPLOYEE_GENERATE_DOC_ID = "/{employeeId}/generate/{documentId}";

    @GetMapping(URL_EMPLOYEE_GENERATE_DOC)
    ResponseEntity<Object> getEmployeeGenDocs(@PathVariable final String employeeId);

    @PostMapping(URL_EMPLOYEE_GENERATE_DOC)
    ResponseEntity<EntityId> addEmployeeGenDoc(@PathVariable final String employeeId,
                                               @RequestBody final GeneratedAddDocumentDto generatedAddDocumentDto);

    @PutMapping(URL_EMPLOYEE_GENERATE_DOC_ID)
    ResponseEntity<EntityId> updateEmployeeGenDoc(@PathVariable final String employeeId,
                                                  @PathVariable final String documentId,
                                                  @RequestBody final GeneratedAddDocumentDto generatedAddDocumentDto);

    @DeleteMapping(URL_EMPLOYEE_GENERATE_DOC_ID)
    ResponseEntity<EntityId> deleteEmployeeGenDoc(@PathVariable final String employeeId,
                                                  @PathVariable final String documentId);

}
