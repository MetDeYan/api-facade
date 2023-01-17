package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The technology entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Technology {

//    private String id;
//    private String title;
//    private int order;
//    private Group group;

    private String id;
    private String title;
    private int order;
    private String technologyGroupId;
    private int technologyTypeId;

}
