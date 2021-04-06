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
public class Salary {

    @Id
    int id;
    char level;
    long amount;

    @Relationship(type = "RECEIVES", direction = INCOMING)
    private Set<Teacher> teacherSalaries  = new HashSet<>();
    @Relationship(type = "PAYS", direction = INCOMING)
    private Set<School> salaries  = new HashSet<>();
}
