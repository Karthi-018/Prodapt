class Manager extends Employee
{
private String dept;
Manager()
{
super(101,"XYZ");
}
public void setDept(String dept)
{
this.dept=dept;
}
public String getDept()
{
return dept;
}
