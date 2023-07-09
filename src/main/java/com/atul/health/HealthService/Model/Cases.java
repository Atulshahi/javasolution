package com.atul.health.HealthService.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tbl_cases")
public class Cases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_id")
    private Long caseId;

    @Column(name = "case_number")
    private String caseNumber;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
//@Column(name = "patient_id")
    private User patientId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vle_id")
//@Column(name = "vle_id")

    private User vleId;

    @Column(name = "vle_note")
    private String vleNote;

    @Column(name = "panchayat_id")
    private Long panchayatId;

    @Column(name = "case_status")
    private String caseStatus;

    @Column(name = "case_date")
    private LocalDateTime caseDate;

    @Column(name = "ref_image")
    private String refImage;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private LocalDateTime createdAt;

    @Column(name = "updated_date")
    private LocalDateTime updatedAt;

    @JsonIgnore
    @OneToMany(mappedBy = "cases", cascade = CascadeType.ALL)
//@Column(mappedBy = "cases", cascade = CascadeType.ALL)
//    @OneToOne(mappedBy = "cases", cascade = CascadeType.ALL)
    private List<HealthData> healthDataList;

    @JsonIgnore
    @OneToMany(mappedBy = "cases", cascade = CascadeType.ALL)
    private List<Prescription> prescriptionList;

    // Constructors, getters, and setters

    public Cases(Long caseId, String caseNumber, User patientId, User vleId, String vleNote, Long panchayatId, String caseStatus, LocalDateTime caseDate, String refImage, String description, LocalDateTime createdAt, LocalDateTime updatedAt, List<HealthData> healthDataList, List<Prescription> prescriptionList) {
        this.caseId = caseId;
        this.caseNumber = caseNumber;
        this.patientId = patientId;
        this.vleId = vleId;
        this.vleNote = vleNote;
        this.panchayatId = panchayatId;
        this.caseStatus = caseStatus;
        this.caseDate = caseDate;
        this.refImage = refImage;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.healthDataList = healthDataList;
        this.prescriptionList = prescriptionList;
    }

    public Cases() {
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public User getPatientId() {
        return patientId;
    }

    public void setPatientId(User patientId) {
        this.patientId = patientId;
    }

    public User getVleId() {
        return vleId;
    }

    public void setVleId(User vleId) {
        this.vleId = vleId;
    }

    public String getVleNote() {
        return vleNote;
    }

    public void setVleNote(String vleNote) {
        this.vleNote = vleNote;
    }

    public Long getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Long panchayatId) {
        this.panchayatId = panchayatId;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public LocalDateTime getCaseDate() {
        return caseDate;
    }

    public void setCaseDate(LocalDateTime caseDate) {
        this.caseDate = caseDate;
    }

    public String getRefImage() {
        return refImage;
    }

    public void setRefImage(String refImage) {
        this.refImage = refImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<HealthData> getHealthDataList() {
        return healthDataList;
    }

    public void setHealthDataList(List<HealthData> healthDataList) {
        this.healthDataList = healthDataList;
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    //    public Cases(Long caseId, String caseNumber, User patient, User vle, String vleNote, Long panchayatId, String caseStatus, LocalDateTime caseDate, String refImage, String description, LocalDateTime createdAt, LocalDateTime updatedAt, List<HealthData> healthDataList, List<Prescription> prescriptionList) {
//        this.caseId = caseId;
//        this.caseNumber = caseNumber;
//        this.patientId = patient;
//        this.vleId = vle;
//        this.vleNote = vleNote;
//        this.panchayatId = panchayatId;
//        this.caseStatus = caseStatus;
//        this.caseDate = caseDate;
//        this.refImage = refImage;
//        this.description = description;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//        this.healthDataList = healthDataList;
//        this.prescriptionList = prescriptionList;
//    }
//
//    public Cases() {
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
//    public String getCaseNumber() {
//        return caseNumber;
//    }
//
//    public void setCaseNumber(String caseNumber) {
//        this.caseNumber = caseNumber;
//    }
//
//    public User getPatientId() {
//        return patientId;
//    }
//
//    public void setPatientId(User patient) {
//        this.patientId = patient;
//    }
//
//    public User getVleId() {
//        return vleId;
//    }
//
//    public void setVleId(User vle) {
//        this.vleId = vle;
//    }
//
//    public String getVleNote() {
//        return vleNote;
//    }
//
//    public void setVleNote(String vleNote) {
//        this.vleNote = vleNote;
//    }
//
//    public Long getPanchayatId() {
//        return panchayatId;
//    }
//
//    public void setPanchayatId(Long panchayatId) {
//        this.panchayatId = panchayatId;
//    }
//
//    public String getCaseStatus() {
//        return caseStatus;
//    }
//
//    public void setCaseStatus(String caseStatus) {
//        this.caseStatus = caseStatus;
//    }
//
//    public LocalDateTime getCaseDate() {
//        return caseDate;
//    }
//
//    public void setCaseDate(LocalDateTime caseDate) {
//        this.caseDate = caseDate;
//    }
//
//    public String getRefImage() {
//        return refImage;
//    }
//
//    public void setRefImage(String refImage) {
//        this.refImage = refImage;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
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
//    public List<HealthData> getHealthDataList() {
//        return healthDataList;
//    }
//
//    public void setHealthDataList(List<HealthData> healthDataList) {
//        this.healthDataList = healthDataList;
//    }
//
//    public List<Prescription> getPrescriptionList() {
//        return prescriptionList;
//    }
//
//    public void setPrescriptionList(List<Prescription> prescriptionList) {
//        this.prescriptionList = prescriptionList;
//    }
//
//    @Override
//    public String toString() {
//        return "Cases{" +
//                "caseId=" + caseId +
//                ", caseNumber='" + caseNumber + '\'' +
//                ", patient=" + patientId +
//                ", vle=" + vleId +
//                ", vleNote='" + vleNote + '\'' +
//                ", panchayatId=" + panchayatId +
//                ", caseStatus='" + caseStatus + '\'' +
//                ", caseDate=" + caseDate +
//                ", refImage='" + refImage + '\'' +
//                ", description='" + description + '\'' +
//                ", createdAt=" + createdAt +
//                ", updatedAt=" + updatedAt +
//                ", healthDataList=" + healthDataList +
//                ", prescriptionList=" + prescriptionList +
//                '}';
//    }


    @Override
    public String toString() {
        return "Cases{" +
                "caseId=" + caseId +
                ", caseNumber='" + caseNumber + '\'' +
                ", patientId=" + patientId +
                ", vleId=" + vleId +
                ", vleNote='" + vleNote + '\'' +
                ", panchayatId=" + panchayatId +
                ", caseStatus='" + caseStatus + '\'' +
                ", caseDate=" + caseDate +
                ", refImage='" + refImage + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", healthDataList=" + healthDataList +
                ", prescriptionList=" + prescriptionList +
                '}';
    }

    public static String generateCaseNo(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder caseNo = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            caseNo.append(characters.charAt(randomIndex));
        }

        return caseNo.toString();
    }

}
