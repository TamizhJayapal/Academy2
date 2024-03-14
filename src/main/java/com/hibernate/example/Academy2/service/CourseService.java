package com.hibernate.example.Academy2.service;

import com.hibernate.example.Academy2.entity.Course;
import com.hibernate.example.Academy2.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public void saveCourse(Course course){
        repository.save(course);
    }
}
