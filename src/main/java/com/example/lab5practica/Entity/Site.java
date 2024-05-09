package com.example.lab5practica.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SiteiD", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "Sitename")
    private String siteName;

    @ManyToOne
    @JoinColumn(name = "Locationid")
    private Location locationID;

    @Column(name = "Installationdate")
    private LocalDate installationDate;

    @Size(max = 45)
    @Column(name = "Latitude", length = 45)
    private String latitude;

    @Size(max = 45)
    @Column(name = "Longitude", length = 45)
    private String longitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocalDate getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(LocalDate installationDate) {
        this.installationDate = installationDate;
    }

    public Location getLocationID() {
        return locationID;
    }

    public void setLocationID(Location locationID) {
        this.locationID = locationID;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
