package pojo;
import java.util.*;
class Org_Empdetails{
	private int eid;
	private String Name;
	private String desg;
	private long sal;
Org_Empdetails()
{
	eid=0;
	Name=null;
	desg=null;
	sal=0;
}
public void seteid (int eid){
	this.eid=eid;
	}
public int geteid(){
	return eid;
	}
public void setName (String Name){
	this.Name=Name;
	}
public String getName(){
	return Name;
	}
public void setdesg (String desg){
	this.desg=desg;
	}
public String getdesg(){
	return desg;
	}
public void setsal (long sal){
	this.sal=sal;
	}
public long getsal(){
	return sal;
	}

public String toString()
{
	return eid+" "+Name+" "+desg+" "+sal;
	
}
public void Org_Emp(Org_Empdetails...emp)
{
	for(Org_Empdetails e:emp)
        {
		System.out.println(e);
	}
}

}
