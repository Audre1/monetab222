package ci.digitalacademy.monetab.controller;


import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repository.StudentRepository;
import ci.digitalacademy.monetab.services.DTO.StudentDTO;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.print.attribute.standard.PresentationDirection;
import java.util.List;
import java.util.Optional;

@Controller
@Service
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;


    @GetMapping("/update_form")
    public String showStudentPage(){
        return "students/form";

    }
    @GetMapping("/add_form")
    public String showAddStudentPages(){
        return "students/form";

    }


    @GetMapping
    public String showStudentPages(Model model){
        List<StudentDTO> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students/add";
    }
    @PostMapping
     public  String showSaveStudent(StudentDTO student){
         log.debug(" show save to student:{}" ,student);
       studentService.save(student);
       return "redirect:/students";

     }

     //for  formulate
     @GetMapping("/form")
     public  String showAddStudentform (Model model){
         log.debug("Requeste to show add student form");
         model.addAttribute("student", new StudentDTO());
         return "students/form";
     }
//methode for update
    @GetMapping("/{id}")
    public String showUpdateStudent(Model model, @PathVariable Long id){
        log.debug("Request to show update student");
        Optional<StudentDTO> student= studentService.findOne(id);
        if(student.isPresent()){
            model.addAttribute("student", student.get());
            return "students/form";
        }else {
            return "redirect:/students";
        }

        }

    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            studentService.delete(id);
            redirectAttributes.addFlashAttribute("message", "Eleve supprimé avec succès.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Erreur lors de la suppression de l'eleve.");
        }
        return "redirect:/students";}






    }

