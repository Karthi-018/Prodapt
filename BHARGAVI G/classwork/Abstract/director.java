class director extends admin
{
	int budget;
public director(int eid,String eName,long esalary,String dept,int budget)
{
	super(eid,eName,esalary,dept);
	this.budget=budget;
}
public void setbudget(int budg)
{
	budget=budg;
}
public int getbudget()
{
return budget;
}
}
