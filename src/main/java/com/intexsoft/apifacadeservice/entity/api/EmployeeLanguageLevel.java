package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The Employee language level entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeLanguageLevel {

    private String id;
    private Language language;
    private LanguageLevel spokenLanguageLevel;
    private LanguageLevel readingLanguageLevel;

}
