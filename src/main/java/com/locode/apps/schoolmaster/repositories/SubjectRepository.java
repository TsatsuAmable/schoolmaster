package com.locode.apps.schoolmaster.repositories;

import com.locode.apps.schoolmaster.domains.Student;
import com.locode.apps.schoolmaster.domains.Subject;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends Neo4jRepository<Subject, Integer> {
}
