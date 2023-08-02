package stud;

public class StudentNotFoundException extends Exception
{
	StudentNotFoundException(String stud_Name)
	{
		System.out.println(stud_Name+"Not found in Student Details");
	}
}
