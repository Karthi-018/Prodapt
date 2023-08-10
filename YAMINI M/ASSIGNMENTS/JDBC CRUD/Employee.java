package edu.prodapt.crud;

public class Employee {

	    private int eid;
	    private String ename;
	    private long salary;
	    private String design;
	    Employee(){}

	    public Employee(int eid, String ename, long salary, String design) {
	        this.eid = eid;
	        this.ename = ename;
	        this.salary = salary;
	        this.design = design;
	    }

	    public int getEid() {
	        return eid;
	    }

	    public void setEid(int eid) {
	        this.eid = eid;
	    }

	    public String getEname() {
	        return ename;
	    }

	    public void setEname(String ename) {
	        this.ename = ename;
	    }

	    public long getSalary() {
	        return salary;
	    }

	    public void setSalary(long salary) {
	        this.salary = salary;
	    }

	    public String getDesign() {
	        return design;
	    }

	    public void setDesign(String design) {
	        this.design = design;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "eid=" + eid +
	                ", ename='" + ename + '\'' +
	                ", salary=" + salary +
	                ", design='" + design + '\'' +
	                '}';
	    }

}
