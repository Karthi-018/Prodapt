public class Manager extends Employee{
    String dept;

    public Manager(int eid,String eName,int salary,String dept) {
        super(eid,eName,salary);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
