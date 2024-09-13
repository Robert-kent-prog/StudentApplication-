package com.Robert.StudentApplication.repository;

import com.Robert.StudentApplication.StudentApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentApplication, String> {
}
