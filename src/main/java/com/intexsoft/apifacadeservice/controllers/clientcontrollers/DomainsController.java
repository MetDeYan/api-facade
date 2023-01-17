package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.DomainConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/domains")
public class DomainsController implements CrudController {
    private static final String URL_SEARCH = "/search";
    @Getter
    private final DomainConsumerFeign consumerFeign;

    @PostMapping(URL_SEARCH)
    public ResponseEntity<Object> searchEntities(@RequestParam final String limit,
                                                 @RequestParam final String offset,
                                                 @RequestBody final Object body) {
        return getConsumerFeign().searchEntities(limit, offset, body);
    }
}
