class Employee
{

public static void main(String[] args)
{
Employee obj = new Employee();
obj.setEid(123);
obj.setEname("Logan");
System.out.println("Employee id:"+obj.getEid()+" and Name:" +obj.getEname());
Employee obj1 = new Employee(321,"Mr.X");
System.out.println("Employee id: "+obj1.getEid()+" and Name:" +obj1.getEname());
}
int eid;
String ename;

public Employee()
{
}

public Employee(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}

public int getEid()
{
return eid;
}

public void setEid(int eid)
{
this.eid=eid;
}

public String getEname()
{
return ename;
}

public void setEname(String ename)
{
this.ename = ename;
}
}























