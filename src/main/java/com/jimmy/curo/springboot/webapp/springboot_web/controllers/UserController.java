package com.jimmy.curo.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jimmy.curo.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Jimmy", "Chaverra");
        user.setEmail("jimm@correo.com");
        model.addAttribute("title", "Hola Mundo Spring boot");
        model.addAttribute("user", user);
        //model.addAttribute("lastname", "Chaverra");
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("title","User List");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel(){ 
        return Arrays.asList(
            new User("Ronald", "Amaranto", "rama@gmail.com"),
            new User("Ronaldo", "Aveiro", "roa@gmail.com"),
            new User("Avi", "Cha"));
            
    }
}

    