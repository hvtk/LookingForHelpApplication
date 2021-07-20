package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.User;
import henkvantkruijs.LookingForHelp.service.AidWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AidWorkerController {

    @Autowired
    private AidWorkerService aidWorkerService;

    @GetMapping(value = "/aidWorkers")
    public ResponseEntity<Object> getAidWorkers() {
        List<AidWorker> aidWorkers = aidWorkerService.getAllAidWorkers();
        return new ResponseEntity<>(aidWorkers, HttpStatus.OK);
    }

    @GetMapping(value = "/aidWorkers/aidWorkerName/{aidWorkerName}")
    public ResponseEntity<Object> getAidWorkers(@PathVariable("aidWorkerName") String aidWorkerName) {
        List<AidWorker> aidWorkers = aidWorkerService.getAidWorkersAidWorkerNameStartsWith(aidWorkerName);
        return new ResponseEntity<>(aidWorkers, HttpStatus.OK);
    }

    @GetMapping(value = "/aidWorkers/{id}")
    public ResponseEntity<Object> getAidWorker(@PathVariable("id") long id) {
        return new ResponseEntity<>(aidWorkerService.getAidWorker(id), HttpStatus.OK);
    }

    @PostMapping(value = "/aidWorkers")
    public ResponseEntity<Object> createAidWorker(@RequestBody AidWorker aidWorker) {
        aidWorkerService.save(aidWorker);
        return new ResponseEntity<>("AidWorker created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/aidWorkers/{id}")
    public ResponseEntity<Object> deleteAidWorker(@PathVariable("id") long id) {
        aidWorkerService.deleteById(id);
        return new ResponseEntity<>("AidWorker deleted", HttpStatus.OK);
    }

    @PutMapping(value = "/aidWorkers/{id}")
    public ResponseEntity<Object> updateAidWorker(@PathVariable("id") long id, @RequestBody AidWorker aidWorker) {
        aidWorkerService.updateAidWorker(id, aidWorker);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


