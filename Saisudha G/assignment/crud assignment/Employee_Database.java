

import java.util.*;

class Employee{
	private int Eid;
	private String Name;
	private double Sal;

Employee(){}

Employee(int Eid,String Name,double Sal){
	this.Eid=Eid;
	this.Name=Name;
	this.Sal=Sal;
	}

public int getEid(){
	return Eid;
	}
public String getName(){
	return Name;
	}
public double getSal(){
	return Sal;
	}
public void setName(String Name){
	this.Name=Name;
	}
public void setSal(double Sal){
	this.Sal=Sal;
	}

public String toString(){
	return "EmpID"+"    "+Eid+"    "+"Name"+"    "+Name+"    "+"Salary"+"    "+Sal;
	}}




class Employee_Database{

	private static final int Max_emp=30;
	private static Employee[] emp= new Employee[Max_emp];
	private static int no_of_emp=10;
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		

		emp[0]=new Employee (101,"sai",100000);//1
		emp[1]=new Employee (102,"sudha",200000);//2
		emp[2]=new Employee (103,"abc",300000);//3
		emp[3]=new Employee (104,"cde",500005);//4
		emp[4]=new Employee (105,"efg",250000);//5
		emp[5]=new Employee (106,"ghj",270000);//6
		emp[6]=new Employee (107,"jkl",550000);//7
		emp[7]=new Employee (108,"lmn",850000);//8
		emp[8]=new Employee (109,"nop",5650000);//9
		emp[9]=new Employee (110,"pqr",290000);//10

	System.out.println("Employee Database Management");
	System.out.println("Options:");
	System.out.println("1.Add Employee");
	System.out.println("2.Update Employee Name");
	System.out.println("3.Update Employee Salary");
	System.out.println("4.Search Employee");
	System.out.println("5.Display all Employee Details");
	System.out.println("6.Delete Employee details");
	System.out.println("Enter your choice:");
	int choice=sc.nextInt();

	switch (choice) {
		case 1:
			addemp(sc);
			break;
		case 2:
			updateemp_name(sc);
			//System.out.println(2);
			break;
		case 3:
			updateemp_sal(sc);
			//System.out.println(3);
			break;
		case 4:
			searchemp(sc);
			//System.out.println(4);
			break;
		case 5:
			displayall_details();
			//System.out.println(5);
			break;
		case 6:
			deleteemp_details(sc);
			//System.out.println(6);
			break;
		default:
			System.out.println("Invalid choice");
			System.out.println("Try Again");
			break;
		}}

static void addemp (Scanner sc){
	if(no_of_emp>=Max_emp){
		System.out.println("cannot add more employees");
		return;
	}
	System.out.println("Enter Employee ID:");
	int Eid=sc.nextInt();
	if(detect(Eid) ==null){
		System.out.println("Enter Employee name:");
		String Name=sc.next();
		System.out.println("Enter Employee Salary:");
		double Sal=sc.nextDouble();
		emp[no_of_emp]=new Employee(Eid,Name,Sal);
		no_of_emp++;
		}
	else{
		System.out.println("Employee ID Already Exist");
	}}

static void updateemp_name(Scanner sc){
	System.out.println("Enter Employee ID to update Name:");
	int Eid=sc.nextInt();
	Employee updateemp =detect(Eid);
	if( updateemp ==null){
		System.out.println("Employee ID does'nt Exist");
		return;
	}
	
	System.out.println("Enter Employee new Name:");
	String Name=sc.next();
	updateemp.setName(Name);
}
static void updateemp_sal(Scanner sc){
	System.out.println("Enter Employee ID to update salary:");
	int Eid=sc.nextInt();
	Employee updateemp =detect(Eid);
	if( updateemp ==null){
		System.out.println("Employee ID does'nt Exist");
		return;
	}
	
	System.out.println("Enter Employee Salary:");
	double Sal=sc.nextDouble();
	updateemp.setSal(Sal);
}


static void searchemp(Scanner sc){
	System.out.println("Enter Employee ID :");
	int Eid=sc.nextInt();
	Employee e =detect(Eid);
	if( e ==null){
		System.out.println("Employee ID does'nt Exist");
		return;
	}
	else{
		System.out.println(e);
	}}

static void displayall_details(){
	System.out.println("\nEmployee Details:");
		for(Employee e:emp){
			System.out.println(e);
	}}
static void deleteemp_details(Scanner sc){
	System.out.println("Enter Employee ID to delete :");
	int Eid=sc.nextInt();
	int delete_index=-1;
	for(int e=0;e<no_of_emp;e++){
		if(emp[e].getEid()==Eid){
			delete_index=e;
			break;
	}}
	if(delete_index==-1){
		System.out.println("Employee not found");
		}else{
		for(int e=delete_index;e<no_of_emp-1;e++){
			emp[e]=emp[e+1];
	}
	no_of_emp--;
	System.out.println("Employee deleted");
	

}}



static Employee detect(int Eid) {
	for(int e=0; e<no_of_emp; e++) {
		if(emp[e].getEid()==Eid){
			return emp[e];
	}}
	return null;
	}}


	