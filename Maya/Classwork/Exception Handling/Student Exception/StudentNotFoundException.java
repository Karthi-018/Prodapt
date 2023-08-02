class StudentNotFoundException extends Exception
{
	StudentNotFoundException(int sid)
	{
	System.out.print(sid+ "Student id not found");
	}
}