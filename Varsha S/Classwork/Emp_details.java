package pojo;
public class Emp_details
{
private int emp_id;
private String emp_name;
private String designation;

Emp_details()
{
emp_id=0;
emp_name=null;
designation=null;
}

public void setid(int id)
{
emp_id=id;
}
public int getid()
{
return emp_id;
}

public void setname(String name)
{
emp_name=name;
}
public String getname()
{
return emp_name;
}

public void setdesg(String desg)
{
designation=desg;
}
public String getdesg()
{
return designation;
}

void display(Emp_details...det)
{
for(Emp_details e : det)
{
System.out.println(e);
}
}

public String toString()
{
return emp_id + " " + emp_name + " " + designation;
}
}
