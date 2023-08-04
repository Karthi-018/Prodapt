package PracticePackage.VarArgs;

import java.util.Scanner;

class MainClass 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter the number of Student Entry: ");
		
		StudentAttendance[] StudentArr = new StudentAttendance[10];
		for(int i=0;i<num;i++)
		{
			StudentAttendance obj = new StudentAttendance();
			System.out.println("Enter the Studtent ID: ");
			obj.setSid = sc.nextInt();
			System.out.println("Enter the Studtent Name: ");
			obj.setSname = sc.nextInt();
			
			StudentAttendance student = new StudentAttendance();
			StudentArr[i] = student ;
		}
		for(StudentAttendance a : StudentArr)
		{
			System.out.println(StudentArr);
		}
	}
}
			
			
			