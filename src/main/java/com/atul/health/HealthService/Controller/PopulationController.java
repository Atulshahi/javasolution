package com.atul.health.HealthService.Controller;

import com.atul.health.HealthService.Model.Population;
import com.atul.health.HealthService.Repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/population")
public class PopulationController {

    @Autowired
    private PopulationRepository populationRepository;

    @GetMapping("/view_population")
    public List<Population> index() {
        return populationRepository.findAll();
    }

    @PostMapping("/add_population")
    public Population create(@RequestBody Population population) {
        return populationRepository.save(population);
    }

    @GetMapping("/view_population/{id}")
    public Population show(@PathVariable Long id) {
        return populationRepository.findById(id).orElse(null);
    }

//    @PutMapping("/edit_population/{id}")
//    public Population update(@PathVariable Long id, @RequestBody Population population) {
//        Population existingPopulation = populationRepository.findById(id).orElse(null);
//        if (existingPopulation != null) {
//            // Update the fields accordingly
//            existingPopulation.setTownname(population.getTownname());
//            existingPopulation.setPopulation(population.getPopulation());
//            // ... update other fields
//
//            return populationRepository.save(existingPopulation);
//        }
//        return null;
//    }

    @DeleteMapping("/delete_population/{id}")
    public void destroy(@PathVariable Long id) {
        populationRepository.deleteById(id);
    }

}
