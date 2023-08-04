import java.util.Scanner;
class StudentDetailsClass     
{
	String id;
	String name;
	String mark;
	
	StudentDetalisClass(){}   //----------------> Default Constructor

	StudentDetalisClass(String id,String name,String mark)   //------------------>Parameterised Constructor
	{
		this.id=id;
		this.name=name;
		this.mark = mark;
	}
	
	public String toString()   //---------------->Hashcode to string
	{
		return id+" \t"+name+" \t"+mark;
	}

	public  void studentDetails(StudentDetailsClass... details)
	{
		System.out.println(details.length+" Students Present");
		System.out.println("________________________________");
		System.out.println("Details of Students");
		for(StudentDetalisClass d:details)
		{
    			System.out.println("Student"+details+d);
		}
	}
	
	
	
	public static void main(String a[])
	{
		
		Scanner s = new Scanner(System.in);
		StudentDetailsClass studentDetails[] = new StudentDetailsClass[5];
		for(int i=0;i<3;i++)
		{	
			System.out.println("Enter the Student ID");
			String sid = s.next();
			System.out.println("Enter the Student Name");
			String sName = s.next();
			System.out.println("Enter the Student Marks");
			String marks = s.next();

			StudentDetailsClass student = new StudentDetailsClass(sid,sName,marks);
			
			studentDetails[i] = student;
			
			
		}
		
		
		
		StudentDetailsClass studentarr = new StudentDetailsClass();
		
		studentarr.studentDetails(studentDetails[0],studentDetails[1],studentDetails[2]);
		
		
		
		
	}
	
	
}