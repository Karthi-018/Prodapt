package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;

public interface Repo extends CrudRepository<Employee, Integer>{

}
