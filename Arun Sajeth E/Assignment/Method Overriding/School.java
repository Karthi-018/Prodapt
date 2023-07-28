class School
{
	public void displayName(String name)
	{
		System.out.println("School Name:"+name);
	}
}
class student extends School
{
	public void displayName(String name)
	{
		super.displayName("ABC");
		System.out.println("Student Name:"+name);
	}
}
class MainSchool
{
	public static void main(String a[])
	{
		student s = new student();
		s.displayName("XYZ");
	}
}