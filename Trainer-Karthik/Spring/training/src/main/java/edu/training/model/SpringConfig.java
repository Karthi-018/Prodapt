package edu.training.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public AndroidPhone getAndroidBean()
	{
		return new AndroidPhone();
	}
	
	@Bean
	public iPhone getiPhoneBean()
	{
		return new iPhone();
	}
	
	@Bean
	public Snapdragon getSnapdragonBean()
	{
		return new Snapdragon();
	}

}
