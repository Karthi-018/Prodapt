import java.util.Scanner;
class Studentmain
{
	public static void main(String[] args)
	{
		StudentDetails students[]=new StudentDetails[5];
		students[0]=new StudentDetails(1,"abc",75);
		students[1]=new StudentDetails(2,"def",60);
		students[2]=new StudentDetails(3,"ghi",98);
		students[3]=new StudentDetails(4,"jkl",35);
		students[4]=new StudentDetails(5,"mno",50);

		Studentmain s=new Studentmain();

		try
		{
			s.Studentsearch(students);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void Studentsearch(StudentDetails[] students) throws Exception
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search id");
		int id = sc.nextInt();
		int flag=0;

		for(int i=0;i<students.length;i++)
		{
			if(students[i].sid == id)
			{
				flag = 1;
				System.out.println(students[i]);
				
			}
		}

		if(flag == 0)
		{
			throw new StudentNotFoundException(id);
		}
				
		}		
		
		
	
}

