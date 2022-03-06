package com.example.project02.Project02_Team8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/api")
public class Api {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/allUsers")
    public @ResponseBody Iterable <User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(path = "/addUser")
    public @ResponseBody String addUser (@RequestParam String username, @RequestParam String password, String email) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        userRepository.save(user);
        return "saved User";
    }

}