import java.util.*;

public class MainCRUD
{
	static Scanner sc = new Scanner(System.in);
	static Service empservice = new Service();

    static void choice()
    {
        System.out.println("--------------------EMPLOYEE MANAGEMENT SYSTEM--------------------");
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("Press 1 to CREATE NEW EMPLOYEE DETAILS");
        System.out.println("Press 2 to UPDATE EMPLOYEE DETAILS");
        System.out.println("Press 3 to SEARCH EMPLOYEE DETAILS");
        System.out.println("Press 4 to DISPLAY EMPLOYEE DETAILS");
        System.out.println("Press 5 to DELETE EMPLOYEE DETAILS");
        System.out.println("Press 6 to LEAVE THE APPLICATION");
        int c = sc.nextInt();
        switchbetween(c);
    }

    static void switchbetween(int c)
    {
        switch(c)
        {
            case 1:
                System.out.println("ENTER DETAILS TO BE ADDED");
                System.out.println("ENTER THE EMPLOYEE ID: ");
                int ID = sc.nextInt();
                System.out.println("ENTER THE EMPLOYEE NAME: ");
                String name = sc.next();
                System.out.println("ENTER THE EMPLOYEE DESIGNATION: ");
                String d = sc.next();
                System.out.println("ENTER THE SALARY: ");
                long sl = sc.nextLong();
                Details newd[] = Service.createemp(new Details(ID, name, d, sl));
                for(int i=0;i<newd.length;i++)
                {
                    System.out.println(newd[i]);
                }    
                choice();
                break;
            case 2:
                System.out.println("GIVE THE DETAILS TO BE UPDATED");
                int uid=sc.nextInt();
                Details uemp = Service.findemp(uid);
                if(uemp != null)
                {
                    System.out.println("CHOOSE AN OPTION");
                    System.out.println("CHOOSE 1 TO UPDATE NAME OF THE EMPLOYEE");
                    System.out.println("CHOOSE 2 TO UPDATE DESIGNATION OF THE EMPLOYEE");
                    System.out.println("CHOOSE 3 TO UPDATE SALARY OF THE EMPLOYEE");
                    int uc=sc.nextInt();
                    switch(uc)
                    {
                        case 1:
                            System.out.println("ENTER THE NAME TO BE UPDATED");
                            uemp.setename(sc.next());
                            break;
                        case 2:
                            System.out.println("ENTER THE DESIGNATION TO BE UPDATED");
                            uemp.setdes(sc.next());
                            break;
                        case 3:
                            System.out.println("ENTER THE SALARY TO BE UPDATED");
                            uemp.setsal(sc.nextLong());
                            break;
                    }
                }
                System.out.println(uemp);
                
                choice();
                break;
            case 3:
                System.out.println("SEARCH FOR: ");
                int eid = sc.nextInt();
                Details emp = Service.findemp(eid);
                if (emp != null)
                {
                    System.out.println(emp);
                }
                else
                {
                    System.out.println("INFORMATION ALREADY EXISTS");
                }
                choice();
                break;
            case 4:
                Details list[] = Service.employee();
                for(int i=0;i<list.length;i++)
                {
                    System.out.println(list[i]);
                }
                choice();
                break;
            case 5:
               Details newArr[] = Service.deleteemp();
               for(Details empDetails : newArr)
               {
                System.out.println(empDetails);
               }
                choice();
                break;
            case 6:
                System.exit(0);
                break;
            default:
        }
    }

    public static void main(String args[])
    {
        Service.empList();
        choice();
    }
}