import java.util.Scanner;
class StudentSearch
{
	
	Student[] list = new Student[5];


	public void initList()
	{
		list[0] = new Student(121,"AA",80);
		list[1] = new Student(122,"BB",90);
		list[2] = new Student(123,"CC",90);
		list[3] = new Student(124,"DD",90);
		list[4] = new Student(125,"EE",70);
	}

	public Student searchStudent(String name) 
	{
		Student stu = null;
		for(Student details:list )
		{
			if((details.getsName()).equals(name))
			{
				stu = details;
			}
			
		}
		
		return stu;	
	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StudentSearch ss = new StudentSearch();
		ss.initList();
		System.out.println("Enter the name to search");
		String name = sc.next();
		Student stu = ss.searchStudent(name);
		if(stu != null)
		{
			System.out.println("Student present"+" "+ stu);
		}
		else
		{
			try
			{
				throw new StudentNotFoundException(name);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}	

	}
}