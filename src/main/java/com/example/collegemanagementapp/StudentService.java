package com.example.collegemanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
//    StudentRepository studentRepository=new StudentRepository();
    public String addStudent(student std) {
//        std.setAge(std.getAge()+5);
        return studentRepository.addStudent(std);
    }

    public student getStudent(int id) {
        return studentRepository.getStudent(id);
    }

    public student getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }
}
