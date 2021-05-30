package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.CostsAidWorkerTreatment;
import henkvantkruijs.LookingForHelp.model.MediaOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CostsAidWorkerTreatmentRepository extends JpaRepository<CostsAidWorkerTreatment, Long> {

    List<CostsAidWorkerTreatment> findAllByCostsAidWorkerTreatmentPartStartsWith(String costsAidWorkerTreatmentPart);


}
