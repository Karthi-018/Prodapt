class Employee1
{
	int id;
	String name;
	long sal;
	public int getid()
	{
		return id;
	}
	public void setid()
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
	
		this.name=name;
	}
	public long getsal()
	{
		return sal;
	}
	public void setsal()
	{
		this.sal=sal;
	}
 public static void main(String[] args){
	Admin a=new Admin();
	a.setname("abc");
	System.out.println(a.getname());
	//a.setbudget("23456");
	//System.out.println(a.getbudget());
} 
}

class Engineer extends Employee1
{

}

class Manager extends Employee1
{
	String dept;
	public String getdept()
	{
		return dept;
	}
	public void setdept()
	{
		this.dept=dept;
	}
}

class Admin extends Manager
{

}

class Director extends Admin
{
	long budget;
	public long getbudget()
	{
		return budget;
	}
	public void setbudget()
	{
		this.budget=budget;
	}
}


	
	

