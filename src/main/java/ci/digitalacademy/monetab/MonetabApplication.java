package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.AdresseService;
import ci.digitalacademy.monetab.services.FicheNoteService;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private AdresseService adresseService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private FicheNoteService ficheNoteService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

/*
		Adresse adresse = new Adresse();
		adresse.setCity("bouake");
		adresse.setStreet("rue");
		adresse.setContry("atos");
		adresseService.save(adresse);




		User user = new User(null,"ange","12234", Instant.now(),adresse);

		adresseService.save(adresse);
		userService.save(user);

 */
		FicheNote ficheNote1 = new FicheNote();
		ficheNote1.setNote("12");
		ficheNote1.setTeach("2023");

		FicheNote ficheNote2 = new FicheNote();
		ficheNote2.setNote("16");
		ficheNote2.setTeach("2024");

		ficheNoteService.save(ficheNote1);
		ficheNoteService.save(ficheNote2);



		//CREATION DE COLLECTION

		Set<FicheNote> noteFiles = new HashSet<>();
		noteFiles.add(ficheNote2);
		noteFiles.add(ficheNote2);

		Teacher teacher = new Teacher();
		teacher.setMatiere("math");
		teacherService.save(teacher);
	}

}
