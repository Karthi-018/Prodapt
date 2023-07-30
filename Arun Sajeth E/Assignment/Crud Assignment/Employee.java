class Employee
{
	private int Emp_id;
	private String Emp_name;
	private int Emp_salary;
	
	Employee()
	{
	}

	Employee(int Emp_id, String Emp_name, int Emp_salary)
	{
		this.Emp_id=Emp_id;
		this.Emp_name=Emp_name;
		this.Emp_salary=Emp_salary;
	}
	
	public void setId(int Emp_id)
	{
		this.Emp_id=Emp_id;
	}
	public void setName(String Emp_name)
	{
		this.Emp_name=Emp_name;
	}
	public void setSalary(int Emp_salary)
	{
		this.Emp_salary=Emp_salary;
	}

	public int getId()
	{
		return Emp_id;
	}
	public String getName()
	{
		return Emp_name;
	}
	public int getSalary()
	{
		return Emp_salary;
	}
	
	public String toString()
	{
		return Emp_id+" "+Emp_name+" "+Emp_salary;
	}

}