import java.util.Scanner;

public class CreateEmployee {
    Scanner sc = new Scanner(System.in);
    public void create(){
        System.out.println("Enter the Employee ID");
        int empId = sc.nextInt();
        System.out.println("Enter the Employee Name");
        String empName = sc.next();
        System.out.println("Enter the Employee salary");
        long empSalary = sc.nextLong();
        boolean idExist = false;
        for(Employee create:DataBase.data){
            if(empId == create.getEmpId()){
                idExist = true;
                break;
            }
        }
        if(!idExist){
            Employee[] data=createArray(DataBase.data, empId, empName, empSalary);
            System.out.println("New employee created successfully");
            for(Employee details:data){
                System.out.println(details);
            }
        }
        else{
            System.out.println("ID already exits");
        }
    }

    public Employee[] createArray(Employee[] data, int empId, String empName, long empSalary){
        Employee[] arr = new Employee[(data.length)+1];
        System.arraycopy(data, 0, arr, 0, data.length);
        arr[data.length]=new Employee(empId, empName, empSalary);
        return arr;

    }
}
