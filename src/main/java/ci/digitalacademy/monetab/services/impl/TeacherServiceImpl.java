package ci.digitalacademy.monetab.services.impl;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
@Slf4j
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;


    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        Optional<Teacher> optionalTeacher = findOne(teacher.getId());
        if(optionalTeacher.isPresent()){
            Teacher teacherToUpdate = optionalTeacher.get();
            teacherToUpdate.setMatiere(teacher.getMatiere());
            return  save(teacherToUpdate);
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<Teacher> findOne(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public void delecte(Long id) {
        teacherRepository.deleteById(id);
    }
}
