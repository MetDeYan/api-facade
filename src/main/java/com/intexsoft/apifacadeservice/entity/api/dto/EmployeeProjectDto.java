package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.EmployeeProject;
import lombok.Data;

import java.util.List;

/**
 * The type Employee project dto.
 */
@Data
public class EmployeeProjectDto {

    private int count;
    private List<EmployeeProject> rows;

}
