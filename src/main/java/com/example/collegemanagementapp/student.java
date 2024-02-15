package com.example.collegemanagementapp;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor

public class student {
    int id;

    int age;
    long mobile;
    String name;

    String department;


}


