import java.util.Scanner;
import java.util.*;
class Employee{
	int empno;
	String ename;
	int salary;
	static int size=0;
	
	Employee(){}
	
	Employee(int empno,String ename,int salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
	}
	
	public int getEmpno(){
		return empno;
	}
	public String getEname(){
		return ename;
	}
	public int getSalary(){
		return salary;
	}
	
	public String toString(){
		return empno+" "+ename+" "+salary;
	}
}



class CRUD{
	public static void main(String []args){
		int ch;
		Scanner s =new Scanner(System.in);
		Employee [] elist =new Employee[10];
		
		
		do{
			System.out.println("*********************************");
			System.out.println("1.Insert Employee Details");
			System.out.println("2.Display Employee Details");
			System.out.println("3.Search Employee Details");
			System.out.println("4.Delete Employee Details");
			System.out.println("5.Update Employee Details");
			System.out.print("Enter your choice : ");
			ch=s.nextInt();
			
			switch (ch){
				case 1:
					System.out.print("Enter Employee ID :");
					int empno = s.nextInt();
					
					boolean idcheck = false;
					for (int i=0;i<Employee.size;i++){
						if (empno ==elist[i].empno){
							idcheck =true;
							break;
						}
					}
					if(idcheck){
						System.out.println("Already exists please check ");
					}
					else{
						System.out.print("Enter Employee Name :");
						String ename = s.next();
						System.out.print("Enter Employee salary : ");
						int salary =s.nextInt();
						Employee e =new Employee(empno,ename,salary);
						elist[Employee.size]= e;
						e.size++;
					}
				break;
				
				case 2:
					System.out.println("*********************************");
					System.out.println("Display Employee details ");
					for(Employee det:elist){
						System.out.println(det);
					}
					System.out.println("*********************************");
				break;
				
				case 3:
					System.out.print("Enter the ID No to Search : ");
					int SID=s.nextInt();
					for(Employee i : elist){
						if(i.empno==SID){
							System.out.println("Employee Already present : "+i);
						}
						else{
							System.out.println("Employee not found");
						}
					}
				break;
				
				case 4:
					System.out.print("Enter Id No to delete detail : ");
					int DID=s.nextInt();
					for (int i=0;i<elist.length;i++){
						if(elist[i].empno==DID){
							for(int j=i;i<elist.length-1;j++){
								elist[j]=elist[j+1];
							}
							elist[elist.length-1]=null;
							Employee.size--;
							System.out.println("Details Deleted");	
							break;
						}
					}
					System.out.println("ID not found");
						
					
				break;
				
				case 5:
					System.out.print("Enter Id No to update details : ");
					int UID=s.nextInt();
					System.out.print("Enter the updated name : ");
					String uname=s.next();
					System.out.print("Enter the updated Salary : ");
					int usalary=s.nextInt();
					for (Employee u:elist){
						if(u.empno==UID){
							u.ename=uname;
							u.salary=usalary;
							System.out.print("Updated");
						}
					}
				break;
				
				default:
					System.out.println("Invalid Choice");
				
				
			}
		}while(ch!=0 && ch<6);
		
		
	}
}