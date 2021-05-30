package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {

    List<Problem> findAllByProblemNameStartsWith(String problemName);
}


