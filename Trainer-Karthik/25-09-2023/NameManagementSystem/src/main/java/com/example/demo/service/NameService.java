package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NameService {
	
	List<String> nameList = new ArrayList<>();
	
	public void addName(String name)
	{
		nameList.add(name);
	}
	
	public List<String> getNameList()
	{
		return nameList;
	}
	
	public String getName(String name)
	{
		String sname = null;
		for(String n:nameList)
		{
			if(name.equals(n))
			{
				sname=n;
			}
		}
		return sname;
	}

}
