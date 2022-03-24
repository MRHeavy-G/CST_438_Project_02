package com.example.project02.Project02_Team8;

import com.example.project02.Project02_Team8.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignInController {
    Api api = new Api();

//    @PostMapping(value = "/sign-up")
//    public String signupUser(@ModelAttribute("user") User user) {
//        String temp = api.addUser(user.getUsername(), user.getPassword(), user.getEmail());
//        return "success";
//    }

    @RequestMapping(value="/signupUser", method = RequestMethod.POST)
    public String signupUser(@ModelAttribute User user) {
        System.out.println("User data: " + user.getUsername() + " " + user.getEmail() + " " + user.getPassword());
        return "sign-up";
    }
}
