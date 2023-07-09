package com.atul.health.HealthService.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_health_data")
public class HealthData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_id")
    private Long healthId;

    @Column(name = "case_id")
    private Long caseId;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "bt_temperature")
    private double bodyTemperature;

    @Column(name = "bp_systolic")
    private int bloodPressureSystolic;

    @Column(name = "bp_diastolic")
    private int bloodPressureDiastolic;

    @Column(name = "bp_ma_pressure")
    private int bloodPressureMeanArterialPressure;

    @Column(name = "bp_pulse")
    private int bloodPressurePulse;

    @Column(name = "pom_oxegen_level")
    private int oxygenLevel;

    @Column(name = "pom_pulse")
    private int pulse;

    @Column(name = "bg_glucose_level")
    private double glucoseLevel;

    @Column(name = "bg_post_glucose_level")
    private double postGlucoseLevel;

    @Column(name = "fb_heart_rates")
    private int heartRates;

    @Column(name = "fb_steps")
    private int steps;

    @Column(name = "fb_calories")
    private int calories;

    @Column(name = "wm_weight")
    private double weight;

    @Column(name = "other_data")
    private String otherData;

    @Column(name = "type")
    private String type;

    @Column(name = "created_date")
    private LocalDateTime createdAt;

    @Column(name = "updated_date")
    private LocalDateTime updatedAt;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "case_id", referencedColumnName = "case_id", insertable = false, updatable = false)
    private Cases cases;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User patient;

//    public HealthData(Long healthId, Long caseId, Long patientId, double bodyTemperature, int bloodPressureSystolic, int bloodPressureDiastolic, int bloodPressureMeanArterialPressure, int bloodPressurePulse, int oxygenLevel, int pulse, double glucoseLevel, double postGlucoseLevel, int heartRates, int steps, int calories, double weight, String otherData, String type, LocalDateTime createdAt, LocalDateTime updatedAt) {
//        this.healthId = healthId;
//        this.caseId = caseId;
//        this.patientId = patientId;
//        this.bodyTemperature = bodyTemperature;
//        this.bloodPressureSystolic = bloodPressureSystolic;
//        this.bloodPressureDiastolic = bloodPressureDiastolic;
//        this.bloodPressureMeanArterialPressure = bloodPressureMeanArterialPressure;
//        this.bloodPressurePulse = bloodPressurePulse;
//        this.oxygenLevel = oxygenLevel;
//        this.pulse = pulse;
//        this.glucoseLevel = glucoseLevel;
//        this.postGlucoseLevel = postGlucoseLevel;
//        this.heartRates = heartRates;
//        this.steps = steps;
//        this.calories = calories;
//        this.weight = weight;
//        this.otherData = otherData;
//        this.type = type;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }
//
//    public HealthData() {
//    }
//
//    public Long getHealthId() {
//        return healthId;
//    }
//
//    public void setHealthId(Long healthId) {
//        this.healthId = healthId;
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
//    public double getBodyTemperature() {
//        return bodyTemperature;
//    }
//
//    public void setBodyTemperature(double bodyTemperature) {
//        this.bodyTemperature = bodyTemperature;
//    }
//
//    public int getBloodPressureSystolic() {
//        return bloodPressureSystolic;
//    }
//
//    public void setBloodPressureSystolic(int bloodPressureSystolic) {
//        this.bloodPressureSystolic = bloodPressureSystolic;
//    }
//
//    public int getBloodPressureDiastolic() {
//        return bloodPressureDiastolic;
//    }
//
//    public void setBloodPressureDiastolic(int bloodPressureDiastolic) {
//        this.bloodPressureDiastolic = bloodPressureDiastolic;
//    }
//
//    public int getBloodPressureMeanArterialPressure() {
//        return bloodPressureMeanArterialPressure;
//    }
//
//    public void setBloodPressureMeanArterialPressure(int bloodPressureMeanArterialPressure) {
//        this.bloodPressureMeanArterialPressure = bloodPressureMeanArterialPressure;
//    }
//
//    public int getBloodPressurePulse() {
//        return bloodPressurePulse;
//    }
//
//    public void setBloodPressurePulse(int bloodPressurePulse) {
//        this.bloodPressurePulse = bloodPressurePulse;
//    }
//
//    public int getOxygenLevel() {
//        return oxygenLevel;
//    }
//
//    public void setOxygenLevel(int oxygenLevel) {
//        this.oxygenLevel = oxygenLevel;
//    }
//
//    public int getPulse() {
//        return pulse;
//    }
//
//    public void setPulse(int pulse) {
//        this.pulse = pulse;
//    }
//
//    public double getGlucoseLevel() {
//        return glucoseLevel;
//    }
//
//    public void setGlucoseLevel(double glucoseLevel) {
//        this.glucoseLevel = glucoseLevel;
//    }
//
//    public double getPostGlucoseLevel() {
//        return postGlucoseLevel;
//    }
//
//    public void setPostGlucoseLevel(double postGlucoseLevel) {
//        this.postGlucoseLevel = postGlucoseLevel;
//    }
//
//    public int getHeartRates() {
//        return heartRates;
//    }
//
//    public void setHeartRates(int heartRates) {
//        this.heartRates = heartRates;
//    }
//
//    public int getSteps() {
//        return steps;
//    }
//
//    public void setSteps(int steps) {
//        this.steps = steps;
//    }
//
//    public int getCalories() {
//        return calories;
//    }
//
//    public void setCalories(int calories) {
//        this.calories = calories;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public String getOtherData() {
//        return otherData;
//    }
//
//    public void setOtherData(String otherData) {
//        this.otherData = otherData;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
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
//    @Override
//    public String toString() {
//        return "HealthData{" +
//                "healthId=" + healthId +
//                ", caseId=" + caseId +
//                ", patientId=" + patientId +
//                ", bodyTemperature=" + bodyTemperature +
//                ", bloodPressureSystolic=" + bloodPressureSystolic +
//                ", bloodPressureDiastolic=" + bloodPressureDiastolic +
//                ", bloodPressureMeanArterialPressure=" + bloodPressureMeanArterialPressure +
//                ", bloodPressurePulse=" + bloodPressurePulse +
//                ", oxygenLevel=" + oxygenLevel +
//                ", pulse=" + pulse +
//                ", glucoseLevel=" + glucoseLevel +
//                ", postGlucoseLevel=" + postGlucoseLevel +
//                ", heartRates=" + heartRates +
//                ", steps=" + steps +
//                ", calories=" + calories +
//                ", weight=" + weight +
//                ", otherData='" + otherData + '\'' +
//                ", type='" + type + '\'' +
//                ", createdAt=" + createdAt +
//                ", updatedAt=" + updatedAt +
//                '}';
//    }


    public HealthData(Long healthId, Long caseId, Long patientId, double bodyTemperature, int bloodPressureSystolic, int bloodPressureDiastolic, int bloodPressureMeanArterialPressure, int bloodPressurePulse, int oxygenLevel, int pulse, double glucoseLevel, double postGlucoseLevel, int heartRates, int steps, int calories, double weight, String otherData, String type, LocalDateTime createdAt, LocalDateTime updatedAt, Cases cases, User patient) {
        this.healthId = healthId;
        this.caseId = caseId;
        this.patientId = patientId;
        this.bodyTemperature = bodyTemperature;
        this.bloodPressureSystolic = bloodPressureSystolic;
        this.bloodPressureDiastolic = bloodPressureDiastolic;
        this.bloodPressureMeanArterialPressure = bloodPressureMeanArterialPressure;
        this.bloodPressurePulse = bloodPressurePulse;
        this.oxygenLevel = oxygenLevel;
        this.pulse = pulse;
        this.glucoseLevel = glucoseLevel;
        this.postGlucoseLevel = postGlucoseLevel;
        this.heartRates = heartRates;
        this.steps = steps;
        this.calories = calories;
        this.weight = weight;
        this.otherData = otherData;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.cases = cases;
        this.patient = patient;
    }

    public HealthData() {
    }

    public Long getHealthId() {
        return healthId;
    }

    public void setHealthId(Long healthId) {
        this.healthId = healthId;
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

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getBloodPressureSystolic() {
        return bloodPressureSystolic;
    }

    public void setBloodPressureSystolic(int bloodPressureSystolic) {
        this.bloodPressureSystolic = bloodPressureSystolic;
    }

    public int getBloodPressureDiastolic() {
        return bloodPressureDiastolic;
    }

    public void setBloodPressureDiastolic(int bloodPressureDiastolic) {
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public int getBloodPressureMeanArterialPressure() {
        return bloodPressureMeanArterialPressure;
    }

    public void setBloodPressureMeanArterialPressure(int bloodPressureMeanArterialPressure) {
        this.bloodPressureMeanArterialPressure = bloodPressureMeanArterialPressure;
    }

    public int getBloodPressurePulse() {
        return bloodPressurePulse;
    }

    public void setBloodPressurePulse(int bloodPressurePulse) {
        this.bloodPressurePulse = bloodPressurePulse;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public double getGlucoseLevel() {
        return glucoseLevel;
    }

    public void setGlucoseLevel(double glucoseLevel) {
        this.glucoseLevel = glucoseLevel;
    }

    public double getPostGlucoseLevel() {
        return postGlucoseLevel;
    }

    public void setPostGlucoseLevel(double postGlucoseLevel) {
        this.postGlucoseLevel = postGlucoseLevel;
    }

    public int getHeartRates() {
        return heartRates;
    }

    public void setHeartRates(int heartRates) {
        this.heartRates = heartRates;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "HealthData{" +
                "healthId=" + healthId +
                ", caseId=" + caseId +
                ", patientId=" + patientId +
                ", bodyTemperature=" + bodyTemperature +
                ", bloodPressureSystolic=" + bloodPressureSystolic +
                ", bloodPressureDiastolic=" + bloodPressureDiastolic +
                ", bloodPressureMeanArterialPressure=" + bloodPressureMeanArterialPressure +
                ", bloodPressurePulse=" + bloodPressurePulse +
                ", oxygenLevel=" + oxygenLevel +
                ", pulse=" + pulse +
                ", glucoseLevel=" + glucoseLevel +
                ", postGlucoseLevel=" + postGlucoseLevel +
                ", heartRates=" + heartRates +
                ", steps=" + steps +
                ", calories=" + calories +
                ", weight=" + weight +
                ", otherData='" + otherData + '\'' +
                ", type='" + type + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", cases=" + cases +
                ", patient=" + patient +
                '}';
    }
}
