package com.jpa.exercise.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
    @Id
    private Integer id;
    private String name;
    private String roadNameAddress;
    @OneToMany(mappedBy = "hospital", fetch=FetchType.LAZY)
    private List<Review> reviews;
}
