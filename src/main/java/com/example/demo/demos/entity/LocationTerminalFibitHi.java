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
@Table(name = "tb_location_terminal_fibit_his", schema = "business_location")
public class LocationTerminalFibitHi {
    @Id
    @Column(name = "id", nullable = false, length = 128)
    private String id;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "device_id", length = 64)
    private String deviceId;

    @Column(name = "hr")
    private Integer hr;

    @Column(name = "spb")
    private Integer spb;

    @Column(name = "dbp")
    private Integer dbp;

    @Column(name = "sos")
    private Integer sos;

    @Column(name = "steps")
    private Integer steps;

    @Column(name = "temperature", precision = 6, scale = 2)
    private BigDecimal temperature;

    @Column(name = "battery")
    private Integer battery;

    @Column(name = "wear")
    private Integer wear;

    @Column(name = "move")
    private Integer move;

    @Column(name = "locate_date")
    private Instant locateDate;

    @Column(name = "record_date")
    private Instant recordDate;

}