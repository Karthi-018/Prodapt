class StudentNotFoundException extends Exception
{
	StudentNotFoundException(String name)
	{
		System.out.println(name+" not found");
	}
}