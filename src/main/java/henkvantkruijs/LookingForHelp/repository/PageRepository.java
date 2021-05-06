package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PageRepository extends JpaRepository<Page, Long> {  // communiceert met de database

        List<Page> findAllByPageNameStartsWith(String pageName);

// hier kun je repository methods toevoegen voor sql queries zie overzicht lesmateriaal.
// je kunt ze allemaal onderelkaar plaatsen. zorg wel dat je de juiste mappings maakt in de controller!

}
