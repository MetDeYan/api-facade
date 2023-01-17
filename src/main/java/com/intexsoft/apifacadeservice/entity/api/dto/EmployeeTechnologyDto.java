package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.EmployeeTechnology;
import lombok.Data;

import java.util.List;

/**
 * The type Employee technology dto.
 */
@Data
public class EmployeeTechnologyDto {

    private int count;
    private List<EmployeeTechnology> rows;

}
