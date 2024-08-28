package ci.digitalacademy.monetab.services.impl;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repository.TeacherRepository;
import ci.digitalacademy.monetab.services.DTO.AdresseDTO;
import ci.digitalacademy.monetab.services.DTO.TeacherDTO;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.mapper.TeacherMapper;
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
    public TeacherDTO save(TeacherDTO teacherDTO) {

     Teacher teacher = TeacherMapper.toEntity(teacherDTO);
     teacher = teacherRepository.save(teacher);
       return TeacherMapper.toDTO(teacher);
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        return  findOne(teacherDTO.getId()).map(existingTeacher->{
            existingTeacher.setMatiere(teacherDTO.getMatiere());
            existingTeacher.setVacant(teacherDTO.isVacant());
            return save(existingTeacher);
        }).orElseThrow(()->new IllegalArgumentException());
    }

    @Override
    public Optional<TeacherDTO> findOne(Long id) {

        return teacherRepository.findById(id).map(teacher -> {
            return TeacherMapper.toDTO(teacher);
        });
    }

    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAll().stream().map(teacher -> {
            return TeacherMapper.toDTO(teacher);
        }).toList();
    }

    @Override
    public void delecte(Long id) {
        teacherRepository.deleteById(id);
    }
}
