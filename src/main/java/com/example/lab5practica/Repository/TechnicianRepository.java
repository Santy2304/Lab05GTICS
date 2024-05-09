package com.example.lab5practica.Repository;

import com.example.lab5practica.Entity.Technician;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician,Integer> {
}
