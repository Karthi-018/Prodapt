public class Employee{
    private static int idGenerator=100;
    private final int id;
    private String name;
    private long salary;
    private String designation;

    public Employee(String name, long salary,String designation) {
        this.id = idGenerator++;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee \n   id : " + id +"\n   name : " + name +"\n   salary : " + salary;
    }
}
