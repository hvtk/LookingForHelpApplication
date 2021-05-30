package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.model.Problem;

import java.util.List;

public interface ProblemService {

    List<Problem> getAllProblems();
    Problem getProblem(long id);
    List<Problem> getProblemsProblemNameStartsWith(String problemName);
    void save(Problem problem);
    void deleteById(long id);
}

