import java.sql.*;
import java.util.Scanner;

public class EmployeeMain {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "root");
    }

    public static void createEmployee(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Employee e = new Employee();
        // Set employee details using setters
        System.out.print("Enter emp id: ");
        e.setId(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        System.out.print("Enter emp name: ");
        e.setName(scanner.nextLine());
        System.out.print("Enter emp salary: ");
        e.setSal(scanner.nextInt());

        PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES (?, ?, ?)");
        ps.setInt(1, e.getId());
        ps.setString(2, e.getName());
        ps.setInt(3, e.getSal());
        ps.executeUpdate();
    }

    public static void readEmployee(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter emp id to be displayed: ");
        int readId = scanner.nextInt();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE id = ?");
        ps.setInt(1, readId);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
    }

    public static void updateEmployee(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter emp id to be updated: ");
        int updateId = scanner.nextInt();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE id = ?");
        ps.setInt(1, updateId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Employee e = new Employee();
            e.setId(rs.getInt("id"));

            System.out.print("Enter new emp name: ");
            e.setName(scanner.next());
            System.out.print("Enter new emp salary: ");
            e.setSal(scanner.nextInt());

            PreparedStatement updatePs = con.prepareStatement("UPDATE employee SET name = ?, salary = ? WHERE id = ?");
            updatePs.setString(1, e.getName());
            updatePs.setInt(2, e.getSal());
            updatePs.setInt(3, e.getId());
            updatePs.executeUpdate();
        }
        else {
            System.out.println("Employee not found.");
        }
    }

    public static void deleteEmployee(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter emp id to be deleted: ");
        int deleteId = scanner.nextInt();

        PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE id = ?");
        ps.setInt(1, deleteId);
        ps.executeUpdate();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection con = getConnection()) {
            while (true) {
                System.out.println("Select operation:");
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                int choice = sc.nextInt();

                switch (choice) {
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
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}


