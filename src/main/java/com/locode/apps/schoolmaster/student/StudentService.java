/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.student;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
