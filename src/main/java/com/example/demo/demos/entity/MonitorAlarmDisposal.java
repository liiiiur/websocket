package com.example.demo.demos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_monitor_alarm_disposal", schema = "business_location")
public class MonitorAlarmDisposal {
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;

    @Column(name = "customer_no", nullable = false, length = 32)
    private String customerNo;

    @Column(name = "alarm_id", length = 100)
    private String alarmId;

    @Column(name = "alarm_level", length = 5)
    private String alarmLevel;

    @Column(name = "alarm_value", precision = 8, scale = 2)
    private BigDecimal alarmValue;

    @Column(name = "max_time")
    private Instant maxTime;

    @Column(name = "max_value", precision = 8, scale = 2)
    private BigDecimal maxValue;

    @Column(name = "monitor_date")
    private Instant monitorDate;

    @Column(name = "monitor_work", length = 20)
    private String monitorWork;

    @Column(name = "alarm_reason_type_code", length = 30)
    private String alarmReasonTypeCode;

    @Column(name = "alarm_reason_type_name", length = 50)
    private String alarmReasonTypeName;

    @Column(name = "alarm_reason", length = 3000)
    private String alarmReason;

    @Column(name = "disposal_measure", length = 3000)
    private String disposalMeasure;

    @Column(name = "disposal_result", length = 3000)
    private String disposalResult;

    @Column(name = "analyse_person", length = 100)
    private String analysePerson;

    @Column(name = "ask_type", length = 20)
    private String askType;

    @Column(name = "ask_name", length = 20)
    private String askName;

    @Column(name = "ask_phone", length = 20)
    private String askPhone;

    @Column(name = "disposal_date")
    private Instant disposalDate;

    @Column(name = "disposal_person_id", length = 36)
    private String disposalPersonId;

    @Column(name = "disposal_person_name", length = 100)
    private String disposalPersonName;

    @Column(name = "disposal_flag", length = 1)
    private String disposalFlag;

    @Column(name = "disposal_level", length = 1)
    private String disposalLevel;

    @Column(name = "group_code", length = 20)
    private String groupCode;

    @Column(name = "partition_month", length = 6)
    private String partitionMonth;

    @Column(name = "press_way", length = 50)
    private String pressWay;

    @Column(name = "press_date")
    private Instant pressDate;

    @Column(name = "called_date")
    private Instant calledDate;

    @Column(name = "called_person", length = 50)
    private String calledPerson;

    @Column(name = "called_to_person", length = 50)
    private String calledToPerson;

    @Column(name = "called_content", length = 3000)
    private String calledContent;

    @Column(name = "press_send_person", length = 50)
    private String pressSendPerson;

    @Column(name = "press_accept_person", length = 50)
    private String pressAcceptPerson;

    @Column(name = "press_no", length = 100)
    private String pressNo;

    @Column(name = "press_content", length = 2000)
    private String pressContent;

    @Column(name = "sms_date")
    private Instant smsDate;

    @Column(name = "sms_person", length = 50)
    private String smsPerson;

    @Column(name = "sms_to_person", length = 500)
    private String smsToPerson;

    @Column(name = "sms_content", length = 1000)
    private String smsContent;

    @Column(name = "cause_type", length = 20)
    private String causeType;

    @Column(name = "cause_stationer_name", length = 50)
    private String causeStationerName;

    @Column(name = "cause_msg", length = 2000)
    private String causeMsg;

    @Column(name = "cause_type_name", length = 50)
    private String causeTypeName;

    @Column(name = "scheduling_time")
    private Instant schedulingTime;

    @Column(name = "scheduling_per", length = 2000)
    private String schedulingPer;

    @Column(name = "scheduling_obj", length = 2000)
    private String schedulingObj;

    @Column(name = "scheduling_content", length = 3000)
    private String schedulingContent;

    @Column(name = "created_by", length = 36)
    private String createdBy;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "modified_by", length = 36)
    private String modifiedBy;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Lob
    @Column(name = "is_deleted")
    private String isDeleted;

    @Column(name = "filename", length = 200)
    private String filename;

    @Column(name = "hidden_danger_id", length = 36)
    private String hiddenDangerId;

}