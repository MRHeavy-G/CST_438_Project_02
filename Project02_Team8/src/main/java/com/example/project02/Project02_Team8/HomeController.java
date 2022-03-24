package com.example.project02.Project02_Team8;

import com.example.project02.Project02_Team8.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    Api api = new Api();
//
//    @PostMapping(value = "/sign-up")
//    public String signupUser(@ModelAttribute("user") User user) {
//        String temp = api.addUser(user.getUsername(), user.getPassword(), user.getEmail());
//        return "success";
//    }

    //to get login form page
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String getLogin() {
        return "landing_page";
    }

    //to get login form page
    @RequestMapping(value="/sign_up", method=RequestMethod.GET)
    public String getSignUp() {
        return "sign-up";
    }

    @GetMapping(value="/")
    public String getHomeAttributes(Model model) {
        model.addAttribute("usertest", "please work");
        return "home";
    }
}
