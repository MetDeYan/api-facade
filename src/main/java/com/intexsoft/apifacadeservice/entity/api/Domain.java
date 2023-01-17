package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The domain entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Domain {

    private String id;
    private String title;

}
