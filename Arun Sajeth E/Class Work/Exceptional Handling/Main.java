package stud;
import java.util.*;
public class Main
{
	static Student StudArr[] = new Student[5];
	static Scanner s = new Scanner(System.in);

	public static void main(String[] a)
	{
		StudArr[0]=new Student(101,"ABC",75);
		StudArr[1]=new Student(102,"GHI",80);
		StudArr[2]=new Student(103,"MNO",70);
		StudArr[3]=new Student(104,"QRS",85);
		StudArr[4]=new Student(105,"XYZ",90);
		
		searchName();
	}
	public static void searchName()
	{
		String stud_Name=s.next();
		Student flag=nameChecking(stud_Name);
		if(flag != null)
            		System.out.println(flag);
        	else
		{
            		try
			{
				throw new StudentNotFoundException(stud_Name);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}	
		
	}
	public static Student nameChecking(String stud_Name)
	{
		Student Stud=null;
		for(int i=0;i<5;i++)
		{

			if(StudArr[i]!=null)
			{

			if(StudArr[i].getName().equals(stud_Name))
				{

				Stud=StudArr[i];
				}
			}
		}
		return Stud;
	}
		
}