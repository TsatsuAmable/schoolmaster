package com.locode.apps.schoolmaster.student;

import com.locode.apps.schoolmaster.basemodel.Person;
import com.locode.apps.schoolmaster.teacher.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
