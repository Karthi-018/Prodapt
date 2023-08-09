package crud;
import java.sql.*;
import java.util.*;
public class Crud {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			//loading driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assign","root","root");
			//establishing connection
			Statement st=con.createStatement();
			//create statement
			int ch;
			do {
			System.out.println("Enter Choice no\n1.Create\n2.Display\n3.Update\n4.Delete");
			ch=s.nextInt();
			switch(ch){
				case 1:
					PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			//prepared statement to insert values,to enter multiple values  
						System.out.println("Enter id");
						int id=s.nextInt();
						System.out.println("Enter name");
						String name=s.next();
						System.out.println("Enter salary");
						int sal=s.nextInt();
						ps.setInt(1,id);
						ps.setString(2, name);
						ps.setInt(3, sal);
						ps.executeUpdate();
						
					break;
				
				case 2:
					ResultSet rs=st.executeQuery("select * from employee");
					//to retrieve data in order
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
						}
					break;
				case 3:
					System.out.print("Enter id:");
					id=s.nextInt();
					System.out.print("Which needs to be changed 1.Name or 2.Salary");
					int val=s.nextInt();
					if(val==1) {
						System.out.print("Enter Name:");
						name = s.next();
						ps=con.prepareStatement("update employee set ename=? where eid=?" );
						ps.setString(1, name);
						ps.setInt(2, id);
						ps.executeUpdate();
					}
					else {
						System.out.print("Enter Salary:");
						sal=s.nextInt();
						ps=con.prepareStatement("update employee set esal=? where eid=?" );
						ps.setInt(1, sal);
						ps.setInt(2, id);
						ps.executeUpdate();
					}
					break;
				case 4:
					ps=con.prepareStatement("delete from employee where eid=?");
					System.out.print("Enter Id to delete");
					id=s.nextInt();
					ps.setInt(1, id);
					ps.executeUpdate();
					break;
					default:System.out.print("Invalid data!You cant proceed further");
					}
			}
			while(ch<5);
			s.close();
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
