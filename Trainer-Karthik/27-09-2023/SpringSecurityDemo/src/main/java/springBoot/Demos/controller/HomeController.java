package springBoot.Demos.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/public")
	@ResponseBody
	public String publicUser()
	{
		
		return "i am a public user";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping("/admin")
	@ResponseBody
	public String adminUser()
	{
		
		return "i am a Admin user";
	}
	@PreAuthorize("hasRole('CUSTOMER')")
	@RequestMapping("/customer")
	@ResponseBody
	public String customer()
	{
		
		return "i am a Customer user";
	}
}
