package com.atul.health.HealthService.Controller;

import com.atul.health.HealthService.Model.CaseDoctorMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/case-doctor-mapping")
public class CaseDoctorMappingController {

    @GetMapping("/view_doctormap")
    public ResponseEntity<CaseDoctorMapping> index() {
        // Code to fetch all case-doctor mappings
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add_doctormap")
    public ResponseEntity<CaseDoctorMapping> create(@RequestBody CaseDoctorMapping caseDoctorMapping) {
        // Code to create a new case-doctor mapping
        return ResponseEntity.ok().build();
    }

    @GetMapping("/view_doctormap/{id}")
    public ResponseEntity<?> show(@PathVariable("id") Long id) {
        // Code to fetch a specific case-doctor mapping by ID
        return ResponseEntity.ok().build();
    }

    @PutMapping("/edit_doctormap/{id}")
    public ResponseEntity<CaseDoctorMapping> update(@PathVariable("id") Long id, @RequestBody CaseDoctorMapping caseDoctorMapping) {
        // Code to update a specific case-doctor mapping
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete_doctormap/{id}")
    public ResponseEntity<CaseDoctorMapping> destroy(@PathVariable("id") Long id) {
        // Code to delete a specific case-doctor mapping
        return ResponseEntity.ok().build();
    }

}
