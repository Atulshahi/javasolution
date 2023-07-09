package com.atul.health.HealthService.Controller;

import com.atul.health.HealthService.Model.HealthData;
import com.atul.health.HealthService.Repository.HealthDataRepository;
import com.atul.health.HealthService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/healthdata")
public class HealthDataController {

    @Autowired
    private HealthDataRepository healthDataRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/view_health_data")
//    public List<HealthData> index() {
//        return healthDataRepository.findAll();
//    }
    public List<String> index() {
        return healthDataRepository.findByH();
    }

    @PostMapping("/add_health_data")
    public HealthData create(@RequestBody HealthData healthData) {
        return healthDataRepository.save(healthData);
    }

    @GetMapping("/view_health_data/{id}")
    public HealthData show(@PathVariable("id") Long id) {
        return healthDataRepository.findById(id).orElse(null);
    }

//    @PutMapping("/edit_health_data/{id}")
//    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody HealthData healthData) {
//        HealthData existingHealthData = healthDataRepository.findById(id).orElse(null);
//        if (existingHealthData != null) {
//            // Update the fields accordingly
//            existingHealthData.setCaseId(healthData.getCaseId());
//            existingHealthData.setPatientId(healthData.getPatientId());
//            existingHealthData.setBtTemperature(healthData.getBtTemperature());
//            existingHealthData.setBpSystolic(healthData.getBpSystolic());
//            existingHealthData.setBpDiastolic(healthData.getBpDiastolic());
//            existingHealthData.setBpMaPressure(healthData.getBpMaPressure());
//            existingHealthData.setBpPulse(healthData.getBpPulse());
//            existingHealthData.setPomOxegenLevel(healthData.getPomOxegenLevel());
//            existingHealthData.setPomPulse(healthData.getPomPulse());
//            existingHealthData.setBgGlucoseLevel(healthData.getBgGlucoseLevel());
//            existingHealthData.setBgPostGlucoseLevel(healthData.getBgPostGlucoseLevel());
//            existingHealthData.setFbHeartRates(healthData.getFbHeartRates());
//            existingHealthData.setFbSteps(healthData.getFbSteps());
//            existingHealthData.setFbCalories(healthData.getFbCalories());
//            existingHealthData.setWmWeight(healthData.getWmWeight());
//            existingHealthData.setOtherData(healthData.getOtherData());
//            existingHealthData.setType(healthData.getType());
//            // ... update other fields
//
//            HealthData updatedHealthData = healthDataRepository.save(existingHealthData);
//            if (updatedHealthData != null) {
//                return ResponseEntity.ok("Updated Successfully");
//            } else {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Update failed");
//            }
//        }
//        return ResponseEntity.notFound().build();
//    }

    @DeleteMapping("/delete_health_data/{id}")
    public void destroy(@PathVariable Long id) {
        healthDataRepository.deleteById(id);
    }

//    @PostMapping("/updateContinued/{id}")
//    public ResponseEntity<String> updateContinued(@PathVariable Long id, @RequestBody HealthData healthData) {
//        HealthData existingHealthData = healthDataRepository.findById(id).orElse(null);
//        if (existingHealthData != null) {
//            // Update the fields accordingly
//            existingHealthData.setFbSteps(healthData.getFbSteps());
//            existingHealthData.setFbCalories(healthData.getFbCalories());
//            existingHealthData.setWmWeight(healthData.getWmWeight());
//            existingHealthData.setOtherData(healthData.getOtherData());
//            existingHealthData.setType(healthData.getType());
//            //... update other fields
//
//            HealthData updatedHealthData = healthDataRepository.save(existingHealthData);
//            if (updatedHealthData != null) {
//                return ResponseEntity.ok("Updated Successfully");
//            } else {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Update failed");
//            }
//        }
//        return ResponseEntity.notFound().build();
//    }

}
