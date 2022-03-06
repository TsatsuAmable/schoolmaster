package com.locode.apps.schoolmaster.student;

import com.locode.apps.schoolmaster.domains.Bill;
import com.locode.apps.schoolmaster.domains.Class;
import com.locode.apps.schoolmaster.domains.Grade;
import com.locode.apps.schoolmaster.model.Person;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
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

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Class> classStudents  = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Grade> studentGrades = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Bill>studentBills  = new ArrayList<>();

}
