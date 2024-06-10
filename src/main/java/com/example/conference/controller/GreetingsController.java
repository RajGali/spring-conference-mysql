package com.example.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingsController {
	@GetMapping("greeting")
	public String greeting(Model model) {
		model.addAttribute("message", "Raj Gali");
		return "greeting";
		
	}

}
