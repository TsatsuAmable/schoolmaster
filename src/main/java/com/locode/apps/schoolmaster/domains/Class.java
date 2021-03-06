package com.locode.apps.schoolmaster.domains;

import com.locode.apps.schoolmaster.model.BaseEntity;
import com.locode.apps.schoolmaster.student.Student;
import com.locode.apps.schoolmaster.teacher.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "classes")
public class Class extends BaseEntity {

    String name;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Student> classTakers = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<Teacher> classTeachers = new HashSet<>();
}
