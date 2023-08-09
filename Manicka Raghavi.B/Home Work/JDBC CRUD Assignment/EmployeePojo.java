package employeecrud;

public class EmployeePojo 
{
	private int id;
	private String name;
	private int salary;

	EmployeePojo(int id,String name,int salary) 
	{ 
	this.id=id;
	this.name=name;
	this.salary=salary; 
	}

	int getId()
	{ 
	return id;
	}

	String getName()
	{ 
	return name;
	} 

	int getSalary() 
	{ 
	return salary;
	} 

	void setId(int id) 
	{ 
	this.id=id;
	}

	void setName(String name) 
	{ 
	this.name=name;
	} 

	void setSalary(int salary) 
	{ 
	this.salary=salary;
	} 

	public String toString()
	{ 
	return "Emp Id: "+id+" Emp Name: "+name+" Emp Salary: "+salary;
	}  
}
