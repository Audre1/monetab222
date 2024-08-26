package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.User;
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
            studentToUpdate.setClasse(student.getClasse());
            studentToUpdate.setEmail(student.getEmail());
            studentToUpdate.setMatricule(student.getMatricule());
            studentToUpdate.setNom(student.getNom());
            studentToUpdate.setPrenom(student.getPrenom());
            studentToUpdate.setVille(student.getVille());
            studentToUpdate.setTelephone(student.getTelephone());
            studentToUpdate.setGenre(student.getGenre());
            studentToUpdate.setAge(student.getAge());
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
