class Emp{
	private int eid;
	private String eName;
	private long sal;

Emp(){}
Emp(int eid,String eName,long sal){
	this.eid=eid;
	this.eName=eName;
	this.sal=sal;
}



public void seteid(int eid){
	this.eid=eid;
	}
public int geteid(){
	return eid;
	}
public void seteName(String eName){
	this.eName=eName;
	}
public String geteName(){
	return eName;
	}
public void setsal(long sal){
	this.sal=sal;
	}
public long getsal(){
	return sal;
	}}

class Manager extends Emp{
	private String dept;

Manager(){}
Manager(int eid,String eName,String dept){
	super(int eid,String eName);
	this.dept=dept;
}



public void setdept(String dept){
	this.dept=dept;
	}
public String getdept(){
	return dept;
	}}
class Engineer extends Emp{
Engineer(){}


}
class Admin extends Manager{
Admin(){}
}

class Director extends Admin{
private long budget;

Director(){}
Director(long budget){
this.budget=budget;
}

public void setbudget(long budget){
	this.budget=budget;
	}
public long getbudget(){
	return budget;
	}}



class Main{
public static void main(String args[]){
	Manager m=new Manager(101,"sai",10000,"EEE");

	System.out.println(Emp(m));






	/*Emp e;
	e=new Emp(101,"abc",10000);
	System.out.println(e.geteid());
	System.out.println(e.geteName());
	System.out.println(e.getsal());
	Manager m =new Manager("EEE");
	System.out.println(m.getdept());
	Director d =new Director(1000000);
	System.out.println(d.getbudget());*/	




	




	/*//Manager obj=new Manager();
	Director obj=new Director();
	obj.seteid(1001);
	System.out.println(obj.geteid());
	obj.seteName("sai");
	System.out.println(obj.geteName());
	obj.setsal(100000);
	System.out.println(obj.getsal());
	obj.setdept("It");
	System.out.println(obj.getdept());
	obj.setbudget(100001);
	System.out.println(obj.getbudget());*/
}}
	