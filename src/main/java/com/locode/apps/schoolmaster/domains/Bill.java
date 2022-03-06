package com.locode.apps.schoolmaster.domains;

import com.locode.apps.schoolmaster.model.BaseEntity;
import com.locode.apps.schoolmaster.student.Student;
import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "bills")
public class Bill extends BaseEntity {

    long totalAmount;
    Date billDate;
    Date fromDate;
    Date toDate;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Student> billItems = new ArrayList<>();

}
