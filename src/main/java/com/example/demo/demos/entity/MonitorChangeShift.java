package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_monitor_change_shift", schema = "business_location")
public class MonitorChangeShift {
    @Id
    @Column(name = "id", nullable = false, length = 64)
    private String id;

    @Column(name = "customer_id", nullable = false, length = 64)
    private String customerId;

    @Column(name = "begin_time")
    private Instant beginTime;

    @Column(name = "end_time")
    private Instant endTime;

    @Column(name = "center_run", length = 20)
    private String centerRun;

    @Column(name = "no_finish", length = 1000)
    private String noFinish;

    @Column(name = "hand_over_time")
    private Instant handOverTime;

    @Column(name = "hand_over_person", length = 1000)
    private String handOverPerson;

    @Column(name = "take_over_person", length = 1000)
    private String takeOverPerson;

    @Column(name = "monitor_date")
    private Instant monitorDate;

    @Column(name = "current_shift", length = 32)
    private String currentShift;

    @Column(name = "next_shift", length = 32)
    private String nextShift;

    @Column(name = "remarks", length = 500)
    private String remarks;

    @Column(name = "is_current", length = 1)
    private String isCurrent;

    @Column(name = "data_type", nullable = false, length = 1)
    private String dataType;

    @Column(name = "created_by", length = 64)
    private String createdBy;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "modified_by", length = 64)
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;

}