package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.AidWorker;
import henkvantkruijs.LookingForHelp.model.TakeAction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AidWorkerRepository extends JpaRepository<AidWorker, Long> {

    List<AidWorker> findAllByAidWorkerNameStartsWith(String aidWorkerName);

}
