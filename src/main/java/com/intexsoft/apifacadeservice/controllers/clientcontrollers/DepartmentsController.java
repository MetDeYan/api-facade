package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.DepartmentConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/departments")
public class DepartmentsController implements CrudController {
    private static final String URL_FULL_DEPARTMENT = "/full";
    @Getter
    private final DepartmentConsumerFeign consumerFeign;

    @GetMapping(URL_FULL_DEPARTMENT)
    ResponseEntity<Object> getAllFullDepartments() {
        return consumerFeign.getAllFull();
    }
}
