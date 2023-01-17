package com.intexsoft.apifacadeservice.entity.api.dto;

import lombok.Data;

/**
 * The type Language add dto.
 */
@Data
public class LanguageAddDto {

    private String languageId;
    private String readingLanguageLevelId;
    private String spokenLanguageLevelId;

}
