class Employee    //------------------------> Parent Class
{
	int eid;	//------------------------> attributes
	String ename;
	
	Employee(int eid,String ename) //--------------->parameterized constructor or default constructor
	{
		this.eid=eid;
		this.ename=ename;
	}

	public void setEid(int eid)           //---------------------> Getters and Setters
	{
		this.eid = eid;               //----------------------> "This" keyword is a predefined keyword,points to current attribute.
	}
	public int getEid()
	{
		return eid;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public String getEname()
	{
		return ename;
	}
	public void display()
	{
		System.out.println("Employee");
	}
} 