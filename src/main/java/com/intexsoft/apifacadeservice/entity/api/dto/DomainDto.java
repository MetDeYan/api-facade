package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Department;
import lombok.Data;

import java.util.List;

/**
 * The type Domain dto.
 */
@Data
public class DomainDto {

    private int count;
    private List<Department> rows;

}
