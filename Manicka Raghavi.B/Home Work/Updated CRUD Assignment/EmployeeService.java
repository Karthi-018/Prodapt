package crudmvc; 
import java.util.*;
class EmployeeService 
{ 

Employee empList[]=new Employee[10]; 

Scanner sc=new Scanner(System.in);

void initalEmpList() 
{ 
for(int i=0;i<9;i++) 
{

Employee e=new Employee((100+i+1),"Employee"+(i+1),(400000+i+1)); 
empList[i]=e;  
}
} 

void createEmpList(int id) 
{ 
Employee emp=searchEmpList(id);  
int flag=0;
if(emp==null) 
{
for(int i=0;i<empList.length;i++)
{   
    if(empList[i]==null) 
    {
        System.out.println("Enter Emp Name to be created");
        String name=sc.next(); 
        System.out.println("Enter Emp Salary to be created"); 
        long sal=sc.nextLong();
        empList[i]=new Employee(id,name,sal); 
        flag=1; 
        System.out.println("Details created successfully"); 
        break;
    }
}
if(flag==0) 
System.out.print("Database is full,cannot create more employee details");
} 
else 
{
System.out.println("Cannot create details for existing ID");
}
} 



 
Employee searchEmpList(int id) 
{
    Employee emp=null; 
    int i;
    for(i=0;i<empList.length;i++)
    {   if(empList[i]!=null)
       {
        if(empList[i].getId()==id ) 
        {
            emp=empList[i]; 
            break;
        } 
       }    
    }
    return emp;
} 

void deleteEmpList(int id) 
{
 int j=0;
 Employee emp=searchEmpList(id); 
 Employee tempList[]=new Employee[10];
 if(emp==null) 
 System.out.print("ID not found\n");
 else 
 {
    for(int i=0;i<empList.length;i++) 
    {  
       
        if(empList[i]!=emp) 
        { tempList[j++]=empList[i]; 
        } 
        else
        empList[i]=null;
       
    }
 System.out.println("List after deletion is\n"); 
 for(int i=0;i<tempList.length;i++)
  {   if(tempList[i]!=null)
      System.out.println(tempList[i]); 
  }  
  }
 
} 

void updateEmpList(int id) 
{
    Employee emp=searchEmpList(id);  
    
    if(emp==null)
    System.out.println("Details does not exist");
    
    else
    {
       System.out.println("Enter your choice \n 1-Update Emp Name \n 2-Update Emp Salary"); 
	   int n=sc.nextInt();  
	   sc.nextLine();
	   switch(n) 
	   {
	    case 1:System.out.println("Enter Emp Name to be updated");
	           emp.setName(sc.nextLine());
	           break;
	                           
	    case 2:System.out.print("Enter Emp Salary to be updated");
	           emp.setSalary(sc.nextLong());
               break;	                        
	   } 
	   System.out.println("Updates Details are "+emp);
	 } 
    
} 
void displayEmpList() 
{
     for(int i=0;i<empList.length;i++) 
     {
      if(empList[i]!=null)
      System.out.println(empList[i]); 
     }
}
}
