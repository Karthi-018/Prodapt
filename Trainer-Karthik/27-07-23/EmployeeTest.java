public class EmployeeTest {

    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        
        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        // Print information about the objects you created
	System.out.println("Engineer Details");	
	
        printEmployee(eng);
	System.out.println();
	System.out.println("Admin Details");
        printEmployee(adm);
	System.out.println();
	System.out.println("Manager Details");
        printEmployee(mgr);
	System.out.println();
	System.out.println("Diretir Details");
        printEmployee(dir);

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName ("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.00);
        printEmployee(mgr);

    }

    public static void printEmployee(Employee emp) {
        //System.out.println(); // Print a blank line as a separator
        // Print out the data in this Employee object
	if(emp instanceof Director)
	{
		Director dir = (Director) emp;
		System.out.println("Employee id:         " + dir.getEmpId());
        	System.out.println("Employee name:       " + dir.getName());
        	System.out.println("Employee Soc Sec #:  " + dir.getSsn());
        	System.out.println("Employee salary:     " + dir.getSalary());
		System.out.println("Employee budget:     " + dir.getBudget());
    	}
       else if(emp instanceof Manager)
	{
		Manager mrg = (Manager) emp;
		System.out.println("Employee id:         " + mrg.getEmpId());
        	System.out.println("Employee name:       " + mrg.getName());
        	System.out.println("Employee Soc Sec #:  " + mrg.getSsn());
        	System.out.println("Employee salary:     " + mrg.getSalary());
		System.out.println("Employee Departyment:     " + mrg.getDeptName());
    	}
	else if(emp instanceof Admin)
	{
		Admin admin = (Admin) emp;
		System.out.println("Employee id:         " + admin.getEmpId());
        	System.out.println("Employee name:       " + admin.getName());
        	System.out.println("Employee Soc Sec #:  " + admin.getSsn());
        	System.out.println("Employee salary:     " + admin.getSalary());
		
    	}
	else if(emp instanceof Engineer)
	{
		
		System.out.println("Employee id:         " + emp.getEmpId());
        	System.out.println("Employee name:       " + emp.getName());
        	System.out.println("Employee Soc Sec #:  " + emp.getSsn());
        	System.out.println("Employee salary:     " + emp.getSalary());
		
    	}
	
	
   }
}
