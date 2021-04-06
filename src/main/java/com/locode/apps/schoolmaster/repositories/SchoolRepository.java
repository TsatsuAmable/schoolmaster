package com.locode.apps.schoolmaster.repositories;

import com.locode.apps.schoolmaster.domains.School;
import com.locode.apps.schoolmaster.domains.Student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends Neo4jRepository<School, Integer> {
}
