package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Department;
import lombok.Data;

import java.util.List;

/**
 * The type Department dto.
 */
@Data
public class DepartmentDto {

    private int count;
    private List<Department> rows;

}
