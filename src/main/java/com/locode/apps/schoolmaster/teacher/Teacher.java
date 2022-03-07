package com.locode.apps.schoolmaster.teacher;

import com.locode.apps.schoolmaster.basemodel.Person;
import com.locode.apps.schoolmaster.student.Student;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "teachers")
public class Teacher extends Person {

    String fullName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Student> teacherSalaries;

}