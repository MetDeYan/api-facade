package com.intexsoft.apifacadeservice.controllers.clientcontrollers.technology;

import com.intexsoft.apifacadeservice.consumers.apiclient.technology.TechnologyConsumerFeign;
import com.intexsoft.apifacadeservice.controllers.clientcontrollers.CrudController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/technologies")
public class TechnologyController implements CrudController {

    private static final String URL_TECHNOLOGIES_SEARCH = "/search";

    @Getter
    private final TechnologyConsumerFeign consumerFeign;

    @GetMapping(URL_TECHNOLOGIES_SEARCH)
    public ResponseEntity<Object> getTechnologies() {
        return consumerFeign.getTechnologies();
    }

    @PostMapping(URL_TECHNOLOGIES_SEARCH)
    public ResponseEntity<Object> searchTechnologyWithFilter() {
        return consumerFeign.searchTechnologyWithFilter();
    }

}
