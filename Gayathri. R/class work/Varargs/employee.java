class employee
{
int emp_id;
int emp_sal;
String emp_name;

public void employeedetails(employee... details)
{
  for(employee e:details)
  {
    System.out.println("employee details");
    System.out.println(e);
  }
}
public String toString()
{
  return emp_name+" " + emp_sal + " "+emp_id;
}
	
public void setid(int id)
{
  emp_id=id;
}
public int getid()
{
return emp_id;
}
public void setsal(int sal)
{
emp_sal=sal;
}
public int getsal()
{
return emp_sal;
}
public void setname(String name)
{
emp_name=name;
}
public String getname()
{
return emp_name;
}
}

