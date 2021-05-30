package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.TakeAction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TakeActionRepository extends JpaRepository<TakeAction, Long> {

    List<TakeAction> findAllByTakeActionNameStartsWith(String takeActionName);
}
