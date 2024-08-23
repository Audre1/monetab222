package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public interface StudentService {

    Student save(Student student);

    Student update(Student student);

    Optional<Student> findOne(Long id);

    List<Student> findAll();

    void delecte(Long id);

    }
