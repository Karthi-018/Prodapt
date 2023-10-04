package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Person;
import com.example.demo.repo.Repo;
import com.example.demo.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	Repo repo;
	@Autowired
	Person p;
	@Autowired
	PersonService ps;

	
	
	@RequestMapping("/")
	public String display() {
		System.out.println(1);
		return "home.jsp";
	}

	@RequestMapping("/index")
	public String index() {
		System.out.println(1);
		return "index.jsp";
	}

	@RequestMapping("/search")
	public String search() {
		System.out.println(1);
		return "search.jsp";
	}
	@RequestMapping("/delete")
	public String delete() {
		System.out.println(1);
		return "delete.jsp";
	}

	@RequestMapping("/add")
	@ResponseBody
	public ModelAndView add(Person p) {
		ModelAndView mv = new ModelAndView("index.jsp");
		String pc="Person created";
		mv.addObject("pc",pc);
		repo.save(p);
		return mv;
	}

	
	  @RequestMapping("/delete1")
	  public ModelAndView delete(int id) 
	  
	  { 
		  ModelAndView mv = new ModelAndView("view");
		  ps.deletePersonById(id); 
	  return mv;
	  }
	 
	@RequestMapping("/view")
	@ResponseBody
	public ModelAndView view() {
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.addObject("viewlist", repo.findAll());
		return mv;
	}

	@RequestMapping("/finddept")
	@ResponseBody
	public ModelAndView find(String dept) {
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.addObject("viewlist", repo.findByDept(dept));
		return mv;
		
	}

	@RequestMapping("/findid")
	@ResponseBody
	public ModelAndView find(int id) {
	
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.addObject("viewlist", repo.findById(id));
		return mv;
		
	}
	
	

}
