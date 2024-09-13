package com.Robert.StudentApplication.service;

import java.util.List;
import java.util.Optional;

import com.Robert.StudentApplication.StudentApplication;
import com.Robert.StudentApplication.model.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<StudentApplication> getAllStudents();

    Student updateStudent(Student student);

    Optional<StudentApplication> getStudentById(String id);
}
