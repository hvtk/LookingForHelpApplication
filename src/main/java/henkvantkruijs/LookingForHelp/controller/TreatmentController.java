package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.model.Treatment;
import henkvantkruijs.LookingForHelp.service.TakeActionService;
import henkvantkruijs.LookingForHelp.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TreatmentController {

    @Autowired
    private TreatmentService treatmentService;

    @GetMapping(value = "/treatments")
    public ResponseEntity<Object> getTreatments() {
        List<Treatment> treatments = treatmentService.getAllTreatments();
        return new ResponseEntity<>(treatments, HttpStatus.OK);
    }

    @GetMapping(value = "/treatments/treatmentName/{treatmentName}")
    public ResponseEntity<Object> getTreatments(@PathVariable("treatmentName") String treatmentName) {
        List<Treatment> treatments = treatmentService.getTreatmentsTreatmentNameStartsWith(treatmentName);
        return new ResponseEntity<>(treatments, HttpStatus.OK);
    }

    @GetMapping(value = "/treatments/{id}")
    public ResponseEntity<Object> getTreatment(@PathVariable("id") long id) {
        return new ResponseEntity<>(treatmentService.getTreatment(id), HttpStatus.OK);
    }

    @PostMapping(value = "/treatments")
    public ResponseEntity<Object> createTreatment(@RequestBody Treatment treatment) {
        treatmentService.save(treatment);
        return new ResponseEntity<>("Treatment created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/treatments/{id}")
    public ResponseEntity<Object> deleteTakeAction(@PathVariable("id") long id) {
        treatmentService.deleteById(id);
        return new ResponseEntity<>("Treatment deleted", HttpStatus.OK);
    }

    @PutMapping(value = "/treatments/{id}")
    public ResponseEntity<Object> updateTreatment(@PathVariable("id") long id, @RequestBody Treatment treatment) {
        treatmentService.updateTreatment(id, treatment);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

