package com.jimmy.curo.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jimmy.curo.springboot.webapp.springboot_web.models.User;
import com.jimmy.curo.springboot.webapp.springboot_web.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController()
//@Controller
@RequestMapping("/api")
public class UserRestController {
    /*Version con Map */
    @GetMapping("/details-map") // Tambien @RequestMapping(path ="/details", method = RequestMethod.GET)
    //@ResponseBody
    public Map<String, Object> details_map(){
        User user = new User("Jimmy", "Salina");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring boot");
        body.put("user", user);
        return body;
    }

    //Return Users list
    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Jimmy", "Chave");
        User user1 = new User("Pedro", "Alfonso");
        User user2 = new User("Alfonzo", "Porro");

        List<User> users = Arrays.asList(user, user1, user2);
        return users;
    }

    /*Vesion con DTO */
    //@ResponseBody */
    @GetMapping("/details") // Tambien @RequestMapping(path ="/details", method = RequestMethod.GET)
    //@ResponseBody
    public UserDto details(){
        User user = new User("Jimmy", "Salina");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot");
        return userDto;
    }
}
