package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_evacuate", schema = "business_location")
public class LocationEvacuate {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "evacuate_time")
    private Instant evacuateTime;

    @Column(name = "evacuate_instructions", length = 500)
    private String evacuateInstructions;

    @Lob
    @Column(name = "is_send")
    private String isSend;

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