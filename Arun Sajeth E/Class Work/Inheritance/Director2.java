class Director2 extends Admin2
{
	private int Budget;
	
	Director2(String eName, int Eid, int sal, String dept, int Budget)
	{
		super(eName,Eid,sal,dept);
		this.Budget=Budget;
	}
	
	public void setBudget(int Budget)
	{
		this.Budget=Budget;
	}
	public int getBudget()
	{
		return Budget;
	}
	public void Display()
	{
		System.out.println("Directro2 Class");
	}
	
}
