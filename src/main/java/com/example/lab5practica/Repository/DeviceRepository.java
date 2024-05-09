package com.example.lab5practica.Repository;

import com.example.lab5practica.DTO.DevicesPorPaisDTO;
import com.example.lab5practica.Entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Integer> {


    @Query(nativeQuery = true, value = "select d.DeviceName as deviceName , d.DeviceType as deviceType, d.Model as model, d.SerialNumber as serialNumber, l.Country from device d \n" +
            "inner join site s on s.SiteID = d.SiteID\n" +
            "inner join location l on l.LocationID = s.LocationID")
    List<DevicesPorPaisDTO> listarEquiposPorPais();


}
