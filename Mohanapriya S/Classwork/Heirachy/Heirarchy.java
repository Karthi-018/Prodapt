import java.util.*;
class Heirarchy
{
public static void main(String a[]) 
{
Scanner s=new Scanner(System.in);
Director d=new Director();
int id=s.nextInt();
String Name=s.next();
int Salary=s.nextInt();
String department=s.next();
d.setid(id);
d.setName(Name);
d.setSalary(Salary);
d.setdept(department);
System.out.println("The Employee id : " + d.getid());
System.out.println("The Name of the Employee is : " +d.getName());
System.out.println("The Salary of the Employee is : " +d.getSalary());
System.out.println("The Department of the Employee is : " +d.getdept());
}
}


