package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Customer;;
import lombok.Data;

import java.util.List;

/**
 * The type Customer dto.
 */
@Data
public class CustomerDto {

    private int count;
    private List<Customer> rows;

}
