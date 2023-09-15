package edu.spring;

import org.springframework.stereotype.Component;

@Component
public class iPhone {
	
	public void calling(String contactName, long number )
	{
		System.out.println("Calling from AndroidPhone to "+contactName);
		System.out.println(number);
	}
	
	public void playingSong(String songName)
	{
		System.out.println("Playing from AndroidPhone"+ songName);
	}

}
