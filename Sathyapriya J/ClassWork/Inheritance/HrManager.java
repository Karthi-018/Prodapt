class HrManager extends Manager       //---------------> Multilevel Inheritance (Employee -----> Manager -----> HR)

//class HrManager extends Employee         //---------------> Heirachical Inheritance
{
	String RepManager;

	HrManager ( int eid , String ename , String RepManager)
	{
		super(eid,ename);
		this.RepManager = RepManager;
	}
	public void setRepManager(String RepManager)
	{
		this.RepManager = RepManager;
	}
	public String getRepManager()
	{
		return RepManager;
	}
}