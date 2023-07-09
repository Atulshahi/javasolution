package com.atul.health.HealthService.Repository;

import com.atul.health.HealthService.Model.CaseDoctorMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaseDoctorMappingRepository extends JpaRepository<CaseDoctorMapping, Long> {
    static List<CaseDoctorMapping> findByDoctorIdOrderByCreatedDateDesc(Long userId) {
        return CaseDoctorMappingRepository.findByDoctorIdOrderByCreatedDateDesc(userId);
    }
//    static List<CaseDoctorMapping> findByDoctorIdOrderByCreatedDateDesc(Long userId) {
//        return null;
//    }
}
