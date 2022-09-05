/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.teacher;

import com.locode.apps.schoolmaster.basemodel.Employee;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class TeacherService extends Employee {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository repository) {
        teacherRepository = repository;
    }

    @Transactional
    void register(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    // assign a teacher to a class
    // teacher grades student
    List<Teacher> getTeachersList(String schoolId) {
        return teacherRepository.findAll();
    }

    // record details in a teachers record books

}
