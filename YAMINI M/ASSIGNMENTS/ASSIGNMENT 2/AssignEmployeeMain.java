import java.util.*;

class AssignEmployeeMain
{

public static void main(String args[])
{
	int employee;
	AssignEmployee emp = new AssignEmployee();
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("Select from the below options");
		System.out.println("1. Create Employee Details");
            	System.out.println("2. Update Employee Details");
            	System.out.println("3. Search Employee Details");
            	System.out.println("4. Display Employee Details");
           	System.out.println("5. Delete Employee Details");
           	System.out.println("6. Exit");
           	System.out.println("Enter your Selected Option");
            	employee = sc.nextInt();
			
		switch(employee)
		{

			case 1: 
			{
				emp.Create();
				break;
			}

			case 2: 
			{
				emp.Update();
				break;
			}

			case 3: 
			{
				emp.Search();
				break;
			}

			case 4: 
			{
				emp.Display();
				break;
			}

			case 5: 
			{
				emp.Delete();
				break;
			}

			case 6:
			{
                    		System.out.println("Exit");
                    		break;
			}


			default:
				System.out.println("Invalid Option");
			}

		}while(employee<7 && employee!=0);			
	}
}