

import java.util.Scanner;


class Employee{
	int eid;
	String ename;
	String dest;
	long salary;
	
	Employee(){
		eid=101;
		ename="JERISH";
		dest="trainee";
		salary=10800;
	}
	
	void display(){
		System.out.println("Employee id : "+eid);
		System.out.println("Employee  name : "+ename);
		System.out.println("Employee no : "+dest);
		System.out.println("Employee salary : "+salary);
	}
	public static void main(String []args){
		Employee emp=new Employee();
		emp.display();
	}
}