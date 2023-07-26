class Manager extends Employee1
{
	private String dept;
	Manager(int eid, String eName, String dept)
	{
		super(eid,eName);
	}
	public void setDept(String dept)
	{
		this.dept =  dept;
	}
	public String getDept()
	{
		return dept;
	}
}