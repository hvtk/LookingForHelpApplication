package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.DatabaseErrorException;
import henkvantkruijs.LookingForHelp.exception.IdNotFoundException;
import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.Problem;
import henkvantkruijs.LookingForHelp.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemRepository problemRepository;

    @Override
    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    @Override
    public List<Problem> getProblemsProblemNameStartsWith(String ageGroup) {
        return problemRepository.findAllByProblemNameStartsWith(ageGroup);
    }

    @Override
    public Problem getProblem(long id) {
        if (problemRepository.existsById(id)) {
            return problemRepository.findById(id).get();
        }
        else {
            throw new IdNotFoundException("No problem with id " + id);
        }
    }

    @Override
    public void save(Problem problem) {
        problemRepository.save(problem);
    }

    @Override
    public void deleteById(long id) {
        problemRepository.deleteById(id);
    }

    @Override
    public void updateProblem(long id, Problem problem) {
        if (problemRepository.existsById(id)) {
            try {
                Problem existingProblem = problemRepository.findById(id).orElse(null);
                existingProblem.setProblemName(problem.getProblemName());
                problemRepository.save(existingProblem);
            }
            catch (Exception ex) {
                throw new DatabaseErrorException();
            }
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
