import java.util.Scanner;

public class SearchEmployee {
    Scanner sc = new Scanner(System.in);
    public void search(){
        System.out.println("Enter the id to search");
        int empId = sc.nextInt();
        boolean idExist = false;
        for(Employee details: DataBase.data){
            if(empId == details.getEmpId()){
                idExist = true;
                System.out.println(details);
            }
        }
        if(!idExist){
            System.out.println("ID does not exists");
        }
    }
}
