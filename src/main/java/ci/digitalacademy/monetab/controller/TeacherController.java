package ci.digitalacademy.monetab.controller;


import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.DTO.TeacherDTO;
import ci.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/teachers")
@RequiredArgsConstructor
@Slf4j
public class TeacherController {
    private  final TeacherService teacherService;

//    @GetMapping("/form")
//    public String showTeacherPage(){
//
//        return "teachers/form";
//    }

    @GetMapping
    public String showTeacher(Model model){
        List<TeacherDTO> teachers =teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teachers/add";
    }

    @GetMapping("/add")
    public String showTeacherlist(Model model){
        List<TeacherDTO> teachers =teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teachers/add";
    }

     @GetMapping("/form")
     public  String showAddTeacherform (Model model){
        log.debug("Requeste to show lister teacher form");
        model.addAttribute("teachers", new Teacher());
        return "teachers/form";
}


       @PostMapping
       public String saveTeachers( TeacherDTO teacher){
             log.debug("Request to save teacher :{}",teacher);
              teacherService.save(teacher);
              return "redirect:/teachers";
    }


      @GetMapping("/{id}")
      public String showUpdate(Model model, @PathVariable Long id){
          log.debug("Request to show update teacher with ID: {}", id);
         Optional<TeacherDTO> teacher= teacherService.findOne(id);
         if(teacher.isPresent()){
             model.addAttribute("teacher", teacher.get());
             return "teachers/form";
         }else {
             return "redirect:/teachers";
         }

     }


}







