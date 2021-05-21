package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.CostsAidWorkerTreatment;
import henkvantkruijs.LookingForHelp.model.MediaOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CostsAidWorkerTreatmentRepository extends JpaRepository<CostsAidWorkerTreatment, Long> {   // communiceert met de database

    List<CostsAidWorkerTreatment> findAllByCostsAidWorkerTreatmentPartStartsWith(String costsAidWorkerTreatmentPart);
// hier kun je repository methods toevoegen voor sql queries zie overzicht lesmateriaal.
// je kunt ze allemaal onderelkaar plaatsen. zorg wel dat je de juiste mappings maakt in de controller!

}
