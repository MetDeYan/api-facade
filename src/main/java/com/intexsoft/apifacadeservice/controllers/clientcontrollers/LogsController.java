package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.LogsConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/logs")
public class LogsController implements CrudController {
    @Getter
    private final LogsConsumerFeign consumerFeign;

    @Override
    public ResponseEntity<Object> deleteEntity(@PathVariable final String id) {
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Object> updateEntity(@PathVariable final String id,
                                               @RequestBody final Object request) {
        return ResponseEntity.badRequest().build();
    }
}
