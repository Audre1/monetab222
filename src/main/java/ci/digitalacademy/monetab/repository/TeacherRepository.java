package ci.digitalacademy.monetab.repository;

import ci.digitalacademy.monetab.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository  extends JpaRepository<Teacher, Long>{
}
