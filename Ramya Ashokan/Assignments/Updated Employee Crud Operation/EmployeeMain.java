import java.util.*;
class EmployeeMain
{

Scanner sc=new Scanner(System.in);


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice;
EmployeeMain empMain=new EmployeeMain();
Employee emp[]=new Employee[3];
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
 empMain.updateDetails(emp);
break;
case 4:
System.out.println("Enter the Employee id:");
int s_eid=sc.nextInt();
empMain.searchEmployee(s_eid,emp);
break;
case 5:
empMain.deleteDetails(emp);
break;
default:
 System.out.println("Invalid choice");
break;
}}
while(choice<6);


}

public void addEmployee(Employee emp[])
{
//Scanner sc1=new Scanner(System.in);

for(int i=0;i<3;i++)
{
System.out.println("Enter the Employee "+(i+1)+" details:");
System.out.println("Enter the Employee id:");
int eid=sc.nextInt();
sc.nextLine();

System.out.println("Enter the Employee Name:");
String ename=sc.nextLine();

System.out.println("Enter the Employee Salary:");
long salary=sc.nextLong();

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
System.out.println("1.Display Employee id Details\n2.Display all Employee");
System.out.println("Enter the choice:");
int choice1=sc.nextInt();
switch(choice1)
{
case 1:
System.out.println("Employee id:");
int d_eid=sc.nextInt();
searchEmployee(d_eid,emp);
break;
case 2:
for(int i=0;i<emp.length;i++)
{

System.out.println("Employee "+(i+1)+" details:");
System.out.println(emp[i].getEid());
System.out.println(emp[i].getEname());
System.out.println(emp[i].getSalary());
System.out.println();
}
break;
}
}

public void updateDetails(Employee emp[])
{
System.out.println("Enter the Employee id to update details:");
int u_eid=sc.nextInt();
sc.nextLine();
searchEmployee(u_eid,emp);
System.out.println("Enter choice to update\n1.Name\n2.Salary");
int choice2=sc.nextInt();
switch(choice2)
{
case 1:
System.out.println("Enter the name to update:");
String u_name=sc.nextLine();
for(int i=0;i<emp.length;i++)
{
if(emp[i].getEid()==u_eid)
{
emp[i].setEname(sc.next());
System.out.println("Name updated successfully");
}}
break;
case 2:
System.out.println("Enter the Salary to update:");
//String u_salary=sc.nextLong();
for(int i=0;i<emp.length;i++)
{
if(emp[i].getEid()==u_eid)
{
emp[i].setSalary(sc.nextLong());
System.out.println("Salary updated successfully");
}}
break;
}
/*for(int i=0;i<emp.length;i++)
{
if(emp[i].getEid()==u_eid)
{


System.out.println("Updated Employee details:");
System.out.println(emp[i].getEid());
System.out.println(emp[i].getEname());
System.out.println(emp[i].getSalary());
System.out.println();
}
}*/

}


public void searchEmployee(int s_eid,Employee emp[])
{
boolean flag=true;
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
flag=false;
break;
}
}
if(flag==true)
{
System.out.println("Employee id not matched");
}
}

public void deleteDetails(Employee emp[])
{
Employee temp[]=new Employee[3];
System.out.println("Enter the Employee_id to delete:");
int d_eid=sc.nextInt();
for(int i=0,j=0;i<emp.length;i++)
{
if(emp[i].getEid()==d_eid)
continue;
else
{
temp[j]= emp[i];
j++;
}}
/*int i=0;
for(Employee e:emp)
{
if(e!=null && e.getEid()!=d_eid)
{
temp[i++]=e;
}
i--;
}*/
for(Employee t:temp)
{
if(t!=null)
{
System.out.println(t);
}}
}
}
