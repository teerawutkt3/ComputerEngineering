package com.computerEngineeringUP.computerEngineering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController {

	@GetMapping("/")
	public ModelAndView portfolioIndex() {
		ModelAndView mav = new ModelAndView("views/portfolio/portfolioIndex.html");
		mav.addObject("activePortfolio", "true");
		return mav;
	}
}
