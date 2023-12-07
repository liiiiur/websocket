package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_evacuate_personnel", schema = "business_location")
public class LocationEvacuatePersonnel {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "personnel_id", length = 36)
    private String personnelId;

    @Column(name = "personnel_name", length = 100)
    private String personnelName;

    @Column(name = "contact_number", length = 20)
    private String contactNumber;

    @Column(name = "organization_id", length = 36)
    private String organizationId;

    @Column(name = "path_name", length = 4000)
    private String pathName;

    @Column(name = "post", length = 20)
    private String post;

    @Column(name = "post_name", length = 200)
    private String postName;

    @Column(name = "evacuate_id", length = 36)
    private String evacuateId;

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