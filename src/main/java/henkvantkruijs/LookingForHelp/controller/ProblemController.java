package henkvantkruijs.LookingForHelp.controller;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.Problem;


import henkvantkruijs.LookingForHelp.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    @GetMapping(value = "/problems")
    public ResponseEntity<Object> getProblems() {
        List<Problem> problems = problemService.getAllProblems();
        return new ResponseEntity<>(problems, HttpStatus.OK);
    }

    @GetMapping(value = "/problems/problemName/{problemName}")
    public ResponseEntity<Object> getProblems(@PathVariable("problemName") String problemName) {
        List<Problem> problems = problemService.getProblemsProblemNameStartsWith(problemName);
        return new ResponseEntity<>(problems, HttpStatus.OK);
    }

    @GetMapping(value = "/problems/{id}")
    public ResponseEntity<Object> getProblem(@PathVariable("id") long id) {
        return new ResponseEntity<>(problemService.getProblem(id), HttpStatus.OK);
    }

    @PostMapping(value = "/problems")
    public ResponseEntity<Object> createProblem(@RequestBody Problem problem) {
        problemService.save(problem);
        return new ResponseEntity<>("Problem created", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/problems/{id}")
    public ResponseEntity<Object> deleteProblem(@PathVariable("id") long id) {
        problemService.deleteById(id);
        return new ResponseEntity<>("Problem deleted", HttpStatus.OK);
    }

    @PutMapping(value = "/problems/{id}")
    public ResponseEntity<Object> updateProblem(@PathVariable("id") long id, @RequestBody Problem problem) {
        problemService.updateProblem(id, problem);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
