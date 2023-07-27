package a;
public class Employee
{
private String name;
private String id;
private String salary;

public String getname()
{
return name;
}

public void setname(String name)
{
this.name=name;
}

public String getid()
{
return id;
}

public void setid(String id)
{
this.id=id;
}

public String getsal()
{
return sal;
}

public void setsal(String sal)
{
this.sal=sal;
}
}


public class Main
{
public static void main(String a[])
{
 Employee e=new Employee();
 e.setname("sree");
 e.setid("1");
 e.setsal("200000");
 System.out.println("Name:"+e.getname());
 System.out.println("ID:"+e.getid());
 System.out.println("Salary:"+e.getsal());
}
}

