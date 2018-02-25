package com.computerEngineeringUP.computerEngineering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentsController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("views/students/students.html");
		mav.addObject("activeStudents", "true");
		return mav;
	}
}
