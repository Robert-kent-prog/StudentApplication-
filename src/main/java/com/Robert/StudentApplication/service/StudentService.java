package com.Robert.StudentApplication.service;

import com.Robert.StudentApplication.StudentApplication;
import com.Robert.StudentApplication.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
   // Student saveStudent(Student student);
    List<StudentApplication> getAllStudents();
    Student  updateStudent(Student student);
    Optional<StudentApplication> getStudentById(Long id);
}
