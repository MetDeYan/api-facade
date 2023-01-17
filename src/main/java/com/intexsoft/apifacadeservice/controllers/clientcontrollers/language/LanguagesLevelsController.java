package com.intexsoft.apifacadeservice.controllers.clientcontrollers.language;

import com.intexsoft.apifacadeservice.consumers.apiclient.language.LanguageLevelConsumerFeign;
import com.intexsoft.apifacadeservice.controllers.clientcontrollers.CrudController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/settings/language_levels")
public class LanguagesLevelsController implements CrudController {
    //router.put('/', todo not found
    @Getter
    private final LanguageLevelConsumerFeign consumerFeign;
}
