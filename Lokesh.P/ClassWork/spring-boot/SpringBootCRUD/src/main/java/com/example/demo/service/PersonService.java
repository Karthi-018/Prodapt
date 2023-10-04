package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.Repo;

@Service
public class PersonService {
	@Autowired
	Repo repo;
	 public void deletePersonById(int id) {
	      repo.deleteById(id);
	   }

}
