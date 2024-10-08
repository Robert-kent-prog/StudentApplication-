package com.Robert.StudentApplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students") // initialization of the collection name
public class Student {

    //all the avcailable fields in the students system.
    @Id//making the id fild to be autogenareated by the mongo db
    private String id;
    private String firstName;
    private String lastName;
    private String regNo;
    private String age;
    private String course;
    private String yearOfStudy;

    //All the constructors and the getrters and setters for trhe fields.
    public Student(String id, String firstName, String lastName, String regNo,
            String age, String course, String yearOfStudy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNo = regNo;
        this.age = age;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
