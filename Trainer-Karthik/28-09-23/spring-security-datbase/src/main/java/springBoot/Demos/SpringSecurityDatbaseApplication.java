package springBoot.Demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import springBoot.Demos.entity.User;
import springBoot.Demos.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityDatbaseApplication {
//	@Bean
	public CommandLineRunner createUser(UserRepository userRepository)
	{
		return args->{
			User user = new User();
			user.setUid(20);
			user.setUsername("Karthi");
			user.setPassword(new BCryptPasswordEncoder().encode("kps"));
			user.setRole("ADMIN");
			userRepository.save(user);
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDatbaseApplication.class, args);
		
		
		
	}

}
