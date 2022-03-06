package com.locode.apps.schoolmaster.repositories;

import com.locode.apps.schoolmaster.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student>findAll();

//    @Query("SELECT firstName FROM Student;")
//    List<Student> getAllStudents();
//
//    @Query("SELECT * FROM students WHERE ")
//    Collection<Student>getAllStudents(@Param("") String school,
//                                      @Param("") String year,
//                                      @Param("") String className);

}
