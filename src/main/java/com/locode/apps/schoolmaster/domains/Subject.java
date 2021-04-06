package com.locode.apps.schoolmaster.domains;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;

@Node
@Data
@FieldDefaults(level= AccessLevel.PRIVATE, makeFinal = true)
public class Subject {

    @Id
    int id;
    String name;
    String code;

    @Relationship(type = "TEACHES", direction = INCOMING)
    private Set<Teacher> subjectTeachers  = new HashSet<>();
}
