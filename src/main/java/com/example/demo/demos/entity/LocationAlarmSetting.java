package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "tb_location_alarm_setting", schema = "business_location")
public class LocationAlarmSetting {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "alarm_id", length = 36)
    private String alarmId;

    @Column(name = "origin_id", length = 36)
    private String originId;

    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name = "company_code", length = 9)
    private String companyCode;

    @Lob
    @Column(name = "object_type")
    private String objectType;

    @Column(name = "object_id", length = 36)
    private String objectId;

    @Column(name = "alarm_type", length = 20)
    private String alarmType;

    @Lob
    @Column(name = "enable_time_interval")
    private String enableTimeInterval;

    @Column(name = "alarm_begin_time")
    private LocalTime alarmBeginTime;

    @Column(name = "alarm_end_time")
    private LocalTime alarmEndTime;

    @Column(name = "alarm_grade", length = 20)
    private String alarmGrade;

    @Lob
    @Column(name = "personnel_list_type")
    private String personnelListType;

    @Column(name = "max_person_num", precision = 5)
    private BigDecimal maxPersonNum;

    @Column(name = "overman_time", precision = 5)
    private BigDecimal overmanTime;

    @Column(name = "retention_time", precision = 5)
    private BigDecimal retentionTime;

    @Lob
    @Column(name = "post_list_type")
    private String postListType;

}