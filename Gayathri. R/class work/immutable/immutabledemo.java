class immutabledemo
{
private int eid;
private String ename;
immutabledemo(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}
public void setEid(int eid)
{
this.eid=eid;
}
public int getEid()
{
return eid;
}
public void setEname(String ename)
{
this.ename=ename;
}
public String getEname()
{
return ename;
}
}