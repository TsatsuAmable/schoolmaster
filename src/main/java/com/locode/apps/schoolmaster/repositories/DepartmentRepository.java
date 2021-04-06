package com.locode.apps.schoolmaster.repositories;

import com.locode.apps.schoolmaster.domains.Department;
import com.locode.apps.schoolmaster.domains.Student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends Neo4jRepository<Class, Integer> {
}
