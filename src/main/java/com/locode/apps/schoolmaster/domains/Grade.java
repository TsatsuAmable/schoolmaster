package com.locode.apps.schoolmaster.domains;

import com.locode.apps.schoolmaster.model.BaseEntity;
import com.locode.apps.schoolmaster.student.Student;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "grades")
public class Grade extends BaseEntity {

    String grade;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Class>classGrades  = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Student> studentGrades = new ArrayList<>();
}
