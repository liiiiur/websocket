package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_terminal", schema = "business_location")
public class LocationTerminal {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "device_id", length = 64)
    private String deviceId;

    @Lob
    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_model", length = 200)
    private String deviceModel;

    @Column(name = "distribution_object", length = 20)
    private String distributionObject;

    @Lob
    @Column(name = "is_enabled")
    private String isEnabled;

    @Lob
    @Column(name = "is_online")
    private String isOnline;

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