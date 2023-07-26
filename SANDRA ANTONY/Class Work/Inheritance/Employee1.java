
class Employee1
{
    private int eid;
    private String eName;
    
    Employee1(int eid, String eName)

    {
	this.eid=eid;
	this.eName=eName;
    }
    
    public void setEid(int eid)
    {
        this.eid=eid;
    }
    public int getEid()
    {
        return eid;
    }
    public void setEname(String eName)
    {
        this.eName=eName;
    }
    public String getEname()
    {
        return eName;
    }
    
}
