package com.atul.health.HealthService.Controller;

import com.atul.health.HealthService.Model.Prescription;
import com.atul.health.HealthService.Repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @GetMapping("/view_prescription")
    public List<Prescription> index() {
        return prescriptionRepository.findAll();
    }

    @PostMapping("/add_prescription")
    public Prescription create(@RequestBody Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    @GetMapping("/view_prescription/{id}")
    public Prescription show(@PathVariable Long id) {
        return prescriptionRepository.findById(id).orElse(null);
    }

    @PutMapping("/edit_prescription/{id}")
    public Prescription update(@PathVariable Long id, @RequestBody Prescription prescription) {
        Prescription existingPrescription = prescriptionRepository.findById(id).orElse(null);
        if (existingPrescription != null) {
            // Update the fields accordingly
            existingPrescription.setCaseId(prescription.getCaseId());
            existingPrescription.setPatientId(prescription.getPatientId());
            existingPrescription.setDoctorId(prescription.getDoctorId());
            existingPrescription.setPrescriptionImage(prescription.getPrescriptionImage());
            existingPrescription.setNote(prescription.getNote());
            existingPrescription.setNextVisitDate(prescription.getNextVisitDate());
            // ... update other fields

            return prescriptionRepository.save(existingPrescription);
        }
        return null;
    }

    @DeleteMapping("/delete_prescription/{id}")
    public void destroy(@PathVariable Long id) {
        prescriptionRepository.deleteById(id);
    }

//    @PostMapping("/{id}/fileUpload")
//    public ResponseEntity<?> fileUpload(@PathVariable Long id, @RequestParam("prescription_image") MultipartFile file) {
//        if (file.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Missing file");
//        }
//
//        Prescription prescription = prescriptionRepository.findById(id).orElse(null);
//        if (prescription == null) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Prescription not found");
//        }
//
//        String bucket = "stlgarvdev";
//        String fileExtension = getFileExtension(file.getOriginalFilename());
//        String fileName = id + "_" + prescription.getCaseId() + "_" + UUID.randomUUID() + fileExtension;
//        String keyName = "assets/prescription_image/" + fileName;
//
//        try {
//            File localFile = convertMultipartFileToFile(file);
//            AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
//
//            // Delete Existing File
//            if (s3.doesObjectExist(bucket, keyName)) {
//                s3.deleteObject(bucket, keyName);
//            }
//
//            // Upload File
//            s3.putObject(bucket, keyName, localFile);
//
//            // Update Prescription with file name
//            prescription.setPrescriptionImage(fileName);
//            prescriptionRepository.save(prescription);
//
//            // Cleanup local file
//            localFile.delete();
//
//            return ResponseEntity.ok().body("File uploaded successfully");
//        } catch (IOException e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed");
//        }
//    }

//    private String getFileExtension(String filename) {
//        int lastDotIndex = filename.lastIndexOf(".");
//        if (lastDotIndex != -1) {
//            return filename.substring(lastDotIndex);
//        }
//        return "";
//    }
//
//    private File convertMultipartFileToFile(MultipartFile file) throws IOException {
//        File convertedFile = new File(file.getOriginalFilename());
//        file.transferTo(convertedFile);
//        return convertedFile;
//    }

}
