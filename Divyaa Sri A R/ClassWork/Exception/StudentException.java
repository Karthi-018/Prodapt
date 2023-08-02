import java.util.Scanner;
public class StudentException
{
	public static void main(String a[])
	{	
		Student stuArr[]=new Student[5];
		stuArr[0]=new Student(101,"AAA",97);
		stuArr[1]=new Student(102,"BBB",87);
		stuArr[2]=new Student(103,"CCC",65);
		stuArr[3]=new Student(104,"DDD",56);
		stuArr[4]=new Student(105,"EEE",73);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name to search");
		String searchName= sc.next();
		boolean flag=false;
		for(Student name: stuArr)
		{
			if(name.getSName()== searchName)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee found");
		}
		else
		{
			try
			{
				throw new StudentNotFoundException(searchName);
			}
			catch(StudentNotFoundException e)
			{
				System.out.println(e);
			}
		}
	}
}
			