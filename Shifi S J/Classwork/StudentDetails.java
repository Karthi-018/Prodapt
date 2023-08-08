import java.util.*;
class StudentDetails
{
	String stu_name;
	int stu_id;
	int stu_marks;
	StudentDetails(String stu_name,int stu_id,int stu_marks)
	{
		this.stu_name=stu_name;
		this.stu_id=stu_id;
		this.stu_marks=stu_marks;
	}
	public String toString()
	{
		return stu_id+" \t"+stu_name+" \t"+stu_marks;
	}
		static void displayDetails(StudentDetails... detail)
	{
		System.out.println("ID"+"  "+"NAME"+"  "+"MARKS");
		for(StudentDetails i:detail)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StudentDetails stuArr[]=new StudentDetails[5];
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter Student ID:");
			int id=sc.nextInt();
			System.out.println("Enter Student Name:");
			String name=sc.next();
			System.out.println("Enter Student Marks:");
			int marks=sc.nextInt();
			StudentDetails stu1=new StudentDetails(name,id,marks);
			stuArr[i]=stu1;
		}
		StudentDetails.displayDetails(stuArr);
	}	
}

		
		