package com.jpa.exercise.service;

import com.jpa.exercise.domain.Hospital;
import com.jpa.exercise.domain.Review;
import com.jpa.exercise.domain.dto.ReviewCreateRequest;
import com.jpa.exercise.domain.dto.ReviewCreateResponse;
import com.jpa.exercise.repository.HospitalRepository;
import com.jpa.exercise.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRespository;
    private final HospitalRepository hospitalRepository;

    public ReviewService(ReviewRepository reviewRespository, HospitalRepository hospitalRepository) {
        this.reviewRespository = reviewRespository;
        this.hospitalRepository = hospitalRepository;
    }

    public ReviewCreateResponse add(ReviewCreateRequest reviewCreateRequest) {
        Optional<Hospital> hospital=hospitalRepository.findById(reviewCreateRequest.getHospitalId());
        Review review=Review.builder()
                .title(reviewCreateRequest.getTitle())
                .content(reviewCreateRequest.getContent())
                .hospital(hospital.get())
                .author(reviewCreateRequest.getAuthor())
                .build();
        Review savedReview=reviewRespository.save(review);
        return new ReviewCreateResponse(savedReview.getId(), savedReview.getTitle(), savedReview.getContent(), savedReview.getAuthor(), "리뷰 등록 성공");
    }
}
