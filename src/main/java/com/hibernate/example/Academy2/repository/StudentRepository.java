package com.hibernate.example.Academy2.repository;

import com.hibernate.example.Academy2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
