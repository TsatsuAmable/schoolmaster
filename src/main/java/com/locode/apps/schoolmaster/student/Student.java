/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.student;

import com.locode.apps.schoolmaster.basemodel.Person;
import com.locode.apps.schoolmaster.teacher.Teacher;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student extends Person {

    // Probably needs a student id:String
    // Leads to requiring the school to define the StudentID

    String firstName;
    String otherNames;
    String lastName;

    Date dob;
    Date registrationDate;
    String schoolYear;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Teacher> teachers;
}
