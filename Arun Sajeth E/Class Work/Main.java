package test1;

public class Main
{
	public static void main(String a[])
	{
		Employee ob=new Employee();
		ob.setemployee(2,"Siva","Student",1000);
		ob.getemployee();

		Employee ob1=new Employee();
		ob1.getemployee();
		
		System.out.println(ob1);
	}
}