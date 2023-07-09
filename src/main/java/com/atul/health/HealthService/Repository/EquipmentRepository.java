package com.atul.health.HealthService.Repository;

import com.atul.health.HealthService.Model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
