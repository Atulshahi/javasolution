package com.atul.health.HealthService.Controller;

import com.atul.health.HealthService.Model.EquipmentPanchayatMapping;
import com.atul.health.HealthService.Repository.EquipmentPanchayatMappingRepository;
import com.atul.health.HealthService.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment-panchayat-mapping")
public class EquipmentPanchayatMappingController {

    private final EquipmentPanchayatMappingRepository equipmentPanchayatMappingRepository;

    public EquipmentPanchayatMappingController(EquipmentPanchayatMappingRepository equipmentPanchayatMappingRepository) {
        this.equipmentPanchayatMappingRepository = equipmentPanchayatMappingRepository;
    }

//    @GetMapping
//    private ResponseEntity<EquipmentPanchayatMapping> index() {
//        return ResponseEntity.ok(equipmentPanchayatMappingRepository.findAll());
//    }

    @GetMapping("/view_equipmentmap")
    public ResponseEntity<List<EquipmentPanchayatMapping>> index() {
        List<EquipmentPanchayatMapping> mappings = equipmentPanchayatMappingRepository.findAll();
        return ResponseEntity.ok(mappings);
    }

    @PostMapping("/add_equipmentmap")
    public ResponseEntity<EquipmentPanchayatMapping> create(@RequestBody EquipmentPanchayatMapping equipmentPanchayatMapping) {
        EquipmentPanchayatMapping createdMapping = equipmentPanchayatMappingRepository.save(equipmentPanchayatMapping);
        return ResponseEntity.ok(createdMapping);
    }

    @GetMapping("/view_equipmentmap/{id}")
    public ResponseEntity<EquipmentPanchayatMapping> show(@PathVariable("id") Long id) {
        EquipmentPanchayatMapping mapping = equipmentPanchayatMappingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EquipmentPanchayatMapping", "id", id));
        return ResponseEntity.ok(mapping);
    }

    @PutMapping("/edit_equipmentmap/{id}")
    public ResponseEntity<EquipmentPanchayatMapping> update(@PathVariable("id") Long id, @RequestBody EquipmentPanchayatMapping updatedMapping) {
        EquipmentPanchayatMapping mapping = equipmentPanchayatMappingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EquipmentPanchayatMapping", "id", id));

        mapping.setEquipmentId(updatedMapping.getEquipmentId());
        mapping.setPanchayatId(updatedMapping.getPanchayatId());
        mapping.setEquipmentCode2(updatedMapping.getEquipmentCode2());
        mapping.setEquipmentCode3(updatedMapping.getEquipmentCode3());
        mapping.setDescription(updatedMapping.getDescription());

        EquipmentPanchayatMapping updated = equipmentPanchayatMappingRepository.save(mapping);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete_equipmentmap/{id}")
    public ResponseEntity<EquipmentPanchayatMapping> destroy(@PathVariable("id") Long id) {
        EquipmentPanchayatMapping mapping = equipmentPanchayatMappingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EquipmentPanchayatMapping", "id", id));

        equipmentPanchayatMappingRepository.delete(mapping);
        return ResponseEntity.ok().build();
    }
}
