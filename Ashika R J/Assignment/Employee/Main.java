import java.util.*;
public class Main 
{
    public static void main(String a[]) 
    {
        Scanner sc=new Scanner(System.in);
        Operation opt=new Operation(10);
        System.out.println("Enter Employee Details");
        for (int i=0;i<10;i++)
   	{
            Employee e1=new Employee();
            System.out.println("Enter "+(i++)+ "Employee Id");
            int id= sc.nextInt();
            System.out.println("Enter "+(i++)+ "Employee Name");
            String name= sc.next();
            System.out.println("Enter "+(i++)+ "Employee 'Salary");
            int salary= sc.nextInt();
            e1.setId(id);
            e1.setName(name);
            e1.setSalary(salary);
            opt.createEmployee(e1);
        }
        do 
	{
           System.out.println("Press 1_Create");
           System.out.println("Press 2_Update");
           System.out.println("Press 3_Search");
           System.out.println("Press 4_Display");
           System.out.println("Press 5_Delete");
           System.out.println("Enter your Option: ");
           int Option= sc.nextInt();

           switch (Option)
	  {
               case 1:
                   opt.createEmployee();
                   break;
               case 3:
                   System.out.println("Enter Employee Id");
                   Employee em=opt.searchById(sc.nextInt());
                   if (em!=null){
                       System.out.println(System.out.println(em.getId()+"\t"+em.getName()+"\t"+em.getSalary()));}
                   break;
               case 4:
                   opt.displayEmployee();
                   break;
               case 5:
                   System.out.println("Enter Id to delete:-");
                   opt.delete();
                   break;
               default:
                   System.out.println("INVALID!!");
           }
           System.out.println("Want to Continue? Y/N");
          }
       }