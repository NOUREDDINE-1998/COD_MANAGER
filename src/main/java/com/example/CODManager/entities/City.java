package com.example.CODManager.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCity;
    private String labelCity;
}
