package com.example.jpapractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    // Seems order used for postgresql reserved word
    private int sectionOrder;

}
