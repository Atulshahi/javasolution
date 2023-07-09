package com.atul.health.HealthService.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_equipment_panchayat_mapping")
public class EquipmentPanchayatMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mapping_id")
    private Long mappingId;

    @Column(name = "equipment_id")
    private Long equipmentId;

    @Column(name = "panchayat_id")
    private Long panchayatId;

    @Column(name = "equipment_code_2")
    private String equipmentCode2;

    @Column(name = "equipment_code_3")
    private String equipmentCode3;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private LocalDateTime createdAt;

    @Column(name = "updated_date")
    private LocalDateTime updatedAt;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "equipment_id", referencedColumnName = "equipment_id", insertable = false, updatable = false)
//    private Equipment equipment;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "panchayat_id", referencedColumnName = "panchayat_id", insertable = false, updatable = false)
//    private GramPanchayat panchayat;


    public EquipmentPanchayatMapping(Long mappingId, Long equipmentId, Long panchayatId, String equipmentCode2, String equipmentCode3, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.mappingId = mappingId;
        this.equipmentId = equipmentId;
        this.panchayatId = panchayatId;
        this.equipmentCode2 = equipmentCode2;
        this.equipmentCode3 = equipmentCode3;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public EquipmentPanchayatMapping() {
    }

    public Long getMappingId() {
        return mappingId;
    }

    public void setMappingId(Long mappingId) {
        this.mappingId = mappingId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Long getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Long panchayatId) {
        this.panchayatId = panchayatId;
    }

    public String getEquipmentCode2() {
        return equipmentCode2;
    }

    public void setEquipmentCode2(String equipmentCode2) {
        this.equipmentCode2 = equipmentCode2;
    }

    public String getEquipmentCode3() {
        return equipmentCode3;
    }

    public void setEquipmentCode3(String equipmentCode3) {
        this.equipmentCode3 = equipmentCode3;
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

    @Override
    public String toString() {
        return "EquipmentPanchayatMapping{" +
                "mappingId=" + mappingId +
                ", equipmentId=" + equipmentId +
                ", panchayatId=" + panchayatId +
                ", equipmentCode2='" + equipmentCode2 + '\'' +
                ", equipmentCode3='" + equipmentCode3 + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
