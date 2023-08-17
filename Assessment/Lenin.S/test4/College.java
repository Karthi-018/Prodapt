package test4;


class College
{
	private String name;
	private String website;
	private String founder;
	private String mobile;
	private String location;
	private int numberOfDept;
	private Date startingdate;

	
	public int getNumberOfDept()
	{
		return numberOfDept;
	}

	public void setNumberOfDept(int numberOfDept) 
	{
		this.numberOfDept = numberOfDept;
	}

	public Date getStartingDate() 
	{
		return startingDate;
	}

	public void setStartingDate(Date startingDate) 
	{
		this.startingDate = startingDate;
	}

	private Date startingDate;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getWebsite() 
	{
		return website;
	}

	public void setWebsite(String website)
	{
		this.website = website;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public int getNumofdept() {
		return numofdept;
	}

	public void setNumofdept(int numofdept) {
		this.numofdept = numofdept;
	}

	public Date getStartingdate()
	{
		return startingdate;
	}

	public void setStartingdate(Date startingdate)
	{
		this.startingdate = startingdate;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", website=" + website + ", founder=" + founder + ", mobile=" + mobile
				+ ", location=" + location + ", numberOfDept=" + numberOfDept + "]";
	}

	
	
	
	
	
	

}
