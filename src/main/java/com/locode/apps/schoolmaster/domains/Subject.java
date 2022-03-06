package com.locode.apps.schoolmaster.domains;

import com.locode.apps.schoolmaster.model.BaseEntity;
import com.locode.apps.schoolmaster.teacher.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "subjects")
public class Subject extends BaseEntity {

    String name;
    String code;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Teacher> subjectTeachers  = new ArrayList<>();
}
