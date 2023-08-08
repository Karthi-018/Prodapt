package edu.prodaptEmployee.example;
import java.util.*;
import java.sql.*;
public class JdbcExample {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			boolean contLoop=true;
			while(contLoop)
			{
				System.out.println("---Select Option---");
				System.out.println("1.Create Employee");
				System.out.println("2.Read Employee");
				System.out.println("3.Update Employee");
				System.out.println("4.Delete Employee");
				System.out.println("5.Display Employee");
				int n=sc.nextInt();
				switch(n) {
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
				  case 5: displayEmployee(con); break;
				 
					 
				default:
					contLoop=false;
					System.out.println("Invalid choice");	
					break;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void createEmployee(Connection con) throws SQLException {
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Employee Department:");
		String dept=sc.next();
		System.out.println("Enter Employee Salary:");
		double sal=sc.nextDouble();
		try {
			PreparedStatement ps=con.prepareStatement("insert into employeedetail values(?,?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setString(3, dept);
			ps.setDouble(4, sal);
			ps.executeUpdate();
			System.out.println("Employee created successfuly");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void readEmployee(Connection con)throws Exception {
		System.out.println("Enter EmployeeID");
		int id=sc.nextInt();
		try(PreparedStatement ps=con.prepareStatement("select * from employeedetail where eid=?")){
			//PreparedStatement ps=con.prepareStatement("select * from employeedetail where eid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				EmployeePojo employee=initializeData(rs);
				System.out.println("Employee Details");
				System.out.println("Employee ID:"+employee.getEid());
				System.out.println("Employee Name:"+employee.getEname());
				System.out.println("Employee Department:"+employee.getEdept());
				System.out.println("Employee Salary:"+employee.getEsal());
			}
		/*	if(rs.next()) {
				System.out.println("Employee Details");
				System.out.println("Employee ID:"+rs.getInt("eid"));
				System.out.println("Employee Name:"+rs.getString("ename"));
				System.out.println("Employee Department:"+rs.getString("edept"));
				System.out.println("Employee Salary:"+rs.getDouble("esal"));
			}*/
			else
				throw new EmployeeNotFoundException("Employee Not Found with ID:"+id);
			
			/*catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally {
				if(con!=null)
				try {
				con.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}*/
		}
	}
	public static void updateEmployee(Connection con)throws Exception{
		
		  System.out.println("Enter Employee Id:"); 
		  int id=sc.nextInt();
		  
		  int choice;
		  do {
			  System.out.println("Choose the attribute to update");
			  System.out.println("1.Name");
			  System.out.println("2.Department");
			  System.out.println("3.Salary");
			  String col="";
		  choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1:
			  col="ename";
			  break;
		  case 2:
			  col="edept";
			  break;
		  case 3:
			  col="esal";
			  break;
		  default:
			  System.out.println("Invalid choice");
			  return;//exit the method
			}
		
		  System.out.println("Enter value to update");
		  String updateval=sc.next();
		  
		 /* System.out.println("Enter Employee Name to update:"); String name=sc.next();
		 * System.out.println("Enter Employee Department to update:"); String
		 * dept=sc.next(); System.out.println("Enter Employee Salary to update:");
		 * double sal=sc.nextDouble();
		 */
		try (PreparedStatement ps=con.prepareStatement("update employeedetail set "+col+" =? where eid=?")){
			//PreparedStatement ps=con.prepareStatement("update employeedetail set ename=?,edept=?,esal=? where eid=?");
			ps.setString(1, updateval);
			ps.setInt(2,id);
			
			int temp=ps.executeUpdate();
			if(temp==1) {
			System.out.println("Employee details update succesfully");
			}
			else {
				throw new EmployeeNotFoundException("Employee Not Found with ID:"+id);
			}
		}
		
		  }while(choice!=4);
		
	}
	public static void deleteEmployee(Connection con)throws SQLException, EmployeeNotFoundException
	{
		System.out.println("Enter Employee Id:");

		int n=sc.nextInt();
		try(PreparedStatement ps=con.prepareStatement("delete from employeedetail where eid=?"))
		{
			ps.setInt(1, n);
			int temp=ps.executeUpdate();
			if(temp==1) 
			System.out.println("Employee Details deleted successfully");
			else
				throw new EmployeeNotFoundException("Employee Not Found with ID:"+n);
		}
	}
	public static void displayEmployee(Connection con)throws SQLException{
		try(PreparedStatement ps=con.prepareStatement("select * from employeedetail")){
			ResultSet rs=ps.executeQuery();
			
			if(!rs.next())
			{
				System.out.println("Empty Database");
				return;
			}
			else {
				System.out.println("Emp Id    |  Emp Name   |  Emp Dept   | Emp Salary");
				System.out.println("--------------------------------------------------");
			do
			{
				EmployeePojo employee=initializeData(rs);
				System.out.printf("%-10d| %-12s| %-12s| %-10s",employee.getEid(),employee.getEname(),employee.getEdept(),employee.getEsal());
			    System.out.println();
			}while(rs.next());
			}
				
		}
	}
	public static EmployeePojo initializeData(ResultSet rs)throws SQLException{
		int eid=rs.getInt("eid");
		String ename=rs.getString("ename");
		String edept=rs.getString("edept");
		double esal=rs.getDouble("esal");
		return new EmployeePojo(eid,ename,edept,esal);
	}
}


