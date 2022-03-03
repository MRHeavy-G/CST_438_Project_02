package com.example.project02.Project02_Team8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Project02Team8Application {

	//connector to the server
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello world!";
	}


	public static void main(String[] args) {
		SpringApplication.run(Project02Team8Application.class, args);
	}

}