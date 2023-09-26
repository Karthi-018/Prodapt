package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;


public interface Employeerepo extends CrudRepository<Employee,Integer> {

	public List<Employee> findBydept(String dname);// to filter the data according to dept
	
	//@Query("from Employee where dept=?1 orderBy ?2")
	//public List<Employee> findBydeptSorted(String dname,String sortname);//to filter and sort the data
	
	
}
