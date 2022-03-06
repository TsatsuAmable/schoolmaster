package com.locode.apps.schoolmaster.domains;

import com.locode.apps.schoolmaster.model.BaseEntity;
import com.locode.apps.schoolmaster.teacher.Teacher;
import lombok.Data;
import org.joda.money.Money;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "salaries")
public class Salary extends BaseEntity {

    String level;
    Money amount;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Teacher> teacherSalaries  = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<School> salaries  = new ArrayList<>();
}
