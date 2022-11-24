package com.jpa.exercise.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewCreateResponse {
    private Integer id;
    private String title;
    private String content;
    private String author;
    private String message;
}
