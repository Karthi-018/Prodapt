import java.util.*;
class employeeManagementSystem{
int empId;
int empSal;
String EmpName;
static int v=0;
public void CreateEmployee(int id,int salary,String name,employeeManagementSystem arr[]){
	int m=arr.length;
	int n=0,x=0;
	employeeManagementSystem e=new employeeManagementSystem();
	for(int i=0;i<m;i++){
		n++;

		if(arr[i]!=null && arr[i].empId==id){
			System.out.println("Employee Id Already Exist");
			x=1;
			break;
		}
	
	}
	if(x==0){
		
			e.empId=id;
			e.empSal=salary;
			e.EmpName=name;
			arr[v]=e;
			System.out.println("The created details are......");
			System.out.println("Employee Id="+arr[v].empId);
			System.out.println("Employee Name="+arr[v].EmpName);
			System.out.println("Employee Salary="+arr[v].empSal);
			v++;
		}
			
	

	
}
public void update(employeeManagementSystem arr[]){
	Scanner sc=new Scanner(System.in);
	int u=0;
	System.out.println("Enter the id to be updated");
	int id=sc.nextInt();
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null && arr[i].empId==id){
			u=1;
			System.out.println("Enter the employee name to be updated");
			String name=sc.next();
			System.out.println("Enter the employee salary to be updated");
			int salary=sc.nextInt();
			arr[i].empSal=salary;
			arr[i].EmpName=name;
		
	
			System.out.println("The updated details are......");
			System.out.println("Employee Id="+arr[i].empId);
			System.out.println("Employee Name="+arr[i].EmpName);
			System.out.println("Employee Salary="+arr[i].empSal);
			break;
		}
	}
	if(u==0){
		System.out.println("The employee detail not found");
	}
}
public void delete(employeeManagementSystem arr[]){
	Scanner sc=new Scanner(System.in);
	int u=0;
	System.out.println("Enter the id to be deleted");
	int id=sc.nextInt();
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null && arr[i].empId==id){
			u=1;
		
		
	
			System.out.println("The details going to be deleted are......");
			System.out.println("Employee Id="+arr[i].empId);
			System.out.println("Employee Name="+arr[i].EmpName);
			System.out.println("Employee Salary="+arr[i].empSal);
			arr[i]=null;
			break;
		}
	}
	if(u==0){
		System.out.println("The employee detail not found");
	}
}
public void search(employeeManagementSystem arr[]){
	Scanner sc=new Scanner(System.in);
	int u=0;
	System.out.println("Enter the id to be searched");
	int id=sc.nextInt();
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null && arr[i].empId==id){
			u=1;
			System.out.println("The search found and the detail you asked are......");
			System.out.println("Employee Id="+arr[i].empId);
			System.out.println("Employee Name="+arr[i].EmpName);
			System.out.println("Employee Salary="+arr[i].empSal);
			break;
		}
	}
	if(u==0){
		System.out.println("The employee detail not found");
	}
}	
public void displayAll(employeeManagementSystem arr[]){
	int u=0;
	System.out.println("The Employee details are....");
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null){
			u=1;
			System.out.println("Employee Id="+arr[i].empId);
			System.out.println("Employee Name="+arr[i].EmpName);
			System.out.println("Employee Salary="+arr[i].empSal);
			System.out.println("----------------------------------");
		}
	}
	if(u==0){
		System.out.println("There is no employee exist");
	}
}
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	employeeManagementSystem arr[]=new employeeManagementSystem[10];
	employeeManagementSystem s=new employeeManagementSystem();
	for(int i=0;i<10;i++){
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee salary");
		int salary=sc.nextInt();
		s.CreateEmployee(id,salary,name,arr);
	}
	s.displayAll(arr);
	s.update(arr);
	s.delete(arr);
	s.displayAll(arr);
	s.search(arr);


		


}
}