package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The department entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Department {

    private String id;
    private String title;
    private String description;
    private String headId;

}
