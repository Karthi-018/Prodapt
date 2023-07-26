import java.util.Scanner;
class Emp
{
	int eid;
	String ename;
	int marks;
	Emp()
	{
	}
	Emp(int eid,String ename,int marks)
	{
		this.eid=eid;
		this.ename=ename;
		this.marks=marks;
	}
	public String toString()
	{
		return eid+" "+ename+" "+marks;
	}
	public void employee(Emp... em)
	{
		for(Emp e: em)
		{
			System.out.println(e);
		}
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		Emp emparr[]=new Emp[5];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter marks");
			int mark=sc.nextInt();
			Emp e1= new Emp(id,name,mark);
			emparr[i]=e1;
			
		}	
		Emp arr=new Emp();
		System.out.println("********************");
		arr.employee(emparr[0]);
		System.out.println("********************");
		arr.employee(emparr[0],emparr[1]);
		haSystem.out.println("********************");
	}
}
				