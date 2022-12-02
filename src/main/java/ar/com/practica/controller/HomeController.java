package ar.com.practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.practica.dominian.User;

@Controller

public class HomeController {
	

	
	
	@RequestMapping("/")
	public String index() {
			return "index";
	}
}
