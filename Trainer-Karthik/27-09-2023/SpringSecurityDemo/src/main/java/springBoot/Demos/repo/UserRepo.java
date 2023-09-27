package springBoot.Demos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springBoot.Demos.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	
	User findByUsername(String username);

}
