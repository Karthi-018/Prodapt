import java.util.*;
class employeeAssignment
{
int id;
int sal;
String name;
int[] arrid=new int[10];
int[] arrsal=new int[10];
String[] arrname=new String[10];


void create()
{
System.out.println("CREATING EMPLOYEE DATABASE");
Scanner s=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.println("ENTER THE ID,SALARY,NAME OF THE EMPLOYEE TO STORE");

int id=s.nextInt();
arrid[i]=id;

int sal=s.nextInt();
arrsal[i]=sal;

String name=s.next();
arrname[i]=name;
}
}

 void display()
{
System.out.println("LIST OF EMPLOYEE DETAILS IS DISPLAYING");
for(int i=0;i<10;i++)
{
System.out.println(arrid[i]);
System.out.println(arrsal[i]);
System.out.println(arrname[i]);
}
}

 void search()
{
System.out.println("ENTER THE EMPLOYEE ID TO BE SEARCHED");
Scanner s=new Scanner(System.in);
int S_id=s.nextInt();
for(int i=0;i<10;i++)
{
if(S_id==(arrid[i]))
{
System.out.println("The searched Employee details");
System.out.println(arrid[i]);
System.out.println(arrsal[i]);
System.out.println(arrname[i]);
}
}
}

void delete()
{
System.out.println("ENTER THE EMPLOYEE ID TO BE DELETED");
Scanner s=new Scanner(System.in);
int del_id=s.nextInt();
for(int i=0;i<10;i++)
{
if(del_id==arrid[i])
{
arrid[i]=0;
arrsal[i]=0;
arrname[i]=null;
}
}
System.out.println("AFTER DELETION");
}

void duplicate()
{
for(int i=0;i<10;i++)
{
for(int j=i+1;j<10;j++)
{
if(arrid[i]==arrid[j])
{
System.out.println("The employee id no."+" "+arrid[i]+" "+"is duplicated pls enter new id and related details");
Scanner d=new Scanner(System.in);
arrid[i]=d.nextInt();
arrsal[i]=d.nextInt();
arrname[i]=d.next();
}
}
}
}

}