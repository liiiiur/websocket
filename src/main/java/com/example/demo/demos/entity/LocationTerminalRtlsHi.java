package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_terminal_rtls_his", schema = "business_location")
public class LocationTerminalRtlsHi {
    @Id
    @Column(name = "id", nullable = false, length = 128)
    private String id;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "device_id", length = 64)
    private String deviceId;

    @Column(name = "radius", length = 64)
    private String radius;

    @Column(name = "mode", length = 8)
    private String mode;

    @Column(name = "locate_date")
    private Instant locateDate;

    @Column(name = "place_id", length = 64)
    private String placeId;

    @Column(name = "building_id", length = 64)
    private String buildingId;

    @Column(name = "floor_id", length = 8)
    private String floorId;

    @Column(name = "lon", precision = 15, scale = 12)
    private BigDecimal lon;

    @Column(name = "lat", precision = 15, scale = 12)
    private BigDecimal lat;

    @Column(name = "steps")
    private Integer steps;

    @Column(name = "heart_rate")
    private Integer heartRate;

    @Column(name = "spb")
    private Integer spb;

    @Column(name = "dbp")
    private Integer dbp;

    @Column(name = "temperature", precision = 6, scale = 2)
    private BigDecimal temperature;

    @Column(name = "battery")
    private Integer battery;

    @Column(name = "record_date")
    private Instant recordDate;

}