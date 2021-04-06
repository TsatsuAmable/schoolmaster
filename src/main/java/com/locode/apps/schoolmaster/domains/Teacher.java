package com.locode.apps.schoolmaster.domains;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

@Node
@Data
@FieldDefaults(level= AccessLevel.PRIVATE, makeFinal = true)
public class Teacher {

    @Id
    int id;
    String fullName;


    @Relationship(type = "RECEIVES", direction = OUTGOING)
    private Set<Salary> teacherSalaries  = new HashSet<>();
    @Relationship(type = "RUNS", direction = OUTGOING)
    private Set<Class> classTeacher  = new HashSet<>();
    @Relationship(type = "WORKS_FOR", direction = OUTGOING)
    private Set<School> teachingStaff  = new HashSet<>();
    @Relationship(type = "TEACHES", direction = OUTGOING)
    private Set<Subject> sunjectTeachers  = new HashSet<>();
}
