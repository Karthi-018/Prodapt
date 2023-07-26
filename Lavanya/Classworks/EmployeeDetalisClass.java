import java.util.Scanner;
class EmployeeDetalisClass
{
    String id;
    String name;
    String salary;

    EmployeeDetalisClass(){}

    public void setId(String id) {
        this.id = id;
    }

 
    public void setName(String name) {
        this.name = name;
    }

   
    public void setMark(String salary) {
        this.salary = salary;
    }
    public String toString()
    {
        return id+" \t"+name+" \t"+salary;
    }

    public  void employeeDetails(EmployeeDetalisClass... details)
    {
        for(EmployeeDetalisClass d:details)
        {
            System.out.println(d);
        }
    }

    public static void main(String args[])
    {

        Scanner s = new Scanner(System.in);
        EmployeeDetalisClass employeeDetails[] = new EmployeeDetalisClass[3];
        for(int i=0;i<3;i++) {
            System.out.println("Enter the Employee ID");
            String eid = s.next();
            System.out.println("Enter the Employee Name");
            String ename = s.next();
            System.out.println("Enter the Employee salary");
            String esalary = s.next();

            EmployeeDetalisClass employee = new EmployeeDetalisClass();
            employee.setId(eid);
            employee.setName(ename);
            employee.setMark(esalary);
            employeeDetails[i] = employee;

        }
        EmployeeDetalisClass emparr = new EmployeeDetalisClass();
        emparr.employeeDetails(employeeDetails);

    }


}
















