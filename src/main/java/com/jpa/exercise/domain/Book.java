package com.jpa.exercise.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Integer id;
    private String bookName;
    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;
    @ManyToOne
    @JoinColumn(name="publisher_id")
    private Publisher publisher;
}
