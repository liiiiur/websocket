package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_alarm_over_list", schema = "business_location")
public class LocationAlarmOverList {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "record_id", length = 36)
    private String recordId;

    @Column(name = "alarm_id", length = 36)
    private String alarmId;

    @Column(name = "alarm_device_id", length = 36)
    private String alarmDeviceId;

    @Column(name = "alarm_time")
    private Instant alarmTime;

    @Column(name = "enter_time")
    private Instant enterTime;

    @Column(name = "leave_time")
    private Instant leaveTime;

    @Column(name = "position_card", length = 36)
    private String positionCard;

    @Column(name = "position_bracelet", length = 36)
    private String positionBracelet;

    @Column(name = "longitude", precision = 20, scale = 15)
    private BigDecimal longitude;

    @Column(name = "latitude", precision = 20, scale = 15)
    private BigDecimal latitude;

    @Column(name = "person_id", length = 36)
    private String personId;

    @Column(name = "person_name", length = 36)
    private String personName;

    @Column(name = "post_id", length = 36)
    private String postId;

    @Column(name = "post_code", length = 36)
    private String postCode;

    @Column(name = "post_name", length = 64)
    private String postName;

    @Column(name = "dept_id", length = 36)
    private String deptId;

    @Column(name = "dept_name", length = 100)
    private String deptName;

    @Column(name = "dept_path", length = 4000)
    private String deptPath;

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