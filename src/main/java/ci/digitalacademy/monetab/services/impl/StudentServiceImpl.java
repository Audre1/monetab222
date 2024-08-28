package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repository.StudentRepository;
import ci.digitalacademy.monetab.services.DTO.StudentDTO;
import ci.digitalacademy.monetab.services.StudentService;
import ci.digitalacademy.monetab.services.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        Student student = StudentMapper.toEntity(studentDTO);
        student = studentRepository.save(student);
        return  StudentMapper.toDTO(student);
    }

    @Override
   public StudentDTO update(StudentDTO studentDTO) {
        return findOne(studentDTO.getId()).map(existingStudents->{
           existingStudents.setMatricule(studentDTO.getMatricule());
            existingStudents.setClasse(studentDTO.getClasse());

            return save(existingStudents);

        }).orElseThrow(()->new IllegalArgumentException());
    }

    @Override
    public Optional<StudentDTO> findOne(Long id) {
            return studentRepository.findById(id).map(student -> {
                return StudentMapper.toDTO(student);
            });
    }

    @Override
    public List<StudentDTO> findAll() {

        return studentRepository.findAll().stream().map(student -> {
            return StudentMapper.toDTO(student);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);

    }
}
