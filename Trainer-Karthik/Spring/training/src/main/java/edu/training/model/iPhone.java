package edu.training.model;

import org.springframework.stereotype.Component;

@Component("iphone")
public class iPhone implements SmartPhone {
	
//	private String cpu = "Snapdragon";
//	
//	
//	
//	public iPhone() {
//		super();
//	}
//
//	public iPhone(String cpu) {
//		
//		this.cpu = cpu;
//	}
//
//	public String getCpu() {
//		return cpu;
//	}
//
//	public void setCpu(String cpu) {
//		this.cpu = cpu;
//	}
	
	public void calling(String contactName, long number )
	{
		System.out.println("Calling from iPhone to"+contactName);
		System.out.println(number);
	}
	
	public void playingSong(String songName)
	{
		System.out.println("Playing from iPhone"+ songName);
	}

}
