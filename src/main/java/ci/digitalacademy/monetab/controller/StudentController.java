package ci.digitalacademy.monetab.controller;


import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repository.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Service
@RequiredArgsConstructor
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

}
