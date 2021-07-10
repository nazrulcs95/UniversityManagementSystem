package com.management.university.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RgistrationController {
	@RequestMapping(value="/registrationHome",method=RequestMethod.GET)
	public String showRegistrationHomePage(ModelMap model) {
		model.put("pageName", "Registration Home");
		return "registrationHome";
	}
	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public String showRegistrationPage(ModelMap model,@RequestParam String role) {
		model.put("role", role);
		model.put("pageName", "Registration");
		return "registration";
	}
}
