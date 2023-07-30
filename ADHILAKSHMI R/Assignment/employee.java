import java.util.*;
class employee{
int id;
int salary;
String name;
static int index=0;
public void create(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id to be created");
	int id=sc.nextInt();
	employee e =new employee();
	int x=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null && arr[i].id==id){
			System.out.println("Employee already exit...enter the new one");
			x=1;
		}
	}
	if(x==0){
		e.id=id;
		System.out.println("Enter the employee name to be created");
		String name=sc.next();
		e.name=name;
		System.out.println("Enter the employee salary to be created");
		int salary=sc.nextInt();
		e.salary=salary;
		arr[index]=e;
		System.out.println("-------------------------Detail creation in progress---------------------");
		System.out.println("The Created Employee Details are.....");
		System.out.println("Employee id  : "+arr[index].id);
		System.out.println("Employee name  : "+arr[index].name);
		System.out.println("Employee salary  : "+arr[index].salary);
		index++;

	}
}
public void display(employee [] arr){
	for(int i=0;i<index;i++){
		if(arr[i]!=null){
			System.out.println("-----------------------------------------------------");
			System.out.println("Employee id  : "+arr[i].id);
			System.out.println("Employee name  : "+arr[i].name);
			System.out.println("Employee salary  : "+arr[i].salary);
			System.out.println("-----------------------------------------------------");
		}
	}
}
public void update(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("------Enter the id to be updated--------");
	int id=sc.nextInt();
	int flag=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null&&arr[i].id==id){
			flag=1;
			arr[i].id=id;
			System.out.println("Enter the employee name to be updated");
			String name=sc.next();
			arr[i].name=name;
			System.out.println("Enter the employee salary to be craeted");
			int salary=sc.nextInt();
			arr[i].salary=salary;
			System.out.println("The Updated Employee Details are.....");
			System.out.println("Employee id  : "+arr[i].id);
			System.out.println("Employee name  : "+arr[i].name);
			System.out.println("Employee salary  : "+arr[i].salary);
			break;
		}
	}
	if(flag==0){
		System.out.println("----------------The employee detail not found------------------");
	}
}
public void delete(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("------Enter the id to be deleted--------");
	int id=sc.nextInt();
	int flag=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null&&arr[i].id==id){
			flag=1;
			arr[i]=null;
			break;
		}
	}
	if(flag==0){
		System.out.println("----------------The employee detail not found------------------");
	}
}
public void search(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("------Enter the id to be searched--------");
	int id=sc.nextInt();
	int flag=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null&&arr[i].id==id){
			flag=1;
			System.out.println("The Searched Employee Details are.....");
			System.out.println("Employee id  : "+arr[i].id);
			System.out.println("Employee name  : "+arr[i].name);
			System.out.println("Employee salary  : "+arr[i].salary);
			break;
		}
	}
	if(flag==0){
		System.out.println("----------------The employee detail not found------------------");
	}
}

public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("*******************************Welcome to the Employee Management System***************************************");
	employee arr[]=new employee[10];
	employee e=new employee();
	for(int i=0;i<10;i++){
		e.create(arr);
	}
	e.display(arr);
	e.update(arr);
	e.display(arr);
	e.delete(arr);
	e.display(arr);
	e.search(arr);
}
		
		
	
	
}