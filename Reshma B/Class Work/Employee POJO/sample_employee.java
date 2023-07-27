package sample;
class sample_employee
{
	int eid;
	String ename;
	String des;
	long salary;

	public String toString()
	{
		return eid+" "+ename+" "+des+" "+salary;
	} 
	
	public sample_employee(){
	}

	public sample_employee(int eid,String ename,String des,long salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.des=des;
		this.salary=salary;
	}

	public void seteid(int eid) 
	{
    		this.eid = eid;
  	}
	
	public int geteid() 
	{  
    		return eid;  
	} 

	public void setename(String ename) 
	{
    		this.ename = ename;
  	}

	public String getename() 
	{  
    		return ename;  
	}  

	public void setdes(String des) 
	{
    		this.des = des;
  	}

	public String getdes() 
	{  
    		return des;  
	} 

	public void setsalary(long salary) 
	{
    		this.salary = salary;
  	}

	public long getsalary() 
	{  
    		return salary;  
	}

	public void details(sample_employee...deets)
	{
		for(sample_employee d: deets)
		{
			System.out.println(d);
		}
	}
}