package com.jpa.exercise.domain.dto;

import com.jpa.exercise.domain.Review;
import com.jpa.exercise.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResponse {
    private Integer reviewId;
    private String author;
    private String title;
    private String content;
    public static ReviewResponse of(Review review) {
        return ReviewResponse.builder()
                .reviewId(review.getId())
                .author(review.getAuthor())
                .title(review.getTitle())
                .content(review.getContent())
                .build();
    }
}
