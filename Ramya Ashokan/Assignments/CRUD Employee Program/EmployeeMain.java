import java.util.*;
class EmployeeMain
{


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice;
EmployeeMain empMain=new EmployeeMain();
Employee emp[]=new Employee[10];
do
{
System.out.println("1.Add Employee Details\n2.Display Employee Details\n3.Update Employee Details\n4.Search Employee Details\n5.Delete Employee Details\n");
System.out.println("Enter the choice:");
choice=sc.nextInt();
sc.nextLine();
switch(choice)
{
case 1:
 empMain.addEmployee(emp);
 break;
case 2:
 empMain.displayDetails(emp);
break;
case 3:
 System.out.println("Enter the Employee id to update details:");
int u_eid=sc.nextInt();
sc.nextLine();
empMain.searchEmployee(u_eid,emp);

System.out.println("Enter the name to update:");
String u_name=sc.nextLine();
empMain.updateDetails(u_eid,u_name,emp);
break;
case 4:
System.out.println("Enter the Employee id:");
int s_eid=sc.nextInt();
empMain.searchEmployee(s_eid,emp);
break;
case 5:
System.out.println("Enter the Employee_id to delete:");
int d_eid=sc.nextInt();
empMain.deleteDetails(d_eid,emp);
break;
default:
 System.out.println("Invalid choice");
break;
}}
while(choice<6);


}

public void addEmployee(Employee emp[])
{
Scanner sc1=new Scanner(System.in);

for(int i=0;i<10;i++)
{
System.out.println("Enter the Employee "+(i+1)+" details:");
System.out.println("Enter the Employee id:");
int eid=sc1.nextInt();
sc1.nextLine();

System.out.println("Enter the Employee Name:");
String ename=sc1.nextLine();

System.out.println("Enter the Employee Salary:");
long salary=sc1.nextLong();

if(emp[0]==null)
{
emp[0]=new Employee(eid,ename,salary);

continue; 
}
if(this.hasDuplicate(emp,eid,new Employee(eid,ename,salary)))
{
System.out.println("Employee id already exist,please provide valid id");
i--;
}
else
{
Employee e=new Employee(eid,ename,salary);
emp[i]=e;
System.out.println("Employee "+(i+1)+" created successfully");
}
}
}

public boolean hasDuplicate(Employee emp[],int eid, Employee e)
{
for(int i=0;i<emp.length;i++)
{
if(emp[i]!=null && emp[i].getEid()==eid)
{
return true;
}
}
return false;
}

public void displayDetails(Employee []emp)
{
for(int i=0;i<emp.length;i++)
{
System.out.println("Employee "+(i+1)+" details:");
System.out.println(emp[i].getEid());
System.out.println(emp[i].getEname());
System.out.println(emp[i].getSalary());
System.out.println();
}
}

public void updateDetails(int u_eid,String u_name,Employee emp[])
{
for(int i=0;i<emp.length;i++)
{
if(emp[i].getEid()==u_eid)
{
emp[i].setEname(u_name);
System.out.println("Updated Employee details:");
System.out.println(emp[i].getEid());
System.out.println(emp[i].getEname());
System.out.println(emp[i].getSalary());
System.out.println();
}
}

}


public void searchEmployee(int s_eid,Employee emp[])
{
for(int i=0;i<emp.length;i++)
{
if(emp[i].getEid()==s_eid)
{
System.out.println("Employee id Matched");
System.out.println("Employee details:");
System.out.println(emp[i].getEid());
System.out.println(emp[i].getEname());
System.out.println(emp[i].getSalary());
System.out.println();
}
}
}

public void deleteDetails(int d_eid, Employee emp[])
{
boolean bool=true;
for(int i=0;i<emp.length;i++)
{
if(emp[i]!=null && emp[i].getEid()==d_eid)
{
emp[i]=null;
System.out.println("Employee details deleted successfully");
bool=false;
break;
}
}
if(bool==true)
{
System.out.println("Employee details not found");
}

}
}