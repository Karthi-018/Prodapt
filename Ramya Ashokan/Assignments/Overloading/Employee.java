import java.util.*;
class Employee
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter Employee id:");
int eid=sc.nextInt();
System.out.println("Enter name:");
String name=sc.next();
System.out.println("Enter salary:");
long salary=sc.nextLong();
Employee e=new Employee();
e.details(eid);
e.details(eid,name);
e.details(salary,eid);
e.details(eid,name,salary);
}
public void details(int eid)
{
System.out.println("Employee id:"+eid+"\n------------------------------");
}
public void details(int eid,String name)
{
System.out.println("Employee id:"+eid);
System.out.println("Employee name:"+name+"\n-----------------------------");

}
public void details(int eid,String name,long salary)
{
System.out.println("Employee id:"+eid);
System.out.println("Employee name:"+name);
System.out.println("Employee salary:"+salary+"\n--------------------------");

}
public void details(long salary,int eid)
{
System.out.println("Employee id:"+eid);
System.out.println("Employee salary:"+salary);

}
}