package com.management.university.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap model) {
		model.put("pageName", "Home");
		return "index";
	}

	@RequestMapping(value = "/loginHome", method = RequestMethod.GET)
	public String showLoginHomePage(ModelMap model) {
		model.put("pageName", "Login Home");
		return "loginHome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model, @RequestParam String role) {
		model.put("pageName", "Login");
		model.put("role", role);
		return "login";
	}
}