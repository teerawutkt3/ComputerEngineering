package com.computerEngineeringUP.computerEngineering.controllers.students;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students/y1")
public class StudentsY1Controller {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("views/students/y1.html");
		mav.addObject("activeStudentsy1", "true");
		mav.addObject("activeStudents", "true");
		return mav;
	}
}
