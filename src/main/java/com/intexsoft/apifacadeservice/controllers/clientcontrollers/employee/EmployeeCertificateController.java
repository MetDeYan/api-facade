package com.intexsoft.apifacadeservice.controllers.clientcontrollers.employee;

import com.intexsoft.apifacadeservice.consumers.apiclient.employee.EmployeeCertificateConsumerFeign;
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

public class EmployeeCertificateController {

    @Getter
    private final EmployeeCertificateConsumerFeign employeeCertificateConsumerFeign;

    private static final String URL_EMPLOYEE_CERTIFICATES = "/{employeeId}/certificates";
    private static final String URL_EMPLOYEE_CERTIFICATE_ID = "/{certificateId}/certificates";
    private static final String URL_EMPLOYEE_CERTIFICATE_IMAGE = "/{certificateId}/certificate_image";

    @GetMapping(URL_EMPLOYEE_CERTIFICATES)
    public ResponseEntity<Object> getEmployeeCertificates(@PathVariable final String employeeId) {
        return employeeCertificateConsumerFeign.getEmployeeCertificates(employeeId);
    }

    @GetMapping(URL_EMPLOYEE_CERTIFICATE_IMAGE)
    public ResponseEntity<ByteArrayResource> getEmployeeCertificateImageById(@PathVariable final String certificateId) {
        return employeeCertificateConsumerFeign.getEmployeeCertificateImageById(certificateId);
    }

    @PostMapping(URL_EMPLOYEE_CERTIFICATES)
    public ResponseEntity<EntityId> addEmployeeCertificate(@PathVariable final String employeeId,
                                                           @RequestPart final MultipartFile file,
                                                           @RequestPart final String title,
                                                           @RequestPart final String titleRu,
                                                           @RequestPart final String link) {
        return employeeCertificateConsumerFeign.addEmployeeCertificate(employeeId, file, title, titleRu, link);
    }

    @PutMapping(URL_EMPLOYEE_CERTIFICATE_ID)
    public ResponseEntity<EntityId> editEmployeeCertificate(@PathVariable final String certificateId,
                                                            @RequestPart final MultipartFile file,
                                                            @RequestPart final String title,
                                                            @RequestPart final String titleRu,
                                                            @RequestPart final String link) {
        return employeeCertificateConsumerFeign.editEmployeeCertificate(certificateId, file, title, titleRu, link);
    }

    @DeleteMapping(URL_EMPLOYEE_CERTIFICATE_ID)
    public ResponseEntity<EntityId> deleteEmployeeCertificate(@PathVariable final String certificateId) {
        return employeeCertificateConsumerFeign.deleteEmployeeCertificate(certificateId);
    }

}
