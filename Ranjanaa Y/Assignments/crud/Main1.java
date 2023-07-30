import java.util.*;
class crudEmp
{

//attributes of employee
int id;
double salary;
String name;

// declaring an array to store the details in individual array
int[] e_id = new int[5];
double[] e_salary = new double[5];
String[] e_name = new String[5];

Scanner sc = new Scanner(System.in);
Scanner s = new Scanner(System.in);

//Method to add Employee details
public void addEmp()
{
int getid;
double getsal;
String getname;
for(int i=0;i<5;i++)
{
System.out.println("Enter id : ");
getid = sc.nextInt();
e_id[i] = getid;
System.out.println("Enter name : ");
getname = s.nextLine();
e_name[i] = getname;
System.out.println("Enter salary : ");
getsal = sc.nextDouble();
e_salary[i] = getsal;
}
System.out.println("\nAdded successfully\n");
for(int i=0;i<5;i++)
{
System.out.println(e_id[i]+" "+e_name[i]+" "+e_salary[i]);
}
} 

// Method to search Employee details
public void searchEmp()
{
System.out.println("Enter id to be searched : ");
int searchid;
searchid = sc.nextInt();
for(int i=0;i<5;i++)
{
if(searchid==(e_id[i]))
{
System.out.println("The searched Employee :");
System.out.println(e_id[i]+" "+e_name[i]+" "+e_salary[i]);
}
}

}

//Method to display the EMployee details
public void showEmp()
{
for(int i=0;i<5;i++)
{
System.out.println(e_id[i]+" "+e_name[i]+" "+e_salary[i]);
}
}

// Method to delete a record of Employee
public void deleteEmp()
{
System.out.println("Enter the id to be deleted : ");
int del_id;
del_id = sc.nextInt();
for(int i=0;i<5;i++)
{
if(del_id==(e_id[i]))
{
e_id[i] = 0;
e_name[i] = null;
e_salary[i] = 0;
}
}
System.out.println("Added successfully");
for(int i=0;i<5;i++)
{
System.out.println(e_id[i]+" "+e_name[i]+" "+e_salary[i]);
}
}

// Method to update the name and salary of an employee
public void updateEmp()
{
System.out.println("Enter the id to be updated : ");
int up_id;
up_id = sc.nextInt();
for(int i=0;i<5;i++)
{
if(up_id==(e_id[i]))
{
e_salary[i] = 50000;
}
}
System.out.println("After updating");
for(int i=0;i<5;i++)
{
System.out.println(e_id[i]+" "+e_name[i]+" "+e_salary[i]);
}
}
}

// main class
class Main1
{
public static void main(String args[])
{


crudEmp ce = new crudEmp();

System.out.println("Add emp details: ");
ce.addEmp();

int choice;
System.out.println("Enter your choice :");
Scanner s1 = new Scanner(System.in);
choice = s1.nextInt();
switch(choice)
{
case 1 : 
System.out.println("\n-----------------\n");
System.out.println("Search emp details: ");
ce.searchEmp();
break;

case 2 :
System.out.println("\n-----------------\n");
System.out.println("Enter ID to be deleted: ");
ce.deleteEmp();
break;

case 3:
System.out.println("\n-----------------\n");
System.out.println("Enter detail to be updated: ");
ce.updateEmp();
break;

case 4:
System.out.println("\n-----------------\n");
System.out.println("Emp details after crud operations : ");
ce.showEmp();
break;
}


}
}


