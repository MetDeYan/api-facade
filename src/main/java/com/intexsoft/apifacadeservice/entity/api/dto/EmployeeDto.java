package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Employee;
import lombok.Data;

import java.util.List;

/**
 * The type Employee dto.
 */
@Data
public class EmployeeDto {

    private int count;
    private List<Employee> rows;

}
