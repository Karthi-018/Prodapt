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
        return super.getEid()+" "+super.getEname()+super.getSal()+" "+getDept();
    }
}
public class Main_ma{
    public static void main(String args[]){
        Manager obj=new Manager(12,"Ram",20000,"CS");
        System.out.println(obj);

    }
}