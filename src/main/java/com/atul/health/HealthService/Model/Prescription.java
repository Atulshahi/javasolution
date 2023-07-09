package com.atul.health.HealthService.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_prescription")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_id")
    private Long prescriptionId;

    @Column(name = "case_id")
    private Long caseId;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "prescription_image")
    private String prescriptionImage;

    @Column(name = "note")
    private String note;

    @Column(name = "next_visit_date")
    private LocalDateTime nextVisitDate;

    @Column(name = "created_date")
    private LocalDateTime createdAt;

    @Column(name = "updated_date")
    private LocalDateTime updatedAt;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User doctor;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", referencedColumnName = "patient_id", insertable = false, updatable = false)
    private Cases patient;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "case_id", referencedColumnName = "case_id", insertable = false, updatable = false)
    private Cases cases;

    public Prescription(Long prescriptionId, Long caseId, Long patientId, Long doctorId, String prescriptionImage, String note, LocalDateTime nextVisitDate, LocalDateTime createdAt, LocalDateTime updatedAt, User doctor, Cases patient, Cases cases) {
        this.prescriptionId = prescriptionId;
        this.caseId = caseId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.prescriptionImage = prescriptionImage;
        this.note = note;
        this.nextVisitDate = nextVisitDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.doctor = doctor;
        this.patient = patient;
        this.cases = cases;
    }

    public Prescription() {
    }

    public Long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getPrescriptionImage() {
        return prescriptionImage;
    }

    public void setPrescriptionImage(String prescriptionImage) {
        this.prescriptionImage = prescriptionImage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getNextVisitDate() {
        return nextVisitDate;
    }

    public void setNextVisitDate(LocalDateTime nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Cases getPatient() {
        return patient;
    }

    public void setPatient(Cases patient) {
        this.patient = patient;
    }

    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", caseId=" + caseId +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", prescriptionImage='" + prescriptionImage + '\'' +
                ", note='" + note + '\'' +
                ", nextVisitDate=" + nextVisitDate +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", cases=" + cases +
                '}';
    }

    //    public Prescription(Long prescriptionId, Long caseId, Long patientId, Long doctorId, String prescriptionImage, String note, LocalDateTime nextVisitDate, LocalDateTime createdAt, LocalDateTime updatedAt, User doctor) {
//        this.prescriptionId = prescriptionId;
//        this.caseId = caseId;
//        this.patientId = patientId;
//        this.doctorId = doctorId;
//        this.prescriptionImage = prescriptionImage;
//        this.note = note;
//        this.nextVisitDate = nextVisitDate;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//        this.doctor = doctor;
////        this.patient = patient;
////        this.cases = cases;
//    }
//
//    public Prescription() {
//    }
//
//    public Long getPrescriptionId() {
//        return prescriptionId;
//    }
//
//    public void setPrescriptionId(Long prescriptionId) {
//        this.prescriptionId = prescriptionId;
//    }
//
//    public Long getCaseId() {
//        return caseId;
//    }
//
//    public void setCaseId(Long caseId) {
//        this.caseId = caseId;
//    }
//
//    public Long getPatientId() {
//        return patientId;
//    }
//
//    public void setPatientId(Long patientId) {
//        this.patientId = patientId;
//    }
//
//    public Long getDoctorId() {
//        return doctorId;
//    }
//
//    public void setDoctorId(Long doctorId) {
//        this.doctorId = doctorId;
//    }
//
//    public String getPrescriptionImage() {
//        return prescriptionImage;
//    }
//
//    public void setPrescriptionImage(String prescriptionImage) {
//        this.prescriptionImage = prescriptionImage;
//    }
//
//    public String getNote() {
//        return note;
//    }
//
//    public void setNote(String note) {
//        this.note = note;
//    }
//
//    public LocalDateTime getNextVisitDate() {
//        return nextVisitDate;
//    }
//
//    public void setNextVisitDate(LocalDateTime nextVisitDate) {
//        this.nextVisitDate = nextVisitDate;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//    public User getDoctor() {
//        return doctor;
//    }
//
//    public void setDoctor(User doctor) {
//        this.doctor = doctor;
//    }
//
////    public Cases getPatient() {
////        return patient;
////    }
////
////    public void setPatient(Cases patient) {
////        this.patient = patient;
////    }
////
////    public Cases getCases() {
////        return cases;
////    }
////
////    public void setCases(Cases cases) {
////        this.cases = cases;
////    }
//
//    @Override
//    public String toString() {
//        return "Prescription{" +
//                "prescriptionId=" + prescriptionId +
//                ", caseId=" + caseId +
//                ", patientId=" + patientId +
//                ", doctorId=" + doctorId +
//                ", prescriptionImage='" + prescriptionImage + '\'' +
//                ", note='" + note + '\'' +
//                ", nextVisitDate=" + nextVisitDate +
//                ", createdAt=" + createdAt +
//                ", updatedAt=" + updatedAt +
//                ", doctor=" + doctor +
//                '}';
//    }
}
