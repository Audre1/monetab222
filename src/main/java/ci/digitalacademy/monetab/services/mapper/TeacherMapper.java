package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.DTO.TeacherDTO;

public final class TeacherMapper {

    private TeacherMapper (){

    }
    public static TeacherDTO toDTO(Teacher teacher){

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacher.getId());
        teacherDTO.setMatiere(teacher.getMatiere());
        teacherDTO.setVacant(teacher.isVacant());
        return teacherDTO;
    }

    public static Teacher toEntity(TeacherDTO teacherDTO){

        Teacher teacher = new Teacher();
        teacher.setId(teacherDTO.getId());
        teacher.setMatiere(teacherDTO.getMatiere());
        teacher.setVacant(teacherDTO.isVacant());
        return teacher;
    }

}
