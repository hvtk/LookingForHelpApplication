package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.MediaOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaOptionRepository extends JpaRepository<MediaOption, Long> {

    List<MediaOption> findAllByMediaOptionNameStartsWith(String mediaOptionName);

}
