package edu.training.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"edu.training.controller"})
public class MyConfig {
	
	@Bean
	public InternalResourceViewResolver getViewTeck()
	{
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/");
		ivr.setSuffix(".jsp");
		
		return ivr;
	}
	

}
