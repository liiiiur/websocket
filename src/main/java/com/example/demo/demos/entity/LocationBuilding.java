package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_location_building", schema = "business_location")
public class LocationBuilding {
    @Id
    @Column(name = "data_code", nullable = false, length = 64)
    private String dataCode;

    @Column(name = "data_name", length = 128)
    private String dataName;

    @Column(name = "data_desc", length = 64)
    private String dataDesc;

    @Column(name = "data_order")
    private Integer dataOrder;

    @Lob
    @Column(name = "is_show")
    private String isShow;

}