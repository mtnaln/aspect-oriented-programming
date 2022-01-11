package com.metin.medium.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping("/registering/{studentId}/{courseId}")
    public void registerCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        System.out.println("Student registered...");
    }

    @GetMapping
    public void getAllCourses() {
        System.out.println("List All Courses...");
    }

    @GetMapping("/count")
    public int totalStudents() {
        return 48;
    }
}
