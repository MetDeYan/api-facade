package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeFileConsumerFeign;
import com.intexsoft.apifacadeservice.entity.api.EntityId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeFilesController {

    @Getter
    private final EmployeeFileConsumerFeign employeeFileConsumerFeign;

    private static final String URL_EMPLOYEE_FILES = "/{employeeId}/files";
    private static final String URL_EMPLOYEE_FILES_ID = "/{employeeId}/files/{fileId}";

    @GetMapping(URL_EMPLOYEE_FILES)
    public ResponseEntity<Object> getEmployeeFiles(@PathVariable final String employeeId) {
        return employeeFileConsumerFeign.getEmployeeFiles(employeeId);
    }

    @PostMapping(URL_EMPLOYEE_FILES)
    public ResponseEntity<EntityId> addEmployeeFile(@PathVariable final String employeeId, @RequestPart final MultipartFile file) {
        return employeeFileConsumerFeign.addEmployeeFile(employeeId, file);
    }

    @GetMapping(URL_EMPLOYEE_FILES_ID)
    public ResponseEntity<ByteArrayResource> getEmployeeFileById(@PathVariable final String employeeId,
                                                                 @PathVariable final String fileId) {
        return employeeFileConsumerFeign.getEmployeeFileById(employeeId, fileId);
    }

    @DeleteMapping(URL_EMPLOYEE_FILES_ID)
    public ResponseEntity<EntityId> deleteEmployeeFile(@PathVariable final String employeeId,
                                                       @PathVariable final String fileId) {
        return employeeFileConsumerFeign.deleteEmployeeFile(employeeId, fileId);
    }

}
