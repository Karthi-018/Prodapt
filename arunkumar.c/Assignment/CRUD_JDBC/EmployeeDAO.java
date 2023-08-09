package com.arunsh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public static Connection getConnect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
	}
	
	static Employee findById(int id) throws Exception{
		Employee e = null;
		Connection con = getConnect();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPLOYEE WHERE id=?;");
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			e = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
		}
		if(e!=null) return e;
		return null;
	}
	
	static List<Employee> findAll()throws SQLException, ClassNotFoundException{
		List<Employee> employeeList = new ArrayList<>();
		Connection con = getConnect();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPLOYEE;");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			employeeList.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3)));
		}
		return employeeList;
	}
	
	static Employee save(Employee e) throws Exception{
		Connection con = getConnect();
		Employee newEmployee = findById(e.getId());
		PreparedStatement ps = null;
		if(newEmployee!=null) {
			ps = con.prepareStatement("UPDATE office.employee SET name = ?,salary = ? WHERE id = ?;");
			ps.setInt(3,e.getId());
			ps.setString(1,e.getName());
			ps.setInt(2,e.getSalary());
			System.out.println("Employee "+e.getId()+" updated");
		}
		else {
			ps = con.prepareStatement("INSERT INTO  office.employee VALUES(?,?,?);");
			ps.setInt(1,e.getId());
			ps.setString(2,e.getName());
			ps.setInt(3,e.getSalary());
			System.out.println("Employee "+e.getId()+" created");
		}
		ps.executeUpdate();
		ps.close();
		con.close();
		return null;
	}

	public static void deleteById(int id) throws ClassNotFoundException, SQLException {
		Connection con = getConnect();
		PreparedStatement ps = con.prepareStatement("DELETE FROM EMPLOYEE WHERE id=?;");
		ps.setInt(1,id);
		ps.executeUpdate();
		System.out.println("Employee "+id+" deleted");
	}
}
