class Employee1
{
private int eid;
private String eName;
private long esalary;
public void seteid(int id)
{
eid=id;
}
public int geteid()
{
return eid;
}
public void seteName(String Name)
{
eName=Name;
}
public String geteName()
{
return eName;
}
public void setesalary(long salary)
{
esalary=salary;
}
public long getesalary()
{
return esalary;
}
public String toString()
{
return eid+" "+eName+" "+esalary;
}
public void employ (Employee1...ar)
{  
for(Employee1 a : ar){
System.out.println(a);
} 
} 
}