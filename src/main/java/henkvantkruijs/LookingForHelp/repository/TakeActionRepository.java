package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.TakeAction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TakeActionRepository extends JpaRepository<TakeAction, Long> {   // communiceert met de database

    List<TakeAction> findAllByTakeActionNameStartsWith(String takeActionName);
// hier kun je repository methods toevoegen voor sql queries zie overzicht lesmateriaal.
// je kunt ze allemaal onderelkaar plaatsen. zorg wel dat je de juiste mappings maakt in de controller!

}
