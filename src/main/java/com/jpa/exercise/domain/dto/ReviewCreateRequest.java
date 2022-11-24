package com.jpa.exercise.domain.dto;

import com.jpa.exercise.domain.Hospital;
import com.jpa.exercise.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewCreateRequest {
    private String title;
    private String content;
    private Integer hospitalId;
    private String author;
}
