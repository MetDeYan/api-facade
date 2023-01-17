package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.LanguageLevel;
import lombok.Data;

import java.util.List;

/**
 * The type Language level dto.
 */
@Data
public class LanguageLevelDto {

    private int count;
    private List<LanguageLevel> rows;

}