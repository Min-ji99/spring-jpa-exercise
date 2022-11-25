package com.jpa.exercise.domain.dto;

import com.jpa.exercise.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewReadResponse {
    private Integer reviewId;
    private String author;
    private String title;
    private String content;
    private String hospitalName;
    public static ReviewReadResponse of(Review review) {
        return ReviewReadResponse.builder()
                .reviewId(review.getId())
                .author(review.getAuthor())
                .title(review.getTitle())
                .content(review.getContent())
                .hospitalName(review.getHospital().getName())
                .build();
    }
}
