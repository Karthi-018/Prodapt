package crudJdbc;

public class crudJDBC 
{
	private int eid;
	private String ename;
	private String sal;
	
	public crudJDBC()
	{}
	
	public crudJDBC(int eid, String ename, String sal) 
	{
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEid() 
	{
		return eid;
	}

	public void setEid(int eid) 
	{
		this.eid = eid;
	}

	public String getEname() 
	{
		return ename;
	}

	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	public String getSal() 
	{
		return sal;
	}

	public void setSal(String sal) 
	{
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "crudJDBC [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
}
