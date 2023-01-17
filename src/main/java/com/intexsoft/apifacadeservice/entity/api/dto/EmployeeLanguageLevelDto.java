package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.EmployeeLanguageLevel;
import lombok.Data;

import java.util.List;

/**
 * The type Employee language level dto.
 */
@Data
public class EmployeeLanguageLevelDto {

    private int count;
    private List<EmployeeLanguageLevel> rows;

}
