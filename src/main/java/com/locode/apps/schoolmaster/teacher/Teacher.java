/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.teacher;

import com.locode.apps.schoolmaster.basemodel.Person;
import com.locode.apps.schoolmaster.student.Student;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teachers")
public class Teacher extends Person {

    String fullName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Student> teacherSalaries;
}
