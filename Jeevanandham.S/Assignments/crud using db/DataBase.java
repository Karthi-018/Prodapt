package edu.prodapt.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBase {
	
	static Scanner sc = new Scanner(System.in);
	
	
	
	private Connection dbConnection()throws ClassNotFoundException,SQLException{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			System.out.println("connection successful");
			return con;	
	}
	
	
	
	public void options() throws ClassNotFoundException, SQLException {
		System.out.println("1. Create");
		System.out.println("2. Search");
		System.out.println("3. Update");
		System.out.println("4. Display all employees");
		System.out.println("5. Delete");
		System.out.println("6. Exit");
		System.out.println("Select the options");
		int opt = sc.nextInt();
		performOperations(opt);
	}
	
	
	public Employee searchId(int id) throws ClassNotFoundException, SQLException {
		Connection con  = dbConnection();
		Employee emp = null;
		PreparedStatement ps = con.prepareStatement("select * from employee where eId = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		return emp;
	}
	
	
	public void create() throws SQLException, ClassNotFoundException {
		Connection con  = dbConnection(); 
		System.out.println("Enter Id");
		int id = sc.nextInt();
		Employee emp = searchId(id);
		if(emp == null) {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter salary");
			String sal = sc.next();
			Employee e = new Employee(id,name,sal);
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, e.geteId());
			ps.setString(2, e.geteName());
			ps.setString(3, e.getSalary());
			int r = ps.executeUpdate();
			if(r == 1) {
				System.out.println("New employee created successfully");
			}
			else {
				System.out.println("Your attempt to create new employee is failed");
			}
		}
		else {
			System.out.println("Id already exists");
		}
	}
	
	public void update() throws SQLException, ClassNotFoundException {
		Connection con  = dbConnection();
		PreparedStatement ps;
		System.out.println("Enter the id to update");
		int upId = sc.nextInt();
		Employee emp = searchId(upId);
		if(emp == null) {
			System.out.println("Id not found");
		}
		else {
			System.out.println("1.update name");
			System.out.println("2.update salary");
			System.out.println("select the option");
			int op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter the new name");
				ps = con.prepareStatement("update employee set eName=? where eId=?");
				ps.setString(1, sc.next());
				ps.setInt(2, upId);
				int upName = ps.executeUpdate();
				if(upName == 1) {
					System.out.println("Employee name updated successfully");
				}
				else {
					System.out.println("Your attempt to update an Employee name is failed");
				}
				break;
				
			case 2:
				System.out.println("Enter the new salary");
				ps = con.prepareStatement("update employee set salary=? where eId=?");
				ps.setString(1, sc.next());
				ps.setInt(2, upId);
				int upSal = ps.executeUpdate();
				if(upSal == 1) {
					System.out.println("Employee salary updated successfully");
				}
				else {
					System.out.println("Your attempt to update an Employee salary is failed");
				}
				break;
			}	
		}
	}
	
	
	
	
	public void display() throws ClassNotFoundException, SQLException {
		Connection con  = dbConnection();
		PreparedStatement ps = con.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	
	
	
	public void delete() throws SQLException, ClassNotFoundException {
		Connection con  = dbConnection();
		System.out.println("Enter the Id to delete");
		int deleteId = sc.nextInt();
		Employee emp = searchId(deleteId);
		if(emp == null) {
			System.out.println("Id not found");
		}
		else {
			PreparedStatement ps = con.prepareStatement("delete from employee where eId=?");
			ps.setInt(1, deleteId);
			int d = ps.executeUpdate();
			if(d == 1) {
				System.out.println("employee deleted successfully");
			}
			else {
				System.out.println("Your attempt to delete an employee is failed");
			}
		}
	}
	
	
	
	
	public void performOperations(int opt) throws ClassNotFoundException, SQLException {
		
		
		switch(opt) {
		case 1:
			create();
			options();
			break;
			
		case 2:
			System.out.println("Enter the Id to search");
			int searchId = sc.nextInt();
			Employee emp = searchId(searchId);
			if(emp == null) {
				System.out.println("Id not found");
			}
			else {
				System.out.println(emp);
			}
			options();
			break;
			
		case 3:
			update();
			options();
			break;
			
		case 4:
			display();
			options();
			break;
			
		case 5:
			delete();
			options();
			break;
			
		case 6:
			System.exit(0);
		}
	}
		
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DataBase db = new DataBase();
		db.dbConnection();
		db.options();
			
	}

}
