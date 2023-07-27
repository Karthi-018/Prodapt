class Director extends Admin
{
	long budget;
public Director(int eid,String eName,long sal,String dept,long budget)
{
	super(eid,eName,sal,dept);
	this.budget=budget;
}
public void setBudget(long budgets)
{
	budget=budgets;
}
public long getBudget()
{
	return budget;
}
}