package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The group entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Group {

    private String id;
    private String title;
    private int order;
    private String marketingName;

}
