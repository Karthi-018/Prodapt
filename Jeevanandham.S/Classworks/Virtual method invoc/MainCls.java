class MainCls
{
	public static void main(String[] args)
	{
		Director d = new Director(121, "jeeva", 400000, "Talent and development", 30_000);
		Admin a = new Admin(122,"Poornesh",350000,"HR");
		Engineer e = new Engineer(123,"Jerish",200000);
		Manager m = new Manager(124,"Lokesh",400000,"Marketing");
		System.out.println("Manager details");
		printEmployee(m);
		System.out.println("Director details");
		printEmployee(d);
		System.out.println("Engineer details");
		printEmployee(e);
		System.out.println("Admin details");
		printEmployee(a);
		
		

	}

	public static void printEmployee(Employee emp)
	{
		if(emp instanceof Manager)
		{
			
			Manager m = (Manager)emp;
			System.out.println("Name: "+m.getEname());
			System.out.println("ID: "+m.getEid());
			System.out.println("Salary: "+m.getSalary());
			System.out.println("Department: "+m.getDept());
			System.out.println();
		}
		else if(emp instanceof Admin)
		{
			
			Admin a = (Admin)emp;
			System.out.println("Name: "+a.getEname());
			System.out.println("ID: "+a.getEid());
			System.out.println("Salary: "+a.getSalary());
			System.out.println("Position: "+a.getDept());
			System.out.println();
	
		}
		else if(emp instanceof Engineer)
		{
			
			Engineer e = (Engineer)emp;
			System.out.println("Name: "+e.getEname());
			System.out.println("ID: "+e.getEid());
			System.out.println("Salary: "+e.getSalary());
			System.out.println();
	
		}
		else if(emp instanceof Director)
		{
			
			Director d = (Director) emp;
			System.out.println("Name: "+d.getEname());
			System.out.println("ID: "+d.getEid());
			System.out.println("Salary: "+d.getSalary());
			System.out.println("Department: "+d.getDept());
			System.out.println("Budget: "+d.getBudget());
			System.out.println();
	
		}

	}
}