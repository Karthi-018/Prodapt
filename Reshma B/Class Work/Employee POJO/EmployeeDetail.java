package sample;
import java.util.*;


public class EmployeeDetail
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		sample_employee deets[] = new sample_employee[3];
		for(int i=0;i<3;i++)
		{
			sample_employee emp=new sample_employee();

			System.out.println("Enter the Employee ID"); 
			emp.seteid(s.nextInt());

			System.out.println("Enter the Employee Name"); 
			emp.setename(s.next());

			System.out.println("Enter the Designation"); 
			emp.setdes(s.next());

			System.out.println("Enter the Salary"); 
			emp.setsalary(s.nextLong());

			deets[i] = emp;
		}

		for(sample_employee a:deets)
			System.out.println(a);
	}
}