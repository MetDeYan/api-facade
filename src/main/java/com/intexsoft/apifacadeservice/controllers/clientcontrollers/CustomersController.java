package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.CustomerConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomersController implements CrudController {
    private static final String URL_PROJECTS_AND_DOMAINS = "/projectsAndDomains";
    private static final String URL_PROJECTS_AND_DOMAINS_SEARCH = "/projectsAndDomains/search";
    @Getter
    private final CustomerConsumerFeign consumerFeign;

    @GetMapping(URL_PROJECTS_AND_DOMAINS)
    public ResponseEntity<Object> getCustomersWithProjectsAndDomains() {
        return consumerFeign.getCustomersWithProjectsAndDomains();
    }

    @PostMapping(URL_PROJECTS_AND_DOMAINS_SEARCH)
    public ResponseEntity<Object> searchCustomersWithProjectsAndDomains(@RequestParam final String limit,
                                                                        @RequestParam final String offset,
                                                                        @RequestBody final Object customer) {
        return consumerFeign.searchCustomersWithProjectsAndDomains(limit, offset, customer);
    }
}
