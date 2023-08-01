import java.util.Scanner;

class EmpNotFoundException extends Exception
{
	EmpNotFoundException(String str)
	{
		System.out.println(str+" not present in our database");
	}
}

class UserDefinedException
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String[] arr = {"ab","bc","ca"};
		boolean isPresent = false;
		for(int i=0;i<3;i++)
		{
			if(arr[i].equals(name))
			{
				isPresent = true;
				break;			
				
			}	
			
		}

		if(isPresent)
		{
			System.out.println("Employee present");
				
		}
		else
		{
			try
			{
				throw new EmpNotFoundException(name);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}