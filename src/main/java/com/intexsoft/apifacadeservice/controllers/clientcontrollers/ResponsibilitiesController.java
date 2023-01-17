package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.ResponsibilitiesConsumerFeign;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/responsibilities")
public class ResponsibilitiesController implements CrudController {
    //deprecated and not implemented:
//router.get('/:id/positions',
//router.post('/:id/positions',
//router.delete('/:id/positions',
    private static final String RESPONSIBILITIES_BY_ID = "/{id}";
    private static final String URL_SEARCH = "/search";
    @Getter
    private final ResponsibilitiesConsumerFeign consumerFeign;

    @GetMapping(RESPONSIBILITIES_BY_ID)  
    public ResponseEntity<Object> getAllResponsibilitiesById(@PathVariable final String id) {
        return consumerFeign.getAllResponsibilitiesById(id);
    }

    @PostMapping(URL_SEARCH)  
    public ResponseEntity<Object> search(@RequestParam(required = false) final String sort,
                                         @RequestParam final String limit,
                                         @RequestParam final String offset,
                                         @RequestBody final Object body) {
        return consumerFeign.search(sort, limit, offset, body);
    }
}
