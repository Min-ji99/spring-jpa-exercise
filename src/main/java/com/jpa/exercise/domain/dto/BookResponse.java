package com.jpa.exercise.domain.dto;

import com.jpa.exercise.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {
    private Integer bookId;
    private String bookName;
    private String authorName;
    public static BookResponse of(Book book, String authorName){
        return BookResponse.builder()
                .bookId(book.getId())
                .bookName(book.getBookName())
                .authorName(authorName)
                .build();
    }
}
