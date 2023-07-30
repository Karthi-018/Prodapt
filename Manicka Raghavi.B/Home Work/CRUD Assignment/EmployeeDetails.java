package crud;
import java.util.*;
class EmployeeDetails 
{
    int id[]={101,102,103,104,105,106,107,108,109,110};
    String name[]={"Raghavi","Hari","Varsha","Sudha","Shalini","Raghavi.B","Vasu","Boomi","Nathan","Suriya"};
    double salary[]={60000.00,59000.00,58000.00,57000.00,56000.00,60000.00,54000.00,53000.00,52000.00,51000.00}; 
    int eid; String ename; double esalary; 
    Scanner sc=new Scanner(System.in);

    EmployeeDetails(int i) 
    {
        this.eid=id[i];
        this.ename=name[i];
        this.esalary=salary[i];
    } 

    EmployeeDetails() 
    {
        
    }

    public String toString() 
    {
        return eid+" "+ename+" "+esalary;
    } 
    
    //Create Emp Details
    void create(EmployeeDetails...empobject)
    {   int n=0,count=0,flag=0;
        System.out.println("Enter Employee Id:");
        eid=sc.nextInt();
        System.out.println("Enter Employee Name:");
        ename=sc.next();
        System.out.println("Enter Employee Salary:");
        esalary=sc.nextDouble();
        for(int i=0;i<10;i++)
        { 
          if(empobject[i].eid==eid) 
          { flag=1; break; 
          }
        if(empobject[i].eid==0) 
         { n=i;
           break; 
         } 
        else 
        count++;
        }
        if(count==10||flag==1)
        System.out.println("Sorry cannot create employee details."); 
        else         
        {   System.out.println("Details created successfully");
            empobject[n].eid=eid;
            empobject[n].ename=ename;
            empobject[n].esalary=esalary; 
            
            //Sorting the Emp Details according to Emp ID  
            for(int i=0;i<10;i++)
            { 
            for(int j=i+1;j<10;j++) 
            { 
             if(empobject[i].eid>empobject[j].eid) 
             {
              EmployeeDetails e=new EmployeeDetails();
              e=empobject[i];
              empobject[i]=empobject[j];
              empobject[j]=e; 
             }
            } 
           }
        }
 
    }

    //Update Emp Details
    void update(EmployeeDetails...empobject)
    {
      int flag=0; 
        System.out.println("Enter The Employee ID To Update The Details");       
        eid=sc.nextInt(); 
        for(EmployeeDetails emp:empobject)
        {
            if(emp.eid==eid && emp.eid!=0) 
            { 
                System.out.println("Enter\n 1-Update Employee Name\n 2-Employee Salary\n 3-Both\n");
                int n=sc.nextInt(); 
                sc.nextLine();
                if(n==1) 
                { System.out.println("Updated Employee Name:");
                  emp.ename=sc.nextLine(); }
                else if(n==2) 
                { System.out.println("Updated Employee Salary:");
                  emp.esalary=sc.nextDouble(); }
                else if(n==3)
                {   System.out.println("Updated Employee Name:");
                    emp.ename=sc.nextLine();  
                    System.out.println("Updated Employee Salary:");
                    emp.esalary=sc.nextDouble();
                } 
                System.out.println("The Updated Details of Emp Id "+emp.eid+ " are\n"+"EMPLOYEE NAME: " +emp.ename+"\n"+"EMPLOYEE SALARY: " +emp.esalary+"\n");
                flag=1;
                break;
            }  
        } 
        if(flag==0)
        System.out.println("Sorry no details found as such,please provide the correct details");    
    }
    
    //Delete Emp Details
    void delete(EmployeeDetails...empobject)
    {
        int flag=0; 
        System.out.println("Enter The Employee ID To Delete The Details:");       
        eid=sc.nextInt();
        for(EmployeeDetails emp: empobject)
        {
            if(emp.eid==eid) 
            {   
                emp.eid=0;
                emp.ename=null; 
                emp.esalary=0.0; 
                System.out.println("The details are deleted successfully,the edited emp details are: "); 
                display(empobject);
                flag=1;
                break;
            }
        } 
        if(flag==0)
        System.out.println("Sorry no details found as such,please provide the correct details");
    }
    
    //Search Emp Details
    void search(EmployeeDetails...empobject)
    {   int flag=0; 
        System.out.println("Enter The Employee ID To Search The Details:");       
        eid=sc.nextInt();
        for(EmployeeDetails emp: empobject)
        {
            if(emp.eid==eid && emp.eid!=0) 
            {
                System.out.println("The details are:");
                System.out.println("EMPLOYEE NAME: "+emp.ename+"\n"+"EMPLOYEE SALARY: "+emp.esalary+"\n"); 
                flag=1; 
                break;
            }
        } 
        if(flag==0)
        System.out.println("Sorry no details found as such,please provide the correct details");
    } 
    
    //Display Emp Details
    void display(EmployeeDetails...empobject)
    {
       for(EmployeeDetails i: empobject)
       {   if(i.eid!=0)
           System.out.println(i);
       }
    }
    
}

