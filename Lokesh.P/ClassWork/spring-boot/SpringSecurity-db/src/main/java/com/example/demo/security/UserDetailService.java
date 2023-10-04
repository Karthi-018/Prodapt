package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.Repo.Repo;
import com.example.demo.entity.User;


@Component
public class UserDetailService implements UserDetailsService {

	
	@Autowired
	Repo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=repo.findByUname(username);
		if(user==null)
			throw new UsernameNotFoundException("user not found");
		return new UserPrinciple(user);
	}

}
