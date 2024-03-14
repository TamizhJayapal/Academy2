package com.hibernate.example.Academy2.repository;

import com.hibernate.example.Academy2.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
