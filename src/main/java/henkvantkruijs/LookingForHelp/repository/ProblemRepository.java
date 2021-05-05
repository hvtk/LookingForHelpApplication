package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {// communiceert met de database

    List<Problem> findAllByAgeGroupStartsWith(String ageGroup);
}
// hier kun je repository methods toevoegen voor sql queries zie overzicht lesmateriaal.
// je kunt ze allemaal onderelkaar plaatsen. zorg wel dat je de juiste mappings maakt in de controller!

