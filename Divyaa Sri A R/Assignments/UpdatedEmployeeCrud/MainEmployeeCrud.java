import java.util.Scanner;

public class MainEmployeeCrud
{
	public static void main(String a[])
	{
		EmployeeOperationCrud e=new EmployeeOperationCrud();
		Scanner sc= new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Create\n2.Update\n3.Search\n4.Display\n5.Delete\n6.Exit");
			System.out.println("Enter your Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
				{
					e.createEmployee();
					break;
				}
				case 2: 
				{
					e.updateEmployee();
					break;
				}
				case 3: 
				{
					e.searchEmployee(104);
					break;
				}
				case 4: 
				{
					e.displayEmployee();
					break;
				}
				case 5: 
				{
					e.deleteEmployee();
					break;
				}
				case 6:
					break;
			}
		}while(choice<=6);			
	}
}