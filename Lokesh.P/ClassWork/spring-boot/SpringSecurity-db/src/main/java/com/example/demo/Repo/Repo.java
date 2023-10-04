package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;




public interface Repo extends JpaRepository<User, Integer> {
	User findByUname(String uname);

}
