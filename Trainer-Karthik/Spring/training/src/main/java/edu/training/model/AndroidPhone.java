package edu.training.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AndroidPhone implements SmartPhone {
	
	@Autowired
	private Snapdragon cpu;
	
	public Snapdragon getCpu() {
		return cpu;
	}

	public void setCpu(Snapdragon cpu) {
		this.cpu = cpu;
	}

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
