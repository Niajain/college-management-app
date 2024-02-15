package com.example.collegemanagementapp.controller;

import com.example.collegemanagementapp.StudentService;
import com.example.collegemanagementapp.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

//    StudentService studentService=new StudentService();
    @Autowired
StudentService studentService;

    @PostMapping("/student/add")
    public String addStudent(@RequestBody student std)
    {
        return studentService.addStudent(std);
    }

//    @GetMapping("/student/get")
//    public student getStudent(@RequestParam("id") int id)
//    {
//
//        return studentDb.get(id);
//    }

    @GetMapping("/student/get")
    public student getStudent(@RequestParam("id") int id)
    {

        return studentService.getStudent(id);
    }


//    @GetMapping("/student/get/{name}/{q}")
//    public student getStudentByName(@PathVariable("name") String name,@PathVariable("q") int age)
//    {
//        for(Integer x:studentDb.keySet())
//        {
//            if(studentDb.get(x).getName().equals(name))
//            {
//                studentDb.get(x).setAge(age);
//                return studentDb.get(x);
//            }
//        }
//        return null;
//    }

    @GetMapping("/student/get/{name}")
    public student getStudentByName(@PathVariable("name") String name)
    {
        return studentService.getStudentByName(name);
    }
}
