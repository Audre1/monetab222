package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/form")
    public String showUserPage(){

        return "users/form";
    }

    @GetMapping("/add")
    public String showUserPages(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);

        return "users/add";
    }


    @PostMapping
    public String saveUsers( User user){
        log.debug("Request to save user :{}",user);
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/user")
    public  String showAdduserform (Model model){
        log.debug("Requeste to show lister user form");
        model.addAttribute("users", new User());
        return "users/form";
    }






}
