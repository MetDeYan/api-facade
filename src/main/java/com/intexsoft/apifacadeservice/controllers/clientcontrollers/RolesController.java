package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.RoleConsumerFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/roles")
public class RolesController {
    //router.post('/', todo 404 not found at api-service
    private final RoleConsumerFeign roleConsumerFeign;

    @GetMapping()  
    public ResponseEntity<Object> getAllRoles() {
        return roleConsumerFeign.getAllRoles();
    }
}
