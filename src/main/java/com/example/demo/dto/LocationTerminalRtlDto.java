package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class LocationTerminalRtlDto implements Serializable {

    private String id;
    private String companyCode;
    private String deviceId;
    private String radius;
    private String mode;
    private Instant locateDate;
    private String placeId;
    private String buildingId;
    private String floorId;
    private BigDecimal lon;
    private BigDecimal lat;
    private Integer steps;
    private Integer heartRate;
    private Integer spb;
    private Integer dbp;
    private BigDecimal temperature;
    private Integer battery;
    private Instant recordDate;
}
