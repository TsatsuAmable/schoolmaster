package com.locode.apps.schoolmaster.domains;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

@Node
@Data
public class Bill {

    @Id
    int id;
    long amount;
    Date billDate;
    String billPeriod;

    @Relationship(type = "BILL_FOR", direction = OUTGOING)
    private Set<Student> billItems = new HashSet<>();
    @Relationship(type = "GENERATES_BILL", direction = OUTGOING)
    private Set<Department> departmentBills = new HashSet<>();
}
