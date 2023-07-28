class Teacher
{
	public void PrintName(String name)
	{
		System.out.println("Teacher Name is "+name);
	}
}

class Student extends Teacher
{
	public void PrintName(String name)
	{	
		super.PrintName("Geetha");
		System.out.println("Student Name is "+name);
	}
}

class MainClass
{
	public static void main(String a[])
	{
		Student s = new Student();
		s.PrintName("Sathya");
	}
}

		
	