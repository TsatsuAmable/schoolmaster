package com.locode.apps.schoolmaster.domains;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;

@Node
@Data
public class Department {

    @Id
    int id;
    String name;
    String hod;

    @Relationship(type = "ADMINISTERS", direction = INCOMING)
    private Set<School> departments = new HashSet<>();
    @Relationship(type = "GENERATES_BILL", direction = INCOMING)
    private Set<Bill> bills = new HashSet<>();
}
