class StudentReg
{
	public void fun(String n1)
	{
		System.out.println("Student name : "+n1+" Not yet registered.");
	}
	public void fun(String n1,int n2)
	{
		System.out.println("Student : "+n1+" Registeration Number : "+n2);
	}
	public void fun(int n1,String n2,int n3)
	{
		System.out.println("Registration Number : "+n1+" Student name : "+n2+" Class: "+n3);
	}
	public void fun(String n2,int n1,int n3,String n4)
	{
		System.out.println("Student name : "+n2+" Registration Number : "+n1+" Class: "+n3+" Section: "+n4);
	}
	public void fun()
	{
		System.out.println("No data is entered");
	}
}