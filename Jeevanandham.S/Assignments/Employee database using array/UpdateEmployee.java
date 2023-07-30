import java.util.Scanner;

public class UpdateEmployee {
    Scanner sc = new Scanner(System.in);
    public void update(){
        System.out.println("Enter the id to update");
        int empId = sc.nextInt();
        String name;
        long sal;
        boolean idExist = false;
        for(Employee update:DataBase.data){

            if(empId == update.getEmpId()){
                idExist = true;
                name = update.getEmpName();
                sal = update.getEmpSalary();
                System.out.println("Registered name: "+name);
                System.out.println("Registered salary: "+sal);
                System.out.println("Enter the new Name");
                update.setEmpName(sc.next());
                System.out.println("Enter the new salary");
                update.setEmpSalary(sc.nextLong());
                if(!name.equals(update.getEmpName()) || sal!=update.getEmpSalary()){
                    System.out.println("Updated successfully");
                }
                else{
                    System.out.println("Your attempt to update the database is unsuccessful");
                }
            }
        }
        if(!idExist){
            System.out.println("Id not found");
        }
        else{
            for(Employee details:DataBase.data){
                System.out.println(details);
            }
        }


    }


}
