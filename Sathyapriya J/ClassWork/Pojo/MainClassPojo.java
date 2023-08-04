package PracticePackage.PojoDemo;

import java.util.*;

class MainClassPojo
{
	public static void main(String agrs[])
	{
		EmployeePojo e = new EmployeePojo(1,"SG",10000); //-----------------> Parameterised Constructor
		/*e.setEid(1);
		e.setEname("SG");
		e.setSalary(100000);*/
		
		EmployeePojo e1 = new EmployeePojo(2,"GS",20000);  //------------------> Parameterised Constructor
		/*e1.setEid(2);
		e1.setEname("GS");
		e1.setSalary(200000);*/
		
		
		/*System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getSalary());
		System.out.println("_____________________________________");
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getSalary());*/
		System.out.println(e);
		System.out.println(e1);
	}
}
	