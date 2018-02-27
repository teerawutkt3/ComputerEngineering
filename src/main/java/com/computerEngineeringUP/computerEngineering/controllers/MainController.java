package com.computerEngineeringUP.computerEngineering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/home/");
		return mav;
	}
}
