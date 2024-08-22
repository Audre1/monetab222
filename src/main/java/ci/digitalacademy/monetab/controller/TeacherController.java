package ci.digitalacademy.monetab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")


public class TeacherController {

    @GetMapping("/form")
    public String showTeacherPage(){

        return "teachers/form";
    }

    @GetMapping("/add")
    public String showTeacherPages(){
        return "teachers/add";
    }
}
