package ci.digitalacademy.monetab.repository;

import ci.digitalacademy.monetab.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
