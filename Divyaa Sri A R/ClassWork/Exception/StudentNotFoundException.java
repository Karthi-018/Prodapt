public class StudentNotFoundException extends Exception
{
	StudentNotFoundException(String name)
	{
		System.out.println(name+ " is not in list");
	}
}