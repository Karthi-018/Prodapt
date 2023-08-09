package edu.prodaptEmployee.example;
import java.util.*;
import java.sql.*;
public class JdbcExample{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		JdbcExample ot=new JdbcExample();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			boolean contLoop=true;
			while(contLoop)
			{
				try {
				System.out.println("---Select Option---");
				System.out.println("1.Create Employee");
				System.out.println("2.Read Employee");
				System.out.println("3.Update Employee");
				System.out.println("4.Delete Employee");
				System.out.println("5.Display Employee");
				int n=sc.nextInt();
				switch(n) {
				case 1:
					ot.createEmployee(con);
					break; 
				case 2: 
					System.out.println("Enter Employee ID:");
					int SearchId=sc.nextInt();
					ResultSet rs=ot.readEmployee(con,SearchId); 
					if(rs!=null) {
						EmployeePojo o=initializeData(rs);
						System.out.print(o);
					}
					else {
						contLoop=false;
						throw new EmployeeNotFoundException("Employee Not Found with ID:"+SearchId);
					}
					break;
				 case 3: 
					 System.out.println("Enter Employee ID:");
					 int Updateid=sc.nextInt();
					 ot.updateEmployee(con,Updateid); 
				 	break; 
				 case 4: 
					 System.out.println("Enter Employee ID:");
					 int Deleteid=sc.nextInt();
					 ot.deleteEmployee(con,Deleteid);
				 break; 
				  case 5: 
					  ot.displayEmployee(con); 
				  break;
				default:
					contLoop=false;
					System.out.println("Invalid choice");	
					break;
				}
			}
			catch(EmployeeNotFoundException ex) {
				System.out.println(ex.getMessage());
				contLoop=ot.shouldContLoop();
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//-----------------------------------------------------------------------------------------------------------
void createEmployee(Connection con) throws SQLException {
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Employee Department:");
		String dept=sc.next();
		System.out.println("Enter Employee Salary:");
		double sal=sc.nextDouble();
		EmployeePojo obj=new EmployeePojo(id,name,dept,sal);
		PreparedStatement ps=con.prepareStatement("insert into employeedetail values(?,?,?,?)");
			ps.setInt(1, obj.getEid());
			ps.setString(2,obj.getEname());
			ps.setString(3, obj.getEdept());
			ps.setDouble(4, obj.getEsal());
			ps.executeUpdate();
			System.out.println("Employee created successfuly");
		}
//--------------------------------------------------------------------------------------------------------
	ResultSet readEmployee(Connection con,int id)throws SQLException, EmployeeNotFoundException {
		PreparedStatement ps=con.prepareStatement("select * from employeedetail where eid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(!rs.next())
			{
				rs=null;
			}
			return rs;
		}
//--------------------------------------------------------------------------------------------------------
			void updateEmployee(Connection con,int id)throws Exception{
				ResultSet rs=readEmployee(con,id);
						if(rs==null)
							throw new EmployeeNotFoundException("Employee Not Found with ID:"+id);
						else {
							EmployeePojo obj=initializeData(rs);
				            int choice;
				  boolean t=true;
				  while(true) {
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
					  System.out.println("Enter new name");
					  obj.setEname(sc.next());
					  break;
				  case 2:
					  col="edept";
					  System.out.println("Enter new department");
					  obj.setEdept(sc.next());
					  break;
				  case 3:
					  col="esal";
					  System.out.println("Enter new salary");
					  obj.setEdept(sc.next());
					  break;
				  default:
					  t=false;
					  System.out.println("Invalid choice");
					  return;//exit the method
				  }
				 PreparedStatement ps=con.prepareStatement("update employeedetail set "+col+" =? where eid=?");
				 if(col.equals("esal"))
				 {
					 ps.setDouble(1, obj.getEsal());
				 }
				 else {
					ps.setString(1, col.equals("edept")?obj.getEdept():obj.getEname());
				 }
				 ps.setInt(2, obj.getEid());
					int temp=ps.executeUpdate();
					if(temp==1) {
					System.out.println("Employee details update succesfully");
					}
				  }
						}
			}
//--------------------------------------------------------------------------------------------------------
	 void deleteEmployee(Connection con,int id) throws Exception {
		 ResultSet rs=readEmployee(con,id);
				 if(rs==null) {
						throw new EmployeeNotFoundException("Employee Not Found with ID:"+id);
						}	
		PreparedStatement ps=con.prepareStatement("delete from employeedetail where eid=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Employee Details deleted successfully");
			
	}
//----------------------------------------------------------------------------------------------
	 void displayEmployee(Connection con)throws SQLException{
		PreparedStatement ps=con.prepareStatement("select * from employeedetail");
			ResultSet rs=ps.executeQuery();
			System.out.println("Emp Id    |  Emp Name   |  Emp Dept   | Emp Salary");
				System.out.println("--------------------------------------------------");
				
			while(rs.next())
			{
				EmployeePojo employee=initializeData(rs);
				System.out.println(employee);
				
			}while(rs.next());
	 }
//-------------------------------------------------------------------------------------------		
 public static EmployeePojo initializeData(ResultSet rs)throws SQLException{
		int eid=rs.getInt("eid");
		String ename=rs.getString("ename");
		String edept=rs.getString("edept");
		double esal=rs.getDouble("esal");
		return new EmployeePojo(eid,ename,edept,esal);
	}
 boolean shouldContLoop() {
	 System.out.println("Do you want to continue?(y/n)");
	 String cont=sc.next();
	 return cont.equals("y");
 }
}


