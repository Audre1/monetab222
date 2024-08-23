package ci.digitalacademy.monetab.services;


import ci.digitalacademy.monetab.models.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface TeacherService {
    Teacher save(Teacher teacher);

    Teacher update(Teacher teacher);

    Optional<Teacher> findOne(Long id);

    List<Teacher> findAll();

    void delecte(Long id);
}
