package com.intexsoft.apifacadeservice.entity.api.dto;

import com.intexsoft.apifacadeservice.entity.api.Group;
import lombok.Data;

import java.util.List;

/**
 * The type Technology dto.
 */
@Data
public class TechnologyGroupsDto {

    private int count;
    private List<Group> rows;

}
