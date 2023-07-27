class Manager extends EmployeeInheritance
{
	String dept;
public Manager(int eid,String eName,long sal,String dept)
{
	super(eid,eName,sal);
	this.dept=dept;
}
public void setDept(String department)
{
	dept=department;
}
public String getDept()
{
	return dept;
}
}