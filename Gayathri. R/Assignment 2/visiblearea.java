import java.util.*;
class visiblearea
{
public static void main(String a[])
{
    System.out.println("enter 1 to show the options to perform")
      
    Scanner s=new Scanner(System.in);
    int choice=s.nextInt();
    employeeAssignment access=new employeeAssignment();
    switch(choice)
    {
        case 1:
            System.out.println("\n 2.create employee \n3.find employee\n 4. delete employee\n 5.update employee");
            break;
        case 2:
            access.create();
            break;
        case 3:
            access.search();
            break;
        case 4:
            access.delete();
            break;
        default:
            System.out.println("exit");
    }

        
    }
    

}
