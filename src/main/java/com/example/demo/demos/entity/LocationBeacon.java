package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_beacon", schema = "business_location")
public class LocationBeacon {
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

    @Column(name = "place_id", length = 64)
    private String placeId;

    @Column(name = "building_id", length = 64)
    private String buildingId;

    @Column(name = "floor_id", length = 8)
    private String floorId;

    @Column(name = "zone", length = 200)
    private String zone;

    @Column(name = "battery")
    private Integer battery;

    @Column(name = "locate_date")
    private Instant locateDate;

    @Lob
    @Column(name = "is_deleted")
    private String isDeleted;

    @Column(name = "record_date")
    private Instant recordDate;

}