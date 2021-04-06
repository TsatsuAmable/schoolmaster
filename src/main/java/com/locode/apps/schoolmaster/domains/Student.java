package com.locode.apps.schoolmaster.domains;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;
import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

@Node
@Data
public class Student {

    @Id
    int id;

    String firstName;
    String otherNames;
    String lastName;

    Date dob;
    Date registrationDate;
    String schoolYear;


    @Relationship(type = "SITS", direction = OUTGOING)
    private Set<Class> classStudents  = new HashSet<>();
    @Relationship(type = "GRADE_FOR", direction = INCOMING)
    private Set<Grade> studentGrades = new HashSet<>();

    @Relationship(type = "ENROLS", direction = INCOMING)
    private Set<School>enrolledStudents  = new HashSet<>();
    @Relationship(type = "BILL_FOR", direction = INCOMING)
    private Set<Bill>studentBills  = new HashSet<>();

}
