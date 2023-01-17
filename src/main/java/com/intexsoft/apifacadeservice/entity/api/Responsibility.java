package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The responsibility entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Responsibility {

    private String id;
    private String title;
    private String titleRu;

}
