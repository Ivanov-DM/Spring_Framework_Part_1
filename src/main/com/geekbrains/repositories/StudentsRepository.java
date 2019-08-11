package com.geekbrains.repositories;

import com.geekbrains.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentsRepository {

    public Student findOneById(Long id) {
        Student student = new Student();
        student.setFirstName("Test" + id);
        student.setLastName("Test" + id);
        return student;
    }
}
