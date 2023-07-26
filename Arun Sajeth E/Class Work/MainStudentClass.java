package stud;
import java.util.*;

class MainStudentClass
{
		
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		
		int count=s.nextInt();
		System.out.println("Student detail");

		Student_Attendance[] attend=new Student_Attendance[10];
		
		for (int i=0;i<count;i++)
		{
			Student_Attendance sc=new Student_Attendance();
			
			System.out.println("Name:");
			sc.setName(s.next());
			System.out.println("Rollno:");
			sc.setRollno(s.nextInt());

			attend[i]=sc;
		}
		
		Student_Attendance studs=new Student_Attendance();
		studs.StudentAttendance(attend[0],attend[1],attend[2]);
	}
}
			
		
