package com.example.lab5practica.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.time.Instant;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ticketid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Siteid")
    private Site siteID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Technicianid")
    private Technician technicianID;

    @Size(max = 50)
    @Column(name = "Status", length = 50)
    private String status;

    @Column(name = "Openeddate")
    private Instant openedDate;

    @Column(name = "Closeddate")
    private Instant closedDate;

    public Instant getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Instant closedDate) {
        this.closedDate = closedDate;
    }

    public Instant getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Instant openedDate) {
        this.openedDate = openedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Technician getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(Technician technicianID) {
        this.technicianID = technicianID;
    }

    public Site getSiteID() {
        return siteID;
    }

    public void setSiteID(Site siteID) {
        this.siteID = siteID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
