package com.jpa.exercise.controller;

import com.jpa.exercise.domain.Hospital;
import com.jpa.exercise.domain.Review;
import com.jpa.exercise.domain.dto.HospitalResponse;
import com.jpa.exercise.domain.dto.ReviewCreateRequest;
import com.jpa.exercise.domain.dto.ReviewCreateResponse;
import com.jpa.exercise.domain.dto.ReviewResponse;
import com.jpa.exercise.service.HospitalService;
import com.jpa.exercise.service.ReviewService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/hospitals")
public class HospitalController {
    HospitalService hospitalService;
    ReviewService reviewService;

    public HospitalController(HospitalService hospitalService, ReviewService reviewService){
        this.hospitalService=hospitalService;
        this.reviewService=reviewService;
    }
    @GetMapping("")
    public ResponseEntity<List<HospitalResponse>> getHospitals(Pageable pageable){
        return ResponseEntity.ok().body(hospitalService.findHospitals(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<HospitalResponse> getReviews(@PathVariable Integer id){
        return ResponseEntity.ok().body(hospitalService.findHospital(id));
    }
    @PostMapping("/{id}/reviews")
    public ResponseEntity<ReviewCreateResponse> get(@PathVariable Integer id, @RequestBody ReviewCreateRequest reviewCreateRequest){
        return ResponseEntity.ok().body(reviewService.add(reviewCreateRequest));
    }
    @GetMapping("/{id}/reviews")
    public ResponseEntity<List<ReviewResponse>> getReviews(@PathVariable Integer id, Pageable pageable){
        return ResponseEntity.ok().body(reviewService.findReviewsByHospitalId(id, pageable));
    }
}
