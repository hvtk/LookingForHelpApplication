package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.TakeAction;
import henkvantkruijs.LookingForHelp.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {

    List<Treatment> findAllByTreatmentNameStartsWith(String treatmentName);
}
