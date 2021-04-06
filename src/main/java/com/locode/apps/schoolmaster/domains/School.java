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
import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

@Node
@Data
@FieldDefaults(level= AccessLevel.PRIVATE, makeFinal = true)
public class School {

    @Id
    int id;
    String name;
    String address;
    String type;


    @Relationship(type = "PAYS", direction = OUTGOING)
    private Set<Salary> salaries  = new HashSet<>();
    @Relationship(type = "WORKS_FOR", direction = INCOMING)
    private Set<Teacher> teachingStaff  = new HashSet<>();
    @Relationship(type = "ADMINISTERS", direction = OUTGOING)
    private Set<Department> departments = new HashSet<>();


}
