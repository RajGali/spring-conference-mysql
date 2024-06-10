package com.example.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.conference.model.Registration;

@Controller
public class RegistrationController {

	@GetMapping("registration")
	public String getRegistration() {
	
		return "registration";
		
	}
	
	@PostMapping("registration")
	public String addRegistration(@ModelAttribute Registration registration, Model model) {
		model.addAttribute("registration",registration);
		System.out.println("Registration :" + registration.getRegistrationname());
		System.out.println("registration object :" + registration);
		return "registration-success";
		
	};
}
