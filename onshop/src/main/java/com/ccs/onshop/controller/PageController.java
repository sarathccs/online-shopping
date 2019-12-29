package com.ccs.onshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView homeLoad() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Welcome to OnShop");
		return mv;
	}
	
	
}
