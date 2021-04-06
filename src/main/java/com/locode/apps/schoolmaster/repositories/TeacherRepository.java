package com.locode.apps.schoolmaster.repositories;

import com.locode.apps.schoolmaster.domains.Student;
import com.locode.apps.schoolmaster.domains.Teacher;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends Neo4jRepository<Teacher, Integer> {
}
