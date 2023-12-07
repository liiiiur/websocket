package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_customer_location_device_bind", schema = "business_location")
public class CustomerLocationDeviceBind {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "customer_id", length = 36)
    private String customerId;

    @Column(name = "person_id", length = 36)
    private String personId;

    @Column(name = "position_card", length = 36)
    private String positionCard;

    @Column(name = "position_bracelet", length = 36)
    private String positionBracelet;

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