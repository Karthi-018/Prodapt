package com.example.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import java.util.List;



@Component
public interface Repo extends CrudRepository<Person,Integer> {

	public List<Person> findByDept(String dept);
	public List<Person> findById(int id);
	
	
	
	
	
}
