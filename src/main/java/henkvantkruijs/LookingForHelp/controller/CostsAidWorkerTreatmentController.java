package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.CostsAidWorkerTreatment;
import henkvantkruijs.LookingForHelp.model.MediaOption;
import henkvantkruijs.LookingForHelp.service.CostsAidWorkerTreatmentService;
import henkvantkruijs.LookingForHelp.service.MediaOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CostsAidWorkerTreatmentController {

    @Autowired
    private CostsAidWorkerTreatmentService costsAidWorkerTreatmentService;

    @GetMapping(value = "/costsAidWorkerTreatments")
    public ResponseEntity<Object> getCostsAidWorkerTreatments() {
        List<CostsAidWorkerTreatment> costsAidWorkerTreatment = costsAidWorkerTreatmentService.getAllCostsAidWorkerTreatments();
        return new ResponseEntity<>(costsAidWorkerTreatment, HttpStatus.OK);
    }

    @GetMapping(value = "/costsAidWorkerTreatments/costsAidWorkerTreatment/{costsAidWorkerTreatmentPart}")
    public ResponseEntity<Object> getAllCostsAidWorkerTreatments(@PathVariable("costsAidWorkerTreatmentPart") String costsAidWorkerTreatmentPart) {
        List<CostsAidWorkerTreatment> costsAidWorkerTreatment = costsAidWorkerTreatmentService.getCostsAidWorkerTreatmentsCostsAidWorkerTreatmentPartStartsWith(costsAidWorkerTreatmentPart);
        return new ResponseEntity<>(costsAidWorkerTreatment, HttpStatus.OK);
    }

    @GetMapping(value = "/costsAidWorkerTreatments/{id}")
    public ResponseEntity<Object> getCostsAidWorkerTreatment(@PathVariable("id") long id) {
        return new ResponseEntity<>(costsAidWorkerTreatmentService.getCostsAidWorkerTreatment(id), HttpStatus.OK);
    }

    @PostMapping(value = "/costsAidWorkerTreatments")
    public ResponseEntity<Object> createCostsAidWorkerTreatment(@RequestBody CostsAidWorkerTreatment costsAidWorkerTreatment) {
        costsAidWorkerTreatmentService.save(costsAidWorkerTreatment);
        return new ResponseEntity<>("CostsAidWorkerTreatment created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/costsAidWorkerTreatment/{id}")
    public ResponseEntity<Object> deleteCostsAidWorkerTreatment(@PathVariable("id") long id) {
        costsAidWorkerTreatmentService.deleteById(id);
        return new ResponseEntity<>("CostsAidWorkerTreatment deleted", HttpStatus.OK);
    }

    @PutMapping(value = "/costsAidWorkerTreatment/{id}")
    public ResponseEntity<Object> updateCostsAidWorkerTreatment(@PathVariable("id") long id, @RequestBody CostsAidWorkerTreatment costsAidWorkerTreatment) {
        costsAidWorkerTreatmentService.updateCostsAidWorkerTreatment(id, costsAidWorkerTreatment);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

