package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.Page;
import henkvantkruijs.LookingForHelp.model.SearchTopic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchTopicRepository extends JpaRepository<SearchTopic, Long> {

        List<SearchTopic> findAllByAgeGroupStartsWith(String ageGroup);
}


