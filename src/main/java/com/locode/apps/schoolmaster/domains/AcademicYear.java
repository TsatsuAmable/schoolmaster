package com.locode.apps.schoolmaster.domains;

import com.locode.apps.schoolmaster.model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
* Chronology of this system should derive from this class
* */
@Data
@Entity
@Table(name = "year")
public class AcademicYear extends BaseEntity {
    private String academicYear;
//    private Year from;
//    private Year to;

}
