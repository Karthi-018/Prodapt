class Employee {
    private int eid;
    private String eName;
    private int sal;
    Employee(int eid, String eName, int sal) {
        this.eid = eid;
        this.eName = eName;
        this.sal = sal;
    }
    public int getEid() {
        return eid;
    }
    public void setEname(String eName) {
        this.eName = eName;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return eName;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public int getSal() {
        return sal;
    }
    public String toString() {
        return "Employee Details\nid:"+eid+"\nName:"+eName+"\nSalary:"+sal;
    }
}
class  Manager extends  Employee {
    private String dept;
    Manager(int eid, String eName, int sal, String dept) {
        super(eid, eName, sal);
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String toString() {
        return "Manager Details\nid:"+super.getEid()+"\nName:"+getEname()+"\nSalary:"+super.getSal()+"\ndepartment:" + dept;
    }
}
class Engineer extends Employee{
     Engineer(int eid, String eName, int sal) {
        super(eid, eName, sal);
    }
    public String toString() {
        return "Engineer details\nid:"+super.getEid()+"\nName:"+super.getEname()+"\nSalary:"+super.getSal();
    }
}
class Admin extends  Manager{
    Admin(int eid, String eName, int sal, String dept) {
        super(eid, eName, sal, dept);
    }
    public String toString() {
        return "Admin details\nid:"+super.getEid()+"\nName:"+getEname()+"\nSalary:"+super.getSal()+"\ndepartment:" + super.getDept();
    }
}
class Director extends Admin{
    private double budget;
    public Director(int eid, String eName, int sal, String dept, double budget) {
        super(eid, eName, sal, dept);
        this.budget = budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }
    public String toString() {
        return "Director details\nid:"+super.getEid()+"\nName:"+getEname()+"\nSalary:"+super.getSal()+"\ndepartment:" + super.getDept()+"\nbudget:" + budget;
    }
}
public class MultiLevelInheritance{
public static void main(String[] args)
{
    Employee ep=new Employee(100,"sam",25000);
    Manager emp=new Manager(101,"popo",10000,"Senior Manager");
    Admin ad=new Admin(102,"shifi",20000,"IT");
    Director dir=new Director(103,"renu",30000,"CSE",50000d);
    Employee eng=new Engineer(106,"riya",0);
    System.out.println(emp+"\n______________________");

    System.out.println(ad+"\n______________________");
    System.out.println(dir+"\n______________________");
    System.out.println(ep+"\n______________________");
    System.out.println(eng);
}
}
