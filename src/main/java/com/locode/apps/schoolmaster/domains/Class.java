package com.locode.apps.schoolmaster.domains;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;

@Node
@Data
public class Class {

    @Id
    int id;
    String name;

    @Relationship(type = "SITS", direction = INCOMING)
    private Set<Student> classTakers = new HashSet<>();
    @Relationship(type = "AWARDS_GRADE", direction = INCOMING)
    private Set<Grade> gradesEarned = new HashSet<>();
    @Relationship(type = "RUNS", direction = INCOMING)
    private Set<Teacher> classTeachers = new HashSet<>();
}
