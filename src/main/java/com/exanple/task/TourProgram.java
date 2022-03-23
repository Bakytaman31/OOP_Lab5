package com.exanple.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tour_program")
@AllArgsConstructor
@NoArgsConstructor
public class TourProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  programmNumber;
    @Column(name = "description")
    private String description;
}
