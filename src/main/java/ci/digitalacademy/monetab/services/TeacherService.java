package ci.digitalacademy.monetab.services;


import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.DTO.TeacherDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface TeacherService {
    TeacherDTO save(TeacherDTO teacherDTO);

    TeacherDTO update(TeacherDTO teacherDTO);

    Optional<TeacherDTO> findOne(Long id);

    List<TeacherDTO> findAll();

    void delecte(Long id);
}
