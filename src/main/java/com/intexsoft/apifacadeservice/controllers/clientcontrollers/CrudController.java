package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.CrudConsumerFeign;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface CrudController {
    String URL_BY_ID = "/{id}";

    @GetMapping
    default ResponseEntity<Object> getAll() {
        return getConsumerFeign().getAll();
    }

    @PostMapping
    default ResponseEntity<Object> addEntity(@RequestBody final Object request) {
        return getConsumerFeign().addEntity(request);
    }

    @DeleteMapping(URL_BY_ID)
    default ResponseEntity<Object> deleteEntity(@PathVariable final String id) {
        return getConsumerFeign().deleteEntity(id);
    }

    @PutMapping(URL_BY_ID)
    default ResponseEntity<Object> updateEntity(@PathVariable final String id,
                                                @RequestBody final Object request) {
        return getConsumerFeign().updateEntity(id, request);
    }

    CrudConsumerFeign getConsumerFeign();
}
