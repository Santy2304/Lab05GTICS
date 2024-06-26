package com.example.lab5practica.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "location", schema = "gtics-f")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LocationID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "City")
    private String city;

    @Size(max = 255)
    @Column(name = "Country")
    private String country;


    //TODO [JPA Buddy] generate columns from DB
}