package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.*;
import ci.digitalacademy.monetab.repository.PersonneRepository;
import ci.digitalacademy.monetab.repository.StudentRepository;
import ci.digitalacademy.monetab.repository.TeacherRepository;
import ci.digitalacademy.monetab.services.*;
import ci.digitalacademy.monetab.services.DTO.StudentDTO;
import ci.digitalacademy.monetab.services.DTO.TeacherDTO;
import ci.digitalacademy.monetab.services.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.List;


@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {


	@Autowired
    private TeacherService teacherService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private UserService userService;



	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

///*
//		Adresse adresse = new Adresse();
//		adresse.setCity("bouake");
//		adresse.setStreet("rue");
//		adresse.setContry("atos");
//		adresseService.save(adresse);
//
//
//
//
//		User user = new User(null,"ange","12234", Instant.now(),adresse);
//
//		adresseService.save(adresse);
//		userService.save(user);
//
//




		//CREATION DE COLLECTION

//		Set<FicheNote> noteFiles = new HashSet<>();
//		noteFiles.add(ficheNote2);
//		noteFiles.add(ficheNote2);
//
//	Teacher teacher = new Teacher();
//	teacher.setMatiere("math");
//	teacher.setVacant(true);
//	teacherService.save(teacher);
//
//		List<Teacher> teachers = teacherService.findAll();
//		System.out.println(teachers);
//
//		FicheNote ficheNote1 = new FicheNote();
//		ficheNote1.setNote("12");
//		ficheNote1.setTeach("2023");
//		FicheNote ficheNote2 = new FicheNote();
//		ficheNote2.setNote("16");
//		ficheNote2.setTeach("2024");
//		//ficheNote2.setTeach(teacher);
//
//		ficheNoteService.save(ficheNote1);

//		ficheNoteService.save(ficheNote2);

		StudentDTO student = new StudentDTO();
		student.setClasse("Terminal");
		student.setMatricule("001");
		student.setEmail("beugre@galil");
		student.setNom("kouanye");
		student.setPrenom("audrey");
		student.setVille("abidjan");
		student.setTelephone("098765");
		student.setAge("24");

		StudentDTO student1 = new StudentDTO();
		student1.setClasse("Terminal");
		student1.setMatricule("002");
		student1.setEmail("manpou@hnsj");
		student1.setNom("kouanye");
		student1.setPrenom("audrey");
		student1.setVille("abidjan");
		student1.setTelephone("098765");
		student1.setAge("22");

		StudentDTO student3 = new StudentDTO();
		student3.setClasse("premiere c");
		student3.setMatricule("003");
		student3.setEmail("COULIBALY@AICHA.com");
		student3.setNom("COULIBALY");
		student3.setPrenom("aicha");
		student3.setVille("Abidjan");
		student3.setTelephone("08765434");
		student3.setAge("24");

		studentService.save(student);
		studentService.save(student1);
		studentService.save(student3);


		TeacherDTO teacher = new TeacherDTO();
		teacher.setVacant(true);
//		teacher.setSujetProchainReunion("reunion des eleves");
//		teacher.setProchainCours("lundi");
		teacher.setAge("23");
		teacher.setNom("Beugre");
		teacher.setPrenom("willy");
		teacher.setMatiere("physique");
		teacher.setEmail("mwilly@gmail");
		teacher.setVille("bouake");
		teacher.setTelephone("0987675645");



		TeacherDTO teacher1 = new TeacherDTO();
		teacher1.setVacant(true);
//		teacher1.setSujetProchainReunion("");
//		teacher1.setProchainCours("mardi");
		teacher1.setAge("27");
		teacher1.setNom("Soumahoro");
		teacher1.setPrenom("bekanty");
		teacher1.setMatiere("math");
		teacher1.setEmail("som@gmail");
		teacher1.setVille("bouake");
		teacher1.setTelephone("098767");


		teacherService.save(teacher1);

		teacherService.save(teacher);

		UserDTO user = new UserDTO();
		user.setPseudo("bmarieaudr");
		user.setPassword("1236G");
		user.setCreationDate(Instant.now());
		userService.save(user);

//
//
	}

}
