class Employee2
{
	private String eName;
	private int Eid;
	private int sal;

	Employee2(String eName, int Eid, int sal)
	{
		this.eName=eName;
		this.Eid=Eid;
		this.sal=sal;
	}
	public void setName(String eName)
	{
		this.eName=eName;
	}
	public String getName()
	{
		return eName;
	}

	public void setEid(int Eid)
	{
		this.Eid=Eid;
	}
	public int getEid()
	{
		return Eid;
	}
	
	public void setsal(int sal)
	{
		this.sal=sal;
	}
	public int getsal()
	{
		return sal;
	}
	public void display()
	{
		System.out.println("Employee2 Class");
	}
	
}