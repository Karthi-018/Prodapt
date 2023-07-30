import java.util.Scanner;

class EmployeeData
{
	int eid;
	String ename;
	String edes;
	double esalary;


    EmployeeData(int eid,String ename,String edes,double esalary)
    {
        this.eid = eid;
        this.ename = ename;
        this.edes = edes;
        this.esalary = esalary;
    }

}


public class MainClass{
    static int count = 10;
    static EmployeeData emp[] = new EmployeeData[50];
    public static void firstTenData()
    {
        int eid[]={101,102,103,104,105,106,107,108,109,110};
        String ename[]={"Sathyapriya","Sandra","Gokul","Aditya","Sruti","Ganesh","Sid","Mohan","Ragu","Nandhini"};
        String edes[]={"HR","ASE","HR","SE","Designer","ASE","Developer","SE","IT support","Developer"};
        double esalary[]={60000.00,59000.00,58000.00,57000.00,56000.00,60000.00,54000.00,53000.00,52000.00,51000.00};

        for(int i=0;i<10;i++)
        {
            emp[i] = new EmployeeData(eid[i],ename[i],edes[i],esalary[i]);
        }
    }
    public static int isIdExists(int id)
    {
        for(int i=0;i<count;i++)
        {
            if (emp[i].eid == id)
            {
                return i;
            }
        }
        return -1;
    }
    public static void create(String name,String des,double salary)
    {
        emp[count] = new EmployeeData(emp[count-1].eid+1,name,des,salary);
        System.out.println("Created Employee");
        display(count);
        count++;
    }
    public static void update(int id,String name,String des,double salary)
    {
        int index = isIdExists(id);
        if(index==-1)
        {
            System.out.println("Employee doesnt exists");
        }
        else
        {
            emp[index].ename = name;
            emp[index].edes = des;
            emp[index].esalary= salary;
            System.out.println("Updated Employee");
            display(index);
        }


    }
    public static void search(int id)
    {
        int index = isIdExists(id);
        if(index==-1)
        {
            System.out.println("Employee doesnt exists");
        }
        else
        {
            display(index);
        }
        
    }
    public static void display()
    {
        for(int i=0;i<count;i++)
        {
            display(i);
        }
    }
    public static void delete(int id)
    {
        int index = isIdExists(id);
        if(index==-1)
        {
            System.out.println("Employee doesnt exists");
        }
        else
        {
            System.out.println("Deleted Employee");
            display(index);
            for(int i=index;i<count-1;i++)
            {
                emp[i] = emp[i+1];
                
            }
            count--;
        }

        
    }
    public static void display(int index)
    {
        System.out.println("Employee id : "+emp[index].eid);
        System.out.println("Employee Name : "+emp[index].ename);
        System.out.println("Employee  : "+emp[index].edes);
        System.out.println("Employee id : "+emp[index].esalary);

    }
	public static void main(String args[])
	{
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Database!!!!");
        firstTenData();
        
        int flag = 1;
        do {
            int id;
            String name;
            String des;
            double salary;
            System.out.println("Select the operation to be performed from below options");
            System.out.println("1.Create Employee \n2.Update Employee Details\n3.Search Employee\n4.Display all Employees\n5.Delete Employee\n6.Quit");
            System.out.println("Enter your choice : ");
            int num = sc.nextInt();
            switch(num)
            {
                case 1 : 
                    System.out.println("Enter Employee Name : ");
                    name = sc.next();
                    System.out.println("Enter Employee Designation : ");
                    des = sc.next();
                    System.out.println("Enter Employee Salary : ");
                    salary = sc.nextDouble();
                    create(name,des,salary);
                    break;
                case 2 :
                    System.out.println("Enter Employee Id :");
                    id = sc.nextInt();
                    System.out.println("Enter Employee Name : ");
                    name = sc.next();
                    System.out.println("Enter Employee Designation : ");
                    des = sc.next();
                    System.out.println("Enter Employee Salary : ");
                    salary = sc.nextDouble();
                    update(id,name,des,salary);
                    break;
                case 3 :
                    System.out.println("Enter Employee Id :");
                    id = sc.nextInt();
                    search(id);
                    break;
                case 4 :
                    display();
                    break;
                case 5 :
                    System.out.println("Enter Employee Id :");
                    id = sc.nextInt();
                    delete(id);
                    break;
                case 6 :
                    flag=0;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }while(flag==1);

        

		
	}
}