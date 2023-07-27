class manager extends EmployeeInheritence
{
	String dept;
public manager(int eid,String eName,long esalary,String dept)
{
	super(eid,eName,esalary);
	this.dept=dept;
}
public void setdept(String dep)
{
	dept=dep;
}
public String getdept()
{
return dept;
}
}