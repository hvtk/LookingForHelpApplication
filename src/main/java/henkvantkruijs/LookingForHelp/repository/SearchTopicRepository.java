package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Page;
import henkvantkruijs.LookingForHelp.model.SearchTopic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchTopicRepository extends JpaRepository<SearchTopic, Long> {  // communiceert met de database

        List<SearchTopic> findAllByAgeGroupStartsWith(String ageGroup);

// hier kun je repository methods toevoegen voor sql queries zie overzicht lesmateriaal.
// je kunt ze allemaal onderelkaar plaatsen. zorg wel dat je de juiste mappings maakt in de controller!

}


