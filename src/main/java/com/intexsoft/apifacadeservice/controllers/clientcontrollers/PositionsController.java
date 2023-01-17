package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.PositionConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/positions")
public class PositionsController implements CrudController {
    private static final String POSITIONS_BY_ID = "/{id}";
    @Getter
    private final PositionConsumerFeign consumerFeign;

    @GetMapping(POSITIONS_BY_ID)
    public ResponseEntity<Object> getPositionsById(@PathVariable final String id) {
        return consumerFeign.getPositionsById(id);
    }
}
