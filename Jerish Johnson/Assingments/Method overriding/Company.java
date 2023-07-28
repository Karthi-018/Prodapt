class Company
{
	void cnt()
	{
		System.out.println("Company Departments");
	}
}

class Director extends Company
{
	void cnt()
	{
		System.out.println("Company Director");
		System.out.println("Number : 1");
		System.out.println("Investment made: 5000000");
	}
}

class HR extends Director
{
	void cnt()
	{	
		System.out.println("Talent Development HR : 5");
		System.out.println("Management HR : 3");
		System.out.println("Delivery HR: 2");
	}
}

class Manager extends HR
{
	void cnt()
	{

		System.out.println("Devops Manager : 3");
		System.out.println("Cloud Manager : 10");
	}
}

class Employee extends Manager
{
	void cnt()
	{
	System.out.println("Total number of EMployees : 200");
	}
}

class TotalCount
{
	
	public static void main(String args[])
	{

	Company c = new Company();
	c.cnt();

	System.out.println("Director");
	Director d = new Director();
	d.cnt();

	System.out.println("HR");
	HR h = new HR();
	h.cnt();

	System.out.println("Manager");
	Manager m = new Manager();
	m.cnt();

	System.out.println("EmployeeS");
	Employee e = new Employee();
	e.cnt();
	}
}