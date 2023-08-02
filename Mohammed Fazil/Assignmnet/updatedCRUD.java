import java.util.*;
public class Employee

{

    private int eid;

    private String ename;

    private String edes;

    private double esal;

 

    Employee(int eid,String ename,String edes,double esal)

    {

        this.eid = eid;

        this.ename = ename;

        this.edes = edes;

        this.esal = esal;

    }

 

    public void setEid(int eid)

    {

        this.eid = eid;

    }

    public int getEid()

    {

        return eid;

    }

    public void setEname(String ename)

    {

        this.ename = ename;

    }

    public String getEname()

    {

        return ename;

    }

    public void setEdes(String edes)

    {

        this.edes = edes;

    }

    public String getEdes()

    {

        return edes;

    }

    public void setEsal(double esal)

    {

        this.esal = esal;

    }

    public double getEsal()

    {

        return esal;

    }

 

    public String toString()

    {

        return "Employee ID : "+eid+" Employee Name : "+ename+" Employee Designation : "+edes+" Employee Salary : "+esal;

    }

   

}
public class EmployeeService

{

   

    Employee emp[] = new Employee[15];

 

    public void firstTenData()           //first 10 set of data

    {

        for(int i=0;i<10;i++)

        {

            emp[i] = new Employee((100+(i+1)),"Employee"+(i+1),"Designation"+(i+1),100000+(i+1));

        }

    }

 

    public Employee isEmployee(int eid)    //checking does employee exist

    {  

        Employee e = null;

        for(int i=0;i<emp.length;i++)

        {

            if(emp[i] != null)

            {

                if(emp[i].getEid()==eid)

                {

                    e = emp[i];

                }

               

            }

        }

        return e;

    }

 

    public Employee[] createEmp(Employee employee)   //create employee

    {

        Employee e = isEmployee(employee.getEid());

        if(e==null)

        {

            emp[emp.length-1]  = employee;

        }

        else

        {

            System.out.println("Employee already exist!!!");

        }

        return emp;

    }

 

    public Employee updateEmp(int eid,String ename,String edes,double esal)

    {

        Employee emp = isEmployee(eid);

 

        if(emp != null)

        {

            emp.setEname(ename);

            emp.setEdes(edes);

            emp.setEsal(esal);

        }

        else

        {

            System.out.println("Employee dosen't exist");

        }

        return emp;

    }

    public Employee[] dispEmp()

    {

        return emp;

    }

 

    public void delete(int id)

    {

        Employee empDelete = isEmployee(id);

        if(empDelete != null)

        {

           

            int indexDelete = -1;

            for(int i=0;i<emp.length-1;i++)

            {

                if(emp[i] == empDelete)

                {

                    indexDelete = i;

                }

               

            }

            if(indexDelete != -1)

            {

                for(int i=indexDelete;i<emp.length-1;i++)

                {

                    emp[i] = emp[i+1];

                }

                emp[emp.length-1] = null;

            }

        }

        else

        {

            System.out.println("Employee not exist");

        }

 

    }
public class MainClass

{

    static Scanner sc = new Scanner(System.in);

    static EmployeeService es = new EmployeeService();

 

    static void choice()

    {

        System.out.println("Welcome to Employee Management System");

        System.out.println("Select option to be performed");

        System.out.println("1.Create new employee\n2.Update employee details\n3.Search employee details\n4.Display all employee deatils\n5.Delete employee\n6.Quit");

        System.out.println("Enter your choice");

        int choice = sc.nextInt();

        userchoice(choice);

    }

    static void userchoice(int choice)

    {

        switch (choice)

        {

            case 1 :

                System.out.println("Enter employee details...");

                System.out.println("Enter employee id :");

                int id = sc.nextInt();

                System.out.println("Enter employee name :");

                String name = sc.next();

                System.out.println("Enter employee designation :");

                String des = sc.next();

                System.out.println("Enter employee salary :");

                double sal = sc.nextDouble();

                Employee newEmpList[] = es.createEmp(new Employee(id,name,des,sal));

                for(int i=0;i<newEmpList.length;i++)

                {

                    System.out.println(newEmpList[i]);

                }

                choice();

                break;

 

            case 2 :

                System.out.println("Update employee details...");

                System.out.println("Enter employee id :");

                int updateid = sc.nextInt();

                Employee updateEmployee = es.isEmployee(updateid);

                if(updateEmployee != null)

                {

                    System.out.println("choose the option to update...");

                    System.out.println("1.Update name\n2.Update designation\n3.Update salary");

                    int option = sc.nextInt();

                    switch (option)

                    {

                        case 1 :

                            System.out.println("Enter name :");

                            updateEmployee.setEname(sc.next());

                            break;

                        case 2 :

                            System.out.println("Enter designation:");

                            updateEmployee.setEdes(sc.next());

                            break;

                        case 3:

                            System.out.println("Enter salary:");

                            updateEmployee.setEsal(sc.nextDouble());

                            break;

                    }

                    System.out.println(updateEmployee);

                }

               

                choice();

                break;

 

            case 3 :

                System.out.println("Searching Employee...");

                System.out.println("Enter employee id : ");

                int eid = sc.nextInt();

                Employee emp = es.isEmployee(eid);

                if(emp != null)

                {

                    System.out.println(emp);

                }

                else{

                    System.out.println("Employee not found!!!");

                }

                choice();

                break;

            case 4 :

                System.out.println("All employee details");

                Employee empList[] = es.dispEmp();

                for(int i = 0;i<empList.length;i++)

                {

                    System.out.println(empList[i]);

                }

                choice();

                break;

            case 5 :

                System.out.println("Deleting Employee...");

                System.out.println("Enter employee id : ");

                int deleteId = sc.nextInt();

                es.delete(deleteId);

                choice();

                break;

            case 6 :

                System.exit(0);

            default :

                System.out.println("Invalid option");

        }

    }

    public static void main(String a[])

    {

        es.firstTenData();

        choice();

    }
}
}
