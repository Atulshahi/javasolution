package com.atul.health.HealthService.Repository;

import com.atul.health.HealthService.Model.HealthData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HealthDataRepository extends JpaRepository<HealthData, Long> {

    @Query(value="SELECT bt_temperature, patient_id FROM tbl_health_data",nativeQuery = true)
    public List<String> findByH();
}
