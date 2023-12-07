package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_location_alarm", schema = "business_location")
public class LocationAlarm {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name = "company_code", length = 20)
    private String companyCode;

    @Column(name = "alarm_time")
    private Instant alarmTime;

    @Column(name = "alarm_type", length = 20)
    private String alarmType;

    @Column(name = "alarm_grade", length = 20)
    private String alarmGrade;

    @Lob
    @Column(name = "alarm_classification")
    private String alarmClassification;

    @Column(name = "alarm_object_id", length = 36)
    private String alarmObjectId;

    @Column(name = "alarm_device_id", length = 36)
    private String alarmDeviceId;

    @Column(name = "alarm_area_name", length = 100)
    private String alarmAreaName;

    @Column(name = "record_id", length = 36)
    private String recordId;

    @Column(name = "position_card", length = 36)
    private String positionCard;

    @Column(name = "position_bracelet", length = 36)
    private String positionBracelet;

    @Column(name = "location_coordinates_longitude", precision = 20, scale = 15)
    private BigDecimal locationCoordinatesLongitude;

    @Column(name = "location_coordinates_latitude", precision = 20, scale = 15)
    private BigDecimal locationCoordinatesLatitude;

    @Column(name = "location_coordinates_altitude", precision = 20, scale = 15)
    private BigDecimal locationCoordinatesAltitude;

    @Column(name = "over_count", precision = 5)
    private BigDecimal overCount;

    @Column(name = "retention_time", precision = 5)
    private BigDecimal retentionTime;

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

    @Column(name = "alarm_detail")
    @Type(type = "org.hibernate.type.TextType")
    private String alarmDetail;

    @Column(name = "end_time")
    private Instant endTime;

    @Lob
    @Column(name = "is_en_process")
    private String isEnProcess;

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