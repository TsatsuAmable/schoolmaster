package com.locode.apps.schoolmaster.repositories;

import com.locode.apps.schoolmaster.domains.Bill;
import com.locode.apps.schoolmaster.domains.Student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends Neo4jRepository<Bill, Integer> {
}
