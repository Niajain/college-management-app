package com.example.collegemanagementapp;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, student> studentDb=new HashMap<>();

    public String addStudent(student std) {
        if(studentDb.containsKey(std.getId()))
        {
            return "student already registered";
        }
        studentDb.put(std.getId(),std);
        return "student registered successfully";
    }

    public student getStudent(int id) {
        if(studentDb.containsKey(id))
        {
            return studentDb.get(id);
        }
        return null;
    }

    public student getStudentByName(String name) {
        for(Integer x:studentDb.keySet())
        {
            if(studentDb.get(x).getName().equals(name))
            {

                return studentDb.get(x);
            }
        }
        return null;
    }
}
