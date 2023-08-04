class MainClass
{
	
	
	public static void main(String agrs[])
	{
		
		
		Employee1 e = new Employee1(101,"ABC",1000);
		Manager1 m = new Manager1(102,"XYZ",1000,"SME");
		Engineer1 ee = new Engineer1(103,"MNO",1000);
		Admin1 a = new Admin1(104,"PQR",1000,"SME");
		Director1 d = new Director1(105,"AAA",20000,"SME",1200000);

		MainClass mc = new MainClass();
		
		
		System.out.println("Employee Info");	
		mc.printEmployee(e);
		System.out.println("_____________________________________________________");
		System.out.println("Manager Info");
		mc.printEmployee(m);
		System.out.println("_____________________________________________________");
		System.out.println("Engineer Info");
		mc.printEmployee(ee);
		System.out.println("_____________________________________________________");
		System.out.println("Admin Info");
		mc.printEmployee(a);
		System.out.println("_____________________________________________________");
		System.out.println("Director Info");
		mc.printEmployee(d);
		
	}
	public static void printEmployee(Employee1 emp)	
	{
		if(emp instanceof Director1)
		{
		Director1 dir = (Director1) emp;
		System.out.println("Employee id:         " + dir.getEid());
        	System.out.println("Employee name:       " + dir.getEname());
        	//System.out.println("Employee Soc Sec #:  " + dir.getSsn());
        	System.out.println("Employee salary:     " + dir.getSalary());
		System.out.println("Employee budget:     " + dir.getBudget());
		}
    	
       			else if(emp instanceof Manager1)
			{
			Manager1 mrg = (Manager1) emp;
			System.out.println("Employee id:         " + mrg.getEid());
        		System.out.println("Employee name:       " + mrg.getEname());
        		//System.out.println("Employee Soc Sec #:  " + mrg.getSsn());
        		System.out.println("Employee salary:     " + mrg.getSalary());
			System.out.println("Employee Departyment:     " + mrg.getDept());
    			}
			else if(emp instanceof Admin1)
			{
			Admin1 admin = (Admin1) emp;
			System.out.println("Employee id:         " + admin.getEid());
        		System.out.println("Employee name:       " + admin.getEname());
        		System.out.println("Employee salary:     " + admin.getSalary());
		
    			}
			else if(emp instanceof Engineer1)
			{
		
			System.out.println("Employee id:         " + emp.getEid());
        		System.out.println("Employee name:       " + emp.getEname());
        		//System.out.println("Employee Soc Sec #:  " + emp.getSsn());
        		System.out.println("Employee salary:     " + emp.getSalary());
		
    			}
			else
			{
			System.out.println("Employee id:         " + emp.getEid());
        		System.out.println("Employee name:       " + emp.getEname());
        		//System.out.println("Employee Soc Sec #:  " + emp.getSsn());
        		System.out.println("Employee salary:     " + emp.getSalary());
			}
		
			
	
   		
	}
	
}	

		