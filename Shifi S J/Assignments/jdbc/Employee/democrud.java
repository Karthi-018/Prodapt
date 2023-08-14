package javaDemo;
import java.util.*;
import java.sql.*;

public class democrud {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudemo", "root", "root");
            while (true) {
                System.out.println("Select Option");
                System.out.println("1.Create Employee");
                System.out.println("2.Read Employee");
                System.out.println("3.Update Employee");
                System.out.println("4.Delete Employee");
                System.out.println("5.Display Employee");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        createEmployee(con);
                        break;
                    case 2:
                        readEmployee(con);
                        break;
                    case 3:
                        updateEmployee(con);
                        break;
                    case 4:
                        deleteEmployee(con);
                        break;
                    case 5:
                        displayEmployee(con);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createEmployee(Connection con) throws SQLException {
        System.out.println("Enter Employee Id:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name:");
        String name = sc.next();
        System.out.println("Enter Employee Department:");
        String dept = sc.next();
        System.out.println("Enter Employee Salary:");
        double sal = sc.nextDouble();
        try {
            PreparedStatement ps = con.prepareStatement("insert into employeedetail values(?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dept);
            ps.setDouble(4, sal);
            ps.executeUpdate();
            System.out.println("Employee created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readEmployee(Connection con) throws SQLException {
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        try (PreparedStatement ps = con.prepareStatement("select * from crudemo where id=?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Employee Details");
                System.out.println("Employee ID: " + rs.getInt("id"));
                System.out.println("Employee Name: " + rs.getString("name"));
                System.out.println("Employee Department: " + rs.getString("dept"));
                System.out.println("Employee Salary: " + rs.getDouble("sal"));
            } else {
                System.out.println("Employee Not Found with ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployee(Connection con) throws SQLException {
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        System.out.println("Choose the attribute to update");
        System.out.println("1.Name");
        System.out.println("2.Department");
        System.out.println("3.Salary");
        int choice = sc.nextInt();
        String col = "";
        switch (choice) {
            case 1:
                col = "name";
                break;
            case 2:
                col = "dept";
                break;
            case 3:
                col = "sal";
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Enter value to update");
        String updateval = sc.next();
        try (PreparedStatement ps = con.prepareStatement("update crudemo set " + col + " = ? where id = ?")) {
            ps.setString(1, updateval);
            ps.setInt(2, id);
            int temp = ps.executeUpdate();
            if (temp == 1) {
                System.out.println("Employee details updated successfully");
            } else {
                System.out.println("Employee Not Found with ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEmployee(Connection con) throws SQLException {
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        try (PreparedStatement ps = con.prepareStatement("delete from crudemo where id = ?")) {
            ps.setInt(1, id);
            int temp = ps.executeUpdate();
            if (temp == 1) {
                System.out.println("Employee Details deleted successfully");
            } else {
                System.out.println("Employee Not Found with ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayEmployee(Connection con) throws SQLException {
        try (PreparedStatement ps = con.prepareStatement("select * from crudemo")) {
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("Empty Database");
            } else {
                System.out.println("Employee Database");
                System.out.println("Emp Id|Emp Name|Emp Dept|Emp Salary");
                do {
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString("eDept") + " " + rs.getDouble("esal"));
                } while (rs.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}