package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_station_his", schema = "business_location")
public class LocationStationHi {
    @Id
    @Column(name = "id", nullable = false, length = 128)
    private String id;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "mac", length = 64)
    private String mac;

    @Column(name = "model", length = 200)
    private String model;

    @Column(name = "lon", precision = 15, scale = 13)
    private BigDecimal lon;

    @Column(name = "lat", precision = 15, scale = 13)
    private BigDecimal lat;

    @Column(name = "state")
    private Integer state;

    @Column(name = "locate_date")
    private Instant locateDate;

    @Column(name = "record_date")
    private Instant recordDate;

    @Lob
    @Column(name = "is_deleted")
    private String isDeleted;

}