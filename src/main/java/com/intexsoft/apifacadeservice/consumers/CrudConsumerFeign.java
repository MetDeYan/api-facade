package com.intexsoft.apifacadeservice.consumers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface CrudConsumerFeign {
    String URL_BY_ID = "/{id}";

    @GetMapping
    ResponseEntity<Object> getAll();

    @PostMapping
    ResponseEntity<Object> addEntity(@RequestBody final Object entity);

    @DeleteMapping(URL_BY_ID)
    ResponseEntity<Object> deleteEntity(@PathVariable final String id);

    @PutMapping(URL_BY_ID)
    ResponseEntity<Object> updateEntity(@PathVariable final String id,
                                        @RequestBody final Object entity);
}
