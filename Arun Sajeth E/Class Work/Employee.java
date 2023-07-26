package test1;

class Employee
{
	private int eid;
	private String eName;
	private String dest;
	private int salary;

	Employee()     //Constructor
	{
		eid=1;
		eName="Arun";
		dest="Trainer";
		salary=10000;
	}

	public void setemployee(int id, String name, String des, int sal)
	{
		eid=id;
		eName=name;
		dest=des;
		salary=sal;
	}

	public void getemployee()
	{
		System.out.println(eid);
		System.out.println(eName);
		System.out.println(dest);
		System.out.println(salary);
	}
	
	public String toString()
	{
		return eid+" "+" "+eName+" "+dest+" "+salary;
	}

}