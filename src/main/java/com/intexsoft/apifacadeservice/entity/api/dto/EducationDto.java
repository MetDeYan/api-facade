package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Education;
import lombok.Data;

import java.util.List;

/**
 * The type Education dto.
 */
@Data
public class EducationDto {

    private int count;
    private List<Education> rows;

}
