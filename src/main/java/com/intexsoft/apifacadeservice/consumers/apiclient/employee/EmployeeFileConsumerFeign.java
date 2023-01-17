package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Consumer to work with employee file api-service requests
 */
@FeignClient(value = "employee-file-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeFileConsumerFeign {

    String URL_EMPLOYEE_FILES = "/{employeeId}/files";
    String URL_EMPLOYEE_FILES_ID = "/{employeeId}/files/{fileId}";

    @GetMapping(URL_EMPLOYEE_FILES)
    ResponseEntity<Object> getEmployeeFiles(@PathVariable final String employeeId);

    @PostMapping(value = URL_EMPLOYEE_FILES, consumes = "multipart/form-data")
    ResponseEntity<EntityId> addEmployeeFile(@PathVariable final String employeeId, @RequestPart final MultipartFile file);

    @GetMapping(URL_EMPLOYEE_FILES_ID)
    ResponseEntity<ByteArrayResource> getEmployeeFileById(@PathVariable final String employeeId,
                                                          @PathVariable final String fileId);

    @DeleteMapping(URL_EMPLOYEE_FILES_ID)
    ResponseEntity<EntityId> deleteEmployeeFile(@PathVariable final String employeeId,
                                                @PathVariable final String fileId);

}
