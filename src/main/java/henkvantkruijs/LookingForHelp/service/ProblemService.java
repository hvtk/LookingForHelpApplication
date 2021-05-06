package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.Problem;

import java.util.List;

public interface ProblemService {   // hierin ga je definieren wat je allemaal met de problemen wil doen.

    List<Problem> getAllProblems();
    Problem getProblem(long id);
    List<Problem> getProblemsProblemNameStartsWith(String problemName);
    void save(Problem problem);
    void deleteById(long id);
}

