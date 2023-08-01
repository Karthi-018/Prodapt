public class EmployeeCrud
{
	int id;
	String name;
	long salary;
	String department;

	public EmployeeCrud(int id, String name, long salary,String department) 
	{
        	this.id = id;
        	this.name = name;
        	this.salary = salary;
        	this.department = department;
	}

	public void setEid(int id)
	{
		this.id=id;
	}
	public int getEid()
	{
		return id;
	}

	public void setEName(String name)
	{
		this.name=name;
	}
	public String getEName()
	{
		return name;
	}

	public void setSalary(long salary)
	{
		this.salary=salary;
	}
	public long getSalary()
	{
		return salary;
	}

	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}

	public String toString() 
	{
        	return "Employee id: " + id +"\nEmployee name: " + name +"\nEmployee salary: " + salary +"\nEmployee Department: " + department;
	}
}