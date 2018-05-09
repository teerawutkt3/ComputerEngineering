package com.computerEngineeringUP.computerEngineering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.computerEngineeringUP.computerEngineering.dao.vo.home.LoginFormVo;
import com.computerEngineeringUP.computerEngineering.dao.vo.home.RegisterVo;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/")	
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("views/home/index.html");
		mav.addObject("activeHome", "true");
		return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView login(@ModelAttribute LoginFormVo formVo) {
		ModelAndView mav = new ModelAndView("views/home/login.html");
		mav.addObject("form", formVo);
		return mav;
	}
	
	@PostMapping("/loginSubmit")
	public ModelAndView loginSubmit(@ModelAttribute LoginFormVo formVo) {
		ModelAndView mav = new ModelAndView("views/home/login.html");
		mav.addObject("form", formVo);
		return mav;
	}
	
	@GetMapping("/register")
	public ModelAndView register(@ModelAttribute RegisterVo formVo) {
		ModelAndView mav = new ModelAndView("views/home/register.html");
		mav.addObject("form", formVo);
		return mav;
	}
	
}
