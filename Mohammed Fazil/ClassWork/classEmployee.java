class Employee {
int eid;
String ename;
int salary;

public int geteid(){
return eid;
}
public void seteid(int eid)
{
this.eid= eid;
}
public String getename()
{
return ename;
}
public void setename(String ename )
{
this.ename= ename;
}
public int getsalary()
{
return salary;
}
public void setsalary(int salary)
{
this.salary= salary;
}
}

class Manager extends Employee
{
String dept;

public String getdept()
{
return dept;
}
public void setdept()
{
this.dept= dept;
}
}

class Engineer extends Employee
{

}
class Admin extends Manager
{
 
}
class Director extends Admin
{
private int budget;

public int getbudget()
{
return budget;
}
public void setbudget()
{
this.budget= budget;
}
}


class Main
{
   public static void main(String[] args)
   {
	Employee e= new Employee();
	e.seteid(123);
	e.setename("Fazil");
	e.setsalary(100000);
	System.out.println("ID: " + e.geteid());
	System.out.println("Name: " + e.getename());
	System.out.println("Salary: " + e.getsalary());
   }
}

	
	




