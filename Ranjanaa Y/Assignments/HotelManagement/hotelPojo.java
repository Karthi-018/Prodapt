class hotelPojo
{
	int id,rate;
    String name,desc,fac;

    public hotelPojo(int id,String name, String desc,String fac,int rate) 
	{
		this.id = id;
        this.name = name;
        this.desc = desc;
		this.fac = fac;
		this.rate = rate;
    }
	public int getId()
	{
		return id;
	}
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
	public String getFac()
	{
		return fac;
	}
	public int getRate()
	{
		return rate;
	}
	public void setId(int id) 
	{
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
	public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setFac(String fac) {
        this.fac = fac;

    }
	public void setRate(int rate) {
        this.rate = rate;
    }
    public String toString()
    {
        return id+" "+name+" "+desc" "+fac" "+rate;
    }
}
