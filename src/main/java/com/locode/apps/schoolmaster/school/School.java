package com.locode.apps.schoolmaster.school;

import com.locode.apps.schoolmaster.model.BaseEntity;
import com.locode.apps.schoolmaster.teacher.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Teacher> teachingStaff  = new ArrayList<>();

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Department> departments = new ArrayList<>();
}
