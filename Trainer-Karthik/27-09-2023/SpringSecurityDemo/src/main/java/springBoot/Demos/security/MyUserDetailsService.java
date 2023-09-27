package springBoot.Demos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import springBoot.Demos.entity.User;
import springBoot.Demos.repo.UserRepo;

@Component
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("User Not found");
		
		return new UserPrinciple(user);
	}

}
