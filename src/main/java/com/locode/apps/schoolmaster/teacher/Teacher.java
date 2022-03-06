package com.locode.apps.schoolmaster.teacher;

import com.locode.apps.schoolmaster.domains.Class;
import com.locode.apps.schoolmaster.domains.Salary;
import com.locode.apps.schoolmaster.domains.Subject;
import com.locode.apps.schoolmaster.model.Person;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "teachers")
public class Teacher extends Person {

    @NotEmpty
    String fullName;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Salary> teacherSalaries  = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Class> classTeacher  = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Subject> subjectTeachers  = new ArrayList<>();
}