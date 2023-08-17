package desp;

import java.util.*;

public class Main 
{
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) 
	{
		for(int j=0;j<10;j++)
		{
			String college = s.next();
			createCollege(college);
		}
	}
	
	public void userChoice() throws Exception
	{
		int choice;
		do
		{
			System.out.println("\n1. Search college based on name \n2. Search colege based on starting Date \n3. Search College based on Location");
			choice = s.nextInt();
			CollegeBO cbo = new CollegeBO();
			switch(choice)
			{
				case 1:
					System.out.print("\nNumberof names to be entered: ");
					int temp=s.nextInt();
					List<String> names = new ArrayList<>();
					System.out.print("\n Enter the list of names: ");
					for(int i=0;i<temp;i++)
						names.add(s.next());
					cbo.sortByName(cbo.findCollege(names));
					break;
				case 2:
					System.out.print("\nEnter the starting date to search:");
					cbo.sortByDate(cbo.findCollege(new Date(s.next())));
					break;
				case 3:
					System.out.println("\n Enter the location to search: ");
					String location = s.next();
					cbo.sortByLocation(cbo.findCollege(location));
					break;
				default: 
					System.out.println("EXIT");
			}
		}while(choice<4 && choice>0);
	}
	
	public static College createCollege(String college)
	{
		String[] ch = college.split(",");
		return new College(ch[0],ch[1],ch[2],ch[3],new Integer(ch[4]),ch[5],new Date(ch[6]));
	}

}
