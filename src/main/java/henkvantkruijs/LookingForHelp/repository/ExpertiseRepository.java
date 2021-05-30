package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Expertise;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpertiseRepository extends JpaRepository<Expertise, Long> {

    List<Expertise> findAllByExpertiseNameStartsWith(String expertiseName);

}
