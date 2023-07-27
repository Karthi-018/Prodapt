class Manager extends Employee
{

	private String dept;

	

	Manager(int eId, String eName, long sal, String dept)
	{
		super(eId, eName, sal);
		this.dept = dept;
	}

	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String getDept()
	{
		return dept;
	}
}