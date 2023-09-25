package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Person;
import com.example.demo.repo.PersonRepo;

@Controller
public class PersonController {
	@Autowired
	private Person person;
	
	@Autowired
	private PersonRepo repo;
	
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String createPerson(Person p)
	{
		repo.save(p);
		return "Person Created";
	}
	
	
	@RequestMapping("/view")
	@ResponseBody
	public String viewPerson()
	{
		return repo.findAll().toString();
	}

}
