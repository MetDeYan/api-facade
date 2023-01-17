package com.intexsoft.apifacadeservice.controllers.clientcontrollers;

import com.intexsoft.apifacadeservice.consumers.apiclient.UserConsumerFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UsersController {
    private static final String GET_USER_BY_USERNAME = "/{username}";
    private static final String URL_SEARCH = "/search";
    //router.put('/:username', todo no idea how it works
    private final UserConsumerFeign consumerFeign;

    @GetMapping()  
    public ResponseEntity<Object> getAllUsers() {
        return consumerFeign.getAllUsers();
    }

    @GetMapping(GET_USER_BY_USERNAME)  
    public ResponseEntity<Object> getUserByUsername(@PathVariable final String username) {
        return consumerFeign.getUserByUsername(username);
    }

    @PutMapping(GET_USER_BY_USERNAME)
    public ResponseEntity<Object> putUserByUsername(@PathVariable final String username,
                                                    @RequestBody final Object body) {
        return consumerFeign.putUserByUsername(username, body);
    }

    @PostMapping(URL_SEARCH)  
    public ResponseEntity<Object> searchUsers(@RequestParam final String sort,
                                              @RequestParam final String limit,
                                              @RequestParam final String offset) {
        return consumerFeign.searchUsers(sort, limit, offset);
    }
}
