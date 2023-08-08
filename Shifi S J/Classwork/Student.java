import java.util.*;
class Student
{
	String stu_name;
	int stu_id;
	int stu_marks;
	/*Student(String stu_name,int stu_id,int stu_marks)
	
		this.stu_name=stu_name;
		this.stu_id=stu_id;
		this.stu_marks=stu_marks;
	}*/
	public String toString()
	{
		return stu_id+" \t"+stu_name+" \t"+stu_marks;
	}
		static void displayDetails(Student... detail)
	{
		System.out.println("ID        NAME   MARKS");
		for(Student i:detail)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("Enter Student ID:");
			int id=sc.nextInt();
			System.out.println("Enter Student Name:");
			String name=sc.next();
			System.out.println("Enter Student Marks:");
			int marks=sc.nextInt();
		Student stu=new Student();
        stu.stu_name=name;
        stu.stu_id=id;
        stu.stu_marks=marks;
			
		Student.displayDetails(stu);
	}	
}

		
		