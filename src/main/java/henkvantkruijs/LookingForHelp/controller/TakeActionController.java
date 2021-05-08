package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.service.TakeActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TakeActionController {

    @Autowired
    private TakeActionService takeActionService;

    @GetMapping(value = "/takeActions")
    public ResponseEntity<Object> getTakeActions() {
        List<TakeAction> takeActions = takeActionService.getAllTakeActions();
        return new ResponseEntity<>(takeActions, HttpStatus.OK);
    }

    @GetMapping(value = "/takeActions/takeActionName/{takeActionName}")
    public ResponseEntity<Object> getTakeActions(@PathVariable("takeActionName") String takeActionName) {
        List<TakeAction> takeActions = takeActionService.getTakeActionsTakeActionNameStartsWith(takeActionName);
        return new ResponseEntity<>(takeActions, HttpStatus.OK);
    }

    @GetMapping(value = "/takeActions/{id}")
    public ResponseEntity<Object> getTakeAction(@PathVariable("id") long id) {
        return new ResponseEntity<>(takeActionService.getTakeAction(id), HttpStatus.OK);
    }

    @PostMapping(value = "/takeActions")
    public ResponseEntity<Object> createTakeAction(@RequestBody TakeAction takeAction) {
        takeActionService.save(takeAction);
        return new ResponseEntity<>("takeAction created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/takeActions/{id}")
    public ResponseEntity<Object> deleteTakeAction(@PathVariable("id") long id) {
        takeActionService.deleteById(id);
        return new ResponseEntity<>("TakeAction deleted", HttpStatus.OK);
    }
}

