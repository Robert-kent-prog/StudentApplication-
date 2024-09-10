package com.Robert.StudentApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class StudentExceptionHandler {
    public ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException studentNotFoundException)
    {
        StudentException studentException = new StudentException(studentNotFoundException.getMessage(),
                studentNotFoundException.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(studentException, HttpStatus.NOT_FOUND);
    }
}
