package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Language;
import lombok.Data;

import java.util.List;

/**
 * The type Language dto.
 */
@Data
public class LanguageDto {

    private int count;
    private List<Language> rows;

}
