package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {// communiceert met de database


}
