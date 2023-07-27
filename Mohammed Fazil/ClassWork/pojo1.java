
class Employee
{
public static void main(String[] args)
{
Employee emp = new Employee();
emp.seteid(123);
emp.setename("Fazil");
System.out.println("Employee Id : " +emp.geteid()+"and Name : "+ emp.getename());
Employee emp1 = new Employee(123,"Karthick");
System.out.println("Employee Id : " +emp1.geteid()+"and Name : "+ emp1.getename());
}
int eid;
String ename;

public Employee(){
}
public Employee(int eid ,String ename){
this.eid = eid;
this.ename= ename;
}
public int geteid(){
return eid;
}
public void seteid(int eid){
this.eid=eid;
}
public String getename(){
return ename;
}
public void setename(String ename)
{
this.ename=ename;
}
}
