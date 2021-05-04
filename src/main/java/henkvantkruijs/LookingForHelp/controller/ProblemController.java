package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.Problem;

import henkvantkruijs.LookingForHelp.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProblemController {

    @Autowired
    private ProblemRepository problemRepository;

    @GetMapping(value = "/problems")
    public ResponseEntity<Object> getProblems() {
        List<Problem> problems = problemRepository.findAll();
        return new ResponseEntity<>(problems, HttpStatus.OK);
    }
}
