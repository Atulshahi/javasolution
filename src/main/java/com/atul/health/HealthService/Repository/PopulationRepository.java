package com.atul.health.HealthService.Repository;

import com.atul.health.HealthService.Model.Population;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationRepository extends JpaRepository<Population, Long> {
}
