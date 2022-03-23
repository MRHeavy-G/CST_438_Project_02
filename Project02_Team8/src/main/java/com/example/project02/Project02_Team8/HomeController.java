package com.example.project02.Project02_Team8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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

    @RequestMapping(value="/wish_list" , method=RequestMethod.GET)
    public String getWishList(){return "wishlist";}
}
