package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repository.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
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
    public Student save(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        Optional<Student> optionalStudent = findOne(student.getId());
        if(optionalStudent.isPresent()){
            Student studentToUpdate = optionalStudent.get();
            studentToUpdate.setMatricule(student.getMatricule());
            return  save(studentToUpdate);
        }else {
            throw new IllegalArgumentException();
        }


    }

    @Override
    public Optional<Student> findOne(Long id) {

            return studentRepository.findById(id);

    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delecte(Long id) {
        studentRepository.deleteById(id);

    }
}
