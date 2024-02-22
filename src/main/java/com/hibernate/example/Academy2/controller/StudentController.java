package com.hibernate.example.Academy2.controller;

import com.hibernate.example.Academy2.entity.Student;
import com.hibernate.example.Academy2.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student){
        repository.save(student);
    }

    @GetMapping("/get-student/{id}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable int id){
        Optional<Student> student = repository.findById(id);
        return ResponseEntity.ok(student);
    }



}
