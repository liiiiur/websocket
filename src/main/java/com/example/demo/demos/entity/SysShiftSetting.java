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
@Table(name = "tb_sys_shift_setting", schema = "business_location")
public class SysShiftSetting {
    @Id
    @Column(name = "id", nullable = false, length = 64)
    private String id;

    @Column(name = "customer_id", nullable = false, length = 64)
    private String customerId;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "begin_time", nullable = false, length = 10)
    private String beginTime;

    @Column(name = "end_time", nullable = false, length = 10)
    private String endTime;

    @Column(name = "next_name", length = 20)
    private String nextName;

    @Column(name = "add_day")
    private Integer addDay;

    @Column(name = "data_order")
    private Integer dataOrder;

    @Column(name = "created_by", length = 64)
    private String createdBy;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "modified_by", length = 64)
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Column(name = "keep_time", length = 10)
    private String keepTime;

}