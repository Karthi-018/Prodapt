class College
{
	public void Details(String Name, String ClgId)
	{
		System.out.println("Enter the details mentioned below \nName: "+Name+"\nClgID: "+ClgId);
	}
}
class Student extends College
{
	public void details(String Name, String ClgId)
	{
		System.out.println("Designation: Student \nName: " +Name+ "\nClgID: "+ClgId);
	}
}
class Faculty extends College
{
	public void details(String Name, String ClgId)
	{
		System.out.println("Designation: Faculty \nName: " +Name+ "\nClgID: "+ClgId);
	}
}
class FloorSupervisor extends College
{
	public void details(String Name, String ClgId)
	{
		System.out.println("Designation: FloorSupervisor \nName: " +Name+ "\nClgID: "+ClgId);
	}
}

public class CollegeDetails
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.details("Abi","ss1234");
		System.out.println("*****************************");
		Faculty f=new Faculty();
		f.details("Hema","ff4325");
		System.out.println("*****************************");
		FloorSupervisor fs=new FloorSupervisor();
		fs.details("kannan","fs5673");		
	}
}		