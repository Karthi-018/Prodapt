package empman;

import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    static Employee_Service es = new Employee_Service();
    
    public static void user_Choice()
    {
        int choice;
        do
        {
	    System.out.println();
            System.out.println("1. Create");
            System.out.println("2. Update");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Display");
            System.out.println("6. Exit");
	    System.out.println();
            
	    System.out.print("Enter your choice:");
            choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    es.create_Employee();
                    break;
                case 2:
                    es.update_Employee();
                    break;
                case 3:
                    es.search_Employee();
                    break;
                case 4:
                    es.delete_Employee();
                    break;
                case 5:
                    es.display_Employee();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:System.out.println("Invalid Choice");
            }
        }while(choice>0 &&choice<7);
    }
    
    
    public static void main(String[] a)
    {
        es.initalArray();
        user_Choice();
    }
}