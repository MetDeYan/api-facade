package com.intexsoft.apifacadeservice.controllers.clientcontrollers.language;

import com.intexsoft.apifacadeservice.consumers.apiclient.language.LanguageConsumerFeign;
import com.intexsoft.apifacadeservice.controllers.clientcontrollers.CrudController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/settings/language")
public class LanguagesController implements CrudController {
    //router.put('/', todo not found in client
    private static final String URL_BY_ID = "/{id}";
    @Getter
    private final LanguageConsumerFeign consumerFeign;
}
