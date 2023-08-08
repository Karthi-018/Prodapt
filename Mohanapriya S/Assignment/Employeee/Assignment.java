import java.util.*;
class Assignment
{
Scanner s=new Scanner(System.in);
int a1[]=new int[10];
String a2[]=new String[10];
int a3[]=new int[10];

void update()
{
for (int i=0;i<10;i++)
{
System.out.println("Enter the Id of the Employee: ");
int Id=s.nextInt();
a1[i]=Id;

System.out.println("Enter the Name of the Employee: ");
String Name=s.next();
a2[i]=Name;

System.out.println("Enter the Salary of the Employee: ");
int Salary=s.nextInt();
a3[i]=Salary;
}
}

void display()
{
for(int i=0;i<10;i++)
{
System.out.println("The Details of Employee " +(i+1) );
System.out.println();
System.out.println("Id: " +a1[i]);
System.out.println("Name: "+a2[i]);
System.out.println("Salary: "+a3[i]);
System.out.println();
}
}

void search()
{
System.out.println("Enter the element to be searched: ");
int e=s.nextInt();
int flag=0;
for(int i=0;i<10;i++)
{
if(a1[i]==e)
{
System.out.println("The element is found in " +(i+1) +" Position");
break;
}
}
}

void delete()
{
System.out.println("Enter the Id to be deleted: ");
int d=s.nextInt();
int ar1[]=new int[a1.length];
int j=0;
for (int i=0;i<a1.length;i++)
{
if(a1[i]==d)
{
continue;
}
ar1[j]=a1[i];
j++;
}
System.out.println("The Id's after deleting");
for(j=0;j<(a1.length-1);j++)
{   
System.out.println(ar1[j]+ " ");
}
}
}

