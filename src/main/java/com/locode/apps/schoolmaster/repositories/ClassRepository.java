package com.locode.apps.schoolmaster.repositories;

import com.locode.apps.schoolmaster.domains.Student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends Neo4jRepository<Student, Integer> {
}
