import java.util.*;
class Employee
{
private int eid;
private String eName;
private long sal;
Employee(int id,String name,long sal)
{
this.eid=id;
this.eName=name;
this.sal=sal;
}
Employee()
{}
}


class Manager extends Employee
{
private String dept;
Manager(int id,String name,long sal,String dept)
{
super(id,name,sal);
this.dept=dept;
}
Manager()
{}
}

class Director extends Employee
{
Director(int id,String name,long sal,String dept)
{}
Director()
{}
}

class Admin extends Employee
{
Admin(int id,String name,long sal,String dept)
{}
Admin()
{}
}

class InstanceOf_main
{
public static void main(String args[])
{
Employee e;
e=new Manager(101,"hari",55555,"trainee");
if(e instanceof Manager)
{
System.out.println("Manager");
}

e=new Director();
if(e instanceof Director)
{
System.out.println("Director");
}

e=new Admin();
if(e instanceof Admin)
{
System.out.println("Admin");
}

}
}