package com.locode.apps.schoolmaster.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAll();

    Student findBySchoolAndLastNameAndDob(String schoolName,
                                          String lastName,
                                          Date dob);

    List<Student> findBySchool(String school);

    List<Student> findByDob(Date dob);

    List findByRegistrationDate(String regDate);

    Student saveStudent(Student student);

}
