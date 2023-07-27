import java.util.*;
class Employee{
    private int eid;
    private String ename;
    private int sal;
    Employee(int eid,String ename,int sal){
        this.eid=eid;
        this.ename=ename;
        this.sal=sal;
    }
    public void setEid(int eid){
        this.eid=eid;
    }
    public int getEid(){
        return eid;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public String getEname(){
        return ename;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
    public int getSal(){
        return sal;
    }
}
//---------------------------------------------------------
class Manager extends Employee{
    private String dept;
    Manager(int eid,String ename,int sal,String dept){
        super(eid,ename,sal);
        this.dept=dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }
    public String toString(){
        return super.getEid()+" "+super.getEname()+" "+super.getSal()+" "+getDept();
    }
}
//---------------------------------------------------------------
class Engineer extends Employee{
    Engineer(int eid,String ename,int sal){
        super( eid,ename,sal);
    }
    public String toString(){
        return super.getEid()+" "+super.getEname()+" "+super.getSal();
    }
}
//--------------------------------------------------------------
class Admin extends Manager{
    Admin(int eid,String ename,int sal,String dept){
        super(eid,ename,sal,dept);
    }
    public String toString(){
        return super.getEid()+" "+super.getEname()+" "+super.getSal()+" "+super.getDept();
    }
}
//--------------------------------------------------------------
class Director extends Admin{
    private long budget;
    Director(int eid,String ename,int sal,String dept,long budget){
        super(eid,ename,sal,dept);
    }
    public String toString(){
        return super.getEid()+" "+super.getEname()+" "+super.getSal()+" "+super.getDept()+" "+getBudget();
    }
    public void setBudget(long budget){
        this.budget=budget;
    }
    public long getBudget(){
        return budget;
    }
}
//-------------------------------------------------------------
public class Main_m{
    public static void main(String args[]){
        Manager obj=new Manager(12,"Ram",20000,"CS");
        System.out.println(obj);
        Engineer o=new Engineer(11,"Sita",10000);
        System.out.println(o);
    }
}
//----------------------------------------------------------------
