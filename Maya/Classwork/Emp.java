import java.util.Scanner;
class Emp
{
	int id;
	String ename;
	long sal;
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getename()
	{
		return ename;
	}
	public void setename(String ename)
	{
		this.ename=ename;
	}
	public long getsal()
	{
		return sal;
	}
	public void setsal(long sal)
	{
		this.sal=sal;
	}
	
	
	public String toString()
	{
		return id+" \t"+ename+" \t"+sal;
	}

	public  void employeeDetails(Emp... details)
	{
		for(Emp d:details)
		{
    			System.out.println(d);
		}
	}	
	
	public static void main(String a[])
	{

		Emp employeeDetalis[] = new Emp[5];
		for(int i=0;i<3;i++)
		{
			Scanner s = new Scanner(System.in);	
			System.out.println("Enter the Employee ID");
			int id = s.nextInt();
			System.out.println("Enter the Employee Name");
			String eName = s.next();
			System.out.println("Enter the Employee Salary");
			long sal = s.nextLong();

			Emp employee = new Emp();
			employee.setid(id);
			employee.setename(eName);
			employee.setsal(sal);
			
			employeeDetalis[i] = employee;
		}
		
		System.out.println(employeeDetalis);
		
		Emp employeearr = new Emp();
		System.out.println("----------------------------------------------");
		employeearr.employeeDetails(employeeDetalis[0]);
		System.out.println("----------------------------------------------");
		employeearr.employeeDetails(employeeDetalis[0],employeeDetalis[1]);
		System.out.println("----------------------------------------------");
		employeearr.employeeDetails(employeeDetalis);
		
	}
	
	
}