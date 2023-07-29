import java.util.*;

class Employee
{
    private int EmpId ;
    private String EmpName;
    private long EmpSalary;
    Employee(int EmpId, String EmpName, long EmpSalary)
    {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpSalary=EmpSalary;
    }

    public int getEmpId()
    {
        return EmpId;
    }
    public  String getEmpName()
    {
        return EmpName;
    }
    public long getEmpSalary()
    {
        return EmpSalary;
    }
    public String toString()
    {
        return EmpId + "\t" + EmpName + "\t" + EmpSalary;
    }
}
public class CRUDTask {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        List<Employee> c = new ArrayList<Employee>();
        do {
            System.out.println("1.CREATE");
            System.out.println("2.UPDATE");
            System.out.println("3.SEARCH");
            System.out.println("4.DISPLAY");
            System.out.println("5.DELETE");
            System.out.println("ENTER THE CHOICE:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the EmpId:");
                    int empId = sc.nextInt();
                    System.out.print("Enter the EmpName:");
                    String empName = sc.next();
                    System.out.print("Enter the EmpSalary:");
                    long empSalary = sc.nextLong();
                    c.add(new Employee(empId,empName,empSalary));
                    break;
                case 2:
                    boolean found = false;
                    System.out.println("Enter EmpId to Update:");
                    empId=sc.nextInt();
                    ListIterator<Employee> li = c.listIterator();
                    while(li.hasNext())
                    {
                        Employee e = li.next();
                        if(e.getEmpId()==empId) {
                            System.out.println("Enter the new EmpName:");
                            empName = sc.next();
                            System.out.println("Enter the new EmpSalary:");
                            empSalary = sc.nextLong();
                            li.set(new Employee(empId,empName,empSalary));
                            found = true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("DATA Not found");
                    }
                    else {
                        System.out.println("Data Updated Successfully");
                    }
                    break;

                case 3:
                    found = false;
                    System.out.println("Enter EmpId to Search:");
                    empId=sc.nextInt();
                    Iterator<Employee> i=c.iterator();
                    while(i.hasNext())
                    {
                        Employee e = i.next();
                        if(e.getEmpId()==empId) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("DATA Not found");
                    }
                    break;
                case 4:
                    Iterator<Employee> i1 = c.iterator();
                    while(i1.hasNext())
                    {
                        Employee e = i1.next();
                        System.out.println(e);

                    }
                    break;
                case 5:
                    found = false;
                    System.out.println("Enter EmpId to Delete:");
                    empId=sc.nextInt();
                    i=c.iterator();
                    while(i.hasNext())
                    {
                        Employee e = i.next();
                        if(e.getEmpId()==empId) {
                            i.remove();
                            found = true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("DATA Not found");
                    }
                    else {
                        System.out.println("Data Deleted Successfully");
                    }
                    break;

            }

        }
        while(choice!=0);
    }
}
