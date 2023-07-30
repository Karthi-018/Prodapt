class Manager2 extends Employee2
{
	private String dept;

	Manager2(String eName, int Eid, int sal, String dept)
	{
		super(eName,Eid,sal);
		this.dept=dept;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	public void Display()
	{
		System.out.println("Manager2 Class");
	}
	
}
