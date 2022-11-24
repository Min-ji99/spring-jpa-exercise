package com.jpa.exercise.controller;

import com.jpa.exercise.domain.Review;
import com.jpa.exercise.domain.dto.ReviewResponse;
import com.jpa.exercise.service.ReviewService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("")
    public ResponseEntity<List<ReviewResponse>> list(Pageable pageable){
        return ResponseEntity.ok().body(reviewService.findReviews(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReviewResponse> getReview(@PathVariable Integer id){
        return ResponseEntity.ok().body(reviewService.findReviewsById(id));
    }
}
