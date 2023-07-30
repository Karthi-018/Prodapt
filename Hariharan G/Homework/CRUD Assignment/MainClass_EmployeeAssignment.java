package assignment;
import java.util.*;
class Employee_Assignment
{
Scanner sc=new Scanner(System.in);
int empId;
String empName;
long salary;
int limit=115;




public String toString()
{                                                            //overriding toString method
return empId+" "+empName+" "+salary; 
}



//constructor creation


Employee_Assignment(int id,String name,long sal)             //parameterised constructor
{
this.empId=id;
this.empName=name;
this.salary=sal;
}



Employee_Assignment()
{}                                                            //default constructor

//Employee_Assignment obj=new Employee_Assignment();            //for local use


static int n=102;


public void create(Employee_Assignment...empArr)
{
if(n<limit)
{
empArr[n-100].empId=n;
System.out.println("Enter name");
String createName=sc.nextLine();
empArr[n-100].empName=createName;
System.out.println("Enter Salary");
long createSalary=sc.nextLong();
empArr[n-100].salary=createSalary;
n=n+1;
}
else
{
System.out.println("Database is full\nCannot create new employee");
}
}




public void update(Employee_Assignment...empArr)
{
System.out.println("Enter Employee id to update employee name or salary");             //update details method
int id=sc.nextInt();
for(Employee_Assignment i:empArr)
{
if(i.empId==id)
{
System.out.println("1 for update name\n2 for update salary");
int select=sc.nextInt();
sc.nextLine();
if(select==1)
{
System.out.println("Enter new name");
//String newName=sc.next();
i.empName=sc.nextLine();
break;
}
else
{
System.out.println("Enter new salary amount");
long s=sc.nextLong();
i.salary=s;
break;
}
}
else
{continue;}
}
}




public void search(Employee_Assignment...empArr)
{
System.out.println("Enter employee id to search");                                    //employee search method
int searchId=sc.nextInt();
for(Employee_Assignment i:empArr)
{
if(i.empId==searchId)
{
System.out.println(i.toString());
System.out.println("Search successful");
break;
}

}

}




public void displayAllEmp(Employee_Assignment...empArr)
{
for(Employee_Assignment i:empArr)                                                    //display all employee method
{
System.out.println(i);

}
}



public void delete(Employee_Assignment...empArr)
{
System.out.println("Enter employee id to delete from database");                    //employee delete method 
int deleteId=sc.nextInt();
for(Employee_Assignment i:empArr)
{
if(i.empId==deleteId)
{
i.empId=0;
i.empName=null;
i.salary=0;
System.out.println("Employee deleted from database");
break;
}

}

}


public void askfn(Employee_Assignment...empArr)
{
System.out.println("Select 1 to create");                                       //ask user what to do?
System.out.println("Select 2 to update");
System.out.println("Select 3 to search");
System.out.println("Select 4 to display all employee details");
System.out.println("Select 5 to delete");
System.out.println("Select 6 to exit");




int selection=sc.nextInt();
switch(selection)
{
case 1:
create(empArr);
askfn(empArr);
break;
case 2:
update(empArr);
askfn(empArr);
break;
case 3:
search(empArr);
askfn(empArr);
break;
case 4:
displayAllEmp(empArr);
askfn(empArr);
break;
case 5:
delete(empArr);
askfn(empArr);
break;
default:
System.out.println("BYE");
break;
}
}

}


                                                                               





public class MainClass_EmployeeAssignment
{
public static void main(String args[])
{
Employee_Assignment empArr[]=new Employee_Assignment[15];
//Employee_Assignment newEmpArr[]=new Employee_Assignment[15];
Employee_Assignment empObj=new Employee_Assignment();
Scanner sc=new Scanner(System.in);
int id=100;
//int limit=115;
System.out.println("EMPLOYEE DETAILS");
                                                                               //employee details info from user.
for(int i=0;i<10;i++)
{
System.out.println("ENTER NAME: ");
String name=sc.next();
System.out.println("ENTER SALARY: ");
long sal=sc.nextLong();
Employee_Assignment ea=new Employee_Assignment(id,name,sal);
id=id+1;
empArr[i]=ea;
}


empObj.askfn(empArr);
//System.out.println(id);



}
}