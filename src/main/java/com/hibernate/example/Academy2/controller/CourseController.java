package com.hibernate.example.Academy2.controller;

import com.hibernate.example.Academy2.entity.Course;
import com.hibernate.example.Academy2.repository.CourseRepository;
import com.hibernate.example.Academy2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/add-course")
    public void saveCourse(@RequestBody Course course) {
        service.saveCourse(course);
    }

}
