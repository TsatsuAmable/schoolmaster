/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.school;

import com.locode.apps.schoolmaster.basemodel.BaseEntity;
import com.locode.apps.schoolmaster.student.Student;
import com.locode.apps.schoolmaster.teacher.Teacher;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "schools")
public class School extends BaseEntity {

    String name;
    String address;
    String type;
    String level;
    String about;
    String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Teacher> teachingStaff;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;
}
