class Emp{
	private int eid;
	private String eName;
	private long sal;
public void seteid(int eid){
	this.eid=eid;
	}
public int geteid(){
	return eid;
	}
public void seteName(String eid){
	this.eName=eName;
	}
public String geteName(){
	return eName;
	}
public void setsal(long eid){
	this.sal=sal;
	}
public long getsal(){
	return sal;
	}}

class Manager extends Emp{
	private String dept;
public void setdept(String dept){
	this.dept=dept;
	}
public String getdept(){
	return dept;
	}}
class Engineer extends Emp{
}
class Admin extends Manager{
}
class Director extends Admin{
private long budget;
public void set(long budget){
	this.budget=budget;
	}
public long getbudget(){
	return budget;
	}}



class Main{
public static void main(String args[]){
	Manager obj=new Manager();
	obj.seteid(1001);
	System.out.println(obj.geteid());
	obj.seteName("sai");
	System.out.println(obj.geteName());
	obj.setsal();
	System.out.println(obj.getsal());
	obj.setdept("It");
	System.out.println(obj.getdept());
	obj.setbudget(10000);
	System.out.println(obj.getbudget());
}}
	