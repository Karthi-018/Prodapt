class Director1 extends Admin1
{
	int budget;	

	Director1(int eid,String ename,int salary,String dept,int budget)
	{
		super(eid,ename,salary,dept);
		this.budget = budget;
		
	}
	public void setBudget(int budget)
	{
		this.budget = budget;
	}
	public int getBudget()
	{
		return budget;
	}
	
}