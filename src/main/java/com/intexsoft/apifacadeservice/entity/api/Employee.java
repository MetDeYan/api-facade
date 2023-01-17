package com.intexsoft.apifacadeservice.entity.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * The employee entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

    private String id;
    private String name;
    private String surname;
    private String email;
    private boolean fired;
    private boolean isPM;

}
