class Manager extends Employee   //----------------------------> Child Class
{   
	
	private String dept;     //---------------> another attribute
	
	Manager(int eid,String ename,String dept) //-------------->Parameterized Constructor
	{
		super(eid,ename); //-------------------> goes to employee class
		this.dept=dept;
	
	}
	
	public void setDept(String dept)      //--------------------> getter and setter for new attribute
	{
		this.dept=dept;
	}
	public String getDept()
	{	
		super.display();
		display();
		return dept;
	}
	public void display()
	{
		System.out.println("Manager");
	}
}
