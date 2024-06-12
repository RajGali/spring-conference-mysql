package com.example.conference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.conference.model.Registration;
import com.example.conference.model.RegistrationReport;
import com.example.conference.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;

	@GetMapping("registration")
	public String getRegistration() {
	
		return "registration";
		
	}
	
	@GetMapping("registrations")
	@ResponseBody
	List<Registration> getRegistrations() {
		List<Registration> registrations = registrationService.findAll();
		return registrations;
		
	}
	
	@GetMapping("registration-reports")
	@ResponseBody
	List<RegistrationReport> getRegistrationsReport() {
		List<RegistrationReport> registrationsReports = registrationService.findAllReports();
		return registrationsReports;
		
	}
	
	@PostMapping("registration")
	public String addRegistration(@ModelAttribute Registration registration, Model model) {
		model.addAttribute("registration",registration);
		System.out.println("Registration :" + registration.getRegistrationname());
		System.out.println("registration object :" + registration);
		registrationService.save(registration);
		return "registration-success";
		
	};
}
