package com.jpa.exercise.repository;

import com.jpa.exercise.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Page<Review> findByHospital_Id(Integer id,Pageable pageable);
}
