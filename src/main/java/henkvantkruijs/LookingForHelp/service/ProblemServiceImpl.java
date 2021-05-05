package henkvantkruijs.LookingForHelp.service;

import henkvantkruijs.LookingForHelp.exception.RecordNotFoundException;
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
    public List<Problem> getProblemsAgeGroupStartsWith(String ageGroup) {
        return problemRepository.findAllByAgeGroupStartsWith(ageGroup);
    }

    @Override
    public Problem getProblem(long id) {
        if (problemRepository.existsById(id)) {
            return problemRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException("No problem with id " + id);
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
}
