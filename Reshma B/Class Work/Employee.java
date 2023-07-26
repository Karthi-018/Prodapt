class Employee
{
	int eID;
	String eName;
	String desg;
	long salary;
	
	void displayEmployeeDetails()
	{
		System.out.println("Employee ID : "+eID);
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Designation : "+desg);
		System.out.println("Employee Salary : "+salary);
	}
	
	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.eID=101;
		emp.eName="Zoe";
		emp.desg="Developer";
		emp.salary=30000;

		emp.displayEmployeeDetails();
		
	}
}