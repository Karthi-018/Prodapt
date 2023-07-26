import java.util.*;

class mainclassemp
{
public static void main(String a[])
{

   Scanner s=new Scanner(System.in);
	employee empArr[] = new employee[3];
   for(int i=0;i<3;i++)
	{ 
	  System.out.println("enter the name of Employee");
	  String name=s.next();
	  System.out.println("enter the ID of Employee");
	  int id=s.nextInt();
	  System.out.println("enter the salary of Employee");
	  int sal=s.nextInt();
          employee o=new employee();
          o.setname(name);
	  o.setid(id);
	  o.setsal(sal);
		empArr[i]=o;
	  }
	
	empArr[0].employeedetails(empArr);

}
}