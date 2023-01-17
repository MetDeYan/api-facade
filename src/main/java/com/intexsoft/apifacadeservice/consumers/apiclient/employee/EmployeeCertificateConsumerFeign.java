package com.intexsoft.apifacadeservice.consumers.apiclient.employee;

import com.intexsoft.apifacadeservice.entity.api.EntityId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Consumer to work with employee certificate api-service requests
 */
@FeignClient(value = "employee-certificate-api-consumer",
        url = "${api.service.url}/employees")
public interface EmployeeCertificateConsumerFeign {

    String URL_EMPLOYEE_CERTIFICATES = "/{employeeId}/certificates";
    String URL_EMPLOYEE_CERTIFICATE_ID = "/{certificateId}/certificates";
    String URL_EMPLOYEE_CERTIFICATE_IMAGE = "/{certificateId}/certificate_image";

    @GetMapping(URL_EMPLOYEE_CERTIFICATES)
    ResponseEntity<Object> getEmployeeCertificates(@PathVariable final String employeeId);

    @GetMapping(URL_EMPLOYEE_CERTIFICATE_IMAGE)
    ResponseEntity<ByteArrayResource> getEmployeeCertificateImageById(@PathVariable final String certificateId);

    @PostMapping(value = URL_EMPLOYEE_CERTIFICATES, consumes = "multipart/form-data")
    ResponseEntity<EntityId> addEmployeeCertificate(@PathVariable final String employeeId,
                                                    @RequestPart final MultipartFile file,
                                                    @RequestPart final String title,
                                                    @RequestPart final String titleRu,
                                                    @RequestPart final String link);

    @PutMapping(value = URL_EMPLOYEE_CERTIFICATE_ID, consumes = "multipart/form-data")
    ResponseEntity<EntityId> editEmployeeCertificate(@PathVariable final String certificateId,
                                                     @RequestPart final MultipartFile file,
                                                     @RequestPart final String title,
                                                     @RequestPart final String titleRu,
                                                     @RequestPart final String link);

    @DeleteMapping(URL_EMPLOYEE_CERTIFICATE_ID)
    ResponseEntity<EntityId> deleteEmployeeCertificate(@PathVariable final String certificateId);

}
