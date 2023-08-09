package employee.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		try {
			boolean flag=true;
			while(flag) {
				Scanner sc=new Scanner(System.in);
				Class.forName("com.mysql.cj.jdbc.Driver");
				//System.out.println("success");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
				PreparedStatement ps;
				ResultSet rs;

				
				System.out.println("1. Create");
				System.out.println("2. Update");
				System.out.println("3. Display");
				System.out.println("4. Search");
				System.out.println("5. Delete");
				System.out.print("Enter the choice : ");
				int ch=sc.nextInt();		
				switch(ch) {
				case 1:
					System.out.println("******************CREATE***********************");
					System.out.print("Eneter the id : ");
					int id=sc.nextInt();
					System.out.print("Enter the name :");
					String name=sc.next();
					System.out.print("Enter the salary :");
					int salary=sc.nextInt();
					ps=con.prepareStatement("insert into new_table values(?,?,?)");
					ps.setInt(1,id);
					ps.setString(2,name);
					ps.setInt(3,salary);
					int result=ps.executeUpdate();
					System.out.println("New employee created");
//					
					break;
					
				case 2:
					System.out.println("******************UPDATE***********************");
					System.out.print("Enter the id to update : ");
					int uid=sc.nextInt();
					System.out.println("Enter what to  update ");
					System.out.println("1.Update name");
					System.out.println("2.Update salary");
					System.out.print("Enter the choice : ");
					int choice =sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("Enter the updated name : ");
						String uname=sc.next();
						ps=con.prepareStatement("update new_table set ename=? where eid=?");
						ps.setString(1,uname);
						ps.setInt(2,uid);
						ps.executeUpdate();
						break;
						
					case 2:
						System.out.println("Enter the updated salary : ");
						int  sal=sc.nextInt();
						ps=con.prepareStatement("update new_table set salary=? where eid=?");
						ps.setInt(1,sal);
						ps.setInt(2,uid);
						ps.executeUpdate();
						break;
					}
					break;
				case 3:
					System.out.println("******************DISPLAY***********************");
					ps=con.prepareStatement("select * from new_table");
					rs =ps.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
					}
					System.out.println("************************************************");
					break;
					
				case 4:
					System.out.println("******************SEARCH***********************");
					System.out.print("Enter the Employee id to search :");
					int sid=sc.nextInt();
					ps=con.prepareStatement("select * from new_table where eid=?");
					ps.setInt(1, sid);
					rs=ps.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getInt(3));
					}
					break;
					
				case 5:
					System.out.println("******************DELETE***********************");
					System.out.print("Enter the employee id to delete : ");
					int did=sc.nextInt();
					ps=con.prepareStatement("delete from new_table where eid=?");
					ps.setInt(1,did);
					ps.executeUpdate();
					System.out.println("Deleted Successfully");
					break;
				case 6:
					flag=false;
					System.exit(0);
					break;
					}
			}
			
		}

		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {
			System.out.println(e);
		}

	}

}
