package ass1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeMain {
	static Employee emp=new Employee();
	static Scanner sc =new Scanner(System.in);
	static int choice;
	public static void main(String a[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("sucess");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			System.out.println("Connection Successful");
			do {
			System.out.println("1. Create your data");
			System.out.println("2. Display your data");
			System.out.println("3. Update your data");
			System.out.println("4. Delete your data");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				create();
				break;
			}
			case 2:{
				read();
				break;
			}
			case 3:{
				update();
				break;
			}
			case 4:{
				delete();
				break;
			}
			}
			}while(choice<=4);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void create() {
		System.out.println("Enter id");
		emp.setId(sc.nextInt());
		System.out.println("Enter name");
		emp.setName(sc.next());
		System.out.println("Enter salary");
		emp.setSalary(sc.nextInt());
		try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1, emp.getId());
		ps.setString(2, emp.getName());
		ps.setInt(3, emp.getSalary());
		ps.executeUpdate();
		System.out.println("Employee detail inserted successfully");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	public static void read() {
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			do {
			System.out.println("1.Display Employee by ID");
			System.out.println("2.Display all the employee");
			System.out.println("3. Exit");
			System.out.println("Enter your sub choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter employee id");
				emp.setId(sc.nextInt());
				System.out.println("Id\t Name\t Salary");
				System.out.println("-----------------------------------");
				PreparedStatement ps1= con.prepareStatement("select * from employee where id=?;");
				ps1.setInt(1,emp.getId());
				ResultSet rs=ps1.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				}
				break;
			}
			case 2 :{
				System.out.println("Id\t Name\t Salary");
				System.out.println("-----------------------------------");
				PreparedStatement ps2=con.prepareStatement("Select * from employee");
				ResultSet rs1=ps2.executeQuery();
				while(rs1.next())
				{
					System.out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getInt(3));
				}
				break;
			}
		}
			}while(choice<=2);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
	

	public static void update() {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		do {
			
			System.out.println("1.Update Employee name");
			System.out.println("2.Update Employee salary");
			System.out.println("3. Exit");
			System.out.println("Enter your sub choice to update");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:{ 
				System.out.println("Enter employee id to update");
				int id = sc.nextInt();
				System.out.println("Enter new name to update");
				//String ename = sc.next();
				emp.setName(sc.next());
				PreparedStatement ps = con.prepareStatement("UPDATE employee SET name = ? WHERE id = ?");
				ps.setInt(2,id);
				ps.setString(1,emp.getName());
				ps.executeUpdate();
				System.out.println("Employee "+emp.getName()+" updated successfully");
				break;
			}
			case 2:{
				System.out.println("Enter employee id to update");
				int id = sc.nextInt();
				System.out.println("Enter new salary to update");
				//int esalary = sc.nextInt();
				emp.setSalary(sc.nextInt());
				PreparedStatement ps4 = con.prepareStatement("UPDATE employee SET salary = ? WHERE id = ?");
				ps4.setInt(2,id);
				ps4.setInt(1,emp.getSalary());
				ps4.executeUpdate();
				System.out.println("Employee "+emp.getSalary()+" updated successfully");
			}
		}
		}while(choice<=2);
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}
	public static void delete() {
		System.out.println("Enter employee id to delete");
		emp.setId(sc.nextInt());
		int temp = 0;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps = con.prepareStatement("Delete from employee where id=?;");
			ps.setInt(1,emp.getId());
			ps.executeUpdate();
			temp=1;
			if(temp==1) {
				System.out.println("Employee "+emp.getId()+" deleted successfully");
			}
			else{
				System.out.println("Employee not found");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
