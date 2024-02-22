package com.hibernate.example.Academy2.repository;

import com.hibernate.example.Academy2.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
