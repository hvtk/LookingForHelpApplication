package henkvantkruijs.LookingForHelp.repository;

import henkvantkruijs.LookingForHelp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
