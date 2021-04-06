package com.locode.apps.schoolmaster.domains;

import lombok.AccessLevel;
import lombok.Data;
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
public class Grade {

    @Id
    int id;
    char grade;

    @Relationship(type = "AWARDS_GRADE", direction = OUTGOING)
    private Set<Class>classGrades  = new HashSet<>();
    @Relationship(type = "GRADE_FOR", direction = OUTGOING)
    private Set<Student> studentGrades = new HashSet<>();

}
