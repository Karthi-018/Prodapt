public class MultilevelInheritance{
	public static void main(String[] args){
		
		Employee employee = new Employee();
		employee.setEid(100);
		employee.setEname("arun");
		employee.setSalary(10_00_000);

		Manager manager = new Manager();
		manager.setDept("Cloud");

		Engineer engineer = new Engineer();

		Admin admin = new Admin();
	
		Director director = new Director();
		director.setBudget(10_00_00_000);

		System.out.println("========================================= EMPLOYEE ======================================================");	
		System.out.println(employee);
		System.out.println("========================================= MANAGER =======================================================");	
		System.out.println(manager);
		System.out.println("========================================= ENGINEER=======================================================");	
		System.out.println(engineer);
		System.out.println("========================================= ADMIN =======================================================");	
		System.out.println(admin);
		System.out.println("========================================= DIRECTOR ======================================================");	
		System.out.println(director);
	}
}

class Employee{
	private int eid;
	private String ename;
	private long salary;

	public void setEid(int eid){
		this.eid = eid;
	}
	
	public int getEid(){
		return this.eid;
	}

	public void setEname(String ename){
		this.ename = ename;
	}
	
	public String getEname(){
		return this.ename;
	}

	public void setSalary(long salary){
		this.salary = salary;
	}

	public long getSalary(){
		return this.salary;
	}

	public String toString(){
		return "Employee Eid : "+eid+"\nEmployee name : "+ename+"\nEmployee salary : "+salary+"\n";	
	}
}

class Manager extends Employee{
	private String dept;

	public void setDept(String dept){
		this.dept = dept;
	}
	
	public String getDept(){
		return this.dept;
	}

	public String toString(){
		return "Hi i am manager of "+dept+" department\n";
	}
}

class Engineer extends Employee{
	public String toString(){
		return "Hi i am engineer i can access Employee\n";
	}
}

class Admin extends Manager{
	public String toString(){
		return "Hi i am Admin i can access Manager and Employee\n";
	}
}

class Director extends Admin{
	private long budget;
	
	public void setBudget(long budget){
		this.budget = budget;
	}

	public long getBudget(){
		return this.budget;
	}

	public String toString(){
		return "Hi i am Director i can access AdminManager and Employee\n";
	}
}