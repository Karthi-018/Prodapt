class Emp
{
 int eid;
 String ename;
 private int sal;

 public int geteid(){
  return eid;
  }

 public void seteid(int eid){
  this.eid=eid;
  }

 public String getename(){
  return ename;
  }

 public void setename(String ename){
  this.ename=ename;
  }

 public int getsal(){
  return sal;
  }

 public void setsal(int sal){
  this.sal=sal;
  }
}



class Manager extends Emp
{
 String dept;

 public String getdept(){
  return dept;
  }

 public void setdept(String dept){
  this.dept=dept;
  }
}


class Admin extends Manager
{
}


class Eng extends Emp
{
}


class Director extends Admin
{
 private int budget;
 
public int getbudget(){
  return budget;
  }

 public void setbudget(int budget){
  this.budget=budget;
  }
}


class Main
{
 public static void main(String a[])
 {
  Emp e;
  e=new Emp();
  e=new Manager();
  e=new Admin();
  e=new Eng();
  e=new Director();
  e.setename("sree");
  e.seteid(1);
  e.setsal(200000);
  e.setbudget(3000000);
  e.setdept("HR")
  System.out.println("Name:"+e.getename());
  System.out.println("ID:"+e.geteid());
  System.out.println("Salary:"+e.getsal());
  
 }
}