package com.intexsoft.apifacadeservice.entity.api;

import lombok.Data;

/**
 * The career entity.
 */
@Data
public class Career {

    private String id;
    private String organization;
    private String dateStart;
    private String dateEnd;
    private Position position;

}