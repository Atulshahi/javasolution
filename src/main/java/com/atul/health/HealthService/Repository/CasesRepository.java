package com.atul.health.HealthService.Repository;

import com.atul.health.HealthService.Model.Cases;
import com.atul.health.HealthService.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CasesRepository extends JpaRepository<Cases, Long> {
   // List<Cases> findByPatientIdOrderByCaseDateDesc(Long patientId);

   // List<Cases> findByVleIdOrderByCaseDateDesc(Long vleId);

   // List<Cases> findAllWithDetails();


////    List<Cases> findByPatientIdOrderByCaseDateDesc(Long id);
//      List<Cases> findByPatientIdOrderByCaseDateDesc(Long patientId);
//
////    List<Cases> findByPatientIdOrderByCaseDateDesc(User patient);
//
//
//    //    List<Cases> findByVleIdOrderByCaseDateDesc(Long userId);
//      List<Cases> findByVleIdOrderByCaseDateDesc(Long vleId);
////List<Cases> findByVleIdOrderByCaseDateDesc(User vle);



    
}
