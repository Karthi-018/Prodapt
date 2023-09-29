package springBoot.Demos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import springBoot.Demos.entity.User;
import springBoot.Demos.repository.UserRepository;

@Component
public class MyUserDetailsService implements UserDetailsService {

	
	@Autowired
	UserRepository userRepo;
	

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("User 404");
		
		
		return new MyUserDetilas(user); 
	}

}
