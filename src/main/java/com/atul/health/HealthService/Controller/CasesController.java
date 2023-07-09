package com.atul.health.HealthService.Controller;

import com.atul.health.HealthService.Model.CaseDoctorMapping;
import com.atul.health.HealthService.Model.Cases;
import com.atul.health.HealthService.Model.User;
import com.atul.health.HealthService.Repository.CaseDoctorMappingRepository;
import com.atul.health.HealthService.Repository.CasesRepository;
import com.atul.health.HealthService.Repository.UserRepository;
import com.atul.health.HealthService.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cases")
public class CasesController {

    private static final String PATIENT_DETAILS = "patient.details";
    private static final String CASE_DOC_DET = "case.doctor.details";

    private final CasesRepository casesRepository;
    private final UserRepository userRepository;

    @Autowired
    public CasesController(CasesRepository casesRepository, UserRepository userRepository) {
        this.casesRepository = casesRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/view_cases")
    public List<Cases> index() {
        return casesRepository.findAll();
    }

    @PostMapping("/add_cases")
    public Cases create(@RequestBody Cases cases) {
        int caseNumberLength = 8;
        cases.setCaseNumber(Cases.generateCaseNo(caseNumberLength));
        return casesRepository.save(cases);
    }

    @GetMapping("/view_cases/{id}")
    public ResponseEntity<Cases> show(@PathVariable("id") Long id) {
        Cases cases = casesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cases", "id", id));
        return ResponseEntity.ok(cases);
    }

//    @GetMapping("/view_cases_by_user/user/{id}")
//    public List<Cases> caseByUser(@PathVariable("id") Long id) {
//        return casesRepository.findByPatientIdOrderByCaseDateDesc(id);
//    }

//    @GetMapping("/view_cases_by_vle/vle")
//    public List<Cases> caseByVle(@RequestHeader("Authorization") String authorizationHeader) {
//        String token = authorizationHeader.replace("Bearer ", "");
//        User vle = userRepository.findByToken(token)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "token", token));
//        return casesRepository.findByVleIdOrderByCaseDateDesc(vle.getUserId());
//    }

//    @GetMapping("/view_cases_by_vle/vle")
//    public List<Cases> caseByVle(@RequestHeader("Authorization") String authorizationHeader) {
//        String token = authorizationHeader.replace("Bearer ", "");
//        User vle = UserRepository.findByToken(token)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "token", token));
//        return casesRepository.findByVleIdOrderByCaseDateDesc(vle.getUserId());
//    }

//    public ResponseEntity<List<Cases>> getCasesByVle(@RequestHeader("Authorization") String authorizationHeader) {
//        String token = authorizationHeader.replace("Bearer ", "");
//        User vle = userRepository.findByToken(token);
//        List<Cases> cases = casesRepository.findByVleIdOrderByCaseDateDesc(vle.getId());
//        return ResponseEntity.ok(cases);
//    }

    @GetMapping("/view_cases_by_doctor/doctor")
    public List<CaseDoctorMapping> caseByDoctor(@RequestHeader("Authorization") String authorizationHeader) {
        String token = authorizationHeader.replace("Bearer ", "");
        User doctor = UserRepository.findByToken(token)
                .orElseThrow(() -> new ResourceNotFoundException("User", "token", token));
        return CaseDoctorMappingRepository.findByDoctorIdOrderByCreatedDateDesc(doctor.getUserId());
    }

    @PutMapping("/edit_cases/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Cases updatedCases) {
        Cases cases = casesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cases", "id", id));
        cases.setPatientId(updatedCases.getPatientId());
        cases.setVleId(updatedCases.getVleId());
        cases.setVleNote(updatedCases.getVleNote());
        cases.setPanchayatId(updatedCases.getPanchayatId());
        cases.setCaseStatus(updatedCases.getCaseStatus());
        cases.setCaseDate(updatedCases.getCaseDate());
        cases.setRefImage(updatedCases.getRefImage());
        cases.setDescription(updatedCases.getDescription());
        Cases updatedCase = casesRepository.save(cases);
        return ResponseEntity.ok(updatedCase);
    }

    @DeleteMapping("/delete_cases/{id}")
    public ResponseEntity<?> destroy(@PathVariable("id") Long id) {
        Cases cases = casesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cases", "id", id));
        casesRepository.delete(cases);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/health")
//    public List<Cases> health() {
//        return casesRepository.findAllWithDetails();
//    }


}
