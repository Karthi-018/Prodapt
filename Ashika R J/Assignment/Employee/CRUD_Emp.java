public class CRUD_Emp{
    private int id;
    private String name;
    private String dept;
    private double sal;

    public CRUD_Emp(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSal(){
        return sal;
    }
    public void setSal(double sal){
        this.sal=sal;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }

    public String toString(){
        return "Employee id: "+id+" , Employee name:"+name+" ,Department:"+dept+" ,Salary:"+sal;
    }


}