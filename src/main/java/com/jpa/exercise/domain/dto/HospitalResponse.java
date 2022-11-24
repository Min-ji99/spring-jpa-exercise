package com.jpa.exercise.domain.dto;

import com.jpa.exercise.domain.Hospital;
import com.jpa.exercise.repository.HospitalRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalResponse {
    private Integer hospitalId;
    private String hospitalName;
    private String roadNameAddress;

    public static HospitalResponse of(Hospital hospital){
        return HospitalResponse.builder()
                .hospitalId(hospital.getId())
                .hospitalName(hospital.getName())
                .roadNameAddress(hospital.getRoadNameAddress())
                .build();
    }
}
