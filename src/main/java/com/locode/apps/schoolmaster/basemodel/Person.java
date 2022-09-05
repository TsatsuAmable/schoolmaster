/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.basemodel;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "other_name")
    private String otherName;

    @Column(name = "last_name")
    private String lastName;
}
