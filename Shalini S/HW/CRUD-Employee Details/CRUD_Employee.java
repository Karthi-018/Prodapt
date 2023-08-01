public class CRUD_Employee{
    private int id;
    private String name;
    private String dept;
    private double sal;

    //-------------------------------------------Parameterised constructor----------------------------------------------
    public CRUD_Employee(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }
    //---------------------------------Geter and Seter methods----------------------------------------------------------
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

    //------------------------------------to string method to display output--------------------------------------------
    public String toString(){
        return "Employee id: "+id+" , Employee name:"+name+" ,Department:"+dept+" ,Salary:"+sal;
    }


}

