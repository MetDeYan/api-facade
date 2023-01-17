package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The customer entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {

    private String id;
    private String title;

}
