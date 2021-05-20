package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.Expertise;
import henkvantkruijs.LookingForHelp.service.ExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpertiseController {

    @Autowired
    private ExpertiseService expertiseService;

    @GetMapping(value = "/expertises")
    public ResponseEntity<Object> getExpertise() {
        List<Expertise> expertise = expertiseService.getAllExpertises();
        return new ResponseEntity<>(expertise, HttpStatus.OK);
    }

    @GetMapping(value = "/expertises/expertiseName/{expertiseName}")
    public ResponseEntity<Object> getExpertises(@PathVariable("expertiseName") String expertiseName) {
        List<Expertise> expertises = expertiseService.getExpertisesExpertiseNameStartsWith(expertiseName);
        return new ResponseEntity<>(expertises, HttpStatus.OK);
    }

    @GetMapping(value = "/expertises/{id}")
    public ResponseEntity<Object> getExpertise(@PathVariable("id") long id) {
        return new ResponseEntity<>(expertiseService.getExpertise(id), HttpStatus.OK);
    }

    @PostMapping(value = "/expertises")
    public ResponseEntity<Object> createExpertise(@RequestBody Expertise expertise) {
        expertiseService.save(expertise);
        return new ResponseEntity<>("Expertise created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/expertises/{id}")
    public ResponseEntity<Object> deleteExpertise(@PathVariable("id") long id) {
        expertiseService.deleteById(id);
        return new ResponseEntity<>("Expertise deleted", HttpStatus.OK);
    }
}

