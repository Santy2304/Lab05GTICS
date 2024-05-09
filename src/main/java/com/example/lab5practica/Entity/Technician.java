package com.example.lab5practica.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Entity
@Getter
@Setter
public class Technician {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Technicianid", nullable = false)
    private Integer id;

    @Size(min = 3, max = 100, message = "El nombre debe estar entre 3 y 100 caractéres")
    @NotBlank
    @Column(name = "Firstname", nullable = false)
    private String firstName;

    @Size(min = 3, max = 100, message = "El apellido debe estar entre 3 y 100 caractéres")
    @NotBlank
    @Column(name = "Lastname", nullable = false)
    private String lastName;

    @Size(min=8, max = 8, message = "Debe ser de 8 dígitos exactos")
    @Digits(integer = 8,fraction = 0, message = "Debe ingresar un dígito")
    @NotBlank
    @Column(name = "Dni", nullable = false, length = 8)
    private String dni;

    @Size(min=9,max = 9, message = "Debe ser de 9 dígitos exactos")
    @Digits(integer = 9,fraction = 0, message = "Debe ingresar números")
    @NotBlank
    @Column(name = "Phone", nullable = false, length = 9)
    private String phone;

    @NotNull
    @Positive
    @Column(name = "Age", nullable = false)
    private Integer age;


}
