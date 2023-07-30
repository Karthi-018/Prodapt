import java.util.*;
class Employeedet
{
private String ename;
private int eid;
private long esalary;

Employeedet(String ename, int eid, long esalary)
{
this.ename=ename;
this.eid=eid;
this.esalary=esalary;
}

public String getname()
{
return ename;
}
public void setname(String ename){
this.ename=ename;
}

public int getid()
{
return eid;
}

public long getsal()
{
return esalary;
}
public void setsal(long esalary){
this.esalary=esalary;
}


public String toString()
{
return "Employee Name: "+"  "+ ename +" Employee ID: "+"  "+eid+"Employee Salary: "+"  "+esalary;
}
}

public class Emp
{
private final static int m = 10; 
private static Employeedet[] em= new Employeedet[m];
private int n =10; //count of employees
		
public static void main(String args[])
{
	
Scanner sc=new Scanner(System.in);
em[0]=new Employeedet ("ABC",1,50000);
em[1]=new Employeedet ("PQR",2,70000);
em[2]=new Employeedet ("LMN",3,58000);
em[3]=new Employeedet ("XYZ",4,13000);
em[4]=new Employeedet ("DEF",5,90000);
em[5]=new Employeedet ("TUV",6,45000);
em[6]=new Employeedet ("VAR",7,95000);
em[7]=new Employeedet ("RAG",8,80000);
em[8]=new Employeedet ("HAR",9,60000);
em[9]=new Employeedet ("SUD",10,45000);

System.out.println("1. Display employee details");
System.out.println("2.Update employee details");
System.out.println("3. Search employee details");
System.out.println("4.Create employee details");
System.out.println("5.Delete employee details");
System.out.println("Your choice: ");

int c = sc.nextInt();
switch(c) 
{
case 1:
display();
break;

/*case 2:
update();
break;
case 3:
search();
break;
case 4:
create();
break;
case 5:
del();
break;*/

default:
System.out.println("Invalid");
break;
}
}


static public void display()
{
for(Employeedet e:em)
{
System.out.println(e);
}
}

}

