import java.util.Scanner;

public class DeleteEmployee {
    Scanner sc = new Scanner(System.in);
    public void delete(){
        System.out.println("Enter the id to be deleted");
        int empId = sc.nextInt();
        boolean idExist = false;
        for(Employee delete:DataBase.data){
            if(empId == delete.getEmpId()){
                idExist = true;
                System.out.println("Deleting details: Id= "+delete.getEmpId()+" Name= "+delete.getEmpName()+" Salary= "+delete.getEmpSalary());
                break;
            }
        }
        if(!idExist){
            System.out.println("ID does not exists");
        }
        else{
            System.out.println("Are you sure to delete the details yes/no");
            String decide = sc.next();
            if(decide.equalsIgnoreCase("yes")) {
                Employee[] arr = deleteArray(DataBase.data, empId);
                System.out.println("Deleted successfully");
                for (Employee details : arr) {
                    System.out.println(details);
                }
            }
            else{
                System.out.println("Deletion cancelled...");
            }
        }
    }

    public Employee[] deleteArray(Employee[] data,int empId){
        Employee[] arr = new Employee[data.length-1];
        int count1=0;
        int count2=0;
        for(Employee details:data){

            if(details.getEmpId()!=empId){
                arr[count2]=data[count1];
                count2++;
            }
            count1++;
        }

        return arr;

    }
}
