package edu.prodapt.demos;
import java.util.*;
import java.sql.*;
public class EmployeeMain {
static Scanner scan = new Scanner(System.in);
    static void createEmployee(Connection con) throws SQLException {
        System.out.print("Enter employee ID: ");
        int eid = scan.nextInt();
        System.out.print("Enter employee name: ");
        String ename = scan.next();
        System.out.print("Enter employee salary: ");
        int salary = scan.nextInt();
        EmployeeDetalis emp = new EmployeeDetalis(eid,ename,salary);
        String sql = "insert into employee_details values (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, eid);
            ps.setString(2,ename);
            ps.setInt(3, salary);
            ps.executeUpdate();
            System.out.println("Employee created successfully.");
        }
    }
    static void updateEmployee(Connection con) throws SQLException {
        System.out.print("Enter new employee salary: ");
        int newSalary = scan.nextInt();
        System.out.print("Enter employee ID to update: ");
        int eid = scan.nextInt();   
        String sql = "update employee_details set salary = ? where eid = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, newSalary);
            ps.setInt(2, eid);
            ps.executeUpdate();
            System.out.println("Employee updated successfully.");
            }
    }

    static void searchEmployee(Connection con) throws SQLException, EmployeeNotFoundException {
    	System.out.print("Enter employee ID to search: ");
        int eid1 = scan.nextInt();
        String sql = "select * from employee_details where eid = ?";
           try (PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, eid1);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
			    int eid = resultSet.getInt("eid");
			    String ename = resultSet.getString("ename");
			    int salary = resultSet.getInt("salary");
			    System.out.println("Employee ID: " + eid + ", Name: " + ename + ", Salary: " + salary);
			}
            else {
                throw new EmployeeNotFoundException();
            }
        }  
    }
  

    static void displayAllEmployees(Connection con) throws SQLException {
        String sql = "select * from employee_details";
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                int eid = resultSet.getInt("eid");
                String ename = resultSet.getString("ename");
                int salary = resultSet.getInt("salary");
                System.out.println("Employee ID: " + eid + ", Name: " + ename + ", Salary: " + salary);
            }
        }
    }

    static void deleteEmployee(Connection con) throws SQLException {
        System.out.print("Enter employee ID to delete: ");
        int eid = scan.nextInt();
        String sql = "delete from employee_details where eid = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, eid);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }
//Main method
public static void main(String args[]) {
    System.out.println("Enter your choice :\n"+"1. Create Employee\n"+"2. Update Employee\n"+"3. Search Employee\n"
    		+"4. Display All Employees\n"+"5. Delete Employee\n");
    int choice = scan.nextInt();
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root")) {
            switch (choice) {
                case 1:
                    createEmployee(con);
                    break;
                case 2:
                    updateEmployee(con);
                    break;
                case 3:
                	try {
                    searchEmployee(con);}
                	catch (EmployeeNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                	
                case 4:
                    displayAllEmployees(con);
                    break;
                case 5:
                    deleteEmployee(con);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    } catch (ClassNotFoundException e) {
        System.out.println("Driver not found: " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
    }
   
}

}
