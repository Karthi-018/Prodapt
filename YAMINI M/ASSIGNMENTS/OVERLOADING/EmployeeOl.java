class EmployeeOl
{
public void EmpDetails(int id,String name,long salary)
{
System.out.println("Staff Employee");
System.out.println("Id : "+id+ "Name:" + name + "Salary:" +salary);
}
public void EmpDetails(int id,String name,long salary,String dept)
{
System.out.println("Engineer");
System.out.println("Id : "+id+ "Name:" + name + "Salary:" +salary+"Dept:"+dept);
}
public void EmpDetails(int id,String name,String dept,String location)
{
System.out.println("HR");
System.out.println("Id:" + id + "Name:" + name +"Dept:" + dept + "location:" + location);
}
public static void main(String args[])
{
EmployeeOl e=new EmployeeOl();
e.EmpDetails(101,"abc",10000);
e.EmpDetails(102,"xyz",20000,"Engineering");
e.EmpDetails(103,"efg","HumanResource","Chennai");
}
}