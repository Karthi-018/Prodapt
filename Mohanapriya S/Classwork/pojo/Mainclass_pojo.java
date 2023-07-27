import java.util.*;
class Mainclass_pojo
{
   public static void main(String a[]);
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number of Employees " ) ;
   int n=s.nextInt();
   pojo arr[]=new pojo[n];
   for(int i=0;i<n;i++)
   {
    pojo employ=new pojo();

    System.out.println("Employee id: ");
    int eid=s.nextInt();
    employ.setdetails(eid);
    System.out.println("Employee name: ");
    String name=s.next();
    employ.setdetails(eName);
    System.out.println("Employee salary: ");
    int eSalary=s.nextInt();
    employ.setdetails(eSalary);

    arr[i]=employ;

   }
   public void displaydetails(pojo...employ)
   {
    for(pojo p:employ)
    {
        System.out.println(p);
    }
   }


}



