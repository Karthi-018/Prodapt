package pojo; 
import java.util.*; 
class Pojo_Main 
{ 
public static void main(String[]args) 
{ 
Emp_details det[]=new Emp_details[3]; 
Emp_details emp=new Emp_details(); 
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++) 
{ 
Emp_details o=new Emp_details(); 
System.out.println("Enter Employee ID:"); 
int id=sc.nextInt(); 
System.out.println("Enter Employee Name:"); 
String name=sc.next(); 
System.out.println("Enter Employee designation:"); 
String desg=sc.next(); 
o.setid(id);
o.setname(name);
o.setdesg(desg);
det[i]=o;
} 
emp.display(det);
}
}