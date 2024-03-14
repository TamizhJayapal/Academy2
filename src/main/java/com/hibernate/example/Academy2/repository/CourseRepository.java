package com.hibernate.example.Academy2.repository;

import com.hibernate.example.Academy2.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
