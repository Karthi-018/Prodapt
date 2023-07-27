class Employee
{
	 private int eId;
	 private String eName;
	 private long sal;

	
	Employee(int eId, String eName, long sal)
	{
		this.eId = eId;
		this.eName = eName;
		this.sal = sal;	
	}


	public void setEid(int eId)
	{
		this.eId = eId;
	}
	public int getEid()
	{
		return eId;
	}



	public void setEname(String eName)
	{
		this.eName = eName;
	}
	public String getEname()
	{
		return eName;
	}



	public void setSalary(long sal)
	{
		this.sal = sal;
	}
	public long getSalary()
	{
		return sal;
	}
}