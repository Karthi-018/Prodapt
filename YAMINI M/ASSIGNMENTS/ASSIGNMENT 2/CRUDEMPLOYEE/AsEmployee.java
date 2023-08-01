 class AsEmployee{
  
    private int id;
    private String name;
    private long salary;
    private String designation;
    private String department;

    public AsEmployee(String name, long salary,String designation,String department)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
	this.department = department;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    
    public void setSalary(long salary) 
    {
        this.salary = salary;
    }

    public long getSalary()
    {
        return salary;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
     
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    

    @Override
    public String toString() {
        return "Employee \n   ID : " + id +"\n   Name : " + name +"\n   Salary : " + salary +"\n   Designation : " + designation +"\n Department : " +department ;
    }
}