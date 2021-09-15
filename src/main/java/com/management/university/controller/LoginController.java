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

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}
	
}