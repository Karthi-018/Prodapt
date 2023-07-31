package example.service;

public class Employee{

    private int id;
    private String name;
    private int salary;


    public Employee(int id ,String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee \n   id : " + id +"\n   name : " + name +"\n   salary : " + salary ;
    }
}