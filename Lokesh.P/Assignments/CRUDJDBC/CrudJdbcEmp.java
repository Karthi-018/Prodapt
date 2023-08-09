import java.sql.*;
import java.util.Scanner;

public class CrudJdbcEmp {
    static PreparedStatement ps;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter your choice:");
        do {
            System.out.println("1.Insert the Data");
            System.out.println("2.Displaying the Data");
            System.out.println("3.Updating the Data");
            System.out.println("4.Delete the Data");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createRecord();
                    break;
                case 2:
                    displayRecord();
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    deleteRecord();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE -> Exiting..");
                    System.exit(0);
            }
        } while (choice != 5);

    }

    public static Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "root");

    }

    private static void displayRecord() throws SQLException, ClassNotFoundException {
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("select * from Employee");
        ResultSet rs = ps.executeQuery();
        System.out.println("Displaying all details");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
        ps.close();
        con.close();
    }


    private static void deleteRecord() throws SQLException, ClassNotFoundException {
        Connection con = getConnect();
        EmployeePojo e = new EmployeePojo();
        System.out.println("Enter id to Delete:");
        int eid = sc.nextInt();
        e.setId(eid);
        PreparedStatement ps = con.prepareStatement("delete from Employee where Eid=? ");

        ps.setInt(1, e.getId());
        int temp = ps.executeUpdate();
        if (temp == 1) {
            System.out.println("Deleted the Record Successfully");
        } else {
            System.out.println("Data Not Found");
        }

    }

    public static void createRecord() throws SQLException, ClassNotFoundException {
        System.out.println("Enter Employee id:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name:");
        String name = sc.next();
        System.out.println("Enter Employee Salary");
        int salary = sc.nextInt();
        EmployeePojo e = new EmployeePojo(id, name, salary);
        Connection con = getConnect();
        PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?)");
        ps.setInt(1, e.getId());
        ps.setString(2, e.getName());
        ps.setInt(3, e.getSalary());
        int temp = ps.executeUpdate();
        System.out.println("Record inserted Successfully");
        ps.close();
        con.close();

    }

    public static void updateRecord() throws SQLException, ClassNotFoundException {

        EmployeePojo e = new EmployeePojo();
        System.out.println("Enter the EmpId:");
        int id = sc.nextInt();
        e.setId(id);
        System.out.println("Enter the EmpName:");
        String name = sc.next();
        e.setName(name);
        System.out.println("Enter the Esalary:");
        int sal = sc.nextInt();
        e.setSalary(sal);
        Connection con = getConnect();
        String str="update employee set Ename=?,Esalary=? where Eid=?";
        PreparedStatement ps = con.prepareStatement(str);
        ps.setString(1,e.getName());
        ps.setInt(2,e.getSalary());
        ps.setDouble(3,e.getId());
        int x=ps.executeUpdate();
        if(x==1)
        {
            System.out.println("updated data successfully");
        }
        else {
            System.out.println("not found");
        }

    }
}

