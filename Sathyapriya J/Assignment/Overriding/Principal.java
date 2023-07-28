class Principal
{
	public void display()
	{
		System.out.println("I am a Principal");
	
	}
}

class Teacher extends Principal
{

	public void display()
	{	
		super.display();
		System.out.println("I am a Teacher");
	}

}



class Student extends Teacher
{
	public void display()
	{	
		super.display();
		System.out.println("I am a Student");
	}
}

class MainClass
{
	public static void main(String a[])
	{
		Principal p = new Student();
		//Principal p1 = new Teacher();
		//Principal p2 = new Principal();
		p.display();
		//p1.display();
		//p2.display();
	}
}
	
	