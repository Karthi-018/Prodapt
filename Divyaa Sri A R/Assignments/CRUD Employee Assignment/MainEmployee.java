import java.util.Scanner;
class MainEmployee
{
	public static void main(String a[])
	{
		int choice;
		EmployeeClass e=new EmployeeClass();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Create\n2.Update\n3.Search\n4.Display\n5.Delete");
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
					e.searchEmployee();
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
				default:
					System.out.println("Invalid Choice");
			}
		}while(choice<6);			
	}
}
