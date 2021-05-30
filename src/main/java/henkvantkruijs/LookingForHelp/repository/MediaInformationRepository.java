package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.MediaInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaInformationRepository extends JpaRepository<MediaInformation, Long> {

    List<MediaInformation> findAllByMediaInformationNameStartsWith(String mediaInformationName);

}
