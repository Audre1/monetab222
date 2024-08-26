package ci.digitalacademy.monetab.controller;


import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private  final TeacherService teacherService;

    @GetMapping("/form")
    public String showTeacherPage(){

        return "teachers/form";
    }

    @GetMapping("/add")
    public String showTeacherPages(Model model){
        List<Teacher> teachers =teacherService.findAll();
        model.addAttribute("teachers", teachers);

        return "teachers/add";
    }




}







