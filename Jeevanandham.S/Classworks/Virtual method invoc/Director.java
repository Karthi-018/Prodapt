class Director extends Admin
{
	private long budget;
	

	Director(int eId, String eName, long sal, String dept, long budget)
	{
		super(eId, eName, sal, dept);
		this.budget = budget;
	}

	public void setBudget(long budget)
	{
		this.budget = budget;
	}
	public long getBudget()
	{
		return budget;
	}
}