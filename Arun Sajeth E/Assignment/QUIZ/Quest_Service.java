package quiz;
import java.util.*;

public class Quest_Service
{
	static Scanner sc = new Scanner(System.in);

	static String[] quiz_choice = new String[10];
	static int mark=0;
	static int size=0;

	public static void choiceGetting()
	{
		System.out.print("Enter the anwer: ");
		String choice=sc.nextLine();
		quiz_choice[size]=choice;
		crct_Answer(choice);
		size+=1;		
	}
	
	public static void crct_Answer(String choice)
	{
		String quiz_ans[]={"8","32 and 64","Objects","At run time","void","Package is collection of class and interface","java.lang.Object","An int value","13","static"};
		
		if(choice.equals(quiz_ans[size]))
		{
			mark+=1;
			System.out.println("Choice is correct");
		}
		else
		{
			System.out.println("Correct Answer is:"+quiz_ans[size]);
		}
	}
	
	public static void markDisplay()
	{
		System.out.println("Your score is "+mark+" out of 10.");
	}

}