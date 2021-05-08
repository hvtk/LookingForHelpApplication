package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @GetMapping(value = "/admin")
    public ResponseEntity<Object> getAdmin() {
        return new ResponseEntity<>("/Info endpoint available for ADMIN only!!", HttpStatus.OK);
    }
}
