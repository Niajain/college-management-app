package com.example.collegemanagementapp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer, student> studentDb=new HashMap<>();

    @PostMapping("/student/add")
    public String addStudent(@RequestBody student std)
    {
        if(studentDb.containsKey(std.getId()))
        {
            return "student already registered";
        }
        studentDb.put(std.getId(),std);
        return "student registered successfully";
    }

    @GetMapping("/student/get")
    public student getStudent(@RequestParam("id") int id)
    {
        return studentDb.get(id);
    }


    @GetMapping("/student/get/{name}/{q}")
    public student getStudentByName(@PathVariable("name") String name,@PathVariable("q") int age)
    {
        for(Integer x:studentDb.keySet())
        {
            if(studentDb.get(x).getName().equals(name))
            {
                studentDb.get(x).setAge(age);
                return studentDb.get(x);
            }
        }
        return null;
    }
}
