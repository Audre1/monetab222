package ci.digitalacademy.monetab.repository;

import ci.digitalacademy.monetab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {

}
