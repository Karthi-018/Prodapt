public class Employee 
{
    private byte id;
    private String name;
    private int salary;

    Employee(byte id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {}

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class Operation {
    private Employee[] emp;
    private int index;
    Operation(int size){
        emp=new Employee[10];
    }
    public void createEmployee(Employee e){
        emp[index++]=e;
    }
    public void displayEmployee(){
        for(int i=0;i< emp.length;i++){
            if (emp[i]!=null){
                System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSalary());
            }
        }
    }
    public boolean delete(int id){
        boolean status=false;
        for(int i=0;i< emp.length;i++){
            if (emp[i]!=null){
                if(emp[i].getId()==id){
                    emp[i]=null;
                    status=true;
                }
            }
        }
        return status;
     }
    public Employee searchById(int id){
        Employee em=null;
        for(int i=0;i< emp.length;i++){
            if (emp[i]!=null){
                if(emp[i].getId()==id){
                    em=emp[i];
                }
            }
        }
        return em;
    }

}
