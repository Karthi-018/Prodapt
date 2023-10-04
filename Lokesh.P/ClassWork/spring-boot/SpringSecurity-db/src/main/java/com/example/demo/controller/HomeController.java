package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.Repo;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/app")
public class HomeController {
	@Autowired
	Repo repo;
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser()
	{
		User user=new User();
		user.setUid(18);
		user.setUname("admin");
		user.setPassword(new BCryptPasswordEncoder().encode("123"));
		repo.save(user);
		return ResponseEntity.ok("I am a Public User");
	}
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser()
	{
		return ResponseEntity.ok("I am a Admin User");
	}

}
