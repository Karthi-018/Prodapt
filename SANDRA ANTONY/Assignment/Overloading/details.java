class details
{
	public void student(String str)
	{
		System.out.println("The name is: " +str);
	}
	
	public void student(String str, int age)
	{
		System.out.println("\nThe name is: "+str+" \nage is: "+age );
	}
	public void student(String str, int age, String dept)
	{
		System.out.println("\nThe name is: "+str+"\nThe age is: "+age+"\nThe department is: "+dept);
	}

	
	public static void main(String args[])
	{
		details det = new details();
		det.student("San");
		det.student("San",21);
		det.student("San", 21, "EEE");
	}
}
	