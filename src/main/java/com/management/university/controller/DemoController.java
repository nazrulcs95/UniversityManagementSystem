package com.management.university.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
	@RequestMapping(value="/addStaff",method=RequestMethod.GET)
	public String showadd() {
		return "addStaff";
	}
	@RequestMapping(value="/addStudent",method=RequestMethod.GET)
	public String showadd4() {
		return "addStudent";
	}
	@RequestMapping(value="/addTeacher",method=RequestMethod.GET)
	public String showadd5() {
		return "addTeacher";
	}
}
