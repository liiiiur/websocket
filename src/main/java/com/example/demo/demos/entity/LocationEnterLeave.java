package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_enter_leave", schema = "business_location")
public class LocationEnterLeave {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "person_id", length = 36)
    private String personId;

    @Column(name = "device_id", length = 64)
    private String deviceId;

    @Lob
    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "area_id", length = 36)
    private String areaId;

    @Lob
    @Column(name = "area_type")
    private String areaType;

    @Column(name = "area_name", length = 100)
    private String areaName;

    @Column(name = "enter_time")
    private Instant enterTime;

    @Column(name = "leave_time")
    private Instant leaveTime;

    @Lob
    @Column(name = "is_deleted")
    private String isDeleted;

    @Column(name = "created_by", length = 36)
    private String createdBy;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "modified_by", length = 36)
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;

}