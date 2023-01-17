package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Technology;
import lombok.Data;

import java.util.List;

/**
 * The type Technology dto.
 */
@Data
public class TechnologyDto {

    private int count;
    private List<Technology> rows;

}
