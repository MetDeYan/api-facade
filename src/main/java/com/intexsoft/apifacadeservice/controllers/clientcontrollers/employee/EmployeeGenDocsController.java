package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeGenDocConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import com.intexsoft.apifacadeservice.entity.api.dto.GeneratedAddDocumentDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeGenDocsController {

    @Getter
    private final EmployeeGenDocConsumerFeign employeeGenDocConsumerFeign;

    private static final String URL_EMPLOYEE_GENERATE_DOC = "/{employeeId}/generate";
    private static final String URL_EMPLOYEE_GENERATE_DOC_ID = "/{employeeId}/generate/{documentId}";

    @GetMapping(URL_EMPLOYEE_GENERATE_DOC)
    public ResponseEntity<Object> getEmployeeGenDocs(@PathVariable final String employeeId) {
        return employeeGenDocConsumerFeign.getEmployeeGenDocs(employeeId);
    }

    @PostMapping(URL_EMPLOYEE_GENERATE_DOC)
    public ResponseEntity<EntityId> addEmployeeGenDoc(@PathVariable final String employeeId,
                                                      @RequestBody final GeneratedAddDocumentDto generatedAddDocumentDto) {
        return employeeGenDocConsumerFeign.addEmployeeGenDoc(employeeId, generatedAddDocumentDto);
    }

    @PutMapping(URL_EMPLOYEE_GENERATE_DOC_ID)
    public ResponseEntity<EntityId> updateEmployeeGenDoc(@PathVariable final String employeeId,
                                                         @PathVariable final String documentId,
                                                         @RequestBody final GeneratedAddDocumentDto generatedAddDocumentDto) {
        return employeeGenDocConsumerFeign.updateEmployeeGenDoc(employeeId, documentId, generatedAddDocumentDto);
    }

    @DeleteMapping(URL_EMPLOYEE_GENERATE_DOC_ID)
    public ResponseEntity<EntityId> deleteEmployeeGenDoc(@PathVariable final String employeeId,
                                                         @PathVariable final String documentId) {
        return employeeGenDocConsumerFeign.deleteEmployeeGenDoc(employeeId, documentId);
    }

}
