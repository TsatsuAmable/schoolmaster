package com.locode.apps.schoolmaster.domains;

import com.locode.apps.schoolmaster.model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "departments")
public class Department extends BaseEntity {

    String name;
    String hod;

}
