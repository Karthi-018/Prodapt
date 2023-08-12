package edu.prodapt.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class ServiceCls
{
	Scanner sc = new Scanner(System.in);
	PreparedStatement ps;
	ResultSet rs;
	Employee employee = new Employee();
	
	
		
	public  Employee searchId(int id, Connection con) throws SQLException{
		
		Employee emp = null;
		ps = con.prepareStatement("select * from employee where eId = ?");
		ps.setInt(1, id);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			
			emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
			
		}
		
		return emp;
		
	}
	
	
	
	public  void create(Connection con) throws SQLException{ 
		
		System.out.println("Enter Id");
		employee.seteId(sc.nextInt());
		Employee emp = searchId(employee.geteId(),con);
		
		if(emp == null) {
			
			System.out.println("Enter name");
			employee.seteName(sc.next());
			System.out.println("Enter salary");
			employee.setSalary(sc.next());
			ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, employee.geteId());
			ps.setString(2, employee.geteName());
			ps.setString(3, employee.getSalary());
			int r = ps.executeUpdate();
			
			if(r == 1) {
				
				System.out.println(employee);
				System.out.println("New employee created successfully :)");
				
			}
			
			else {
				
				System.out.println("Your attempt to create new employee is failed :(");
				
			}
		}
		
		else {
			
			System.out.println(emp.geteId()+" Id already exists");
			
		}
	}
	
	
	
	public void update(Connection con) throws SQLException{
		
		System.out.println("Enter the id to update");
		employee.seteId(sc.nextInt());
		Employee emp = searchId(employee.geteId(),con);
		
		if(emp == null) {
			
			System.out.println(employee.geteId()+" Id not found :(");
			
		}
		
		else {
			System.out.println(emp);
			System.out.println("1.update name");
			System.out.println("2.update salary");
			System.out.println("select the option");
			int op = sc.nextInt();
			
			switch(op) {
			
			case 1:
				
				System.out.println("Enter the new name");
				employee.seteName(sc.next());
				ps = con.prepareStatement("update employee set eName=? where eId=?");
				ps.setString(1,employee.geteName());
				ps.setInt(2, employee.geteId());
				int upName = ps.executeUpdate();
				
				if(upName == 1) {
					
					System.out.println(employee);
					System.out.println("Employee name updated successfully :)");
					
				}
				
				else {
					
					System.out.println("Your attempt to update an Employee name is failed :(");
					
				}
				
				break;
				
				
			case 2:
				
				System.out.println("Enter the new salary");
				employee.setSalary(sc.next());
				ps = con.prepareStatement("update employee set salary=? where eId=?");
				ps.setString(1, employee.getSalary());
				ps.setInt(2, employee.geteId());
				int upSal = ps.executeUpdate();
				
				if(upSal == 1) {
					
					System.out.println(employee);
					System.out.println("Employee salary updated successfully :)");
					
				}
				
				else {
					
					System.out.println("Your attempt to update an Employee salary is failed :(");
					
				}
				
				break;
			}	
		}
	}
	
	
	public void delete(Connection con) throws SQLException{
		
		System.out.println("Enter the Id to delete");
		employee.seteId(sc.nextInt());
		Employee emp = searchId(employee.geteId(),con);
		
		if(emp == null) {
			
			System.out.println(employee.geteId()+" Id not found :(");
			
		}
		
		else {
			
			int d = 0;
			System.out.println(emp);
			System.out.println("Are you sure to delete these details, y/n");
			
			if(sc.next().equalsIgnoreCase("y")) {
				
				ps = con.prepareStatement("delete from employee where eId=?");
				ps.setInt(1, employee.geteId());
				d = ps.executeUpdate();
				
				if(d == 1) {
					
					System.out.println("Employee deleted successfully :)");
					
				}
				
				else {
					
					System.out.println("Your attempt to delete an employee is failed :(");
					
				}
				
			}
			
			else {
				
				System.out.println("Cancelled deletion");
				
			}
		
		}
	}
	
	
	

	public void display(Connection con) throws SQLException {
		
		ps = con.prepareStatement("select * from employee");
		rs = ps.executeQuery();
		
		while(rs.next()) {
			
			employee.seteId(rs.getInt(1));
			employee.seteName(rs.getString(2));
			employee.setSalary(rs.getString(3));
			System.out.println(employee);
			System.out.println();
			
		}
	}
	
	
}		


