package com.atul.health.HealthService.Controller;

import com.atul.health.HealthService.Model.Equipment;
import com.atul.health.HealthService.Repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @GetMapping("/view_equipment")
    public List<Equipment> index() {
        return equipmentRepository.findAll();
    }

    @PostMapping("/add_equipment")
    public Equipment create(@RequestBody Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @GetMapping("/view_equipment/{id}")
//    public Equipment show(@PathVariable Long id) {
//        return equipmentRepository.findById(id).orElse(null);

        public ResponseEntity<Equipment> show(@PathVariable Long id) {
            Equipment equipment = equipmentRepository.findById(id).orElse(null);
            return ResponseEntity.ok(equipment);
    }

//    @PutMapping("/{id}")
//    public Equipment update(@PathVariable Long id, @RequestBody Equipment equipment) {
//        Equipment existingEquipment = equipmentRepository.findById(id).orElse(null);
//        if (existingEquipment != null) {
//            // Update the fields accordingly
//            existingEquipment.setEquipmentName(equipment.getEquipmentName());
//            existingEquipment.setEquipmentModel(equipment.getEquipmentModel());
//            existingEquipment.setManufacturer(equipment.getManufacturer());
//            // ... update other fields
//
//            return equipmentRepository.save(existingEquipment);
//        }
//        return null;
//    }

    @DeleteMapping("/delete_equipment/{id}")
    public void destroy(@PathVariable Long id) {
        equipmentRepository.deleteById(id);
    }

//    @GetMapping("/equipmentfn")
//    public List<Equipment> equipmentfn() {
//        return equipmentRepository.findAllWithField();
//    }

}
