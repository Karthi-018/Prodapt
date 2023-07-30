import java.util.*;
class Employee {
    private String name;
    private String id;
    private String department;
    private String designation;
    private double salary;
    public Employee(String name, String id, String department, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary= " + salary +
                '}';
    }
}
class Main{
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Fazi","100","CSE","Trainee",1500.00));
        employees.add(new Employee("Ajith","101","CSE","Trainee",1400.00));
        employees.add(new Employee("dhanush","102","CSE","Trainee",1300.00));
        employees.add(new Employee("vijay","103","CSE","Trainee",1500.00));
        employees.add(new Employee("ganesh","104","CSE","Trainee",1560.00));
        employees.add(new Employee("tamil","105","CSE","Trainee",12310.00));
        employees.add(new Employee("Arun","106","CSE","Trainee",1200.00));
        employees.add(new Employee("Mohan","107","CSE","Trainee",190.00));
        employees.add(new Employee("logesh","108","CSE","Trainee",120880.00));
        employees.add(new Employee("Thareun","109","CSE","Trainee",12070.00));
        Employee employeeToUpdate = employees.get(3);
        employeeToUpdate.setName("Mohammed");
        employeeToUpdate.setId("123");
        employeeToUpdate.setDepartment("cse");
        employeeToUpdate.setDesignation("trainee");
        employeeToUpdate.setSalary(4000.00);
        System.out.println(employees+"\n");
        System.out.println(employees.get(3));
        employees.remove(2);
        employees.set(3, employeeToUpdate);
        System.out.println(employees);

    }
}