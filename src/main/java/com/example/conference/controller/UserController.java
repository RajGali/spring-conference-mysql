package com.example.conference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.conference.model.User;
import com.example.conference.service.UserSevice;

@RestController
public class UserController {
	
	@Autowired
	private UserSevice userService;
	
	@GetMapping("/user")
	public User getUser(@RequestParam(value="firstname", defaultValue = "Raj") String firstname,
						@RequestParam(value="lastname", defaultValue = "Gali") String lastname,
						@RequestParam(value="age", defaultValue = "25") int age) {
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setAge(age);
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		System.out.println("User object:" + user);
		userService.save(user);
		return user;
	}

}
