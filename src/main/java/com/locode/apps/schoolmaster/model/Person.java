package com.locode.apps.schoolmaster.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;


@MappedSuperclass
@Data
public class Person extends BaseEntity{

    @Column(name = "first_name")
    @NotEmpty
    private String firstName;

    @Column(name = "other_name")
    @NotEmpty
    private String otherName;

    @Column(name = "last_name")
    @NotEmpty
    private String lastName;
}
