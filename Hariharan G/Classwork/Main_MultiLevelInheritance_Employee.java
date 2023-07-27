import java.util.*;
class Employee
{
private int eid;
private String eName;
private long sal;

Employee()
{}

Employee(int eid,String eName, long sal)
{
this.eid=eid;
this.eName=eName;
this.sal=sal;
System.out.println(eid);
System.out.println(eName);
System.out.println(sal);
}

public void setId(int id)
{
this.eid=id;
}
public void setName(String name)
{
this.eName=name;
}
public void setSalary(long sal)
{
this.sal=sal;
}
int getId()
{
return eid;
}
String getName()
{
return eName;
}
long getSalary()
{
return sal;
}

}


class Manager extends Employee
{
private String dept;

Manager()
{}
Manager(int id,String name,long sal,String dept)
{
super(id,name,sal);
this.dept=dept;
System.out.println(dept);

}

//Manager(int id,String name,long sal,String dept)
//{
//this.dept=dept;

//}
public void setDept(String dept)
{
this.dept=dept;
}
String getDept()
{
return dept;
}
}

class Admin extends Manager
{
Admin(int id,String name,long sal,String dept)
{
super(id,name,sal,dept);

}
Admin() {}
}

class Engineer extends Employee
{
Engineer()
{}
}

class Director extends Admin
{
Director()
{}
Director(int id,String name,long sal,String dept)
{
super(id,name,sal,dept);
}
private long budget;
public void setBudget(long budget)
{
this.budget=budget;
}
long getBudget()
{
return budget;
}

}

class Main_MultiLevelInheritance_Employee
{
public static void main(String args[])
{

Director d=new Director(11,"hari",1000000,"cse");

/*Employee emp_obj;

emp_obj=new Manager();

emp_obj.setId(101);
emp_obj.setName("HARI");
emp_obj.setSalary(1011111111);

System.out.println("ID: "+emp_obj.getId()+"\nNAME: "+emp_obj.getName()+"\nSALARY: "+emp_obj.getSalary());

emp_obj=new  */



}
}
