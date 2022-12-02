package ar.com.practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.practica.dominian.User;

@org.springframework.web.bind.annotation.RestController


public class RestController {
	
	@Autowired
	private User user;
	
	
	
	@RequestMapping("/home")
	
	public void home() {
		
		this.user.getId();
		
		System.out.println("Tu vieja");
	}
	
	@RequestMapping("/user/show")
	public User showUser() {
		User u = new User();
		
		return u;
		
		
	}
	
	
}
