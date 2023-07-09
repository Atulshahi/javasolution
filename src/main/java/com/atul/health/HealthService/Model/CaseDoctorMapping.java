package com.atul.health.HealthService.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_case_doctor_mapping")

public class CaseDoctorMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mapping_id")
    private Long mappingId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "case_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cases casesId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User doctorId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rejected_by_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User rejectedById;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approved_by_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User approvedById;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_by_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User assignedById;

    @Column(name = "reason")
    private String reason;

    @Column(name = "mapping_status")
    private String mappingStatus;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    public CaseDoctorMapping(Long mappingId, Cases casesId, User doctorId, User rejectedById, User approvedById, User assignedById, String reason, String mappingStatus, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.mappingId = mappingId;
        this.casesId = casesId;
        this.doctorId = doctorId;
        this.rejectedById = rejectedById;
        this.approvedById = approvedById;
        this.assignedById = assignedById;
        this.reason = reason;
        this.mappingStatus = mappingStatus;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public CaseDoctorMapping() {
    }

    public Long getMappingId() {
        return mappingId;
    }

    public void setMappingId(Long mappingId) {
        this.mappingId = mappingId;
    }

    public Cases getCasesId() {
        return casesId;
    }

    public void setCasesId(Cases casesId) {
        this.casesId = casesId;
    }

    public User getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(User doctorId) {
        this.doctorId = doctorId;
    }

    public User getRejectedById() {
        return rejectedById;
    }

    public void setRejectedById(User rejectedById) {
        this.rejectedById = rejectedById;
    }

    public User getApprovedById() {
        return approvedById;
    }

    public void setApprovedById(User approvedById) {
        this.approvedById = approvedById;
    }

    public User getAssignedById() {
        return assignedById;
    }

    public void setAssignedById(User assignedById) {
        this.assignedById = assignedById;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMappingStatus() {
        return mappingStatus;
    }

    public void setMappingStatus(String mappingStatus) {
        this.mappingStatus = mappingStatus;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "CaseDoctorMapping{" +
                "mappingId=" + mappingId +
                ", casesId=" + casesId +
                ", doctorId=" + doctorId +
                ", rejectedById=" + rejectedById +
                ", approvedById=" + approvedById +
                ", assignedById=" + assignedById +
                ", reason='" + reason + '\'' +
                ", mappingStatus='" + mappingStatus + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
