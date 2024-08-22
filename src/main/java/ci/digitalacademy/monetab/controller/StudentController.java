package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")

public class StudentController {

    @GetMapping("/form")
    public String showStudentPage(){
        return "students/form";

    }

    @GetMapping("/add")
    public String showStudentPages(){
        return "students/add";

    }




}
