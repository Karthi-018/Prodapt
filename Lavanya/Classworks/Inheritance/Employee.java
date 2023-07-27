public class Employee {
   private  int eid;
    private String eNme;
   private  int salary;

    public int getEid() {
        return eid;
    }

    public Employee(int eid, String eNme, int salary) {
        this.eid = eid;
        this.eNme = eNme;
        this.salary = salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteNme() {
        return eNme;
    }

    public void seteNme(String eNme) {
        this.eNme = eNme;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public static void main(String[] args) {
         Admin obj=new Admin(123,"lavanya",23456,"cs");
         obj.setSalary(123445);
         obj.setEid(123);
        System.out.println(obj.getSalary());


    }
}
