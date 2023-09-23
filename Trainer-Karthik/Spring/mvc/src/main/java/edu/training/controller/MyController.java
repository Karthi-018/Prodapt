package edu.training.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/printname")
	public ModelAndView printName(String uname)
	{
		
		
		System.out.println(uname);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("uName", uname);
		mv.setViewName("display.jsp");
		
		return mv;
		
	}

}
