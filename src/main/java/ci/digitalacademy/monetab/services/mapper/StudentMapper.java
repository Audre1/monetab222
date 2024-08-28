package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.DTO.StudentDTO;

public final class StudentMapper {

    private StudentMapper(){
    }

    public static StudentDTO toDTO(Student student){

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setClasse(student.getClasse());
        studentDTO.setMatricule(student.getMatricule());
        studentDTO.setAge(student.getAge());
        studentDTO.setNom(student.getNom());
        studentDTO.setPrenom(student.getPrenom());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setTelephone(student.getTelephone());
        return studentDTO;
    }

    public static Student toEntity(StudentDTO studentDTO){

        Student student = new Student();
        student.setClasse(studentDTO.getClasse());
        student.setMatricule(studentDTO.getMatricule());
        student.setAge(studentDTO.getAge());
        student.setTelephone(studentDTO.getTelephone());
        student.setPrenom(studentDTO.getPrenom());
        student.setEmail(studentDTO.getEmail());
        return student;
    }

}
