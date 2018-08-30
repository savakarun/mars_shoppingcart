package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController{
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index() { 
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", "welcome to Arun");
		return mv;
	}
	
/*	@RequestMapping(value={"/test", "/pummy"})
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		if(greeting==null){
			greeting="welcome";
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	} 
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		if(greeting==null){
			greeting="welcome";
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/	
	
}
