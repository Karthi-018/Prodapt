class Manager1 extends Employee1 
{
	String dept;
	

	Manager1(int eid,String ename,int salary,String dept)
	{
		super(eid,ename,salary);
		this.dept = dept;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	
	
		
}
	