package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PageRepository extends JpaRepository<Page, Long> {

        List<Page> findAllByPageNameStartsWith(String pageName);

}
