class Emp

{
int empid;
String empName;
int wages;

public int getempid()      //getter
{
return empid;
}

public void setempid(int empid)           //setter
{
this.empid = empid;
}

public String getempName()       //settermethod
{
return empName;
}

public void setempName(String empName)          //gettermethod
{
this.empName = empName;
}

public int getwages()           //getter
{
return wages;
}

public void setwages(int wages)              //setter
{
this.wages = wages;
}
}



class Manager extends Emp          //extends keyword      class
{
String dept;

public String getdept()
{
return dept;
}

public void setdept(String dept)
{
this.dept = dept;
}

}

class Admin extends Manager
{
}

class Engineer extends Emp
{
}

class Director extends Admin
{
private int budget;

public int getbudget()
{
return budget;
}

public void setbudget(int budget)
{
this.budget = budget;
}
}

class Main
{

public static void main(String a[])
{
Emp e;
e = new Emp();
e = new Manager();
e = new Admin();
e = new Engineer();
e = new Director();

e.setempName("mr.x");
e.setempid(001);
e.setwages(35000);


System.out.println("Name:" +e.getempName());
System.out.println("Employeeid:" +e.getempid());
System.out.println("Salary:" +e.getwages());
}
}















