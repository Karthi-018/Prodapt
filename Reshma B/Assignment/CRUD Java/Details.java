public class Details
{
	private int eid;
	private String ename;
	private String des;
	private long sal;

	public Details(int eid, String ename, String des, long sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.des=des;
		this.sal=sal;
	}

	public void seteid(int eid)
	{
		this.eid=eid;
	}

	public int geteid()
	{
		return eid;
	}

	public void setename(String ename)
	{
		this.ename=ename;
	}

	public String getename()
	{
		return ename;
	}

	public void setdes(String des)
	{
		this.des=des;
	}

	public String getdes()
	{
		return des;
	}

	public void setsal(long sal)
	{
		this.sal=sal;
	}

	public long getsal()
	{
		return sal;
	}

	public String toString()
	{
		return "Employee[" + "ID:" + eid + ", Name:" + ename + ", Designation:" + des + ", Salary:" + sal + "]";
	}
}