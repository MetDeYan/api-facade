package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Career;
import lombok.Data;

import java.util.List;

/**
 * The type Career dto.
 */
@Data
public class CareerDto {

    private int count;
    private List<Career> rows;

}
