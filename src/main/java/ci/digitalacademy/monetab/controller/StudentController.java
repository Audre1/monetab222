package ci.digitalacademy.monetab.controller;


import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repository.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students/add";
    }
    @PostMapping
     public  String showSaveStudent(Student student){
         log.debug(" show save to student:{}" ,student);
       studentService.save(student);
       return "redirect:/students";

     }

     //for  formulate
     @GetMapping("/form")
     public  String showAddStudentform (Model model){
         log.debug("Requeste to show add student form");
         model.addAttribute("student", new Student());
         return "students/form";
     }

    @GetMapping("/{id}")
    public String showUpdateStudent(Model model, @PathVariable Long id){
        log.debug("Request to show update student");
        Optional<Student> student= studentService.findOne(id);
        if(student.isPresent()){
            model.addAttribute("teacher", student.get());
            return "students/form";
        }else {
            return "redirect/students";
        }

    }







}
