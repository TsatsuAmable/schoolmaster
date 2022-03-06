package com.locode.apps.schoolmaster.controllers;

import com.locode.apps.schoolmaster.repositories.StudentRepository;
import com.locode.apps.schoolmaster.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnrolmentManagement {

    private final StudentRepository studentRepository;

    public EnrolmentManagement(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student/all")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
