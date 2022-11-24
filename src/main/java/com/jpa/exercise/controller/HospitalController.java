package com.jpa.exercise.controller;

import com.jpa.exercise.domain.Hospital;
import com.jpa.exercise.domain.Review;
import com.jpa.exercise.domain.dto.HospitalResponse;
import com.jpa.exercise.service.HospitalService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/hospitals")
public class HospitalController {
    HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService){
        this.hospitalService=hospitalService;
    }
    @GetMapping("")
    public ResponseEntity<List<HospitalResponse>> list(Pageable pageable){
        return ResponseEntity.ok().body(hospitalService.findHospitals(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<Review>> getReview(@PathVariable Integer id){
        return ResponseEntity.ok().body(new ArrayList<>());
    }
}
