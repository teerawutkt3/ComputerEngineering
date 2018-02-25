package com.computerEngineeringUP.computerEngineering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("views/professor/professorIndex.html");
		mav.addObject("activeProfessor", "true");
		return mav;
	}
}
