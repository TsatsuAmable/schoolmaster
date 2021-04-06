package com.locode.apps.schoolmaster.services;

import com.locode.apps.schoolmaster.domains.Student;
import com.locode.apps.schoolmaster.repositories.StudentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class StudentService {

    StudentRepository studentRepository;

    public Student registerStudent(Student student){
        return studentRepository.save(student);
    }

}
