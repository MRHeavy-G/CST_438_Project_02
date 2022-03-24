package com.example.project02.Project02_Team8;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Project02Team8Application {


	@RequestMapping("/landing_page")
	String landing(Model model) {
		return "landing_page";
	}

	@RequestMapping("/settings")

	String settings(Model model){ return "settings";}

	@RequestMapping("/sign_up")

	String sign_up(Model model){ return "sign-up";}


	public static void main(String[] args) {
		SpringApplication.run(Project02Team8Application.class, args);
	}

}
