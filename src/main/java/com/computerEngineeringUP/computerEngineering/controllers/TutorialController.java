package com.computerEngineeringUP.computerEngineering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tutorial")
public class TutorialController {
	
	@GetMapping("/Y1")
	public ModelAndView tutorialIndex() {
		ModelAndView mav = new ModelAndView("views/tutorials/Y1.html");
		mav.addObject("activeTutorial", "true");
		return mav;
	}
}
