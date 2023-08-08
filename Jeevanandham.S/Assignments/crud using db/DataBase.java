package edu.prodapt.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBase {
	
	static Scanner sc = new Scanner(System.in);
	
	public int options() {
		System.out.println("1. Create");
		System.out.println("2. Search");
		System.out.println("3. Update");
		System.out.println("4. Display all employees");
		System.out.println("5. Delete");
		System.out.println("Select the options");
		int opt = sc.nextInt();
		return opt;
	}
	
	public static void main(String[] args) {
		DataBase db = new DataBase();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			System.out.println("connection successful");
			PreparedStatement ps;
			ResultSet rs;
			int opt = db.options();
			
			
			switch(opt) {
			case 1:
				System.out.println("Enter Id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter salary");
				String sal = sc.next();
				ps = con.prepareStatement("insert into employee values(?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, sal);
				int r = ps.executeUpdate();
				if(r == 1) {
					System.out.println("New employee created successfully");
				}
				else {
					System.out.println("Your attempt to create new employee is failed");
				}
				break;
				
				
				
			case 2:
				System.out.println("Enter the Id to search");
				int searchId = sc.nextInt();
				ps = con.prepareStatement("select * from employee where eId=?");
				ps.setInt(1, searchId);
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				
				
				break;
				
				
				
			case 3:
				System.out.println("Enter the id to update");
				int upId = sc.nextInt();
				System.out.println("Enter the new name");
				String upName = sc.next();
				ps = con.prepareStatement("update employee set eName=? where eId=?");
				ps.setString(1, upName);
				ps.setInt(2, upId);
				int up = ps.executeUpdate();
				if(up == 1) {
					System.out.println("employee updated successfully");
				}
				else {
					System.out.println("Your attempt to update an employee is failed");
				}
				break;
				
				
				
			case 4:
				ps = con.prepareStatement("select * from employee");
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				break;
				
				
				
			case 5:
				System.out.println("Enter the Id to delete");
				int deleteId = sc.nextInt();
				ps = con.prepareStatement("delete from employee where eId=?");
				ps.setInt(1, deleteId);
				int d = ps.executeUpdate();
				if(d == 1) {
					System.out.println("employee deleted successfully");
				}
				else {
					System.out.println("Your attempt to delete an employee is failed");
				}
				break;
				
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}

}
