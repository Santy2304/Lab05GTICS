package com.example.lab5practica.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Device {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Deviceid", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "Devicename")
    private String deviceName;

    @Size(max = 255)
    @Column(name = "Devicetype")
    private String deviceType;

    @Size(max = 255)
    @Column(name = "Model")
    private String model;

    @Size(max = 255)
    @Column(name = "Serialnumber")
    private String serialNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Siteid")
    private Site siteID;

    public Site getSiteID() {
        return siteID;
    }

    public void setSiteID(Site siteID) {
        this.siteID = siteID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
