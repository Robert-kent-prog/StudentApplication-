package com.Robert.StudentApplication.service.imp;

import com.Robert.StudentApplication.StudentApplication;
import com.Robert.StudentApplication.model.Student;
import com.Robert.StudentApplication.repository.StudentRepository;
import com.Robert.StudentApplication.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentApplication> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Optional<StudentApplication> getStudentById(String id) {
        return studentRepository.findById(id);
    }

}
